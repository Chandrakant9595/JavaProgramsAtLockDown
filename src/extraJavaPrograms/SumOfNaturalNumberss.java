	package extraJavaPrograms;

import java.util.Scanner;

public class SumOfNaturalNumberss {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number for upto the sum of Natural number: ");
		int num = scanner.nextInt();
		int sum = 0;	
		
		for(int i=1; i<=num; i++) {
			sum = sum+i;
		}
		
		System.out.println("Sum of natural number is: "+sum);
	}
}
