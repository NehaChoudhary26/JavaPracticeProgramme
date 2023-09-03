package oops_practice;

	/* Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'. Assign the 
	value of roll_no as '2' and that of name as "John" by creating an object of the class Student.
	*/
	
   
   class Student{                  // create class named Studend
	   String name;                // sdeclare variable
	   int roll_no;
	   
	   Student(String name,int roll_no){         // create constructor
		   this.name = name;
		   this.roll_no=roll_no;
	   }
	   
   }

    public class Practice2 {
	public static void main(String[] args) {
		// create variable
		Student S = new Student("John", 2);
		// Print attributes
		System.out.println(S.name);
		System.out.println(S.roll_no);

	}

}
