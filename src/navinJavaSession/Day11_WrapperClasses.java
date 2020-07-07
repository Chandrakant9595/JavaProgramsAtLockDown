package navinJavaSession;

public class Day11_WrapperClasses {

	public static void main(String[] args) {
		
		String s = "100";
		System.out.println(s+20);
		
		//data conversion string to int
		int i = Integer.parseInt(s);
		System.out.println(i+20);

		//wrapper class - Integer, Character, Boolean, Double etc
		
		//data conversion string to double
		String s1 = "12.34";
		double d = Double.parseDouble(s1);
		System.out.println(d);
		
		//data conversion string to char
		String s2 = "A";
		char c = s2.charAt(0);
		System.out.println(c);
		
		//int to string
		int k = 300;
		String s4 = String.valueOf(k);
		System.out.println(s4);
		
		// double to string
		double d1 = 12.12;
		String s5 = String.valueOf(d1);
		System.out.println(s5);
		
		
	}

}
