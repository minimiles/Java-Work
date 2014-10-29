import java.util.Scanner;

public class Rodriguez_Minilab002 
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		int education;// years in school
		int age;
		double income;
		int people;
		
		System.out.println("Enter years in school ====>");
		education=input.nextInt();
		System.out.print("Enter Age ====>");
		age=input.nextInt();
		
		if (education >=12 && age>=17)
		{	System.out.println("You can use this tool.");
			System.out.println("Enter your income ====>");
			income = input.nextDouble();
			System.out.println("Enter amount of people in your household ====>");
			people=input.nextInt();
			if(income<=1000 || people>=6)
				System.out.println("You can use our extra help tool");
			else 
				System.out.println("You continue on this toolss help");
		}
		else
			System.out.println("You can not use this tool.");
		
	}
}
