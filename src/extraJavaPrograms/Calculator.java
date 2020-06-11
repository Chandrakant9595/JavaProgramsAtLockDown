package extraJavaPrograms;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter First numbers: ");
		int one = scanner.nextInt();
		
		System.out.print("Enter First numbers: ");
		int two = scanner.nextInt();
		
		System.out.print("Enter operatpr (+, -, *, /): ");
		char operator = scanner.next().charAt(0);
		
		int result=0;
		
		switch (operator) {
		case '+':
			result=one+two;
			break;
			
		case '-':
			result=one-two;
			break;
			
		case '*':
			result=one*two;
			break;
			
		case '/':
			result=one/two;
			break;

		default:
			System.out.println("Please select correct opeator");
			break;
		}
		System.out.println(result);
	}
}
