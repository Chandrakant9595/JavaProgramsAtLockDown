package extraJavaPrograms;

import java.util.Scanner;

public class RecursionFactorial {

	public static void main(String[] args) {

		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		int fac = multiplyNum(num);
		System.out.println("Factorial is: "+fac);
	}
	
	public static int multiplyNum(int num) {
		
		if(num>=1) {
			return num*multiplyNum(num-1);
		}else {
			return 1;
		}
	}

}
