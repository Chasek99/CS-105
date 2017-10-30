/**
 * 
 */
package homework;

/**
 * @author Kress
 *
 */
public class Number16 {

	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) 
	{
		for (int i = 1; i <=6; i++)
		{
			for (int a = 1; a <= 2 * i - 2; a++)
			{
					System.out.print("\\");
			}
			for ( int b = 1; b <= -4 * i +26; b++)
			{
				System.out.print("!");
			}
			for (int c = 1; c <= 2 * i - 2; c++)
			{
				System.out.print("/");
			}
		
			System.out.println();
		}
		
		
	}

}
