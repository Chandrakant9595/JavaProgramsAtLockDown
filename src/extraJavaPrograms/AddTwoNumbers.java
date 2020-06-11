package extraJavaPrograms;

import java.util.Scanner;

public class AddTwoNumbers {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first number: ");
		int one = scanner.nextInt();
		
		System.out.println("Enter second number: ");
		int two = scanner.nextInt();
		
		System.out.println("Addition of first no: "+one+ " and second no: " +two+ " is = " + (one+two));
	}

}
