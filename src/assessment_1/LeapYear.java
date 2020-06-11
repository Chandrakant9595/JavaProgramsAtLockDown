package assessment_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class LeapYear {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter year");
		int preYear = Integer.parseInt(br.readLine()); 
		
		for (int i=2000; i<preYear; i++) {
            if ( (0 == i % 4) && (0 != i % 100) || (0 == i % 400) ){
               System.out.println("Prvious leap year = " +i);               
            }
        }
		
		System.out.println("");
		
		for (int i=2040; i>preYear; i--) {
            if ( (0 == i % 4) && (0 != i % 100) || (0 == i % 400) ){
               System.out.println("next leap year = " +i);
            }
        }
		
		
		
		
		
		/*
			if(year%100==0 && year%400==0) {
				System.out.println("Leap year is" +year);
			}
		*/
		
		
	}

}
