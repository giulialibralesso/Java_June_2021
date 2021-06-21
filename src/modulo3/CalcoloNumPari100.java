package modulo3;

public class CalcoloNumPari100 {

	public static void main(String[] args) {

		int a = 0;
		int somma = 0;
		
		for (int i=0; i<=100; i++) {
			
			if (a%2 == 0) {
				somma += a;
				a++;
			}
			else
				a++;
		} //fine ciclo for (int i=0; i<=100; i++)
		
		System.out.println(somma);
	} //fine metodo main()

} //fine classe CalcoloNumPari100
