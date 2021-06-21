package modulo1;
import javax.swing.JOptionPane;

public class SommaNumeri {

	public static void main(String[] args) {

		//dichiarazione variabili
		String primoNumero, secondoNumero;
		int valPrimoNumero, valSecondoNumero, somma;
		
		//acquisizione dati
		primoNumero = JOptionPane.showInputDialog("Inserisci il primo numero");
		valPrimoNumero = Integer.parseInt(primoNumero);
		
		secondoNumero = JOptionPane.showInputDialog("Inserisci il secondo numero");
		valSecondoNumero = Integer.parseInt(secondoNumero);
		
		//elaborazione dati
		somma = valPrimoNumero + valSecondoNumero;
		
		JOptionPane.showMessageDialog(null, "Somma = " +somma);
		System.exit(0);
		
	} //fine metodo main()

} //fine classe SommaNumeri
