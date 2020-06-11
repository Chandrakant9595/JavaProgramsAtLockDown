package extraJavaPrograms;

import java.util.Scanner;

public class CharacterIsAlphabetOrNot {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a Alphabet: ");
		char c = scanner.next().charAt(0);
		
		if((c>='a' && c<='z') || (c>='A' && c<='Z')) {
			System.out.println("Entered character is Alphabet: "+c);
		}else {
			System.out.println("Entered character is not Alphabet: "+c);
		}
	}

}
