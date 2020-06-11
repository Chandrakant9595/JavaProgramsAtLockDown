package extraJavaPrograms;

import java.util.Scanner;

public class PositivenegitiveNumber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number: ");
		double no = scanner.nextDouble();
		
		if(no<0.0) {
			System.out.println("Negitive number: "+no);
		}else if(no>0.0) {
			System.out.println("Positive number: "+no);
		}else {
			System.out.println("Number is zero: "+no);
		}
	}
}
