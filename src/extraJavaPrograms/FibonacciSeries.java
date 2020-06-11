package extraJavaPrograms;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter number up to print the Fibonacci series: ");
		int num = scanner.nextInt();
		
		int f1 = 0;
		int f2 = 1;
		int sum = 0;
		System.out.println(f1);
		System.out.println(f2);
		
		int counter = 2;
		
		while(counter<num){
			sum=f1+f2;
			f1=f2;
			f2=sum;
			counter++;
			System.out.println(sum);
		}
	}

}
