package basic_practice;

public class fractionUsingMethod {
	
	public int fraction(int i,int n, int result) {
		for ( i=1; i<=n;i++) {
			 result = result*i;
		}
		return result;
	}
	
	public static void main(String[]args) {
		fractionUsingMethod fract = new fractionUsingMethod();
		int result=fract.fraction(1, 6, 1);
		System.out.println(result);
	}

}
