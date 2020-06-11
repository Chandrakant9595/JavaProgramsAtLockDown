package assessment_1;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LowestAndLargestNo {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number one: ");
		int one = scanner.nextInt();
		
		System.out.println("Enter number two: ");
		int two = scanner.nextInt();
		
		System.out.println("Enter number three: ");
		int three = scanner.nextInt();
		
		System.out.println("Enter number four: ");
		int four = scanner.nextInt();
		
		System.out.println("Enter number five: ");
		int five = scanner.nextInt();
		
		List<Integer> al = new ArrayList<Integer>(); 
		al.add(one);
		al.add(two);
		al.add(three);
		al.add(four);
		al.add(five);
		System.out.println(" ");
		
		System.out.println( "Lowset number is: " + Collections.min(al));
		System.out.println( "Greatest number is: " + Collections.max(al));
	} 
		

}
