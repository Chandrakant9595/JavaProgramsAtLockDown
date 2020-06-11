package extraJavaPrograms;

import java.util.Scanner;

public class RecursionSumOfNaturalNumber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter Number: ");
		int num = scanner.nextInt();
		
		int sum = addNum(num);
		System.out.println("Sum is: "+sum);
	}
	
	public static int addNum(int num) {
		
		if(num != 0) {
			return num+addNum(num-1);
		}else {
			return num;
		}
		
		
	}
}
