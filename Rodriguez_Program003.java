import javax.swing.*;

public class Rodriguez_Program003 extends JApplet
{
	public void init()
	{   
		String strNbr1 = JOptionPane.showInputDialog("Enter Number 1"); 
		String strNbr2 = JOptionPane.showInputDialog("Enter Number 2");
		int intNbr1 = Integer.parseInt(strNbr1);
		int intNbr2 = Integer.parseInt(strNbr2);
		int sum = intNbr1 + intNbr2;
		JOptionPane.showMessageDialog(null,intNbr1 + " + " + intNbr2 + " = " + sum);         
		System.exit(0);
	}
}
