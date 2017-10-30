package hw;

public class Number17 {

	public static void main(String[] args) 
	{
		padString("hello", 8);
		padString("congratulations", 10);
		
	}
	
	public static void padString (String string, int y)
	{
		System.out.print(string);
		for(int i =1; i<= y - string.length(); i++)
		{
			System.out.print(" ");
		}
		System.out.println();
		
	}
	
	
}
