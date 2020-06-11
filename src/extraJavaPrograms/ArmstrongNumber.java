package extraJavaPrograms;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num = scanner.nextInt();
		
		int temp = num;
		int n = 0;
		
		while(num != 0) {
			int i = num % 10;
			num = num / 10;
			n = n+(i*i*i);
		}
		
		if(temp==n) {
			System.out.println("Armstrong number");
		}else {
			System.out.println("Not Armstrong number");
		}
	}
}
