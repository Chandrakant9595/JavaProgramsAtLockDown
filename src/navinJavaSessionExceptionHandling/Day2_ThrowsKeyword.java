package navinJavaSessionExceptionHandling;

public class Day2_ThrowsKeyword {

	public void div() throws ArithmeticException{
		int i = 7/0;
	}
	
	public void sum() {
		try{
			div();
		}catch (ArithmeticException e) {
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {

		Day2_ThrowsKeyword th = new Day2_ThrowsKeyword();
		th.sum();
		System.out.println("SLK");
	}
}
