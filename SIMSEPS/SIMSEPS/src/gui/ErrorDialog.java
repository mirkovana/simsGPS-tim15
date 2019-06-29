package gui;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
public class ErrorDialog {
	
	public static void showErrorMandatory() {
	 final JPanel panel = new JPanel();

	 JOptionPane.showMessageDialog(panel,
			    "Obavezna polja nisu popunjena!.");
}}
