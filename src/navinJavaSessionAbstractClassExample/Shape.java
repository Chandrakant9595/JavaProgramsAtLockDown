package navinJavaSessionAbstractClassExample;

public abstract class Shape {

	//constructor
	public Shape() {
		System.out.println("Abstract class constructor");
	}
	
	//variable
	int i = 100;
	
	//abstract method
	abstract void draw();
	
	//normal method
	public void fill() {
		System.out.println("Abstract class normal method");
	}
	
	//can not create object of child class 
}
