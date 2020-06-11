package extraJavaPrograms;

import java.util.Scanner;

public class Swapumber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int firstNo = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		int secondNo = scanner.nextInt();
		
		System.out.println("");
		
		System.out.println("Before swap ");
		System.out.println("First number: "+firstNo);
		System.out.println("Second number: "+secondNo);
		
		System.out.println("");
		
		firstNo = firstNo+secondNo;
		secondNo = firstNo-secondNo;
		firstNo = firstNo-secondNo;
		
		System.out.println("After swap ");
		System.out.println("First number: "+firstNo);
		System.out.println("Second number: "+secondNo);
	}

}
