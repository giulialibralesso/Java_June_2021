package modulo3;
import javax.swing.JOptionPane;

public class SommaNumeriFOR {

	public static void main(String[] args) {
		
		final int NUMERI_TOTALI = 15;
		
		int somma = 0;
		//int cont = 1;
		String numero;
		int valNumero;
		
		for(int cont=1; cont <= NUMERI_TOTALI; cont++) {
			
			numero = JOptionPane.showInputDialog("Inserisci numero #" +cont);
			valNumero = Integer.parseInt(numero);
			
			somma += valNumero;
			
		} //fine ciclo for (cont <= 5)
		
		JOptionPane.showMessageDialog(null, "Somma = " +somma);
		System.exit(0);

	} //fine metodo main()

} //fine classe SommaNumeriFOR
