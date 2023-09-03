package loops_Practice;

import java.util.Scanner;

public class Practice6 {

	public static void main(String[] args) {
	/* Write a program that prompts the user to input an integer and then outputs the number with the digits 
		reversed. For example, if the input is 12345, the output should be 54321.*/
		
       Scanner input = new Scanner(System.in);
		
		System.out.println("Enter no.");
		int n = input.nextInt();
		
		int reverse=0;
		int remender;
		
		while(n!=0) {
			remender = n%10;
			reverse = reverse*10+remender;
			n=n/10;
			
		}
		System.out.print(reverse);
	

	}

}
