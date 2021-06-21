package modulo4;
import javax.swing.*;

public class VariabiliGlobali {

	static int dado1, dado2;
	
	public static void main(String[] args) {

		int risultato;
		String output;

		JTextArea outputArea = new JTextArea();
		
		risultato = lanciaDueDadi();
		output = "Dado1 = " +dado1 +"\nDado2 = " +dado2 +"\nSomma dei dadi = " +risultato;
		
		outputArea.setText(output);
		JOptionPane.showMessageDialog(null, outputArea);

		System.exit(0);
	} //fine metodo main() ///////////////////////////////////////////////////

	public static int lanciaDueDadi() {
		
		int dado1, dado2, sommaDadi;
		
		dado1 = 1 + (int)(Math.random()*6);
		dado2 = 1 + (int)(Math.random()*6);
		sommaDadi = dado1 + dado2;
		
		return sommaDadi;
		
	} //fine metodo lanciaDueDadi()/////////////////////////////////////////////////
	

} //fine classe VariabiliGlobali
