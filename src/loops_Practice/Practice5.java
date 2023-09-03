package loops_Practice;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
	/* Two numbers are entered through the keyboard. Write a program to find the value of one number raised 
		to the power of another. (Do not use Java built-in method)*/
		
       Scanner input = new Scanner(System.in);
		
		System.out.println("Enter base no.");
		int b = input.nextInt();
		
		System.out.println("Enter power no.");
		int p = input.nextInt();
		
		int result= 1;
		
		for(int i=1;i<=p;i++) {
			
				result =result*b;
		}
		System.out.println(result);
	
	}

}
