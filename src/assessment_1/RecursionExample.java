package assessment_1;

public class RecursionExample {

	public static void main(String[] args) {
		
		System.out.println("Factorial of 5 is: " +factorial(5));
	}
	
	static int factorial(int f) {
		if(f==1)
			return 1;
		else
			return(f*factorial(f-1));
	}
}
