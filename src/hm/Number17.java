package hm;

import java.util.Scanner;

public class Number17 {

	public static void main(String[] args) 
	{
		Scanner console = new Scanner(System.in);
		System.out.print("How many numbers? ");
		int count = console.nextInt();
		int product = 1;
		for (int i = 1; i <= count; i++) {
		    System.out.print("Next number --> ");
		    int num = console.nextInt();
		    product *= num;
		}
		System.out.println("Product = " + product);


	}

}
