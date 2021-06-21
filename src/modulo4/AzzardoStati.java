package modulo4;

import javax.swing.JOptionPane;

public class AzzardoStati {

	public static void main(String[] args) {

		final int VITTORIA = 1;
		final int SCONFITTA = 2;
		final int PATTA = 3;
		final int CONTINUA = 4;
		
		int budget = 1000;
		String puntata;
		int valPuntata;
		String output;
		int punteggio, vincita = 0;
		int statoGioco = CONTINUA;
		int statoMano = CONTINUA;
		
		while (statoGioco == CONTINUA) {
			
			output = "Budget = " +budget + " euro\nQuanto vuoi puntare?";
			
			do {
			puntata = JOptionPane.showInputDialog(output);
			valPuntata = Integer.parseInt(puntata);
			if ((valPuntata <= 0) || (valPuntata > budget))
				JOptionPane.showMessageDialog(null, "Devi puntare una somma compresa tra\n1 euro e " +budget +" euro", "Puntata errata", JOptionPane.ERROR_MESSAGE);
			} while ((valPuntata <= 0) || (valPuntata > budget));
			
			budget -= valPuntata;
			
			output = "Hai puntato: " +valPuntata +" euro\nBudget attuale: " +budget +" euro\n" +"Clicca su \"OK\" per lanciare i dadi";
			JOptionPane.showMessageDialog(null, output, "Pronti a giocare!!!", JOptionPane.WARNING_MESSAGE);
	
			punteggio = lanciaDueDadi();
					
			output = "Punteggio dadi: " +punteggio;
			
			switch (punteggio) {
			case 2: case 12:
				statoMano = VITTORIA;
				vincita = valPuntata*5;
				budget += vincita;
				break;
			case 3: case 11:
				statoMano = VITTORIA;
				vincita = valPuntata*3;
				budget += vincita;
				break;
			case 4: case 10:
				statoMano = VITTORIA;
				vincita = valPuntata*2;
				budget += vincita;
				break;
			case 5:
				statoMano = PATTA;
				budget += valPuntata;
				break;
			default:
				statoMano = SCONFITTA;
				break;
			} //fine switch (punteggio)
			
			if (statoMano == VITTORIA)
				output += "\nHai vinto la mano!!!\nVinci " +vincita +" euro";
			else
				if (statoMano == SCONFITTA)
					output += "\nHai perso la mano :-(\nPerdi " +valPuntata + " euro";
				else
					output += "\nPatta\nRecuperi la puntata di " +valPuntata +" euro";

			JOptionPane.showMessageDialog(null, output);

			if (budget == 0)
				statoGioco = SCONFITTA;
			else
				if (budget >= 5000)
					statoGioco = VITTORIA;
			
		} //fine ciclo while ((budget > 0) && (budget < 5000))

		output = "Budget = " +budget + " euro";
		
		if(statoGioco == SCONFITTA)
			output += "Mi dispiace, hai perso tutto :-(";
		else
			output += "Complimenti, hai fatto saltare il banco!!!";
		
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
		
	} //fine metodo main()//////////////////////////////////////////////////////////

	public static int lanciaDueDadi() {
		
		int dado1, dado2, sommaDadi;
		
		dado1 = 1 + (int)(Math.random()*6);
		dado2 = 1 + (int)(Math.random()*6);
		sommaDadi = dado1 + dado2;
		
		return sommaDadi;
		
	} //fine metodo lanciaDueDadi()/////////////////////////////////////////////////
	
} //fine classe AzzardoStati
