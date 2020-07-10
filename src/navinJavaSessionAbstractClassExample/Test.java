package navinJavaSessionAbstractClassExample;

public class Test extends Shape{

	public Test() {
		System.out.println("Test class constructor");
	}
	
	public static void main(String[] args) {
		
		Shape s = new Test();
		s.draw();
		System.out.println(s.i);
		s.fill();
		
	}

	@Override
	void draw() {
		System.out.println("Implement shape abstract class method");
	}

}
