package modulo3;

import javax.swing.JOptionPane;

public class TestaOCroce {

	//eventuale funzione lanciaMoneta()
	/*public static int lanciaMoneta () {
		int esitoLancioMoneta = 1+(int)(Math.random()*2);
		return esitoLancioMoneta;
	}*/

	public static void main(String[] args) {

		int budget = 100;
		int risultatoLancio;
		int valPuntata;
		int valScommessa;
		String puntata = "";
		String scommessa= "";
		
		while (budget > 0 && budget < 1000) {
			JOptionPane.showMessageDialog(null, "Budget = " +budget);
			puntata = JOptionPane.showInputDialog("Quanto vuoi puntare?");
			valPuntata = Integer.parseInt(puntata);
			
			while (budget < valPuntata) {
				JOptionPane.showMessageDialog(null, "Non puoi puntare così tanti soldi: non li hai.");
				JOptionPane.showMessageDialog(null, "Budget = " +budget);
				puntata = JOptionPane.showInputDialog("Quanto vuoi puntare?");
				valPuntata = Integer.parseInt(puntata);
			} //fine ciclo while (budget < valPuntata)
			
			budget = budget - valPuntata;
			JOptionPane.showMessageDialog(null, "Budget dopo la puntata = " +budget);
			
			scommessa = JOptionPane.showInputDialog("Scommetti su testa (1) o su croce (2)");
			valScommessa = Integer.parseInt(scommessa);
	
			//se usassi la funzione lanciaMoneta(), la chiamerei --> risultatoLancio = lanciaMoneta();
			risultatoLancio = 1+(int)(Math.random()*2);
			
			if (risultatoLancio == valScommessa) {
				JOptionPane.showMessageDialog(null, "Hai vinto la mano. Vinci " +(valPuntata*2) + " euro");
				budget = budget + (valPuntata*2);
			} //fine if (risultatoLancio == valScommessa)
			else {
				JOptionPane.showMessageDialog(null, "Hai perso la mano. Perdi " +valPuntata + " euro");
			} //fine else di if (risultatoLancio == valScommessa)		
		} //fine ciclo while (budget > 0 && budget < 1000)
		
		if (budget >= 1000) {
			JOptionPane.showMessageDialog(null, "Complimenti, hai vinto.");
		} //fine if (budget >= 1000)
		else {
			JOptionPane.showMessageDialog(null, "Hai perso.");
		} //fine else di if (budget >= 1000)
	
		System.exit(0);
	} //fine metodo main()

} //fine classe TestaOCroce