package assessment_1;

import java.util.Scanner;

public class ArrayEx {

	public static void main(String ars[]) {

		int sum = 0; 
		
		Scanner s=new Scanner(System.in);

        System.out.println("Eenter number of elements");
        int n=s.nextInt();

        int arr[]=new int[n];
        
        System.out.println("Enter elements");

        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        
        for(int i: arr){ //for printing array
        	System.out.println("Entered value is = "+i);
        	sum = sum + arr[i];
        }
        
        System.out.println("Sum of all array elements is =" +sum); 
	}
}
