package extraJavaPrograms;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		int rev = 0;
		
		while(num!=0) {
			int temp = num % 10;
			rev = rev * 10 + temp;
			num = num / 10;
		}
		
		System.out.println("Reverse number is: " +rev);
	}
}
