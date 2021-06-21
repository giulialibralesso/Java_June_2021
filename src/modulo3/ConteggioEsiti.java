package modulo3;
import javax.swing.JOptionPane;

public class ConteggioEsiti {

	public static void main(String[] args) {

		int nVoti = 1;
		int totPromossi = 0;
		int totBocciati = 0;
		String esito;
		int valEsito;
		
		while (nVoti <= 10) {
			esito = JOptionPane.showInputDialog("Inserisci esito#" +nVoti);
			valEsito = Integer.parseInt(esito);
		
			
			
			if (valEsito == 1) 
				totPromossi++;
				else
					if (valEsito == 2)
						totBocciati++;
				
			
		} //fine ciclo whilw (nVoti <= 10)
		
	} //fine metodo main()

} //fine classe ConteggioEsiti
