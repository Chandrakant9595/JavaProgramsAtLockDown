package assessment_1;

public class CallByValueExample {

	int data = 500;
	
	void m1(int data) {
		data = data+100;
	}
	
	public static void main(String[] args) {

		CallByValueExample cbv = new CallByValueExample();
		
		System.out.println("Original value: " +cbv.data);
		
		cbv.m1(200);
		
		System.out.println("Afte change: " +cbv.data);
	}

}
