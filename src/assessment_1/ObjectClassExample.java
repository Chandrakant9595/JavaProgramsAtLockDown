package assessment_1;

public class ObjectClassExample {

	int i; // Global variable defile 
	public void m3() {
		i = 30;
		System.out.println("Globall variable eg = " +i);
	}
	
	static int j = 40; // static variable declare
	static void m4() {
		System.out.println("Static variable eg = " +j);
	}
	
	public void m5() {
		int k = 50;   // Local variable declare
		System.out.println("Local variable eg = " +k);
	}
		
	
	
	public void m1(int a, int b) {
		System.out.println("a+b="+ (a+b) ); // Here we use aithmatic operator with method overloading
	}
	
	public void m1(int a, int b, int c) {
		System.out.println("a+b+c="+ (a+b+c) ); // Here we use aithmatic operator with method overloading
	}
	
	public static void main(String args[]) {
		
		ObjectClassExample o = new ObjectClassExample(); //creting object or class using new keyword
		o.m1(10, 20);
		o.m1(10, 20, 30);
		o.m3();
		ObjectClassExample.m4();
		o.m5();
	}
}

