package navinJavaSession;

public class Day18_ConstructorWithSuperKeywordTest extends Day18_ConstructorWithSuperKeyword{

	// super keyword used for call the super class constructor
	// super keyword used for call the super class methods
	// super keyword used for call the super class var
	// super must be first statement in constructor or method
	// super and this keyword not able to used in constructor or method because this are first statements declare
	
	int b = 500;
	
	public Day18_ConstructorWithSuperKeywordTest() {
		super();
		System.out.println("Default constructor of child");
	}
	
	public Day18_ConstructorWithSuperKeywordTest(int i) {
		super(i);
		System.out.println("Constructor of child with parameter: " +i);
	}
	
	public Day18_ConstructorWithSuperKeywordTest(int i, int j) {
		super(i,j);
		System.out.println("Constructor of child with parameters sum: " +(i+j));
	}
	
	public void m2() {
		super.m1();
		System.out.println("Child class method");
	}
	
	public void accessVar() {
		System.out.println(super.a);
		System.out.println(b);
	}
	
	public static void main(String[] args) {
		
		Day18_ConstructorWithSuperKeywordTest d18_1 = new Day18_ConstructorWithSuperKeywordTest();
		Day18_ConstructorWithSuperKeywordTest d18_2 = new Day18_ConstructorWithSuperKeywordTest(10);
		Day18_ConstructorWithSuperKeywordTest d18_3 = new  Day18_ConstructorWithSuperKeywordTest(10, 20);
		
		d18_1.m2();
		d18_1.accessVar();
 	}

}
