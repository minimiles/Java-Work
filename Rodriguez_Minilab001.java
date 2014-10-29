import java.util.Scanner;

public class Rodriguez_Minilab001
{
	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		int education;
		int age;
		System.out.print("Enter years in school ====>");
		education=input.nextInt();
		if (education>=11)
		{
			System.out.println("You have enough education to use this tool.");
			System.out.println("Enter age here ====>");
			age=input.nextInt();
			if (age<=16)
				System.out.println("You are not old enough to use this tool.");
			else
				System.out.println("You are old enough to use this tool.");
		}
		else
		{
			System.out.println("You do not have enough school years to use this tool.");
			
		}
		double income;
		int people;
		System.out.print("Enter your Income ====>");
		income=input.nextDouble();
		if (income<=1000)
		{
			System.out.println("Your income is "+income);
			System.out.println("You qualify for assistance");
			System.out.println("Enter amount of people in your family ====>");
			people=input.nextInt();
			if(people>=5)
				System.out.println("You qualify for extra asisstance ");
			else
				System.out.println("You do not qualify for extra assistance");
		}
		else
		{
			System.out.println("Your income is "+income);
			System.out.println("You do not qualify for assisstance");
		}
	}

}