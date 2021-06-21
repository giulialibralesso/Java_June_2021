package modulo5;

public class RicercaLineare {

	public static void main(String[] args) {

		int array[] = new int [5];
		int esitoRicerca;
		
		array[0] = 53;
		array[1] = 10;
		array[2] = 30;
		array[3] = 8;
		array[4] = 35;
		
		visitaArray(array);
		
		esitoRicerca = cercaElemento(array, 250);
		
		if (esitoRicerca != -1)
			System.out.println("Elemento trovato alla posizione #" +esitoRicerca);
		else
			System.out.println("Nessun elemento trovato");
		
	} //fine metodo main()

	public static void visitaArray(int x[]) {
		
		for(int i = 0; i < x.length; i++)
			System.out.println("array[" +i +"] = " +x[i]);
		
	} //fine metodo visitaArray(int x)
	
	
	public static int cercaElemento(int x[], int chiave) {
		
		boolean trovato = false;
		int i = 0;
		
		while((trovato == false) && (i < x.length)) {
			
			if(x[i] == chiave)
				trovato = true;
			else
				i++;
		} //fine ciclo while((trovato == false) && (i < x.length))
		
		if(trovato == true)
			return i;
		else
			return -1;

	} //fine metodo cercaElemento(int x[])
	
	
} //fine classe RicercaLineare
