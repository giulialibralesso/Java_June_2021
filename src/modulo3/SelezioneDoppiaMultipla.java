package modulo3;

public class SelezioneDoppiaMultipla {

	public static void main(String[] args) {

		int voto = 20;
		
		if (voto < 18) 
			System.out.println("Respinto");
		else
			if (voto <= 20) 
				System.out.println("Sufficiente");
			else
				if (voto <= 25)
					System.out.println("Buono");
				else
					System.out.println("Eccellente");
		
	} //fine metodo main()

} //fine classe SelezioneDoppiaMultipla
