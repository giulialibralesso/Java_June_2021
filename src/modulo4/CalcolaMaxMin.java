package modulo4;

import javax.swing.JOptionPane;

public class CalcolaMaxMin {

	public static void main(String[] args) {

		String selezione;
		int valSelezione;
		String esito = "Risultato = ";
		int valEsito;

		selezione = JOptionPane.showInputDialog("Inserisci 1 se vuoi calcolare il max, 2 se vuoi calcolare il min");
		valSelezione = Integer.parseInt(selezione);
		
		if (valSelezione == 1) {
			valEsito = calcolaMassimo();
			JOptionPane.showMessageDialog(null, esito + "il numero maggiore è " +valEsito);
		} else {
			valEsito = calcolaMinimo();
			JOptionPane.showMessageDialog(null, esito + "il numero minore è " +valEsito);
		} //fine else di if (valSelezione == 1)
		
		System.exit(0);
	} //fine metodo main()

	
	//metodo calcolaMassimo
	public static int calcolaMassimo () {
		int max = 0;
		int valInput = 0;
		String input;
		
		for (int i = 1; i <= 3; i++) {
			
			do {
			input = JOptionPane.showInputDialog("Inserisci numero [-50..+50]");
			valInput = Integer.parseInt(input);
				if ((valInput < -50) || (valInput > 50))
					JOptionPane.showMessageDialog(null, "Il numero deve essere compreso tra -50 e 50", "Errore di inserimento", JOptionPane.ERROR_MESSAGE);
			} while ((valInput < -50) || (valInput > 50));
			//fine do.while
			
				if (i == 1) {
					max = valInput;
				} // fine if (i == 1)
				else
					if (valInput > max) {
						max = valInput;
					} // fine if (valInput > max)
		} //fine ciclo for (int i = 1; i <= 5; i++)
	
		return max;
	
	} //fine metodo calcolaMassimo
	
	//metodo calcolaMinimo
	public static int calcolaMinimo () {
		int min = 0;
		int valInput = 0;
		String input;
	
		for (int i = 1; i <= 3; i++) {
			
			do {
			input = JOptionPane.showInputDialog("Inserisci numero [-50..+50]");
			valInput = Integer.parseInt(input);
				if ((valInput < -50) || (valInput > 50))
					JOptionPane.showMessageDialog(null, "Il numero deve essere compreso tra -50 e 50", "Errore di inserimento", JOptionPane.ERROR_MESSAGE);
			} while ((valInput < -50) || (valInput > 50));
			//fine do.while
			
			if (i == 1) {
				min = valInput;
			} // fine if (i == 1)
			else
				if (valInput < min) {
					min = valInput;
			} // fine if (valInput > max)
		} //fine ciclo for (int i = 1; i <= 5; i++)
	
		return min;
	
	} //fine metodo calcolaMassimo
	
} //fine classe CalcolaMaxMin
