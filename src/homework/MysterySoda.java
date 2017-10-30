/**
 * 
 */
package homework;

/**
 * @author Kress
 *
 */
public class MysterySoda {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		String soda = "coke";
		String pop = "Pepsi";
		String coke = "pop";
		String Pepsi = "soda";
		String say = "pop";
		
		carbonated(coke, soda, pop);
		carbonated(pop, Pepsi, Pepsi);
		carbonated("pop", pop, "Kool-Aid");
		carbonated(say, "say", pop);
	}
	public static void carbonated(String coke, String soda, String pop)
	{
		System.out.println("say " + soda + " not " + pop + " or " + coke);
	}

}
