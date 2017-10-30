/**
 * 
 */
package shapes;

/**
 * @author Kress
 *
 */
public class Drawing {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		house();
		cup();
		shape();
		stop();
		
	}
	
	public static void shape() 
	
	{
	System.out.println("   -----");
	System.out.println(" /       \\");
	System.out.println("/         \\");
	System.out.println("\\         /");
	System.out.println(" \\       /");
	System.out.println("   -----");
	}
	
	
	public static void cup()
	{
	System.out.println("\\         /");
	System.out.println(" \\       /");
	System.out.println("   -----");
	System.out.println("  +-----+");
	}
	
	public static void stop()
	{
	System.out.println("   -----");
	System.out.println(" /       \\");
	System.out.println("/         \\");
	System.out.println("|    STOP |");
	System.out.println("\\         /");
	System.out.println(" \\       /");
	System.out.println("   -----");
	}
	
	
	public static void house()
	{
	System.out.println("  -------");
	System.out.println(" /       \\");
	System.out.println("/         \\");
	}
}
