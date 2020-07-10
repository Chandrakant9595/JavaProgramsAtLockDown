package navinJavaSessionInterfaceExample;

public class TestBank {

	public static void main(String[] args) {
		
		ICICIBank ic = new ICICIBank();
		
		ic.debit();
		ic.credit();
		ic.transferMoney();
		System.out.println(USBank.min_Balance_USBank);
		
		ic.educationLoan();
		ic.homeLoan();
		ic.carLoan();
		System.out.println(RBI.min_Balance_RBI);
		
		ic.mutualfund();
		ic.insurance();
		System.out.println(ic.min_Balance_ICICI);

		System.out.println("--------------------------------------------");
		
		USBank us = new ICICIBank(); // call only UBank methods
		us.debit();
		us.credit();us.transferMoney();
		System.out.println(USBank.min_Balance_USBank);
		
		System.out.println("--------------------------------------------");
		
		
		RBI rbi = new ICICIBank(); //call only RBI methods 
		rbi.educationLoan();
		rbi.carLoan();
		rbi.homeLoan();
		System.out.println(RBI.min_Balance_RBI);
		
		System.out.println("--------------------------------------------");
		
	}

}
