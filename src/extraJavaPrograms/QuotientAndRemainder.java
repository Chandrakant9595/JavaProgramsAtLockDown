package extraJavaPrograms;

import java.util.Scanner;

public class QuotientAndRemainder {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Divident number: ");
		int divident = scanner.nextInt();
		
		System.out.println("Enter Divisor number: ");
		int divisor = scanner.nextInt();
		
		int que = divident/divisor;
		int rem = divident%divisor;
		
		System.out.println("Quotient: "+que);
		System.out.println("Remainder: "+rem);
	}
}
