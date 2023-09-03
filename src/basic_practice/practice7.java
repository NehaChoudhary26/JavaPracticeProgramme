package basic_practice;

import java.util.Scanner;

public class practice7 {

	public static void main(String[] args) {
		// Write a Java program that takes a number as input and prints its multiplication table upto 10
		Scanner input = new Scanner(System.in);
		System.out.println("enter first no.");
		int a = input.nextInt();
		 int mul =1;
		for(int i=1;i<=10;i++ ) {
		 mul = a*i;
		 System.out.println(a+"*"+i+"="+mul);
		}
		
		

	}

}
