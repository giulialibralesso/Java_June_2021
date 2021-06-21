package modulo4;

import javax.swing.JOptionPane;

public class EsercizioMetodi {

	static int valA;
	static int valB;
	static int valRichiesta;
	static int valOutput;
	static String a, b;
	static String richiesta;
	static String output = "Risultato = ";
	
	public static void main(String[] args) {

		do {
		a = JOptionPane.showInputDialog("Inserisci primo numero");
		valA = Integer.parseInt(a);
		if (valA < 0)
			JOptionPane.showMessageDialog(null, "Il numero deve essere maggiore di 0", "Errore", JOptionPane.ERROR_MESSAGE);
		} while (valA < 0);
		
		do {
		b = JOptionPane.showInputDialog("Inserisci secondo numero");
		valB = Integer.parseInt(b);
		if (valB < 0)
		JOptionPane.showMessageDialog(null, "Il numero deve essere maggiore di 0", "Errore", JOptionPane.ERROR_MESSAGE);
		} while (valB < 0);
		
		richiesta = JOptionPane.showInputDialog("Inserisci calcolo desiderato [1 = potenza; 2 = max; 3 = min; 4 = dadi]");
		valRichiesta = Integer.parseInt(richiesta);
		
		switch (valRichiesta) {
			case 1:
				output += calcolaPotenza(valA, valB);
				break;
			case 2:
				output += calcolaMassimo(valA, valB);
				break;
			case 3:
				output += calcolaMinimo(valA, valB);
				break;
			case 4:
				output = lanciaDueDadi(valA, valB);
				break;
			default:
				output = "Operazione errata";
				break;
		} //fine switch (valRichiesta)
		JOptionPane.showMessageDialog(null, output);
		
		System.exit(0);
	} //fine metodo main()
	
	public static int calcolaPotenza(int b, int e) {

		int risultatoPotenza = 1;
		
		if(b == 0)
			if(e == 0)
				risultatoPotenza = -1;
			else 
				risultatoPotenza = 0;
		else 
			for(int i = 1; i <= e; i++) 
				risultatoPotenza *= b;
		
		return risultatoPotenza;
	} //fine metodo calcolaPotenza(int b, int e) //////////////////////////////////
	
	public static int calcolaMassimo(int a, int b) {
	
		if (valA > valB)
			valOutput = valA;
		else
			valOutput = valB;
	
		return valOutput;
	} //fine metodo calcolaMassimo(int a, int b) ////////////////////////////////
	
	
	public static int calcolaMinimo (int a, int b) {
		
		if (valA < valB)
			valOutput = valA;
		else
			valOutput = valB;
	
		return valOutput;
	}//fine metodo calcolaMinimo(int a, int b) ////////////////////////////////
	
	public static String lanciaDueDadi (int a, int b) {
		
		int dado1, dado2, sommaDadi;
		String sommaDadiString;
		
		dado1 = 1 + (int)(Math.random()*6);
		dado2 = 1 + (int)(Math.random()*6);
		sommaDadi = dado1 + dado2;
		sommaDadiString = "Numero casuale "+sommaDadi;
		
		return sommaDadiString;
		
	} //fine metodo lanciaDueDadi(int a, int b) ////////////////////////////////////////

} //fine classe EsercizioMetodi
