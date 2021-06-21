package modulo3;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class SommaNumeri {

	public static void main(String[] args) {

		int somma = 0;
		int cont = 1;
		String numero;
		int valNumero;
		double media;
		DecimalFormat decimaliNecessari;
		String mediaArrotondata;
		
		while (cont <= 5) {
			
			numero = JOptionPane.showInputDialog("Inserisci numero #" +cont);
			valNumero = Integer.parseInt(numero);
			
			somma += valNumero;
			cont++;
			
		} //fine ciclo while (cont <= 5)
		
		media = (double)somma/cont;
		decimaliNecessari = new DecimalFormat("0.00");
		mediaArrotondata = decimaliNecessari.format(media);
		System.out.println(mediaArrotondata);
		
		if (media < 18)
			System.out.println("media insufficiente");
			else
				if (18 <= media && media <= 28)
				System.out.println("media sufficiente");
				else
					if (media > 28)
					System.out.println("media eccellente");
		
		System.exit(0);
	} //fine metodo main()

} //fine classe SommaNumeri
