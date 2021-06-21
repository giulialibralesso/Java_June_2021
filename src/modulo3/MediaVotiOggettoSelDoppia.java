package modulo3;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class MediaVotiOggettoSelDoppia {

	public static void main(String[] args) {
		
		//dichiarazione variabili
		int valPrimoVoto, valSecondoVoto, valTerzoVoto, valDecimaliDesiderati;
		double media;
		String primoVoto, secondoVoto, terzoVoto, decimaliDesiderati, formattazione="", mediaArrotondata, output = "La media dei voti è pari a ";
		DecimalFormat decimaliNecessari;
		
		//acquisizione dati
		primoVoto = JOptionPane.showInputDialog("Inserisci il primo voto");
		valPrimoVoto = Integer.parseInt(primoVoto);
		
		secondoVoto = JOptionPane.showInputDialog("Inserisci il secondo voto");
		valSecondoVoto = Integer.parseInt(secondoVoto);
		
		terzoVoto = JOptionPane.showInputDialog("Inserisci il terzo voto");
		valTerzoVoto = Integer.parseInt(terzoVoto);
		
		decimaliDesiderati = JOptionPane.showInputDialog("Con quanti decimali vuoi visualizzare la media? Inserisci un numero da 0 a 5");
		valDecimaliDesiderati = Integer.parseInt(decimaliDesiderati);
		
		//elaborazione dati
		if (valDecimaliDesiderati == 0)
			formattazione = "0";
		else
			if (valDecimaliDesiderati == 1)
				formattazione = "0.0";
				else 
					if (valDecimaliDesiderati == 2)
						formattazione = "0.00";
					else
						if (valDecimaliDesiderati == 3)
							formattazione = "0.000";
						else
							if (valDecimaliDesiderati == 4)
								formattazione = "0.0000";
							else
								formattazione = "0.00000";
		
		media = ((valPrimoVoto + valSecondoVoto + valTerzoVoto) / 3);
			
		decimaliNecessari = new DecimalFormat(formattazione); //equivale a dire, se non avessi dichiarato prima decimaliNecessari: DecimalFormat decimaliNecessari = new DecimalFormat(formattazione);
		mediaArrotondata = decimaliNecessari.format(media);
		
		//produzione output
		output += mediaArrotondata;
		
		if (media >= 18)
			output += "\n\nEsito positivo";
			else
				if (media < 18)
				output += "\n\nEsito negativo";
		
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
	} //fine metodo main()

} //fine classe MediaVotiOggettoSel Doppia
