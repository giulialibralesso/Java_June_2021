package modulo1;
import javax.swing.JOptionPane;

public class OutputIncrementale {

	public static void main(String[] args) {

		//dichiarazione variabili e acquisizione dati
		int a = 5;
		int b = 4;
		
		String output = "A = " +a +"\nB = " +b +"\n\n";
		
		//elaborazione dati
		if (a == b)
			output += "A � uguale a B";
		if (a != b)
			output += "A � diverso da B";
		if (a > b)
			output += "\nA � maggiore di B";
		if (a < b)
			output += "\nA � minore di B";
		if (a >= b)
			output += "\nA � maggiore o uguale a B";
		if (a <= b)
			output += "\nA � minore o uguale a B";
		
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
	} //fine metodo main()

} //fine classe OutputIncrementale
