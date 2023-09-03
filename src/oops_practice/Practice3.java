package oops_practice;



/* Assign and print the roll number, phone number and address of two students having names "Sam" and 
 *"John" respectively by creating two objects of class 'Student'.
 */
   class details{
int r_no;
Long p_no;
String adress;

// create methed
void assignvalues(int r,Long p, String a) {
    r_no =r;
    p_no= p;
    adress =a;
}
}

public class Practice3 {
public static void main(String[] args) {
// create object for student1
	details S1 = new details();
// assign values for student1
S1.r_no=10;
S1.p_no= 876745348L;
S1.adress="Gothenburg";
// print values of Student1
System.out.println(S1.r_no);
System.out.println(S1.p_no);
System.out.println(S1.adress);


// create object for student2
details S2 = new details();
		// assign values for student2
		S2.r_no=20;
		S2.p_no= 987745348L;
		S2.adress="Stockholm";
		// print values of Student1
		System.out.println(S2.r_no);
		System.out.println(S2.p_no);
		System.out.println(S2.adress);
}

}
