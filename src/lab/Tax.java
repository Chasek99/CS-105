package lab;

public class Tax {

	public static void main(String[] args) 
	{
		System.out.println("The tax on $50000 is " + Taxes(50000)); // 9237.5
		System.out.println("The tax on $27500 is " + Taxes(27500)); // 3767.5
		System.out.println("The tax on $6000 is " + Taxes(6000)); // 600.0
		System.out.println("The tax on $120000 is " + Taxes(120000)); // 28227.0

	}
	public static double Taxes(int x)
	{
		Double salary = new Double(x);
		if (x <= 7150)
		{
			return (0+ ((x-0) * 0.10));
			
		}
		else if(x > 7150 && x <= 29050)
		{
			return (715 +((x - 7150) * 0.15));
			
		}
		else if(x > 29050 && x <= 70350)
		{
			return (4000 +((x - 20950) * 0.25));
			
		}
		else if(x > 70350 && x <= 1000000)
		{
			return (14325 + ((x - 70350) * 0.28));
			
			
		}
		return x;
	}
}
