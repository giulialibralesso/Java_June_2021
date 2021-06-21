package modulo3;

import javax.swing.JOptionPane;

public class DoWhile {

	public static void main(String[] args) {

		String n;
		int valN;
		
		do {
			n = JOptionPane.showInputDialog(null, "Inserisci n");
			valN = Integer.parseInt(n);
			if ((valN < 0) || (valN > 30))
				JOptionPane.showMessageDialog(null, "N deve essere compreso tra 0 e 30", "Errore di inserimento", JOptionPane.ERROR_MESSAGE);
		} while ((valN < 0) || (valN > 30));
		
	} //fine metodo main()

} //fine classe DoWhile
