package gui;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;

import model.Document;
import model.State;
import model.TransitionState;

//import model.Korisnik;

public class MainWindow extends JFrame {
	public Document doc;
	public FormPanel fp;
	public MainWindow(Document doc) {
		JFrame jfr = new JFrame();
		this.doc = doc;
		this.setSize(800, 700);
		this.setLayout(null);
		this.setTitle(doc.getName());
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	
		this.setVisible(true);

		JButton b1 = new JButton("NasXml");
		b1.setVerticalTextPosition(AbstractButton.CENTER);
		b1.setHorizontalTextPosition(AbstractButton.LEADING);
		b1.setBounds(50, 50, 95, 30);
		this.add(b1).setVisible(true);

		fp = new FormPanel(jfr, doc.getState());

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				fp.setVisible(true);
				
			}
		});

		
	}

	/*protected boolean checkIfTransExists(String name,State state) {
		for(TransitionState t : state.getTransitions()) {
			if(t.getAkcija().getName().equalsIgnoreCase(name)) {
				System.out.println("izasgfdso");
				doc.changeState(t.toState);
				fp.dispose();
				return true;
			}
		}
		return false;
	}*/

	public Document getDoc() {
		return doc;
	}

	public void setDoc(Document doc) {
		this.doc = doc;
	}

}
