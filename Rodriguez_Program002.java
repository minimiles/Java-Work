
import java.awt.*;
import java.applet.*;

public class Rodriguez_Program002 extends Applet
{
	public void paint (Graphics g)
	{
		street st=new street(g);
		car tc=new car(g);
		wheel wh=new wheel(g);
	}
}
class street
{
	public street(Graphics g)
	{
		for (int k = 5; k <= 485; k+=40)
		g.setColor(Color.gray);
		g.fillRect(0,0,500,200);
		g.setColor(Color.yellow);
		g.fillRect(5,75,30,10);
		g.fillRect(45,75,30,10);
		g.fillRect(85,75,30,10);
		g.fillRect(125,75,30,10);
		g.fillRect(165,75,30,10);
		g.fillRect(205,75,30,10);
		g.fillRect(245,75,30,10);
		g.fillRect(295,75,30,10);
	}
}

class car
{
	public car(Graphics g)
	{
		g.setColor(Color.red);
		g.fillRect(20, 125,125,50);
		g.setColor(Color.orange);
		g.fillRect(165,125,125,50);
	}
}
class wheel
{
	public wheel(Graphics g)
	{
		g.setColor(Color.black);
		g.fillOval(30,160,25,25);
		g.fillOval(105,160,25,25);
		g.fillOval(175,160,25,25);
		g.fillOval(250,160,25,25);
	}
}
