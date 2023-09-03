package oops_practice;

import java.util.Scanner;


	/*
	Program to print the area of a rectangle by creating a class named “Area” taking the values of its length
	 and breadth as parameters of its constructors and have a method named “returnArea” which returns the 
	 area of the rectangle. Length and breadth of the rectangle are entered through the keyboard.
	*/
     class Area{
    	 int lenth,breath;
    	
       Area(int l,int b) {       // create constructor to set dimension
    	 lenth =l;
    	 breath = b;
    	 }
     int returnArea(){
    	 return lenth*breath;
     }
     }

      public class Practice1{
    	  
    	  public static void main(String[]args) {
    		  
    		  Scanner input = new Scanner(System.in);
    		  int l,b;
    		  System.out.println("Enter input");
    		  l = input.nextInt();
    		   b = input.nextInt();
    		  
    		  Area A = new Area(l,b);
    		 
    		  System.out.println(A.returnArea());
    		  
   
}
}