package navinJavaSessionExceptionHandling;

public class Day1TryCatch {

	int a = 10;
	
	public static void main(String[] args) {
	
		//uncaught exception 
		/*int i = 5/0;
		System.out.println(i);*/
		
		//caught exception- eclipse give a notation to handle it
		//Thread.sleep(2000);
		
		//null reference 
		/*Day1 d1 = null;
		System.out.println(d1);
		System.out.println(d1.a);*/
		
		// try catch
		try {
			int i = 7/0;
		} catch (ArithmeticException e) {
			e.printStackTrace();
		}
		
		System.out.println("SLK");
		
	}

}
