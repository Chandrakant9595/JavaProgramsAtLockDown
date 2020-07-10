package navinJavaSessionAbstractClassExample;

public abstract class Day2_Bank {

	//constructor
	public Day2_Bank() {
		System.out.println("Abstract class constructor");
	}
	
	int min_balance = 400;
	
	// abstract method
	public abstract void loan();
	
	//non abstract method
	public void credit() {
		System.out.println("Bank--Credit method");
	}
	
	//non abstract method
	public void debit() {
		System.out.println("Bank--Debit method");
	}
	
}
