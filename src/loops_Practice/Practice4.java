package loops_Practice;

import java.util.Scanner;

public class Practice4 {

	public static void main(String[] args) {
	// Write a program to find the factorial value of any number entered through the keyboard. 
		
        Scanner input = new Scanner(System.in);
		
		System.out.println("Enter input no.");
		
		int n = input.nextInt();
		int fact = 1;
		
		for(int i=1;i<=n;i++) {
		 fact = fact*i;
		}
		System.out.println(fact);

	}

}
