package extraJavaPrograms;

import java.util.Scanner;

public class AsciiValueOfCharacter {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter Charactre: ");
		char c = scanner.next().charAt(0);
		
		System.out.println("Entered char is: "+c);
		
		int a = c;
		System.out.println("Ascii number of entered char is: "+a);
	}

}
