package loops_Practice;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
	/* Write a program that prompts the user to input a positive integer. It should then output a message 
	 indicating whether the number is a prime number. */
		
		 Scanner input = new Scanner(System.in);
			
			System.out.println("Enter no.");
			int n = input.nextInt();
			
			int temp=0;
			
			for(int i=2;i<=(n-1);i++) {
				if(n%i==0) {
				   temp = temp+1;
				}
			}if(temp>0) {
				System.out.println("not prime no.");
			}else {
				System.out.println("a prime no.");
			}
	}
}
