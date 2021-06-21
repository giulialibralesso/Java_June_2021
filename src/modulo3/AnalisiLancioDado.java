package modulo3;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class AnalisiLancioDado {

	public static void main(String[] args) {

		final int LANCI_TOTALI = 10;
		
		int frequenza1 = 0, frequenza2 = 0, frequenza3 = 0,
			frequenza4 = 0, frequenza5 = 0, frequenza6 = 0;
		int faccia;
		String output = "Lanci totali = " +LANCI_TOTALI +"\n\nFaccia\tFrequenza\n";
		
		JTextArea outputArea = new JTextArea();
		
		for (int lancio = 1; lancio <= LANCI_TOTALI; lancio++) {
			faccia = 1+(int)(Math.random()*6); //genera un numero random tra 1 e 6 inclusi
			
			switch(faccia) {
				case 1:
					frequenza1++;
					break;
				case 2:
					frequenza2++;
					break;
				case 3:
					frequenza3++;
					break;
				case 4:
					frequenza4++;
					break;
				case 5:
					frequenza5++;
					break;
				default:
					frequenza6++;
					break;
			} //fine switch(faccia)
		} //fine ciclo for (int lancio = 1; lancio <= LANCI_TOTALI; lancio++)
		
		//output incrementale
		output += "\n1\t" +frequenza1 + "\n2\t" +frequenza2 + "\n3\t" +frequenza3 + "\n4\t" +frequenza4 + "\n5\t" +frequenza5 + "\n6\t" +frequenza6;
		outputArea.setText(output);
		JOptionPane.showMessageDialog(null, outputArea);
		System.exit(0);
	} //fine metodo main()

} //fine classe AnalisiLancioDado
