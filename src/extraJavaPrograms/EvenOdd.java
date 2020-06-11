package extraJavaPrograms;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int i = scanner.nextInt();
		
		if(i%2==0) {
			System.out.println(i+" Is Even number");
		}else {
			System.out.println(i+" Is Odd number");
		}
	}

}
