/**
 * 
 */
package test1;

/**
 * @author Kress
 *
 */
public class LoopTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		 for (int line = 1; line <= 5; line++) {
			 for( int j = 1; j <= (-1 * line + 5); j++) {
				 System.out.println(".");
			 }
			 System.out.print(line);
			 for (int j =1; j <=(line -1); j++) {
				 System.out.println(".");
			 }
			 
		 	}
		  
	}

}
//for (int line = 1; line <= 5; line++) {
//	 for( int j = 1; j <= (-1 * line + 5); j++) {
//		 System.out.println(".");
//	 }
//	 System.out.print(line);
