package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Frame;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import enumType.Semantika;
import model.Field;
import model.State;
import model.TransitionState;

public class FormPanel extends JDialog {
	JPanel panel ;
	JPanel bp ;
	GridBagConstraints cs = new GridBagConstraints();
	
	JButton submit = new JButton("Submit");
	JButton publish = new JButton("Publish");
	JButton finish = new JButton("Finish");
	JButton save = new JButton("Save");
	JButton delete = new JButton("Delete");

	public State stanje;

	public FormPanel(Frame parent, State stanje) {
		super(parent, "Forma stanja", true);
		this.stanje = stanje;
		this.bp = new JPanel();
		this.panel = new JPanel(new GridBagLayout());
		
		
		this.showField();

		pack();
		add(panel);
		
		this.setLocationRelativeTo(null);
		
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("izasgghao");
				if (checkIfTransExists(submit.getText(),stanje)) {
					setVisible(false);
					System.out.println("izasao");
					showField();
					setVisible(true);
				}
			}
		});
		
		publish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("izasgghao");
				if (checkIfTransExists(publish.getText(),stanje)) {
					setVisible(false);
					System.out.println("izasao");
					showField();
					setVisible(true);
				}
			}
		});
		finish.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("izasgghao");
				if (checkIfTransExists(finish.getText(),stanje)) {
					setVisible(false);
					System.out.println("izasao");
					showField();
					setVisible(true);
				}
			}
		});
		
		save.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("izasgghao");
				
			}
		});
		
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("izasgghao");
				
			}
		});

		
	}

	public void showField() {
		int i = 0, j = 0;
		
		cs.fill = GridBagConstraints.HORIZONTAL;
		String[] comboBoxContent = new String[15];
		String[] checkBoxContent;
		System.out.println(stanje.getName());
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
				if (f.getType().equalsIgnoreCase("textField")) {
					cs.gridx = i;
					cs.gridy = j;
					cs.gridwidth = 1;
					panel.add(new JLabel(f.getName() + "           "), cs);

					i++;
					cs.gridx = i;
					cs.gridy = j;
					cs.gridwidth = 3;
					panel.add(new JTextField(20), cs);
					j++;
				}
				if (f.getType().equalsIgnoreCase("ComboBox")) {
					cs.gridx = i;
					cs.gridy = j;
					cs.gridwidth = 1;
					panel.add(new JLabel(f.getName() + "       "), cs);
					i++;

					if (f.getName().equalsIgnoreCase("DateTime")) {
						comboBoxContent = new String[] { "10.09.2019.", "11.09.2019.", "12.09.2019." };

						cs.gridx = i;
						cs.gridy = j;
						cs.gridwidth = 1;
						panel.add(new JComboBox(comboBoxContent), cs);
						j++;
					}
					if (f.getName().equalsIgnoreCase("Points")) {
						for (int k = 1; k <= 15; k++) {
							comboBoxContent[k] = "" + k;
						}

						cs.gridx = i;
						cs.gridy = j;
						cs.gridwidth = 1;
						panel.add(new JComboBox(comboBoxContent), cs);
						j++;
					}
				}
				if (f.getType().equalsIgnoreCase("CheckBox")) {
					cs.gridx = i;
					cs.gridy = j;
					cs.gridwidth = 1;
					panel.add(new JLabel(f.getName() + "   "), cs);
					i++;

					if (f.getName().equalsIgnoreCase("status")) {
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
					if (f.getName().equalsIgnoreCase("equipment")) {
						checkBoxContent = new String[] { "Kabl", "Dizalica", "Merdevine" };
						cs.gridx = i;
						cs.gridy = j;
						cs.gridwidth = 1;
						panel.add(new JCheckBox("Kabl"), cs);
						panel.add(new JCheckBox("Dizalica"), cs);
						panel.add(new JCheckBox("Merdevine"), cs);
						j++;
					}
				}
			}
		}

		panel.setBorder(new LineBorder(Color.GRAY));

		for (Field fi : stanje.mandatoryFields) {
			i = 0;
			if (fi.getType().equalsIgnoreCase("textField")) {
				cs.gridx = i;
				cs.gridy = j;
				cs.gridwidth = 1;
				panel.add(new JLabel(fi.getName() + "           "), cs);

				i++;
				cs.gridx = i;
				cs.gridy = j;
				cs.gridwidth = 3;
				panel.add(new JTextField(20), cs);
				j++;
			}
			if (fi.getType().equalsIgnoreCase("ComboBox")) {
				cs.gridx = i;
				cs.gridy = j;
				cs.gridwidth = 1;
				panel.add(new JLabel(fi.getName() + "       "), cs);
				i++;

				if (fi.getName().equalsIgnoreCase("DateTime")) {
					comboBoxContent = new String[] { "10.09.2019.", "11.09.2019.", "12.09.2019." };

					cs.gridx = i;
					cs.gridy = j;
					cs.gridwidth = 1;
					panel.add(new JComboBox(comboBoxContent), cs);
					j++;
				}
				if (fi.getName().equalsIgnoreCase("Points")) {
					for (int k = 1; k <= 15; k++) {
						comboBoxContent[k] = "" + k;
					}

					cs.gridx = i;
					cs.gridy = j;
					cs.gridwidth = 1;
					panel.add(new JComboBox(comboBoxContent), cs);
					j++;
				}
			}
			if (fi.getType().equalsIgnoreCase("CheckBox")) {
				cs.gridx = i;
				cs.gridy = j;
				cs.gridwidth = 1;
				panel.add(new JLabel(fi.getName() + "   "), cs);
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
					checkBoxContent = new String[] { "Kabl", "Dizalica", "Merdevine" };
					cs.gridx = i;
					cs.gridy = j;
					cs.gridwidth = 1;
					panel.add(new JCheckBox("Kabl"), cs);
					panel.add(new JCheckBox("Dizalica"), cs);
					panel.add(new JCheckBox("Merdevine"), cs);
					j++;
				}
			}

		}
		
		
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
				System.out.println("izasgfdso");
				stanje.getDocument().changeState(t.toState);
				stanje = t.toState;
				return true;
			}
		}
		return false;
	}
	
}
