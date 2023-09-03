package basic_practice;

import java.util.Scanner;

public class Practice5 {

	public static void main(String[] args) {
		// Write a Java program that takes two numbers as input and display the product of two numbers
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter first no.");
		int a = input.nextInt();
		
		System.out.println("enter second no.");
		int b = input.nextInt();
		
		int result = a*b;
		System.out.println("product is\n"+result);

	}

}
