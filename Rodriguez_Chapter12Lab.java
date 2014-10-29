
import java.util.Scanner;

public class Rodriguez_Chapter12Lab 
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		computePrimes();
		//displayPrimes();

	}
	public static int computePrimes()
	 {
		{
		int primes = 0;
		for(int c=2;c<=100;c++)
{ 		primes = 0;
		if (c % 2==0)
	{
			System.out.print("");
	}
		else
			System.out.println(""+c);
}
		return primes;
		}
		
	 }
	//public static int displayPrimes()
	{
		//System.out.println("");
	}
}
