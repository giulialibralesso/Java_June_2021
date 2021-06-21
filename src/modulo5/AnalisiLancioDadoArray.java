package modulo5;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class AnalisiLancioDadoArray {

	public static void main(String[] args) {

		final int LANCI_TOTALI = 10;
		
		int frequenza [] = new int[7];
		int faccia;
		String output = "Lanci totali = " +LANCI_TOTALI +"\n\nFaccia\tFrequenza\n";
		
		JTextArea outputArea = new JTextArea();
		
		for (int lancio = 1; lancio <= LANCI_TOTALI; lancio++) {
			
			faccia = 1+(int)(Math.random()*6); //genera un numero random tra 1 e 6 inclusi
			frequenza[faccia]++;
			
		} //fine ciclo for (int lancio = 1; lancio <= LANCI_TOTALI; lancio++)
		
		for (int i=1; i<frequenza.length; i++)
			output += "\n" +i +"\t" +frequenza[i];
		
		outputArea.setText(output);
		JOptionPane.showMessageDialog(null, outputArea);
		System.exit(0);
	} //fine metodo main()

} //fine classe AnalisiLancioDadoArray
