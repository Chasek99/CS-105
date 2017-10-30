/**
 * 
 */
package test1;

import java.util.Scanner;

/**
 * @author Kress
 *
 */
public class StringQuestion {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
        System.out.print("Type your name: ");
        
        String name = console.toString();
        
        
        System.out.println("Your name is: " + name);	

	}

	

}
