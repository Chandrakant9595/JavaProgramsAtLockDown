package extraJavaPrograms;

import java.util.Scanner;

public class Vowel {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
				
		System.out.println("Enter a character: ");
		char ch = scanner.next().charAt(0);
		
		if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u') {
			System.out.println(ch+ " is Vowel");
		}else {
			System.out.println(ch+ " is Consoant");
		}
	}
}