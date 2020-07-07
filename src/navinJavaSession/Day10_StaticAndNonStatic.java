package navinJavaSession;

public class Day10_StaticAndNonStatic {

	//global var
	String name = "Vicky"; // non-static 
	static int age = 30; // static
	
	//non-static method
	public void sendMail() {
		System.out.println("Mail send");
	}
	
	//static method
	public static void whatsAppMessageSend() {
		System.out.println("WhatsApp message send");
	}
	
	
	public static void main(String[] args) {
		
		Day10_StaticAndNonStatic d10 = new Day10_StaticAndNonStatic();
		
		//access non static var and method
		System.out.println(d10.name);
		d10.sendMail();
		
		//access non-static var and method
		// 1. direct call
		System.out.println(age);
		whatsAppMessageSend();
		
		// 2. using className.methodName/varName
		System.out.println(Day10_StaticAndNonStatic.age);
		Day10_StaticAndNonStatic.whatsAppMessageSend();
	}

}
