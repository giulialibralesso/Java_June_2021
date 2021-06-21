package modulo1;
import javax.swing.JOptionPane;

public class GestioneModulo2 {

	public static void main(String[] args) {

		//dichiarazione variabili
		String a, b;
		int valA, valB, modulo;
		double risultato;
		
		String output = "";
		
		//acquisizione dati
		a = JOptionPane.showInputDialog("Inserisci il dividendo");
		valA = Integer.parseInt(a);
		
		b = JOptionPane.showInputDialog("Inserisci il divisore");
		valB = Integer.parseInt(b);
		
		//elaborazione dati
		risultato = (double)valA/valB;
		modulo = valA%valB;
		
		output = output +risultato;
		
		//prima e unica decisione
		if (modulo != 0 )
			output = output + "\nE il resto è " +modulo;
		
		JOptionPane.showMessageDialog(null, "Il risultato è " + output);
		System.exit(0);
	} //fine metodo main()

} //fine classe GestioneModulo2
