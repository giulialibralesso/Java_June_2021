package modulo3;
import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class OperazioniMultiple2 {

	public static void main(String[] args) {

		int valA;
		int valB;
		int valRichiesta;
		int valDecVoluti;
		String a, b;
		String richiesta;
		String decVoluti;
		String formattazione = "";
		String risultato = "Risultato = ";
		
		richiesta = JOptionPane.showInputDialog("Inserisci operazione [1..4]");
		valRichiesta = Integer.parseInt(richiesta);
		
		a = JOptionPane.showInputDialog("Inserisci primo numero");
		valA = Integer.parseInt(a);
		
		b = JOptionPane.showInputDialog("Inserisci secondo numero");
		valB = Integer.parseInt(b);
		
		
		switch (valRichiesta) {
		case 1:
			risultato += valA+valB;
			break;
		case 2:
			risultato += valA-valB;
			break;
		case 3:
			risultato += valA*valB;
			break;
		case 4:
			if (valB != 0) {
				decVoluti = JOptionPane.showInputDialog("Con quanti decimali vuoi vedere la divisione? 1 = somma; 2 = sottrazione; 3 = moltiplicazione; 4 = divisione [1..4]");
				valDecVoluti = Integer.parseInt(decVoluti);
				risultato += (double)valA/valB;
								
				if (valDecVoluti == 0)
					formattazione = ".";
				for (int dec = 1; dec <= valDecVoluti; dec++)
					formattazione+= "0";
				
				DecimalFormat decimali = new DecimalFormat(formattazione);
				risultato += decimali.format(valDecVoluti);
			} //fine if (valB != 0)
			else
				risultato += "Errore divisione per zero";
		} //fine switch
	
		JOptionPane.showMessageDialog(null, risultato);	
	} //fine metodo main()

} //fine classe OperazioniMultiple2
