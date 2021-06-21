package modulo5;

public class OrdinamentoBubbleSort {

	public static void main(String[] args) {

		int a[] = {50, 40, 30, 20, 10};
		
		visitaArray(a);
		bubbleSort(a);
		visitaArray(a);
		
	} //fine metodo main() /////////////////////////////////////////////////////
	
	public static void visitaArray(int x[]) {
		
		for (int i = 0; i< x.length; i++)
			System.out.println("array[" +i +"] = " +x[i]);
	} //fine metodo visitaArray(int x[]) ///////////////////////////////////////

	public static void bubbleSort (int x[]) {
		
		for (int passaggio = 1; passaggio < x.length; passaggio++)
			for (int i = 0; i < x.length-passaggio; i++)
				
				if(x[i] > x[i+1]) {
					scambia(x, i , i+1);
				} //fine if(x[i] > x[i+1])
			
	} //fine metodo bubbleSort (int x[]) //////////////////////////////////////
	
	public static void scambia(int y[], int primoIndice, int secondoIndice) {
		
		int temp;
		
		temp = y[primoIndice];
		y[primoIndice] = y[secondoIndice]; 
		y[secondoIndice] = temp;
		
	} //fine metodo scambia (int y[], int primoIndice, int secondoIndice)
	
} //fine classe OrdinamentoBubbleSort
