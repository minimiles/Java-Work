import java.util.Scanner;
import java.text.DecimalFormat;


public class Rodriguez_Program001
{
	public static void main (String[]args)
		{
		System.out.println("Review Program AP");
		Name();
		Cal();
		Dec();
		}
public static void Name()
	{
	Scanner input = new Scanner (System.in); 
	System.out.println("Enter your first name----> ");
	String firstName = input.nextLine();
	System.out.println("Enter your last name-----> ");
	String lastName = input.nextLine();
	String fullName = firstName+lastName;
	System.out.println("Your full name is "+fullName);

	}

public static void Cal()
	{
	Scanner input = new Scanner (System.in);
	DecimalFormat output = new DecimalFormat("0,000,000");
	System.out.println("Hi I am Cal your new Calculator");
	System.out.println("How can I help you today?(Addition) enter first number here==> ");
	int num1 = input.nextInt();
	System.out.println("Enter second number here ==>");
	int num2 = input.nextInt();
	int sum= num1+num2;
	System.out.println("Your sum is "+sum);
	
	}
public static void Dec()
	{
	Scanner input = new Scanner (System.in);
	DecimalFormat output = new DecimalFormat("000,000,000");
	System.out.println("Now for the decimal format, enter your number here ----->");
	int numb1=input.nextInt();
	System.out.println("Now enter the second number here ----->");
	int numb2=input.nextInt();
	int numb3=numb1+numb2;
	System.out.println("Your sum is "+output.format(numb3));
	}
}
