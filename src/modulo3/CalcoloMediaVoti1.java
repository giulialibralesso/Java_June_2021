package modulo3;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class CalcoloMediaVoti1 {

	public static void main(String[] args) {

		int sommaVoti = 0;
		int nVoti = 1;
		String voto;
		int valVoto;
		double media;
		String mediaArrotondata;
		String output = "";
		
		while(nVoti <= 5) {
			
			voto = JOptionPane.showInputDialog("Inserisci numero #" +nVoti);
			valVoto = Integer.parseInt(voto);
			
			sommaVoti += valVoto;
			nVoti++;
			
		} //fine ciclo while(nVoti <= 5)
		
		media = (double)sommaVoti/5;
		DecimalFormat decimaliNecessari = new DecimalFormat("0.00");
		mediaArrotondata = decimaliNecessari.format(media);
		
		output += "Media voti = " +mediaArrotondata; 
		
		if (media < 18)
			output += "\nMedia insufficiente";
			else
				if (18 <= media && media <= 28)
					output += "\nMedia sufficiente";
					else
						if (media > 28)
							output += "\nMedia eccellente";
		
		JOptionPane.showMessageDialog(null, output);
		
		System.exit(0);
	} //fine metodo main()

} //fine classe CalcoloMediaVoti
