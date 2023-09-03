package oops_practice;
      /*Write a program to print the area and perimeter of a triangle having sides of 3, 4 and 5 units by
       *  creating a class named 'Triangle' without any parameter in its constructor.
       */

public class Triangle {
	int a,b,c;
	 
	 Triangle(){
		 int a=3;
		 int b=4;
		 int c=5;
	 }
	 
	double Area(){
		double s= (a+b+c)/2;
		return Math.sqrt(s*(s-a)*(s-b)*(s-c));
		 
	 }
	 double Parameter() {
		 return (a+b+c);
	 }
	 
	 public static void main(String[]args) {
		 Triangle t = new Triangle();
		 int a=3;
		 int b=4;
		 int c=5;
		 
		 System.out.println("Area is\n"+t.Area());
		 System.out.println("parameter is\n"+t.Parameter());
		  
	 }

}
