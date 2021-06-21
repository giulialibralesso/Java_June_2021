package modulo5;

import javax.swing.*;
import javax.swing.JTextArea;
import java.text.DecimalFormat;

public class AnalisiLancioDadi {

	public static void main(String[] args) {

		//dichiarazione variabili
		final int NUMERO_DADI = 20;
		final int LANCI_TOTALI = 1000000;
		double frequenzaPercentuale;
		int frequenza [] = new int [1+(6*NUMERO_DADI)];
		String output = "Lanci totali = " +LANCI_TOTALI +"\n\nFaccia\tFrequenza\tPercentuale %\tIstogramma";
				
		DecimalFormat totCifre = new DecimalFormat("0.00000");
		
		JTextArea outputArea = new JTextArea(50, 50);
		JScrollPane sp = new JScrollPane(outputArea);
		
		for (int lancio = 1; lancio <= LANCI_TOTALI; lancio++) {
	
			frequenza[lanciaNDadi(NUMERO_DADI)]++;
			
		} //fine ciclo for (int lancio = 1; lancio <= LANCI_TOTALI; lancio++)
	
		
		for (int i = NUMERO_DADI; i < frequenza.length; i++) {
		
			frequenzaPercentuale = ((double)frequenza[i] / LANCI_TOTALI)*100;
			output += "\n" +i +"\t" +frequenza[i] +"\t" +totCifre.format(frequenzaPercentuale) +"\t" +creaIstogramma(frequenzaPercentuale, NUMERO_DADI);
	
		} //fine for (int i=3; i<frequenza.length; i++)
		
		outputArea.setText(output);
		JOptionPane.showMessageDialog(null, sp);
		
		System.exit(0);
	} //fine metodo main() ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	//creo il metodo che effettua il lancio dei dadi (n è il numero di dadi che lanceremo)
	public static int lanciaNDadi(int n) {
	
		int dado, risultato = 0;
		
		for(int i = 1; i <= n; i++) {
		dado = 1+(int)(Math.random()*6);
		risultato+= dado;
		
		} //fine ciclo for(int i = 1; i <= n; i++)
		return risultato;
	} //fine metodo lanciaNDadi(int n) /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
	
	
	//creo il metodo per l'istogramma
	public static String creaIstogramma(double frequenza, int dadi) {
		
		String asterischi = "";
		double totaleAsterischi = frequenza*dadi;
		
		for (int i = 1; i <=  totaleAsterischi; i++) {	
			asterischi += "*";
		} //fine ciclo for (int contAsterischi = 1; contAsterischi <=  b; contAsterischi++)
		
		return asterischi;
	} //fine metodo String creaIstogramma

} //fine classe AnalisiLancioDadi
