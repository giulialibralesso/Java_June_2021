package modulo3;

import javax.swing.JOptionPane;

public class CalcoloMax {

	public static void main(String[] args) {
				
		String a, b, c, d, e;
		String output = "Il numero maggiore è ";
		int valA, valB, valC, valD, valE, r1, r2, r3, rFinale;

		a = JOptionPane.showInputDialog("Inserisci numero");
		valA = Integer.parseInt(a);
		
		b = JOptionPane.showInputDialog("Inserisci numero");
		valB = Integer.parseInt(b);
		
		c = JOptionPane.showInputDialog("Inserisci numero");
		valC = Integer.parseInt(c);
		
		d = JOptionPane.showInputDialog("Inserisci numero");
		valD = Integer.parseInt(d);
		
		e = JOptionPane.showInputDialog("Inserisci numero");
		valE = Integer.parseInt(e);
		
		r1 = Math.max(valA, valB);
		r2 = Math.max(valC, valD);
		
			if (r1 < r2) {
				r3 = Math.max(r2, valE);
				if (r2 < r3) {
					rFinale = r3;
					output+= rFinale;
				} //fine if (r2 < r3)
				else {
					rFinale = r2;
					output+= rFinale;
				}//fine else di if (r2 < r3)
			} //fine if (r1 < r2)
			else if (r2 < r1) {
				r3 = Math.max(r1, valE);
				if (r1 < r3) {
					rFinale = r3;
					output+= rFinale;
				} //fine if (r1 < r3)
				else {
					rFinale = r1;
					output+= rFinale;
				} //fine else di else if (r1 < r3)
			} //fine else if (r1 < r3)
		
		JOptionPane.showMessageDialog(null, output);
		System.exit(0);
	} //fine metodo main()

} //fine classe CalcoloMax
