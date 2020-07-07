package navinJavaSession;

public class Day9_MethodOverloading {

	// method name is same with different type of parameters with different data types 
	// you can not create method inside the method
	// same name same number of parameters not allow
	// we can overload the main method
	
	public void sum() {
		System.out.println("Sum-1");
	}
	
	public void sum(int i) {
		System.out.println("Sum-2");
		System.out.println(i);
	}
	
	public void sum(int i, int j) {
		System.out.println("Sum-3");
		System.out.println(i+j);
	}
	
	public void main(int n) {
		System.out.println("Main method");
		System.out.println(n);
	}
	
	public static void main(String[] args) {

		Day9_MethodOverloading d9 = new Day9_MethodOverloading();
		d9.sum();
		d9.sum(1);
		d9.sum(2, 3);
		d9.main(4);
	}

}
