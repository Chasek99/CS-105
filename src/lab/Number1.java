package lab;

public class Number1 {

	public static void main(String[] args) 
	{
		System.out.println(Median(7, 3, 9)); // 7
		System.out.println(Median(29, -14, 11)); // 11
		System.out.println(Median(752, 64, 121)); // 64
	}
	public static int Median(int a, int b, int c)
	{
		
		if (a < b && b < c || (c < b && b < a))
		{
			return b;
			
		}
		
	}
	
}
