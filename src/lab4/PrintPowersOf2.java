/**
 * 
 */
package lab4;

/**
 * @author Kress
 *
 */
public class PrintPowersOf2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		power(3);
		power(10);
	}

	public static void power(int a)
	{
		for (int i = 0; i <=a; i++)
		{
			
			System.out.print((int)Math.pow(2,i));
			System.out.print(" ");
			
	}
		System.out.println();	
}
}