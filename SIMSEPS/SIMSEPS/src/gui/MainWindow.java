package gui;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;

import model.Document;

//import model.Korisnik;

public class MainWindow extends JFrame {
	public Document doc;
	public MainWindow(Document doc) {
		this.doc = doc;
		this.setSize(800,700);
		this.setLayout(null);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null); 
		
		this.setVisible(true);
		
		JButton b1 = new JButton(doc.getName());
	    b1.setVerticalTextPosition(AbstractButton.CENTER);
	    b1.setHorizontalTextPosition(AbstractButton.LEADING); 
	    b1.setBounds(50,50,95,30);  
	    
	    this.add(b1);
		
	}
}
