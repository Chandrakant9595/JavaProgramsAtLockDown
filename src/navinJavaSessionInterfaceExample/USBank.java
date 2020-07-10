package navinJavaSessionInterfaceExample;

public interface USBank {

	//interface have only method declaration 
	//we can not create object of interface
	//no static method
	
	
	int min_Balance_USBank = 300;
	
	public void debit();
	
	public void credit();
	
	public void transferMoney();
}
