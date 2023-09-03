package basic_practice;

import java.util.Scanner;

public class practice6 {

	public static void main(String[] args) {
		// Write a Java program to print the sum (addition), multiply, subtract, divide and remainder of two numbers
		Scanner input = new Scanner(System.in);
		
		System.out.println("enter first no.");
		int a = input.nextInt();
		
		System.out.println("enter second no.");
		int b = input.nextInt();
		
		int add = a+b;
		int sub = a-b;
		int mul = a*b;
		int div = a/b;
		int quotent = a%b;
		
		System.out.println(add);
		System.out.println(sub);
		System.out.println(mul);
		System.out.println(div);
		System.out.println(quotent);
	}

}
