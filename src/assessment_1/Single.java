package assessment_1;

class First{
	int i=10;
}

class Second extends First{
	int j=20;
}

public class Single extends Second{

	int k=20;
	
	public static void main(String[] args) {
		Single s = new Single();
		System.out.println("First class value: "+s.i);
		System.out.println("Second class value: "+s.j);
		System.out.println("Third class value: "+s.k);

	}

}
