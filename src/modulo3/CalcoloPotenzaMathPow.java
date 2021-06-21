package modulo3;

import javax.swing.JOptionPane;

public class CalcoloPotenzaMathPow {

	public static void main(String[] args) {

		String base, esponente;
		int valBase, valEsponente;
		double risultato;
		String output = "Risultato = ";
		
		base = JOptionPane.showInputDialog("Inserisci base [0..]");
		valBase = Integer.parseInt(base);
		esponente = JOptionPane.showInputDialog("Inserisci esponente [0..]");
		valEsponente = Integer.parseInt(esponente);

		if (valBase == 0 && valEsponente == 0)
			output += "Indeterminato";
		else {
		risultato = Math.pow(valBase, valEsponente);
		output+= risultato;
		} //fine else di if (valBase != 0 && valEsponente != 0)
		
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
	} //fine metodo main()

} //fine classe CalcoloPotenzaOttimizzato
