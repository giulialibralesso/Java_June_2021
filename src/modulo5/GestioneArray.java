package modulo5;
import javax.swing.*;

public class GestioneArray {
	
	static boolean arrayCreato = false;
	static boolean arrayPopolato = false;
	static boolean arrayOrdinato = false;

	public static void main(String[] args) {

		String scelta;
		int valScelta;
		String messaggioSceltaUtente = "GESTIONE ARRAY\n\nMenu:"
				+ "\n[1] Crea array\n[2] Popola array\n[3] Ordina array\n[4] Cerca elemento"
				+ "\n[5] Resetta posizione\n[6] Stato array\n[7] StampaArray\n[8] Exit\n\n";
		
		//String elemento;
		int valElemento = 0;
	
		int array[] = null;
		
		do {
			
			scelta = JOptionPane.showInputDialog(messaggioSceltaUtente);
			valScelta = Integer.parseInt(scelta);
			
			switch(valScelta) {
				case 1:
					array = creaArray(array);
					break;
				case 2:
					popolaArray(array);
					break;
				case 3:
					ordinaArray(array);
					break;
				case 4:
					cercaElemento(array);
					break;
				case 5:
					resettaPosizione(array);
					break;
				case 6:
					stampaStatoArray(array);
					break;
				case 7: 
					visitaArray(array);
					break;
			} //fine switch(valScelta == 1)
			
		} while(valScelta != 8);

		if (valScelta == 8)
				System.exit(0);
	} //fine metodo main()
	
	public static int[] creaArray(int x[]) {
		
		String lunghezzaArray;
		int valLunghezzaArray;
		
		if(arrayCreato == false) {
			lunghezzaArray = JOptionPane.showInputDialog("Inserire lunghezza array");
			valLunghezzaArray = Integer.parseInt(lunghezzaArray);
			x = new int[valLunghezzaArray];
			arrayCreato = true;
			JOptionPane.showMessageDialog(null, "Creato array di #" +x.length + " elementi" );
		} //fine if(arrayCreato == false)
		else
			JOptionPane.showMessageDialog(null, "Array già creato",
					"Errore", JOptionPane.ERROR_MESSAGE);
		
		return x;
			
	} //fine metodo creaArray(int x[], int n)
	
	public static void popolaArray(int x[]) {
		
		String estremoMinimo, estremoMassimo;
		int valEstremoMinimo, valEstremoMassimo;
		
		if(arrayCreato == false)
			JOptionPane.showMessageDialog(null, "E necessario creare l'array",
					"Errore", JOptionPane.ERROR_MESSAGE);
		else
			if(arrayPopolato == true)
				JOptionPane.showMessageDialog(null, "Array già popolato",
						"Errore", JOptionPane.ERROR_MESSAGE);
			else {
				estremoMinimo = JOptionPane.showInputDialog(null, "Inserire estremo minimo");
				valEstremoMinimo = Integer.parseInt(estremoMinimo);
				estremoMassimo = JOptionPane.showInputDialog(null, "Inserire estremo massimo");
				valEstremoMassimo = Integer.parseInt(estremoMassimo);
				for(int i=0; i<x.length; i++)
					x[i] = generaNumeroCasuale(valEstremoMinimo, valEstremoMassimo);
				arrayPopolato = true;
				JOptionPane.showMessageDialog(null, "Popolato array di #" +x.length 
						+" elementi\n con range [" +valEstremoMinimo
						+".." +valEstremoMassimo +"]");
					
			} //fine elese di if(arrayPopolato == true)
	} //fine metodo popolaArray(int x[] 
	
	public static void visitaArray(int x[]) {
		
		String output = "Report visita dell'array:\n";
		JTextArea outputArea = new JTextArea(20, 20);
		JScrollPane sp = new JScrollPane(outputArea);
		
		if(arrayCreato == false)
			JOptionPane.showMessageDialog(null, "E' necessario creare l'array",
					"Errore", JOptionPane.ERROR_MESSAGE);
		else {
			for(int i=0; i<x.length; i++)
				output += "\narray[" +i +"] = " +x[i];
			outputArea.setText(output);
			JOptionPane.showMessageDialog(null,sp);
		} //fine else di if(arrayCreato == false)
		
	} //fine metodo visitaArray(int x)
	
	public static int generaNumeroCasuale(int min, int max) {
		
		int range = max - min + 1;
		int shift = min;
		int n;
		
		n = shift + (int)(Math.random()*range);
		return n;
		
	} //fine metodo generaNumeroCasuale(int min, int max) 

	public static void ordinaArray(int x[]) {

		if(arrayCreato == false)
			JOptionPane.showMessageDialog(null, "E' necessario creare l'array",
					"Errore", JOptionPane.ERROR_MESSAGE);
		else
			if(arrayPopolato == false)
				JOptionPane.showMessageDialog(null, "E' necessario popolare l'array",
						"Errore", JOptionPane.ERROR_MESSAGE);
			else
				if(arrayOrdinato == true)
					JOptionPane.showMessageDialog(null, "Array già ordinato",
							"Errore", JOptionPane.ERROR_MESSAGE);
				else {		
					for (int passaggio = 1; passaggio < x.length; passaggio++) {
						for (int i = 0; i < x.length-passaggio; i++) {
							if(x[i] > x[i+1]) 
								scambia(x, i , i+1);
						} //fine ciclo for (int i = 0; i < x.length-passaggio; i++)
					} // fine ciclo for (int passaggio = 1; passaggio < x.length; passaggio++)
					arrayOrdinato = true;
					JOptionPane.showMessageDialog(null, "Ordinato array di  #" +x.length +" elementi\n");
				}
		
	} //fine metodo ordinaArray(int x[])
	
	public static void scambia(int y[], int primoIndice, int secondoIndice) {
			
		int temp;
		
		temp = y[primoIndice];
		y[primoIndice] = y[secondoIndice]; 
		y[secondoIndice] = temp;
			
	} //fine metodo scambia (int y[], int primoIndice, int secondoIndice)
	
	public static void cercaElemento(int x[]) {
		
		boolean trovato = false;
		int i = 0;
	
		String chiave;
		int valChiave;
		
		if(arrayCreato == false)
			JOptionPane.showMessageDialog(null, "E' necessario creare l'array",
					"Errore", JOptionPane.ERROR_MESSAGE);
		else
			if(arrayPopolato == false)
				JOptionPane.showMessageDialog(null, "E' necessario popolare l'array",
						"Errore", JOptionPane.ERROR_MESSAGE);
			else {	
				
				chiave = JOptionPane.showInputDialog("Inserisci l'elemento che stai cercando");
				valChiave = Integer.parseInt(chiave);
				
				while((i < x.length) && (trovato != true)) {
		
					if(x[i] == valChiave) {
						trovato = true;
						JOptionPane.showMessageDialog(null, "Chiave " +valChiave +" trovata alla posizione #" +i);
					} //fine if (x[i] == valChiave)
						else 
							i++;
				
				} //fine ciclo while(i < x.length)
			
				if (trovato == false)
					JOptionPane.showMessageDialog(null, "Elemento non trovato");
			
			} //fine else di if (arrayCreato == false) && if (arrayPopolato == false)

	}//fine metodo cercaElemento(int x[])
	
	public static void stampaStatoArray(int x[]) {
		
		String outputStatoArray = "Array";
		
		if (arrayCreato == false) 
			outputStatoArray += "\n- non creato";
		else {
			outputStatoArray += "\n- creato";
			if (arrayPopolato == false) 
				outputStatoArray += "\n- non popolato";
			else {
				outputStatoArray += "\n- popolato";
				if (arrayOrdinato == true)
					outputStatoArray += "\n- ordinato";
				else
					outputStatoArray += "\n- non ordinato";
			} //fine else di if(arrayPopolato == false)
		} //fine else di if (arrayCreato == false) 
		
		JOptionPane.showMessageDialog(null, outputStatoArray);
					

	} //fine metodo stampaStatoArray(int x[])
	
	
	public static void resettaPosizione(int x[]) {
		
		String richiesta = "";
		int valRichiesta = 0;
		
		if(arrayCreato == false)
			JOptionPane.showMessageDialog(null, "E' necessario creare l'array",
					"Errore", JOptionPane.ERROR_MESSAGE);
		else
			if(arrayPopolato == false)
				JOptionPane.showMessageDialog(null, "E' necessario popolare l'array",
						"Errore", JOptionPane.ERROR_MESSAGE);
			else
				{	
		
				richiesta = JOptionPane.showInputDialog("Quale posizione dell'array vuoi elminare?");
				valRichiesta = Integer.parseInt(richiesta);
				
						if (valRichiesta >= x.length)
							JOptionPane.showMessageDialog(null, "Indice immesso superiore alla lunghezza dell'array",
								"Errore", JOptionPane.ERROR_MESSAGE);
						else {
							x[valRichiesta] = 0;
							JOptionPane.showMessageDialog(null, "Posizione #" +valRichiesta +" settata a 0");
						}
				} //fine else
	} //fine metodo resettaPosizione(int x[])
	
} //fine classe GestioneArray
