/**
 * 
 */
package homework;

/**
 * @author Kress
 *
 */
public class Number14 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		for (int a = 1; a <= 4; a++)
		{
			for (int b = 1; b <= 9; b++)
			{
				for (int c = 1; c <= 10 - b; c++)
				{
					System.out.print(10 - b);
				}
				
			}
			System.out.println();
		}	
		
	}
}
