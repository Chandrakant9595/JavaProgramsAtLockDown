package navinJavaSessionInterface;

public interface USBank {

	//in interface only method declaration, no method body
	// able to declare var, var by-default static, not able to change 
	//not create object of interface 
	
	int min_bal = 100;
	
	public void credit();
	
	public void debit();
	
	public void transferMoney();
	
	static void m1() {
		System.out.println("Static method in interface");
	}
	
	static int max_bal = 10000000;
}
