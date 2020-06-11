package extraJavaPrograms;

import java.util.Scanner;

public class PallindromNumber {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter a number: ");
		int num = scanner.nextInt();
		
		int rev = 0;
		int temp = num;
		
		while(num!=0) {
			int i = num%10;
			rev = rev*10+i;
			num = num/10;
		}
		
		System.out.println(rev);
		
		if(temp==rev) {
			System.out.println(temp+ " Nnumber is Pallindrom");
		}else {
			System.out.println(temp+ " Number is not Pallindrom");
		}
	}

}
