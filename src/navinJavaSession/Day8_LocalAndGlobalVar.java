package navinJavaSession;

public class Day8_LocalAndGlobalVar {

	//Global var
	String name = "Vicky";
	int age  = 25;
	
	public void sum() {
		//local var
		int i = 15;
		int age = 30;
		System.out.println("Local var of method: " +i);
		System.out.println("Local var of method: " +age);
	}
	
	public static void main(String[] args) {
		
		//local var
		int i = 50;
		System.out.println("Local var: " +i);
		
		//to access global var create object of class and access it
		Day8_LocalAndGlobalVar d8 = new Day8_LocalAndGlobalVar();
		System.out.println("Global var: " +d8.name);
		System.out.println("Global var: " +d8.age);
		
		//access local var of method
		d8.sum();
	}

}
