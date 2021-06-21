package modulo5;

public class TestArray {

	public static void main(String[] args) {

		int a[] = new int[5];

		//visita dell'array: leggo il contenuto di tutte le celle, quindi è sempre legato ad un ciclo for
		for (int i=0; i<a.length; i++) //uso "<5" perché l'array ha 4 celle di memoria, da 0 a 4 inclusi (vedi sopra)
			System.out.println("a[" + i + "] = " +a[i]);
		
		//popolamento dell'array
		for (int i=0; i<a.length; i++)
			a[i] = 1 + (int)(Math.random()*6);
		
		//visita dell'array
		for (int i=0; i<a.length; i++) //uso "<5" perché l'array ha 4 celle di memoria, da 0 a 4 inclusi (vedi sopra)
			System.out.println("a[" + i + "] = " +a[i]);
				
	} //fine metodo main()

} //fine classe TestArray
