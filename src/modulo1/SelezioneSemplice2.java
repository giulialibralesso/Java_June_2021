package modulo1;
import javax.swing.JOptionPane;

public class SelezioneSemplice2 {

	public static void main(String[] args) {
		
		String numeroUno, numeroDue;
		String stampa = "";
		int valNumeroUno, valNumeroDue;
		int somma;
		double divisione;
		
		numeroUno = JOptionPane.showInputDialog("Inserisci il primo numero");
		valNumeroUno = Integer.parseInt(numeroUno);
		
		numeroDue = JOptionPane.showInputDialog("Inserisci il secondo munero");
		valNumeroDue = Integer.parseInt(numeroDue);
	
		
		somma = (valNumeroUno + valNumeroDue);
		divisione = ((double)valNumeroUno / valNumeroDue);
		
		if (valNumeroUno > valNumeroDue)
			stampa += numeroUno + " maggiore di " + numeroDue;
		
		stampa += "\nSomma = " + somma + " \nDivisione = " + divisione;
		JOptionPane.showMessageDialog(null, stampa);
		
		System.exit(0);
	} //fine metodo main()

} //fine classe SelezioneSemplice2
