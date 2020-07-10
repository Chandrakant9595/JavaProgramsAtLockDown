package navinJavaSessionAbstractClassExample;

public class Day2_HDFCBank extends Day2_Bank{

	
	public Day2_HDFCBank(){
		System.out.println("HDFC bank constructor");
	}
	
	@Override
	public void loan() {
		System.out.println("Bank class abstract method loan");
	}
	
	public void fund() {
		System.out.println("HDFC fund method");
	}
}
