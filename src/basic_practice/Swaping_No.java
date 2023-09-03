package basic_practice;

import java.util.Scanner;

public class Swaping_No {

	public static void main(String[] args) {
		int t;
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the value of x");
		int x = sc.nextInt();
		
		System.out.println("enter the value of y");
		int y = sc.nextInt();
		//Swaping
		t=x;
		x=y;
		y=t;
		System.out.println(x);
		System.out.println(y);

	}

}
