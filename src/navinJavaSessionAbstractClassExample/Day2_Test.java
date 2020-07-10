package navinJavaSessionAbstractClassExample;

public class Day2_Test {

	public static void main(String[] args) {

		Day2_HDFCBank hd = new Day2_HDFCBank();
		hd.loan(); //abstract method
		hd.credit(); //non abstract method
		hd.debit(); //non abstract method
		System.out.println(hd.min_balance); //access var
		hd.fund();
		
		System.out.println("----------------------------------------");
		
		Day2_Bank db = new Day2_HDFCBank(); //dynamic polymorphism
		db.loan();
		db.credit();
		db.debit();
		System.out.println(hd.min_balance); //access var
		
		
		System.out.println("----------------------------------------");
		
		
	}
}
