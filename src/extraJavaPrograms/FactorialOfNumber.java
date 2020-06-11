package extraJavaPrograms;

import java.util.Scanner;

public class FactorialOfNumber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		int fact = 1;
		
		for(int i=1; i<=num; i++) {
			fact = fact*i; 
		}
		
		System.out.println("Factorial is: "+fact);
	}
}
