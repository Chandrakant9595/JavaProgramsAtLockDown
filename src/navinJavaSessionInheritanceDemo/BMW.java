package navinJavaSessionInheritanceDemo;

public class BMW extends Car{ //has-a relationship 

	public void bmwStart() {
		System.out.println("Start bmw");
	}
	
	public void bmwTopSpeed() {
		System.out.println("Top speed bmw");
	}
	
	//method overriding (same method present in car class)
	public void test() {
		System.out.println("Test method of BMW class");
	}
}
