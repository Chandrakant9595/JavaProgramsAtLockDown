package assessment_1;


class ABC{
	void message(int a, int b) {
		System.out.println("Parent class method = "+(a+b));
	}
}

public class MethodOverriding extends ABC{

	void message(int a, int b) {
		System.out.println("Child class method = "+(a+b));
	}
	
	public static void main(String[] args) {
	
		MethodOverriding mo = new MethodOverriding();
		mo.message(5, 5);
	}

}
