package test1;
import java.util.Scanner;
public class Test {

	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		
		al(console);
		
	}

	public static void al(Scanner console)
	{
		System.out.print("Give me a double: ");
		double d = console.nextDouble();
		System.out.print("Give me a string: ");
		String s = console.next();
		
		System.out.print("The string " + s + " has " + s.length() + " letters");
		System.out.printf("the double d is: %.3f ", d);
	}
}
