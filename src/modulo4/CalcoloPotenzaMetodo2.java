package modulo4;
import javax.swing.JOptionPane;

public class CalcoloPotenzaMetodo2 {

	public static void main(String[] args) {
		
		
		String base, esponente;
		int valBase, valEsponente;
		int risultatoPotenza;
		
		base = JOptionPane.showInputDialog("Inserisci base [0..]");
		valBase = Integer.parseInt(base);
		esponente = JOptionPane.showInputDialog("Inserisci esponente [0..]");
		valEsponente = Integer.parseInt(esponente);
		
		risultatoPotenza = potenza(valBase, valEsponente);
		
		if (risultatoPotenza == -1)
			JOptionPane.showMessageDialog(null, "Indeterminato");
		else
			JOptionPane.showMessageDialog(null, "Risultato = " +risultatoPotenza);

		System.exit(0);
		
	} //fine metodo main()

	public static int potenza(int b, int e) {
		
		int risultato = 1;
		
		if(b == 0)
			if(e == 0)
				risultato = -1;
			else 
				risultato = 0;
		else 
			for(int i = 1; i <= e; i++) 
				risultato *= b;
		
		return risultato;
		
	} //fine metodo potenza (int b, int e)
	
} //fine classe CalcoloPotenzaMetodo2
