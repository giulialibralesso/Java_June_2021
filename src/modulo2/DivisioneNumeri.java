package modulo2;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class DivisioneNumeri {

	public static void main(String[] args) {
		
		//dichiarazione delle variabili e dei riferimenti (qui già istanziati gli oggetti)
		String primoNumero, secondoNumero, risultatoArrotondato;
		int valPrimoNumero, valSecondoNumero;
		double risultato;
		DecimalFormat dueCifre = new DecimalFormat("0.00");
		
		//acquisizione dei dati
		primoNumero = JOptionPane.showInputDialog("Inserisci primo numero");
		valPrimoNumero = Integer.parseInt(primoNumero);
		
		secondoNumero = JOptionPane.showInputDialog("Inserisci secondo numero");
		valSecondoNumero = Integer.parseInt(secondoNumero);
		
		//elaborazione dati
		risultato = (double)valPrimoNumero / valSecondoNumero;
		risultatoArrotondato = dueCifre.format(risultato);
		
		//produzione dell'output
		JOptionPane.showMessageDialog(null, "Risultato = " +risultatoArrotondato);
		System.exit(0);

	}//fine metodo main

}//fine classe sommaNumeri
