package navinJavaSession;

public class Day4_ArrayOneDimantation {

	public static void main(String[] args) {

		//array: to store similar data type value
		//one dim array - static array
		//disadvantages - 1) fixed size - to overcome this problem we use collection  ArrayList, HashTable, use dynamic array
		//                2) store similar data types only - to overcome this problem we use Object array
	 
		
		// 1. int array declare
		int i[] = new int[4];
		i[0] = 10;
		i[1] = 20;
		i[2] = 30;
		i[3] = 40;
		
		//print particular array index value
		System.out.println(i[2]);
		System.out.println(i[3]);
		System.out.println("----------");
		
		//get length/size of array
		System.out.println(i.length);
		System.out.println("----------");
		
		//print all values of array - use for loop
		for(int j=0; j<i.length; j++) {
			System.out.println(i[j]);
		}
		System.out.println("----------");
		
		
		
		
		// 2. double array
		double d[] = new double[3];
		d[0] = 1.1;
		d[1] = 2.1;
		d[2] = 3.1;
		
		//print particular array index value
		System.out.println(d[2]);
		System.out.println("----------");
		
		//print all values of array - use for loop
		for(int j=0; j<d.length; j++) {
			System.out.println(d[j]);
		}
		System.out.println("----------");
		
		
		
		
		// 3. char array
		char c[] = new char[3];
		c[0] = 'A';
		c[1] = 'B';
		c[2] = 'C';
		
		//print particular array index value
		System.out.println(c[2]);
		System.out.println("----------");
		
		//print all values of array - use for loop
		for(int j=0; j<c.length; j++) {
			System.out.println(c[j]);
		}
		System.out.println("----------");
		
		
		
		
		// 4. String array
		String s[] = new String[3];
		s[0] = "AAA";
		s[1] = "BBB";
		s[2] = "CCC";
		
		//print particular array index value
		System.out.println(s[2]);
		System.out.println("----------");
	
		//print all values of array - use for loop
		for(int j=0; j<s.length; j++) {
			System.out.println(s[j]);
		}
		System.out.println("----------");
		
		
		
		
		
		// 6. object array is uses to store different data type values
		Object ob[] = new Object[4];
		ob[0] = 1;
		ob[1] = "Tom";
		ob[2] = 25000.50;
		ob[3] = 'M';
		
		
		//print particular array index value
		System.out.println(ob[2]);
		System.out.println(ob[3]);
		System.out.println("----------");
		
		//print all values of array - use for loop
		for(int j=0; j<ob.length; j++) {
			System.out.println(ob[j]);
		}
		System.out.println("----------");
				
	}

}
