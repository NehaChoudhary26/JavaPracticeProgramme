package basic_practice;

import java.util.Scanner;

public class Practice11 {

	public static void main(String[] args) {
		// Write a Java program to print the area and perimeter of a circle
        Scanner input = new Scanner(System.in);
			System.out.println("Enter the radius of circle");
			double r = input.nextDouble();
			
			double area = Math.PI*r*r;
			double parameter = 2*Math.PI*r;
			
			System.out.println(area);
			System.out.println(parameter);
		}

	}


