package modulo4;

import javax.swing.*;

public class Craps {

	static int punteggio;
	static int risultato;
	static int dado1, dado2, sommaDadi;
	
	public static void main(String[] args) {

		boolean primoLancio = true;
		String outputVittoria = "Vittoria\nNuova partita\nDado_1 = " +dado1 +"\tDado_2 = " +dado2 +"\nSomma = " +sommaDadi;
		String outputSconfitta = "Sconfitta\nNuova partita\nDado_1 = " +dado1 +"\tDado_2 = " +dado2 +"\nSomma = " +sommaDadi;
		String outputContinua = "Continua\nDado_1 = " +dado1 +"\tDado_2 = " +dado2 +"\nSomma = " +sommaDadi;
		
	
		while (true) {
		
		JOptionPane.showMessageDialog(null, "Clicca su OK per iniziare una nuova partita");
		risultato = lanciaDueDadi();
		
		if (primoLancio == true) {
			
			switch(risultato) {
			case 7: case 11:
				JOptionPane.showMessageDialog(null, outputVittoria);
				break;
			case 2: case 3: case 12:
				JOptionPane.showMessageDialog(null, outputSconfitta);
				break;
			default:
				punteggio = risultato;
				primoLancio = false;
				JOptionPane.showMessageDialog(null, outputContinua);
				break;
			} //fine switch(risultato)
			
		} //fine ciclo if (primoLancio == true)
		

		while (primoLancio == false) {
			
			if(risultato == 7)	
				JOptionPane.showMessageDialog(null, outputSconfitta);
			else 
				if (risultato == punteggio)
					JOptionPane.showMessageDialog(null, outputVittoria);
				else
					primoLancio = false;
					JOptionPane.showMessageDialog(null, outputContinua);
		} //fine ciclo while (primoLancio == false)
		
		} //fine while(true)
		
	} //fine metodo main()

	public static int lanciaDueDadi() {
		//int dado1, dado2, sommaDadi;
		
		dado1 = 1 + (int)(Math.random()*6);
		dado2 = 1 + (int)(Math.random()*6);
		sommaDadi = dado1 + dado2;

		return sommaDadi;
	} //fine metodo lanciaDueDadi()
	
	
} //fine classe Craps
