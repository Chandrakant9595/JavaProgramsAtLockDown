package extraJavaPrograms;

import java.util.Scanner;

public class ConvertHrIntoMinAndSec {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter hours ");
		int hr = scanner.nextInt();
		
		ConvertHours(hr);
	}
	
	 static void ConvertHours(int n) { 
	  
		 int minutes, seconds; 
	   
	     minutes = n * 60; 
	     seconds = n * 3600; 
	   
	     System.out.println( "Minutes = " + minutes + ", Seconds = " + seconds); 
	 } 

}
