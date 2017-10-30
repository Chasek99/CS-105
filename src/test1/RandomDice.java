package test1;

import java.util.Random;

public class RandomDice {

	public static void main(String[] args) 
	{
		Random rand = new Random(); 
		int d1 = 0;
		int d2 = 0;
		int tries = 0;
		
		while (d1 + d2 != 7)
		{
			 d1 = rand.nextInt(6) + 1; 
			 d2 = rand.nextInt(6) + 1;
			System.out.println(d1 + " + " + d2 + " = " + (d1 + d2));
			tries++;
		}
		System.out.println("You won after " + tries + " tries!");
	}

}
