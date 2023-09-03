package basic_practice;

import java.util.Scanner;

public class Practice12 {

	public static void main(String[] args) {
		// Write a Java program that takes three numbers as input to calculate and print the average of the numbers
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter inputs");
		int a = input.nextInt();
		int b = input.nextInt();
		int c = input.nextInt();
		
		double average = (a+b+c)/3;
		System.out.println(average);
	}

}
