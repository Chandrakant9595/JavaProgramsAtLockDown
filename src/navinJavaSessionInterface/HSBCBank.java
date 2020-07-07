package navinJavaSessionInterface;

public class HSBCBank implements USBank, BrazilBank{ //multiple inheritance

	int min_hsbc = 500;
	static int max_hsbc = 50000000;
	
	@Override
	public void credit() {
		System.out.println("USBank--credit");
	}

	@Override
	public void debit() {
		System.out.println("USBank--debit");
	}

	@Override
	public void transferMoney() {
		System.out.println("USBank--transfer money");
	}
	
	public void educationLoan() {
		System.out.println("HSBC--education loan");
	}
	
	public void carLoan() {
		System.out.println("HSBC--car loan");
	}

	@Override
	public void mutualFund() {
		System.out.println("Brazil bank mutual fund");
	}

}
