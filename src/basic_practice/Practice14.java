package basic_practice;

public class Practice14 {

	public static void main(String[] args) {
		//Write a Java program to print an American flag on the screen.
		
		String s1= "* * * * * * ==================================\n * * * * *  ==================================";
		String s2 = "==============================================";
		for(int i=0;i<4;i++) {
			System.out.println(s1);
		}
		for(int j=0;j<=6;j++) {
			System.out.println(s2);
		}
	}
}
