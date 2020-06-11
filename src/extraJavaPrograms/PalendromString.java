package extraJavaPrograms;

import java.util.Scanner;

public class PalendromString {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Enter String: ");
		String str = scanner.next();
		
		String rev = "";
		
		int lenght = str.length();
		
		for(int i=lenght-1; i>=0; i--) {
			rev = rev+str.charAt(i);
		}
		
		if (str.equals(rev)) {
			System.out.println("Entered string is Palendrom: " +str);
		}else {
			System.out.println("Entered string is not Palendrom: " +str);
		}

	}

}
