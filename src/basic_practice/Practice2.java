package basic_practice;

import java.util.Scanner;

public class Practice2 {

	public static void main(String[] args) {
		// Write a Java program to print the sum of two numbers
		Scanner input = new Scanner(System.in);
		System.out.println("Enter first no.");
		int a = input.nextInt();
		System.out.println("Enter second no.");
		int b = input.nextInt();
		int add = a+b;
		System.out.println("result is\n"+add);
	}

}
