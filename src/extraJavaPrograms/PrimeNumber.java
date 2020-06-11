package extraJavaPrograms;

import java.util.Scanner;

public class PrimeNumber {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		int i;
		
		for(i=2; i<num && num%i!=0; i++ );
		if(i==num) {
			System.out.println("Number is prime: " +num);
		}else {
			System.out.println("Number is not prime: " +num);
		}
	}
}
