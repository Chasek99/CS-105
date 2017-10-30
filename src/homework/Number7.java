/**
 * 
 */
package homework;

/**
 * @author Kress
 *
 */
public class Number7 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		largestAbsVal(7, -2, -11);
	}
	
	public static void largestAbsVal(int x, int y, int z)
	{
		System.out.print(Math.abs( Math.max(Math.max(x,y),z)));
		
		
		
	}
}