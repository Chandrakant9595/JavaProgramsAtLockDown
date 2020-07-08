package navinJavaSession;

public class Day15_FinalizeMethod {

	
	public void finalize() {
		System.out.println("finalize method");
	}
	
	public static void main(String[] args) {

		// garbage collection - delete the unused object from memory we use finalize method
		
		Day15_FinalizeMethod f1 = new Day15_FinalizeMethod();
		Day15_FinalizeMethod f2 = new Day15_FinalizeMethod();
		
		f1 = null;
		f2 = null;
		
		System.gc();
	}

}
