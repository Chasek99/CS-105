/**
 * 
 */
package lab4;

/**
 * @author Kress
 *
 */
public class Number2 {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String a = "king";
		String b = "two";
		String c = "queen";
		String two = "five";

		sentence(a, b, c);
		sentence("b", c, c);
		sentence(two, "two", a);
		sentence(c, a, b);
		sentence(two, "queen", b);
		}

	 static void sentence(String b, String c, String a) 
		{
		System.out.println("a " + c + " and a " + a + " beats a " + b);
		}
	}


