package extraJavaPrograms;

import java.util.Scanner;

public class LargerNumberWithinThreeNumber {

	public static void main(String[] args) {

		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First number");
		int one = scanner.nextInt();
		
		System.out.println("Enter second number");
		int two = scanner.nextInt();
		
		System.out.println("Enter Three number");
		int three = scanner.nextInt();
		
		System.out.println("");
		
		if(one>two && one>three) {
			System.out.println(one+ " is greater");
		}else if(two>three) {
			System.out.println(two+ " is greater");
		}else {
			System.out.println(three+ " is greater");
		}
	}
}
