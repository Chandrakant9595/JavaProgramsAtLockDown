package extraJavaPrograms;

import java.util.Scanner;

public class PowerCalculation {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter Base number: ");
		int base = scanner.nextInt();
		
		System.out.print("Enter Exponent number: ");
		int exponent = scanner.nextInt();
		
		long result = 1;
		
		while(exponent != 0) {
			result *= base;
			--exponent;
		}
		
		System.out.print("Power of number is: " +result);
	}
}
