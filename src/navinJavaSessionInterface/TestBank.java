package navinJavaSessionInterface;

public class TestBank {

	public static void main(String[] args) {
		

		HSBCBank hsbc = new HSBCBank();
		hsbc.credit(); // interface method
		hsbc.debit(); // interface method
		hsbc.transferMoney(); // interface method
		hsbc.educationLoan(); // class method
		hsbc.carLoan(); // class method
		System.out.println("-------------------------------");
		
		//dynamic polymorphism
		//child class can referred by parent interface var
		//Top casting 
		USBank usb = new HSBCBank();
		usb.credit(); // interface method
		usb.debit(); // interface method
		usb.transferMoney(); // interface method
		//usb.educationLoan(); error - only access interface methods not in class methods
		System.out.println("-------------------------------");
		
		//access var in interface
		//we can not change value of var in interface it is final 
		System.out.println(USBank.min_bal);
		System.out.println("-------------------------------");
		
		//access static method in interface
		USBank.m1();
		System.out.println("-------------------------------");
		
		//access static var ininterface
		System.out.println(USBank.max_bal);
		System.out.println("-------------------------------");
		
		//access non static and static var in class
		System.out.println(hsbc.min_hsbc);
		System.out.println(HSBCBank.max_hsbc);
		System.out.println("-------------------------------");
		
		//access 2nd interface methods
		hsbc.mutualFund();
		System.out.println("-------------------------------");
	}

}
