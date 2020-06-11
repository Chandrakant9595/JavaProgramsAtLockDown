package assessment_1;

class One{
	int i=10;
}

class Two extends One{
	int j=20;
}

class Three extends One{
	int k=30;
}

public class Hierarchicalinheritance {

	public static void main(String[] args) {
		
		Three t = new Three();
		System.out.println("class One value: " +t.i);
		System.out.println("class Three value: "+t.k);
	}

}
