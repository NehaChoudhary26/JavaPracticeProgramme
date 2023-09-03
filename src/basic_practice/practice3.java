package basic_practice;

import java.util.Scanner;

public class practice3 {

	public static void main(String[] args) {
		// Write a Java program to divide two numbers and print on the screen
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter dividend value");
		int a = input.nextInt();
		
		System.out.println("Enter divisor value");
		int b = input.nextInt();
		
		int result = a/b;
		System.out.println("result is\n"+result);

	}

}
