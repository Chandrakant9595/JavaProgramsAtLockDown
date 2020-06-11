package extraJavaPrograms;

import java.util.Scanner;

public class PrintIntegerValue {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter an Integer value : ");
		
		int i = scanner.nextInt();
		
		System.out.println("User entered value is : "+i);
	}

}
