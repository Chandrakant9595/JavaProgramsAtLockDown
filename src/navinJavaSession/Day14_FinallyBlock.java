package navinJavaSession;

public class Day14_FinallyBlock {
	
	// finally always used with try catch block
	// it is always executed if error handle or not
	
	int a = 10;
	int b = 0;
	
	public void m1() {
		
		try {
			int c =a/b;
			System.out.println(c);
 		} catch (ArithmeticException e) {
			System.out.println("ArithmeticException exception devide by zero");
		}	
		finally {
			System.out.println("Finally block always executed");
		}
		
		try {
			System.out.println("second try");
		}finally {
			System.out.println("second finally block");
		}
	
	}
	
	public static void main(String[] args) {
		
		Day14_FinallyBlock d14 = new Day14_FinallyBlock();
		d14.m1();
	}

}
