package lab;
import java.util.*;
public class Number3 {

	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		double result = getCoordinates(console);
		System.out.println(result);
	}
	
	public static double getCoordinates(Scanner console) 
	{
		System.out.print("What is the x coordinate? ");
		double x = console.nextDouble();
		int negatives = 0;
		negatives = 0;
		negatives = 0;
		if (x < 0.0) 
		{
			negatives++;
		} 
		System.out.print("What is the y coordinate? ");
		double y = console.nextDouble();
		if (y < 0.0) 
		{
			negatives++;
		} 
		
			System.out.println("negatives = " + negatives);
			return x + y + negatives;
			}

}

