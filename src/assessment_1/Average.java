package assessment_1;

import java.util.Scanner;

/** This class is to calculate the average of 5 numbers*/  
public class Average {
 
	public static void main(String[] args) {
		int i;
		 
		System.out.print("Enter a number 5: ");
		 
		/** Enter values from user end*/
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		 
		int n=sc.nextInt();
		int[] a=new int[n];
		 
		System.out.println("Enter numbers");
		 
		 for(i=0;i<n;i++){
			 a[i]=sc.nextInt();
		 }
		 
		 /** call the static method*/
		 double avg=averageCalculation(a);
		 System.out.print("Average of (");
		 
		 for(i=0;i<n-1;i++) {
		     System.out.print(a[i]+",");
		 }
		 System.out.println(a[i]+") = " +avg/n);
	}

	/** This is the static method to calculate the average*/
	static double  averageCalculation(int a[])
	 {
	   double sum=0;
	 
	   for(int  i=0;i<a.length;i++){
	     sum= sum+a[i];
	   }  
	   return  sum;
	  }
}
