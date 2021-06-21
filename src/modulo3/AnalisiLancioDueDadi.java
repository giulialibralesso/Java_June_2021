package modulo3;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class AnalisiLancioDueDadi {

	public static void main(String[] args) {

		final int LANCI_TOTALI = 10;
		
		int frequenza2 = 0, frequenza3 = 0, frequenza4 = 0, frequenza5 = 0, frequenza6 = 0,
			frequenza7 = 0, frequenza8 = 0, frequenza9 = 0, frequenza10 = 0, frequenza11 = 0, frequenza12 = 0;
		int faccia;
		String output = "Lanci totali = " +LANCI_TOTALI +"\n\nRisultato\tFrequenza\n";
		
		JTextArea outputArea = new JTextArea();
		
		for (int lancio = 1; lancio <= LANCI_TOTALI; lancio++) {
			
			faccia = 2+(int)(Math.random()*11); //genera un numero random tra 2 e 12 inclusi
			
			switch(faccia) {
				case 1:
					frequenza2++;
					break;
				case 2:
					frequenza3++;
					break;
				case 3:
					frequenza4++;
					break;
				case 4:
					frequenza5++;
					break;
				case 5:
					frequenza6++;
					break;
				case 6:
					frequenza7++;
					break;
				case 7:
					frequenza8++;
					break;
				case 8:
					frequenza9++;
					break;
				case 9:
					frequenza10++;
					break;
				case 10:
					frequenza11++;
					break;
				default:
					frequenza12++;
					break;
			} //fine switch(faccia)
		} //fine ciclo for (int lancio = 1; lancio <= LANCI_TOTALI; lancio++)
		
		//output incrementale
		output += "\n2\t" +frequenza2 + "\n3\t" +frequenza3 + "\n4\t" +frequenza4 + "\n5\t" +frequenza5 + "\n6\t" +frequenza6 + "\n7\t" +frequenza7 + "\n8\t" +frequenza8 + "\n9\t" +frequenza9 + "\n10\t" +frequenza10 + "\n11\t" +frequenza11 +"\n12\t" +frequenza12;
		outputArea.setText(output);
		JOptionPane.showMessageDialog(null, outputArea);
		System.exit(0);
	} //fine metodo main()

} //fine classe AnalisiLancioDueDadi
