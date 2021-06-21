package modulo5;

public class TestArrayMetodo {

	public static void main(String[] args) {

		int a[] = new int[5];
		
		a[2] = 10;

		for (int i = 0; i < a.length; i++) 
			System.out.println("a[" +i +"] = " +a[i]);
		
		gestisciArray(a);
		
		for (int i = 0; i < a.length; i++) 
			System.out.println("a[" +i +"] = " +a[i]);
		
	} //fine metodo main()

	public static void gestisciArray(int x[]) {
		
		x[2] = 50;
		x[3] = 100;
		
	} //fine metodo gestisciArray(int x[])
	
	
} //fine TestArrayMetodo
