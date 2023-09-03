package loops_Practice;

import java.util.Scanner;

public class Practice3 {

	public static void main(String[] args) {
	/* Write a program that prompts the user to input a positive integer. It should then print the 
		multiplication table of that number. */
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter input no.");
		int n = input.nextInt();
		
		for(int i=1;i<=10;i++ ) {
			int mul = n*i;
			System.out.println(mul);
		}
		

	}

}
