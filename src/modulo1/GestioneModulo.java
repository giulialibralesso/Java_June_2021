package modulo1;
import javax.swing.JOptionPane;

public class GestioneModulo {

	public static void main(String[] args) {

		//dichiarazione variabili e acquisizione dati
		int a = 9;
		int b = 5;
		double divisione;
		int modulo;
		
		String output = "";
			
		//elaborazione dati
		 divisione = (double)a/b;
		 modulo = a%b;
		
		 output = output +divisione;
		 
		 if (modulo != 0)
			 output = output + "\nE il resto è " +modulo;
		
		 JOptionPane.showMessageDialog(null, "Il risultato è " +output);
		 
		 System.exit(0);
	} //fine metodo main()

} //fine classe GestioneModulo
