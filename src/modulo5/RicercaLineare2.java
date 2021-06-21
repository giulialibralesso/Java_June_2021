package modulo5;

public class RicercaLineare2 {

	public static void main(String[] args) {

		int array[] = new int [5];
		int esitoRicerca;
		int posizione = 0;
		
		array[0] = 53;
		array[1] = 30;
		array[2] = 30;
		array[3] = 8;
		array[4] = 30;
		
		visitaArray(array);
		
		esitoRicerca = cercaElemento(array, 30);
		
		if (esitoRicerca != -1)
			System.out.println("Elemento trovato " +esitoRicerca +" volte" +" in posizione " +posizione); //NOTA: non funziona la posizione
		else
			System.out.println("Elemento non trovato");
		
	} //fine metodo main()

	public static void visitaArray(int x[]) {
		
		for(int i = 0; i < x.length; i++)
			System.out.println("array[" +i +"] = " +x[i]);
		
	} //fine metodo visitaArray(int x)
	
	public static int cercaElemento(int x[], int chiave) {
		
		boolean trovato = false;
		int i = 0;
		int conta = 0;
		
		while(i < x.length) {
			
			if(x[i] == chiave) {
				trovato = true;
				conta++;
				i++;
			} //fine if(x[i] == chiave)
			else
				i++;
		} //fine ciclo while(i < x.length)
		
		if(trovato == true) {
			return conta;
		}
		else
			return -1;

	} //fine metodo cercaElemento(int x[])
	
} //fine classe RicercaLineare2
