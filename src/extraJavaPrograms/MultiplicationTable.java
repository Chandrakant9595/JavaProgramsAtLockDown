package extraJavaPrograms;

import java.util.Scanner;

public class MultiplicationTable {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		int num = scanner.nextInt();
		
		for(int i=1; i<=10; i++) {
			System.out.println(num + " * " + i + " = " +(num*i));
		}
	}

}
