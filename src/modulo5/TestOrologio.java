package modulo6;

public class TestOrologio {

	public static void main(String[] args) {
		
		Orologio t1 = new Orologio();
		
		System.out.println(t1.count);
		System.out.println(t1.count2);
		t1.count++;
		t1.count2++;
		System.out.println(t1.count);
		System.out.println(t1.count2);
		
		Orologio t2 = new Orologio();
		System.out.println(t2.count);
		System.out.println(t2.count2);
		
		/*
		Orologio t1 = new Orologio(16, 38, 9);
		Orologio t2 = new Orologio();
		
		System.out.println(t1.getStandardTime());
		System.out.println(t1.getUniversalTime());
		
		t1.setTime(16, 40);
		
		System.out.println(t1.getStandardTime());
		System.out.println(t1.getUniversalTime());
		
		t1.setTime(56, 25, 91);
		
		System.out.println(t1.getStandardTime());
		System.out.println(t1.getUniversalTime());
		
		t2.setTime(18,  31);
		System.out.println(t2.getStandardTime());
		System.out.println(t2.getUniversalTime());*/
		
		
		
	} //fine metodo main

} //fine classe TestOrologio
