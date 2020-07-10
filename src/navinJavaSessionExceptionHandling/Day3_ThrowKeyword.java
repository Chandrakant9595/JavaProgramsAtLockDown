package navinJavaSessionExceptionHandling;

public class Day3_ThrowKeyword {

	public static void main(String[] args) throws Exception {
	
		System.out.println("Flipcart");
		
		try {
			throw new Exception("My error");
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		//throw new Exception("My error");
		
		System.out.println("Amazon");
	}

}
