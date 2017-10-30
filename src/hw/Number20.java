package hw;
import java.util.Scanner;   
public class Number20 {

	public static void main(String[] args) 
	{	
		
		
		Scanner scanner = new Scanner(System.in);
		
		
		System.out.println("On what day of the month were you born?");
		 String day = scanner.nextLine();
		System.out.println("What is the name of the month in which you were born?");
		 String month = scanner.nextLine();
		System.out.println("During what year were you born?");
		 String year = scanner.nextLine();
		 
		System.out.println("You were born on " + month + " " + day + ", " + year + "." +" You're mighty old!" );
	}

}
