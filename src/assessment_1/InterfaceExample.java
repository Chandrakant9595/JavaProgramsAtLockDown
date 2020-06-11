package assessment_1;


interface A{
	void message1();
}

interface B extends A{
	void message2();
}

public class InterfaceExample implements A{
	
	public void message1() {
		System.out.println("Message 1");
	}
	
	public void message2() {
		System.out.println("Message 2");
	}
	
	public static void main(String[] args) {

		InterfaceExample ie = new InterfaceExample();
		ie.message1();
		ie.message2();
	}

}
