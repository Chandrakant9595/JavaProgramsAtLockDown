package extraJavaPrograms;

import java.util.Scanner;

public class CountNumberOfDigitsInIntegers {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = scanner.nextInt();
		int count = 0;
		
		while(num != 0) {
			num = num/10;
			++count;
		}
		
		System.out.println("Number of degit is: " +count);
	}
}
