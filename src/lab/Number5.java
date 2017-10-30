package lab;

public class Number5 {

	public static void main(String[] args) 
	{
		
		System.out.println("unique : " + NumUnique(18, 3, 4));
		System.out.println("unique : " + NumUnique(4, 3, 4));
	}
	public static int NumUnique(int a, int b, int c)
	{
		int tmp = 0;
		
		if (a == b && a == c) {
			tmp = 1;
		}
		
		else if ( (a == b && b != c) 
		       || (a == c && c != b) 
		       || (b == c && a != c)) {
			tmp = 2;
		}
		
		else {
			tmp = 3;
		}
		return tmp;
	}
}
