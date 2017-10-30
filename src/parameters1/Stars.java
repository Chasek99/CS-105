/**
 * 
 */
package parameters1;

/**
 * @author Kress
 *
 */
public class Stars {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		line(13);
		line(7);
		line(35);
		box(10,3);
		box(5,4);
		box(20,7);

	}
	
	public static void line(int star) 
	{
		for (int i = 1; i<= star; i++)
		{
			System.out.print("*");
		}
		System.out.println();
	}
	
	public static void box(int x, int y)
	{
		line(x);
		//* space *
		for (int j = 1; j<= y - 2; j++)
		System.out.print("*");
		//x-2 spaces
		for (int i = 1; i<= 2; i++)
		{
			System.out.print(" ");
		}
		System.out.print("*");
		System.out.println();
		line(x);
	}

}
