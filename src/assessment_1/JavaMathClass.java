package assessment_1;

import java.util.Scanner;

public class JavaMathClass {

	public static void main(String[] args) {
		
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Enter First number: ");
		int one = scanner.nextInt();
		
		System.out.println("Enter Second number: ");
		int two = scanner.nextInt();
		
		 // return the maximum of two numbers  
        System.out.println("Maximum number of One and Two is: " +Math.max(one, two));   
          
        // return the square root    
        System.out.println("Square root of One is: " + Math.sqrt(one));   
          
        //returns power 
        System.out.println("Power of One and Two is: " + Math.pow(one, two));      
  
        // return the logarithm of given value       
        System.out.println("Logarithm of One is: " + Math.log(one));   
        System.out.println("Logarithm of Two is: " + Math.log(two));  
          
        // return the logarithm of given value      
        System.out.println("log10 of One is: " + Math.log10(one));   
        System.out.println("log10 of Two is: " + Math.log10(two));    
          
        // return the log
        System.out.println("log1p of One is: " +Math.log1p(one));    
  
        // return a power  
        System.out.println("exp of One is: " +Math.exp(one));    
          
        // return (a power of 2)-1  
        System.out.println("expm1 of One is: " +Math.expm1(one));
	}

}
