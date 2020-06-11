package assessment_1;


abstract class Demo{
	
	//constructor
	Demo(){
		System.out.println("Constructor");
	}
	
	//data member
	int i = 10;
	
	//abstract method example
	abstract void message();
	
	//void method
	public void message2() {
		System.out.println("Void method");
	}
}


public class DemoAbstract extends Demo{

	@Override
	void message() {
			System.out.println("Abstract method example");	
	}
	
	public static void main(String args[]) {
		Demo d = new DemoAbstract();
		d.message();
		d.message2();
		System.out.println("Integer value is = "+d.i);
	}
}
