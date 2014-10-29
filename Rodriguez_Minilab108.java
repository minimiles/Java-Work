
public class Rodriguez_Minilab108 
{
	public static void main (String arg[])
	{
		System.out.println("2-D Arrays");
		
		String twoD[][]={ {"Tom ","Rob ","Julian "},
				{"Brady ","Gronkowski ","Edelman "}};
		
		for (int row = 0;row<4;row++)
		{
			for (int col=0;col<3;col++)
			{
				System.out.print(twoD[row][col]+"");
			}
			System.out.println();
		}
		System.out.println();
	}
}
