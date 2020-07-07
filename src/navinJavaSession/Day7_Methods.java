package navinJavaSession;


public class Day7_Methods {

	//non static-methods
	//does not return any thing - no input no output 
	public void m1() {
		System.out.println("Method-1");
	}
	
	//return int value - no input but some output
	public int m2() {
		System.out.println("Method-2");
		int a = 10;
		int b = 20;
		int c = a+b;
		
		return c;
	}
	
	//return string value - no input but some output
	public String m3() {
		System.out.println("Method-3");
		String string = "Selenium";
		
		return string;
	}
	
	// return int value - some input arguments/parameters and some output
	public int m4(int x, int y) {
		System.out.println("Method-4");
		int z =x/y;
		
		return z;
	}
	
	public static void main(String[] args) {

		Day7_Methods d7 = new Day7_Methods();
		
		d7.m1();
		
		int add = d7.m2();
		System.out.println(add);
		
		String op = d7.m3();
		System.out.println(op);
		
		int res = d7.m4(6, 2);
		System.out.println(res);
	}
}
