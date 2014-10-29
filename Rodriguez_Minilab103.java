import java.util.Scanner;

public class Rodriguez_Minilab103 
{

	public static void main (String args[])
	{
		Scanner input = new Scanner(System.in);
		String password;
		int attempts=0;
		do
		{
			System.out.println("Enter your password:");
			password=input.nextLine();
			attempts++;
		}
		while(!password.equals("passwordLol")&&(attempts<5));
		if (password.equals("passwordLol"))
			System.out.println("Your password is correct");
		else
			System.out.println("You have run out of attempts");
	}
}
