import java.util.Scanner;

public class Rodriguez_FinalProject 
{
	
	public static void main (String args[])
	{
		System.out.println("Choices...");
		Scanner Keyboard = new Scanner(System.in);
		System.out.println("It is Halloween time.");
		System.out.println("You and your two friends Joe and Eric are trick or treating.");
		System.out.println("While you are trick or treating you all come across a haunted house.");
		System.out.println("This house is rumored to be the most haunted house in the whole town.");
		System.out.println("It is said that whoever enters this house never returns the same.");
		System.out.println("Joe dares you to go knock and the door to see anyone is there.");
		System.out.println("Go knock on the door(A)");
		System.out.println("Tell Eric to do it.(B)");
		String temp=Keyboard.nextLine();
		char choice = temp.charAt(0);
		switch (choice)
		{
		case 'A'	: System.out.println("You went to knock on the door.");
					  System.out.println("The door slowly creaks open.");break;
		case 'B'	: System.out.println("Erik runs to the door and knocks on the door.");
		              System.out.println("He is lured in by a strange noise and disappears into the darkness.");break;
		default 	: System.out.println("Error:Not a valid choice");
		}
	}
}
