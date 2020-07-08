package navinJavaSession;

public class Day16_Constructor {

	//constructor without parameter - default constructor
	// default constructor called when object is created  
	public Day16_Constructor() {
		System.out.println("Default constructor...");
	}
	
	//constructor with parameter - parameterized constructor
	// default constructor called when object is created
	public Day16_Constructor(int i) {
		System.out.println("Parameterized constructor: " +i);
	}
	
	//overload the constructor 
	public Day16_Constructor(int i, int j) {
		System.out.println("Parameterized constructor: " +(i+j));
	}
	
	public static void main(String[] args) {

		// new keyword used to call the constructor
		// if we don't provide the default constructor then compiler provide the default constructor 
		
		Day16_Constructor d16_1 = new Day16_Constructor(); // call default constructor
		
		Day16_Constructor d16_2 = new Day16_Constructor(2); // call parameterized constructor
		
		Day16_Constructor d16_3 = new Day16_Constructor(4, 5);
	}

}
