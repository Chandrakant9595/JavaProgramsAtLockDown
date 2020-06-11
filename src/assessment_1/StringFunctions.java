package assessment_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringFunctions {

public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter string First");
		String text = br.readLine();
		
		//upper case and lower case
		System.out.println("Lower case text = " + text.toLowerCase());
		System.out.println("Upper case text = " + text.toUpperCase());
		
		//trim()
		System.out.println("Trim text = " + text.trim());
		
		//starts with end with
		System.out.println("Starts with text = " + text.startsWith("c"));
		System.out.println("Ends with text = " + text.startsWith("d"));
		
		//chatAt()
		System.out.println("chat at 3 position in text is = " + text.charAt(2));
		
		//legnth()
		System.out.println("Length of text is = " + text.length());
		
		//value of
		int i =10;
		text= String.valueOf(i);
		System.out.println("Value of = " +text+10);
		
		//replace
		String rep = "shinde";
		String s = rep.replace(text, rep);
		System.out.println("Replace text is = " +s);
		
	}
}
