package modulo3;
import javax.swing.JOptionPane;

public class SommaNumeriPulito2 {

	public static void main(String[] args) {
		
		int somma = 0;
		int cont = 1;
		String numeriTotali;
		int valNumeriTotali;
		String numero;
		int valNumero;
		
		numeriTotali = JOptionPane.showInputDialog("Quanti numeri vuoi inserire?");
		valNumeriTotali = Integer.parseInt(numeriTotali);
				
		while(cont <= valNumeriTotali) {
			
			numero = JOptionPane.showInputDialog("Inserisci numero #" +cont);
			valNumero = Integer.parseInt(numero);
			
			somma += valNumero;
			cont++;
			
		} //fine ciclo while(cont <= 5)
		
		JOptionPane.showMessageDialog(null, "Somma = " +somma);
		System.exit(0);

	} //fine metodo main()

} //fine classe SommaNumeriPulito2
