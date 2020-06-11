package assessment_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class StringEg {

	public static void main(String args[]) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter string First");
		String one = br.readLine();
		
		System.out.println("Enter string Two");
		String two = br.readLine();
		
		if(one.equals(two)) {
			System.out.println("String one and two are same");
		}else{
			System.out.println("Sting one and two are not same");
		}
		System.out.println("");
		String add = " SLK Training Program";
		System.out.println("Concatenate "+one.concat(add));
		System.out.println("concatenate "+two.concat(add));
	}
}
