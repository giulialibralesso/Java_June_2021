package modulo3;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.text.DecimalFormat;

public class CalcoloInteressiScroll {

	public static void main(String[] args) {

		final int ANNI_TOTALI = 100;
		
		int capitaleIniziale = 1000;
		double interessePercentuale = 5;
		double interesse = interessePercentuale / 100;
		double montante;
		String output = "Anno\tMontante";
		
		JTextArea outputArea = new JTextArea(15, 20);
		JScrollPane sp = new JScrollPane(outputArea);
		DecimalFormat dueCifre = new DecimalFormat ("0.00");
		
		for (int anno = 1; anno <= ANNI_TOTALI; anno++) {
			montante = capitaleIniziale * Math.pow(1 + interesse, anno);
			output+= "\n" + anno + "\t" + dueCifre.format(montante);
		} //fine ciclo for (int anno = 1; anno <= 10; anno++)
		
		outputArea.setText(output);
		JOptionPane.showMessageDialog(null, sp);
		System.exit(0);
		
	} //fine metodo main()

} //fine classe CalcoloInteressiScroll
