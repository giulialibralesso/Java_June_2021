package modulo4;
import javax.swing.JOptionPane;

public class CalcoloPotenzaMetodo1 {

	public static void main(String[] args) {
		
		String base, esponente;
		int valBase, valEsponente;
		String output = "Risultato = ";
		
		base = JOptionPane.showInputDialog("Inserisci base [0..]");
		valBase = Integer.parseInt(base);
		esponente = JOptionPane.showInputDialog("Inserisci esponente [0..]");
		valEsponente = Integer.parseInt(esponente);
		
		output += potenza(valBase, valEsponente);
		
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);

	} //fine metodo main()

	public static String potenza(int b, int e) {
		
		int risultato = 1;
		String elaborazione;
		
		if(b == 0)
			if(e == 0)
				elaborazione = " Indeterminato";
			else {
				risultato = 0;
				elaborazione = "" +risultato;
			} //fine else di if(e == 0)
		else {
			for(int i = 1; i <= e; i++) 
				risultato *= b;
			elaborazione = "" +risultato;
		} //fine else di if(b == 0)
		
		return elaborazione;
		
	} //fine metodo potenza (int b, int e)
	
} //fine classe CalcoloPotenzaMetodo1
