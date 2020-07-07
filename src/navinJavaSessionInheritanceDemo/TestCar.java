package navinJavaSessionInheritanceDemo;

public class TestCar {

	public static void main(String[] args) {
		
		BMW b = new BMW();
		
		//compile time polymorphism - static polymorphism  
		b.test(); //call child class not from parent class(same method present in both class) (method overriding)	
		b.carStart(); // method from parent class
		b.bmwStart(); // method from child class
		b.carRefile(); // method from parent class
		b.carStop(); // method from parent class
		b.bmwTopSpeed(); // method from child class
		b.vechileEngine(); //call grand parent method
		System.out.println("---------------------------");
		
		Car c = new Car();
		c.carStart(); // method from parent class
		c.carStop(); // method from parent class
		c.carRefile(); // method from parent class
		c.vechileEngine(); // call grand parent method
		System.out.println("---------------------------");
		
		//top casting
		Car c1 = new BMW(); //child class object can be referred by parent class ref var - dynamic/runtime polymorphism
		c1.carStart(); //parent class method
		c1.carStop(); //parent class method
		c1.carRefile(); //parent class method
		c1.test(); // child class method
		c1.vechileEngine();
		System.out.println("---------------------------");
		
		
		//down casting
		BMW b1 = (BMW) new Car(); // not allow error - java.lang.ClassCastException
	}

}
