package modulo3;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import java.text.DecimalFormat;

public class AnalisiInvestimento {

	public static void main(String[] args) {
				
		String capitaleIniziale;
		String durata;
		String interessePercentuale;
		String decimaliVoluti;
		String altezza;
		int valCapitaleIniziale;
		int valDurata;
		int valInteressePercentuale;
		int valDecimaliVoluti;
		int valAltezza;
		double interesse;
		double montante;
		String formattazione = "";
		double interesseTotale;
		String asterischi = "";
		String output = "Anno\tMontante\tInteresse totale\tIstogramma";
		
		capitaleIniziale = JOptionPane.showInputDialog("Inserisci il capitale iniziale");
		valCapitaleIniziale = Integer.parseInt(capitaleIniziale);
		
		durata = JOptionPane.showInputDialog("Inserisci la durata");
		valDurata = Integer.parseInt(durata);
		
		interessePercentuale = JOptionPane.showInputDialog("Inserisci percentuale");
		valInteressePercentuale = Integer.parseInt(interessePercentuale);
		
		decimaliVoluti = JOptionPane.showInputDialog("Con quante cifre vuoi vedere il montante? [0..3]");
		valDecimaliVoluti = Integer.parseInt(decimaliVoluti);
		
		altezza = JOptionPane.showInputDialog("Altezza? [5..20]");
		valAltezza = Integer.parseInt(altezza);
		
		JTextArea area = new JTextArea (valAltezza, 3);
		JScrollPane sp = new JScrollPane (area);
		
		interesse = (double)valInteressePercentuale / 100;
		
		if (valDecimaliVoluti == 0)
			formattazione = ".";
		for (int dec = 1; dec <= valDecimaliVoluti; dec++)
			formattazione+= "0";
		/*else
			if (valDecimaliVoluti == 1)
				formattazione = "0.0";
				else
					if (valDecimaliVoluti == 2)
						formattazione = "0.00";
					else
						if (valDecimaliVoluti == 3)
							formattazione = "0.000";*/
		
		DecimalFormat totCifre = new DecimalFormat(formattazione);		
		
		for (int anno = 1; anno <= valDurata; anno++) {
			montante = valCapitaleIniziale * Math.pow(1 + interesse, anno);
			interesseTotale = ((double)(montante - valCapitaleIniziale) / valCapitaleIniziale) * 100;
			//output+= "\n" + anno + "\t" + totCifre.format(montante) + "\t" + totCifre.format(interesseTotale);
		
			for (int contAsterischi = 1; contAsterischi <= interesseTotale ; contAsterischi++) 
				asterischi+= "*";
				
			output+=  "\n" + anno + "\t" + totCifre.format(montante) + "\t" + totCifre.format(interesseTotale) + "\t" + asterischi;
			asterischi = "";
		} //fine ciclo for (int anno = 1; anno <= valDurata; anno++)
		
		area.setText(output);
		JOptionPane.showMessageDialog(null, sp);
		System.exit(0);
		
	} //fine metodo main()

} //fine classe AnalisiInvestimento
