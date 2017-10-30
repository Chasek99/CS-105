/**
 * 
 */
package lab4;

/**
 * @author Kress
 *
 */
public class PrintColumns {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Columns(8,5);
	}
	public static void Columns( int a, int b)
	{
			
		for (int i = 1; i <=a; i++)
		{
			System.out.print(i);
			for(int j =1; j <= b; j++)
			{
				System.out.print(" ");
			}
			
		}
		
	}

}
