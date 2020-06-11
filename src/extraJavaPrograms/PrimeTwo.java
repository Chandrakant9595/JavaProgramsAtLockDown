package extraJavaPrograms;

import java.util.Scanner;

public class PrimeTwo {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Starting number from: ");
		int low = scanner.nextInt();
		
		System.out.print("Ending number to: ");
		int high = scanner.nextInt();
		
		while(low<high) {
			
			boolean flag = false;
			
			for(int i=2; i<low/2; i++) {
				if(low%i==0) {
					flag=true;
					break;
				}
			}
			if(!flag) {
				System.out.println(low+ " ");
			}
			low++;
		}	
	}
}
