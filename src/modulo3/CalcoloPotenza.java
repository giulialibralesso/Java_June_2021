package modulo3;
import javax.swing.JOptionPane;


public class CalcoloPotenza {

	public static void main(String[] args) {

		String base;
		String esponente;
		String output = "";
		int valBase;
		int valEsponente;
		int potenza = 1;

		base = JOptionPane.showInputDialog("Inserisci la base");
		valBase = Integer.parseInt(base);
		
		esponente = JOptionPane.showInputDialog("Inserisci l'esponente");
		valEsponente = Integer.parseInt(esponente);
		
		if (valBase == 0)
			output+= valBase;			
		else
			if (valEsponente == 0)
				output+= potenza;
				
		if (valBase != 0 && valEsponente != 0) {
			for (int cont = 1; cont <= valEsponente; cont++) {
				potenza = potenza * valBase;
			} //fine ciclo for
			output+= potenza;
		} //fine if (valBase != 0 && valEsponente != 0)
				
		JOptionPane.showMessageDialog(null, "Il risultato è " +output);
		
		System.exit(0);
	} //fine metodo main()

} //fine classe CalcoloPotenza
