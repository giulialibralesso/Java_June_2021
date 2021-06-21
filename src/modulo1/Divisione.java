package modulo1;
import javax.swing.JOptionPane;

public class Divisione {

	public static void main(String[] args) {

		//dichiarazione variabili
		String dividendo, divisore;
		int valDividendo, valDivisore;
		double divisione;
		
		//acquisizione dati
		dividendo = JOptionPane.showInputDialog("Inserisci il dividendo");
		valDividendo = Integer.parseInt(dividendo);
		
		divisore = JOptionPane.showInputDialog("Inserisci il divisore");
		valDivisore = Integer.parseInt(divisore);
		
		//elaborazione dati
		divisione = (double)valDividendo / valDivisore;
		
		JOptionPane.showMessageDialog(null, "Divisione = " +divisione);
		System.exit(0);
		
	} //fine metodo main()

} //fine classe Divisione
