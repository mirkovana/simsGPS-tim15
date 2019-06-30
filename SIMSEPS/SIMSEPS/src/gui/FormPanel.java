package gui;

import java.awt.BorderLayout;
import java.awt.Checkbox;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import enumType.Semantika;
import model.Field;
import model.State;
import model.TransitionState;

public class FormPanel extends JDialog {
	JPanel panel ;
	JPanel bp ;
	List<Checkbox> checkboxes = new ArrayList<Checkbox>();
	int brojac=0;
	boolean uneto;
	GridBagConstraints cs = new GridBagConstraints();
	ErrorDialog erd = new ErrorDialog();
	MessageDialog msd = new MessageDialog();
	
	
	JButton submit = new JButton("Submit");
	JButton publish = new JButton("Publish");
	JButton finish = new JButton("Finish");
	JButton save = new JButton("Save");
	JButton delete = new JButton("Delete");

	public State stanje;

	public FormPanel(Frame parent, State stanje) {
		super(parent, "Forma stanja-Init", true);
		this.stanje = stanje;
		this.bp = new JPanel();
		this.panel = new JPanel(new GridBagLayout());
		
		
		this.showField();

		this.setSize(500, 500);
		//pack();
		add(panel);
		
		this.setLocationRelativeTo(null);
		
		initialization();

		
	}

	public void initialization() {
		
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				if (checkIfTransExists(submit.getText(),stanje)) {
					setVisible(false);
					
					showField();
					setVisible(true);
				}
			}
		});
		
		publish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (uneto == false) {
					
					erd.showErrorMandatory();
					stanje=stanje;
					return;
				}
				
				if (checkIfTransExists(publish.getText(),stanje)) {
					setVisible(false);
					
					
					showField();
					setVisible(true);
				}
			}
		});
		finish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if (checkIfTransExists(finish.getText(),stanje)) {
					setVisible(false);
					
					showField();
					setVisible(true);
				}
			}
		});
		
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				msd.saveDialog();
				
			}
		});
		
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				msd.deleteDialog();
				
			}
		});
	}
	public void showField() {
		int i = 0, j = 0;
		
		
		cs.fill = GridBagConstraints.HORIZONTAL;
		String[] comboBoxContent = new String[15];
		String[] checkBoxContent;
		System.out.println(stanje.getName());
		
		
		
		/**************DENYMODIFY******************/

		boolean found = false;
		for (Field f : stanje.denyModifyFields) {
			found = false;
			for (Field hidden : stanje.hiddenFields) {
				if (f.equals(hidden)) {
					found = true;
					break;
				}

				
			}
			
			if (found == false) {
				i = 0;
			
				/*************************TEXTFIELD*********************/
				
				if (f.getType().equalsIgnoreCase("textField")) {
					cs.gridx = i;
					cs.gridy = j;
					cs.gridwidth = 1;
					panel.add(new JLabel(f.getName() + "           "), cs);

					i++;
					cs.gridx = i;
					cs.gridy = j;
					cs.gridwidth = 3;
					JTextField jtf = new JTextField(20);
					//jtf.setText("Neki tekst");
					jtf.setEditable(false);
					
					if (f.getName().equalsIgnoreCase("Name")) {
						jtf.setText("Name");
					}
					if (f.getName().equalsIgnoreCase("Answers")) {
						jtf.setText("Answers");
					}
					if (f.getName().equalsIgnoreCase("PhoneNo")) {
						jtf.setText("0685214569");
					}
					
					panel.add(jtf, cs);
					j++;
					j++;
				}
				
				
				/*************************COMBOBOX*********************/

				if (f.getType().equalsIgnoreCase("ComboBox")) {
					cs.gridx = i;
					cs.gridy = j;
					cs.gridwidth = 1;
					panel.add(new JLabel(f.getName() + "      "), cs);
					i++;

					if (f.getName().equalsIgnoreCase("DateTime")) {
						comboBoxContent = new String[] { "10.09.2019." };

						cs.gridx = i;
						cs.gridy = j;
						cs.gridwidth = 3;
						JComboBox comB = new JComboBox(comboBoxContent);
						panel.add(comB, cs);
						j++;
					}
					if (f.getName().equalsIgnoreCase("Points")) {
						comboBoxContent=new String[] {"9"};

						cs.gridx = i;
						cs.gridy = j;
						cs.gridwidth = 1;
						JComboBox comB = new JComboBox(comboBoxContent);
						panel.add(comB, cs);
						j++;
					}
				}
				
				
				/*************************CHECKBOX*********************/

				if (f.getType().equalsIgnoreCase("CheckBox")) {
					cs.gridx = i;
					cs.gridy = j;
					cs.gridwidth = 1;
					panel.add(new JLabel(f.getName() + "   "), cs);
					i=i+1;					

					if (f.getName().equalsIgnoreCase("status")) {
						cs.gridx = i;
						cs.gridy = j;
						cs.gridwidth = 1;
						JCheckBox jcb1 = new JCheckBox("Neodredjeno");
						jcb1.setSelected(true);
						jcb1.setEnabled(false);
						panel.add(jcb1, cs);
						cs.gridx = i + 1;
						cs.gridy = j;
						cs.gridwidth = 1;
						JCheckBox jcb2 = new JCheckBox("Uspesno");
						jcb2.setEnabled(false);
						panel.add(jcb2, cs);
						cs.gridx = i + 2;
						cs.gridy = j;
						cs.gridwidth = 1;
						JCheckBox jcb3 = new JCheckBox("Neuspesno");
						jcb3.setEnabled(false);
						panel.add(jcb3, cs);
						j++;
					}
					if (f.getName().equalsIgnoreCase("equipment")) {
						
						cs.gridx = i;
						cs.gridy = j;
						cs.gridwidth = 1;
						JCheckBox jcb1 = new JCheckBox("Kabl");
						jcb1.setEnabled(false);
						panel.add(jcb1, cs);
						cs.gridx = i + 1;
						cs.gridy = j;
						cs.gridwidth = 1;
						JCheckBox jcb2 = new JCheckBox("Dizalica");
						jcb2.setEnabled(false);
						panel.add(jcb2, cs);
						cs.gridx = i + 2;
						cs.gridy = j;
						cs.gridwidth = 1;
						JCheckBox jcb3 = new JCheckBox("Merdevine");
						jcb3.setSelected(true);
						jcb3.setEnabled(false);
						panel.add(jcb3, cs);
						j++;
						
					}
				}
			}
		}

		panel.setBorder(new LineBorder(Color.GRAY));
		
		
		/*****************MANDATORYFIELDS***********/
		boolean found1 = false;
		//boolean uneto =true;
		for (Field fi : stanje.mandatoryFields) {
			found1 = false;
			for (Field f2 : stanje.denyModifyFields) {
				if (fi.equals(f2)) {
					found1 = true;
					break;
				}}
			
			if (found1 == false) {
			i = 0;
			if (fi.getType().equalsIgnoreCase("textField")) {
				cs.gridx = i;
				cs.gridy = j;
				cs.gridwidth = 1;
				panel.add(new JLabel(fi.getName() + "*           "), cs);

				i++;
				cs.gridx = i;
				cs.gridy = j;
				cs.gridwidth = 3;
				JTextField jtf = new JTextField(20);
				panel.add(jtf, cs);
				
				j++;
			}
			if (fi.getType().equalsIgnoreCase("ComboBox")) {
				cs.gridx = i;
				cs.gridy = j;
				cs.gridwidth = 1;
				panel.add(new JLabel(fi.getName() + "*       "), cs);
				i++;

				if (fi.getName().equalsIgnoreCase("DateTime")) {
					comboBoxContent = new String[] { "10.09.2019.", "11.09.2019.", "12.09.2019." };

					cs.gridx = i;
					cs.gridy = j;
					cs.gridwidth = 1;
					JComboBox comB = new JComboBox(comboBoxContent);
					panel.add(comB, cs);
					j++;
				}
				if (fi.getName().equalsIgnoreCase("Points")) {
					comboBoxContent=new String[] {"1","2","3","4","5","6","7","8","9"};

					cs.gridx = i;
					cs.gridy = j;
					cs.gridwidth = 1;
					JComboBox comB = new JComboBox(comboBoxContent);
					panel.add(comB, cs);
					j++;
				}
			}
			if (fi.getType().equalsIgnoreCase("CheckBox")) {
				cs.gridx = i;
				cs.gridy = j;
				cs.gridwidth = 1;
				panel.add(new JLabel(fi.getName() + "*   "), cs);
				i++;

				if (fi.getName().equalsIgnoreCase("status")) {

					cs.gridx = i;
					cs.gridy = j;
					cs.gridwidth = 1;
					panel.add(new JCheckBox("Neodredjeno"), cs);

					cs.gridx = i + 1;
					cs.gridy = j;
					cs.gridwidth = 1;
					panel.add(new JCheckBox("Uspesno"), cs);

					cs.gridx = i + 2;
					cs.gridy = j;
					cs.gridwidth = 1;
					panel.add(new JCheckBox("Neuspesno"), cs);
					j++;
				}
				if (fi.getName().equalsIgnoreCase("equipment")) {
					cs.gridx = i;
					cs.gridy = j;
					cs.gridwidth = 1;
					JCheckBox jcb1 = new JCheckBox("Kabl");
					
					panel.add(jcb1, cs);
					cs.gridx = i + 1;
					cs.gridy = j;
					cs.gridwidth = 1;
					JCheckBox jcb2 = new JCheckBox("Dizalica");
					
					panel.add(jcb2, cs);
					cs.gridx = i + 2;
					cs.gridy = j;
					cs.gridwidth = 1;
					JCheckBox jcb3 = new JCheckBox("Merdevine");
					
					
					panel.add(jcb3, cs);
					//boolean uneto =true;
					 jcb1.addChangeListener(new ChangeListener() {

				            @Override
				            public void stateChanged(ChangeEvent e) {
				            	if(jcb1.isSelected())
				                uneto=true;
				                
				            }
				        });
					
					 jcb2.addChangeListener(new ChangeListener() {

				            @Override
				            public void stateChanged(ChangeEvent e) {
				            	if(jcb2.isSelected())
				                uneto=true;
				                
				            }
				        });
					 jcb3.addChangeListener(new ChangeListener() {

				            @Override
				            public void stateChanged(ChangeEvent e) {
				            	if(jcb3.isSelected())
				                uneto=true;
				                
				            }
				        });
					j++;
					
				}
			}

		}}
		
		
		panel.setBorder(new LineBorder(Color.GRAY));

		

		for (Semantika s : stanje.getSemantike()) {
			if (!s.name().equalsIgnoreCase(stanje.getName())) {
				if (s == s.published) {
					bp.add(publish);
				}
				if (s == s.submitted) {
					bp.add(submit);
				}
				if (s == s.finall) {
					bp.add(finish);
				}
				if (s == s.saveEnabled) {
					bp.add(save);
				}
				if (s == s.deleteEnabled) {
					bp.add(delete);
				}
			}
		}
		

		getContentPane().add(panel, BorderLayout.CENTER);

		getContentPane().add(bp, BorderLayout.PAGE_END);

		
		

	}
	
	protected boolean checkIfTransExists(String name,State state) {
		for(TransitionState t : state.getTransitions()) {
			if(t.getAkcija().getName().equalsIgnoreCase(name)) {
				
				
				stanje.getDocument().changeState(t.toState);
				panel.removeAll();
				bp.removeAll();
				stanje = t.toState;
				this.setTitle("Forma stanja-" + stanje.getName());
				return true;
			}
		}
		
		return false;
	}
	
}
