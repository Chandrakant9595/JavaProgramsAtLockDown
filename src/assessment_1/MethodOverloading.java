package assessment_1;

public class MethodOverloading {
	
	public void add2Int(int a, int b) {
		System.out.println("Addition of two int is = "+(a+b));
	}
	
	public void add2Int(int a, int b, int c) {
		System.out.println("Addition of two int is = "+(a+b+c));
	}
	
	public static void main(String[] args) {
		
		MethodOverloading ml = new MethodOverloading();
		ml.add2Int(5, 5);
		ml.add2Int(5, 5, 5);
	}

}
