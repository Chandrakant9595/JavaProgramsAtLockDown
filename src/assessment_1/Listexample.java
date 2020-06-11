package assessment_1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Listexample {

	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.println("Enter number First");
		int oneNumber = Integer.parseInt(br.readLine());
		
		System.out.println("Enter number Second");
		int twoNumber = Integer.parseInt(br.readLine());
		
		System.out.println("Enter number Third");
		int threeNumber = Integer.parseInt(br.readLine());
		
		System.out.println("Enter number Fourth");
		int fourNumber = Integer.parseInt(br.readLine());
		
		System.out.println("Enter number Fifth");
		int fiveNumber = Integer.parseInt(br.readLine());
		
		ArrayList<Integer> listOne=new ArrayList<Integer>();
		listOne.add(oneNumber);
		listOne.add(twoNumber);
		listOne.add(threeNumber);
		listOne.add(fourNumber);
		listOne.add(fiveNumber);
		
		System.out.println("Original list is = "+listOne);
		
		ArrayList<Integer> listtwo=new ArrayList<Integer>();
		listtwo.add(oneNumber+1);
		listtwo.add(twoNumber+1);
		listtwo.add(threeNumber+1);
		listtwo.add(fourNumber+1);
		listtwo.add(fiveNumber+1);
		
		System.out.println("Plus one number  = "+listtwo);
		
	}

}
