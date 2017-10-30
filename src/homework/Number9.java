/**
 * 
 */
package homework;

/**
 * @author Kress
 *
 */
public class Number9 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		System.out.println(lastDigit(3572));
		System.out.println(lastDigit(-947));
	}
	
	public static int lastDigit(int number)
	{
		int last = number % 10;

	    return Math.abs(number % 10);
	}
	

}


