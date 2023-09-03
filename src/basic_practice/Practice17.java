package basic_practice;

public class Practice17 {

	public static void main(String[] args) {
		// Reverse a number
		
		int num= 1234;
		int reverse=0,remender;
		
		while(num!=0) {
			remender=num%10;
			num=num/10;
			reverse=reverse*10+remender;
		}
			System.out.print(reverse);
		}

	}


