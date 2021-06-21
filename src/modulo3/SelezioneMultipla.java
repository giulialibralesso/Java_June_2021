package modulo3;

public class SelezioneMultipla {

	public static void main(String[] args) {

		int anni = 18;
		
		switch(anni) {
			case 18:
				System.out.println("Hai 18 anni");
				break;
			case 19:
				System.out.println("Hai 19 anni");
				break;
			case 20:
				System.out.println("Hai 20 anni");
				break;
			default:
				System.out.println("Non hai né 18 né 19 né 20 anni");
				break;
		} //fine switch (anni)
		
		System.out.println("Continua...");
	} //fine metodo main()

} //fine classe SelezioneMultipla
