package lab;
import java.util.*;
public class Number4 {
	
 
	public static void main(String[] args) 
	{
	Scanner console = new Scanner(System.in);
	System.out.print("How much will John and Jane be spending? ");
	double amount = console.nextDouble();
	System.out.println();
	
	int numBills = (int) (amount / 20.0);
	
	if (numBills * 20.0 < amount) 
	{
	numBills++;
	}
		System.out.println("John and Jane need " + numBills + " bills");
	}
	
	
}
	


