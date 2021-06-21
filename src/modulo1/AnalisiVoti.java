package modulo1;
import javax.swing.JOptionPane;

public class AnalisiVoti {

	public static void main(String[] args) {

		//dichiarazione variabili
		String primoVoto, secondoVoto, terzoVoto;
		String risultato = "La media dei voti è pari a ";
		int valPrimoVoto, valSecondoVoto, valTerzoVoto;
		int media;
		
		//acquisizione dati
		primoVoto = JOptionPane.showInputDialog("Inserisci il primo voto");
		valPrimoVoto = Integer.parseInt(primoVoto);
		
		if (valPrimoVoto < 0 || valPrimoVoto > 30)
			JOptionPane.showMessageDialog(null, "Impossibile!");

		secondoVoto = JOptionPane.showInputDialog("Inserisci il secondo voto");
		valSecondoVoto = Integer.parseInt(secondoVoto);
		
		if (valSecondoVoto < 0 || valSecondoVoto > 30)
			JOptionPane.showMessageDialog(null, "Impossibile!");
		
		terzoVoto = JOptionPane.showInputDialog("Inserisci il terzo voto");
		valTerzoVoto = Integer.parseInt(terzoVoto);
		
		if (valTerzoVoto < 0 || valTerzoVoto > 30)
			JOptionPane.showMessageDialog(null, "Impossibile!");
		
		//elaborazione dati
		media = ((valPrimoVoto + valSecondoVoto + valTerzoVoto) / 3);
		risultato += media;
		
		if (media >= 18)
			risultato += "\nEsito positivo";
		
		JOptionPane.showMessageDialog(null, risultato);
		System.exit(0);
	} //fine metodo main()

} //fine classe AnalisiVoti
