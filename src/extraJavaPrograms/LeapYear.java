package extraJavaPrograms;

import java.util.Scanner;

public class LeapYear {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter a year");
		int year = scanner.nextInt();
		
		if(((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0)) {
			System.out.println(year+" leap year");
		}else {
			System.out.println(year+ " not leap year");
		}
	}
}
