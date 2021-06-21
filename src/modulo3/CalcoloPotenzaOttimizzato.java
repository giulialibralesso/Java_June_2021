package modulo3;

import javax.swing.JOptionPane;

public class CalcoloPotenzaOttimizzato {

	public static void main(String[] args) {

		int potenza = 1;
		String base, esponente;
		int valBase, valEsponente;
		String output = "Risultato = ";
		
		base = JOptionPane.showInputDialog("Inserisci base [0..]");
		valBase = Integer.parseInt(base);
		esponente = JOptionPane.showInputDialog("Inserisci esponente [0..]");
		valEsponente = Integer.parseInt(esponente);

		if (valBase == 0)
			if (valEsponente == 0)
				output += "Indeterminato";
			else {
				potenza = 0;
				output+= potenza;
			} //fine else di if (valEsponente == 0)
		else {
			for (int i = valEsponente; i != 0; i--)
				potenza *= valBase;
			output+= potenza;
		} //fine else di if (valBase == 0)
		
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
	} //fine metodo main()

} //fine classe CalcoloPotenzaOttimizzato
