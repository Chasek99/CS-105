/**
 * 
 */
package lab4;

/**
 * @author Kress
 *
 */
public class number1 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		int a = 4, b = 7, c = -2;
		mystery(a,b,c);
		mystery(c,3,a);
		mystery(a + b,b +c ,c + a);
	}
	public static void mystery(int c,int a, int b)
	{
		b -=2;
		c = a +5;
		a = a -b;
		System.out.println(b + " + " + c + " = " + a);
	}

}
