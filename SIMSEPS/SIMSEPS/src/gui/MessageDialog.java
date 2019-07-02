package gui;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class MessageDialog {
	public static void saveDialog() {
		 final JPanel panel = new JPanel();

		 JOptionPane.showMessageDialog(panel,
				    "Uspesno ste sacuvali!");
	}
	public static void deleteDialog() {
		 final JPanel panel = new JPanel();

		 JOptionPane.showMessageDialog(panel,
				    "Uspesno ste obrisali!");
	}
}
