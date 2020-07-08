package navinJavaSession;

public class Day18_ConstructorWithSuperKeyword {
	
	int a = 200;
	
	public Day18_ConstructorWithSuperKeyword() {
		System.out.println("Parent default constructor");
	}
	
	public Day18_ConstructorWithSuperKeyword(int i) {
		System.out.println("Parent constructor with parameter: " +i);
	}

	public Day18_ConstructorWithSuperKeyword(int i, int j) {
		System.out.println("Parent constructor with parameters sum: " +(i+j));
	}
	
	public void m1() {
		System.out.println("Parent class method");
	}
}
