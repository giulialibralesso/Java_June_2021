package modulo3;
import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class MediaVotiValoreSentinella {

	public static void main(String[] args) {
		
		int somma = 0;
		int cont = 1;
		String voto;
		int valVoto;
		String output ="";
		double media;
		DecimalFormat dueCifre = new DecimalFormat("0.00");
		
		voto = JOptionPane.showInputDialog("Inserisci voto#" +cont +" [0..30]\n[-1] Exit");
		valVoto = Integer.parseInt(voto);
		
		while (valVoto != -1) {
			somma += valVoto;
			cont++;
			//sotto rilegge il voto altrimenti lui non ripropone un nuovo inserimento
			voto = JOptionPane.showInputDialog("Inserisci voto#" +cont +" [0..30]\n[-1] Exit");
			valVoto = Integer.parseInt(voto);
		} //fine ciclo while (valVoto != -1)
		
		
		if (cont == 1)
				output = "Nessun voto inserito";
				else {
						media = ((double)somma/(cont-1));
						output = "Media voti = " +dueCifre.format(media);
					} //fine if(cont != 1)
		
		JOptionPane.showMessageDialog(null, output);

		System.exit(0);
	} //fine metodo main()

} //fine classe MediaVotiValoreSentinella
