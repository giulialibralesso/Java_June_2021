package modulo5;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class AnalisiLancioTreDadiArray {

	public static void main(String[] args) {

final int LANCI_TOTALI = 10;
		
		int frequenza [] = new int[19];
		int sommaDadi;
		String output = "Lanci totali = " +LANCI_TOTALI +"\n\nFaccia\tFrequenza\n";
		
		JTextArea outputArea = new JTextArea();
		
		for (int lancio = 1; lancio <= LANCI_TOTALI; lancio++) {
			
			sommaDadi = lanciaTreDadi();
			frequenza[sommaDadi]++;
			
		} //fine ciclo for (int lancio = 1; lancio <= LANCI_TOTALI; lancio++)
		
		for (int i=3; i<frequenza.length; i++) //escludo le posizioni 0, 1 e 2 dell'array per non creare confusione
			output += "\n" +i +"\t" +frequenza[i];
		
		outputArea.setText(output);
		JOptionPane.showMessageDialog(null, outputArea);
		System.exit(0);
		
	} //fine metodo main()
	
	public static int lanciaTreDadi() {
		
		int dado1, dado2, dado3, risultato;
		
		dado1 = 1+(int)(Math.random()*6);
		dado2 = 1+(int)(Math.random()*6);
		dado3 = 1+(int)(Math.random()*6);
		
		risultato = dado1 + dado2 + dado3;
		
		return risultato;
	} //fine metodo lancia3Dadi()

} //fine classe AnalisiLancioTreDadiArray
