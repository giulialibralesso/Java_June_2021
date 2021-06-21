package modulo3;

import javax.swing.JOptionPane;

public class CalcMax2 {

	public static void main(String[] args) {

		int max = 0;
		int valInput = 0;
		String input;
		String risultato = "Risultato = ";
		
		
		for (int i = 1; i <= 5; i++) {
			input = JOptionPane.showInputDialog("Inserisci numero");
			valInput = Integer.parseInt(input);
			
			if (i == 1) {
				max = valInput;
			} // fine if (i == 1)
			else
				if (valInput > max) {
					max = valInput;
				} // fine if (valInput > max)
		} //fine ciclo for (int i = 1; i <= 5; i++)
		
		risultato += max;
		JOptionPane.showMessageDialog(null, risultato);
	} //fine metodo main()

} //fine classe CalcMax2
