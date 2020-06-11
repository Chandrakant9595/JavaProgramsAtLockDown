package extraJavaPrograms;

import java.util.Scanner;

public class FloatingNumberMultiplication {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter first floating number: ");
		float f1 = scanner.nextFloat();
		
		System.out.println("Enter second floating number: ");
		float f2 = scanner.nextFloat();
		
		float mul = f1*f2;
		
		System.out.println("Floating number multiplication is: " +mul);
	}

}
