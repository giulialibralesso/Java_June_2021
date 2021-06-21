package modulo4;

import javax.swing.JOptionPane;

public class CalcolaMaxMin2 {

	public static void main(String[] args) {
		
		String numero1, numero2, numero3;
		int valNumero1, valNumero2, valNumero3;
		
		String scelta;
		int valScelta;
		
		int risultato;
		
		do {
			numero1 = JOptionPane.showInputDialog("Inserisci il primo numero: ");
			valNumero1 = Integer.parseInt(numero1);
			if ((valNumero1 < -50) || (valNumero1 > 50))
				JOptionPane.showMessageDialog(null, "Il numero dev'essere compreso tra -50 e +50", "Errore di inserimento", JOptionPane.ERROR_MESSAGE);
		}
		while ((valNumero1 < -50) || (valNumero1 > 50));
		
		do {
			numero2 = JOptionPane.showInputDialog("Inserisci il secondo numero: ");
			valNumero2 = Integer.parseInt(numero2);
			if ((valNumero2 < -50) || (valNumero2 > 50))
				JOptionPane.showMessageDialog(null, "Il numero dev'essere compreso tra -50 e +50", "Errore di inserimento", JOptionPane.ERROR_MESSAGE);
		}
		while ((valNumero2 < -50) || (valNumero2 > 50));
		
		do {
			numero3 = JOptionPane.showInputDialog("Inserisci il terzo numero: ");
			valNumero3 = Integer.parseInt(numero3);
			if ((valNumero3 < -50) || (valNumero3 > 50))
				JOptionPane.showMessageDialog(null, "Il numero dev'essere compreso tra -50 e +50", "Errore di inserimento", JOptionPane.ERROR_MESSAGE);
		}
		while ((valNumero3 < -50) || (valNumero3 > 50));
		
		scelta = JOptionPane.showInputDialog("Vuoi calcolare il minimo o il massimo?\n[1] Minimo - [2] Massimo");
		valScelta = Integer.parseInt(scelta);
		
		if (valScelta == 1)
			risultato = calcolaMinimo(valNumero1, valNumero2, valNumero3);
		else
			risultato = calcolaMassimo(valNumero1, valNumero2, valNumero3);
		
		JOptionPane.showMessageDialog(null, "Risultato = " +risultato);
		
		System.exit(0);
		

	} // fine metodo main()
	
	public static int calcolaMinimo(int num1, int num2, int num3) {
		
		int minimo;
		
		if (num1 < num2)
			minimo = num1;
		else
			minimo = num2;
		
		if (num3 < minimo)
			minimo = num3;
		
		return minimo;
	} // fine metodo calcolaMinimo(int num1, int num2, int num3)
	
	public static int calcolaMassimo (int num1, int num2, int num3) {
		
		int massimo;
		
		if (num1 > num2)
			massimo = num1;
		else
			massimo = num2;
		
		if (num3 > massimo)
			massimo = num3;
		
		return massimo;
	} // fine metodo calcolaMassimo(int num1, int num2, int num3)

} // fine classe CalcolaMaxMin 2
