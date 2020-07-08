package navinJavaSession;

public class Day17_ConstructorWithThisKeyword {

	// this keyword is used to initilized the class var in the constructor
	
	String name;
	int age;
	
	public Day17_ConstructorWithThisKeyword(String name, int age) {
		
		this.name = name;
		this.age = age;
		
		System.out.println(name);
		System.out.println(age);
	}
	
	
	public static void main(String[] args) {
		
		Day17_ConstructorWithThisKeyword d17 = new  Day17_ConstructorWithThisKeyword("Vicky", 20);
	}

}
