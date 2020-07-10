package navinJavaSessionInterfaceExample;

public class ICICIBank implements USBank, RBI{

	int min_Balance_ICICI = 100;
	
	//RBI methods
	@Override
	public void educationLoan() {
		System.out.println("ICICI--RBI method-- education loan");
	}

	@Override
	public void homeLoan() {
		System.out.println("ICICI--RBI method-- home loan");
	}

	@Override
	public void carLoan() {
		System.out.println("ICICI--RBI method-- car loan");
	}

	
	//USBank methods
	@Override
	public void debit() {
		System.out.println("ICICI--USBank method-- debit");
	}

	@Override
	public void credit() {
		System.out.println("ICICI--USBank method-- credit");
	}

	@Override
	public void transferMoney() {
		System.out.println("ICICI--USBank method-- transfer money");
	}

	
	//ICICI methods
	public void mutualfund() {
		System.out.println("ICICI--Mutual fund");
	}
	
	public void insurance() {
		System.out.println("ICICI--insurance");
	}
}
