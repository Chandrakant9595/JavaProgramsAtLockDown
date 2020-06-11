package assessment_1;

public class Student {

	String name;
	Student(String n){
		name = n;
	}
	
	void display() {
		System.out.println(name);
	}
	
	Student(){
		System.out.println("Unknown");
	}
	
	
	public static void main(String[] args) {

		//name should be equal to the String value passed while creating object of Student class
		Student s = new Student("Chandu");
		s.display();
		
		//no name is passed while creating an object of Student class, then the name should be "Unknown
		Student s1 = new Student();
	}
}

