import java.awt.*;
import java.applet.*;
import java.util.*;


public class Rodriguez_Chapter11lLab extends Applet
{
	public void paint (Graphics g)
	{
		int circleAmount=40;
		Circles circles = new Circles(g,circleAmount);
		g.setColor(Color.black);
		g.drawRect(0,0,900,450);
}
class Circles 
{
private int circleCount;
private Random rnd;
private Color randomColor;
private int colorRow;

private int redCount,greenCount,blueCount;

public Circles(Graphics g,int c)
	{
	rnd=new Random(12345);
	circleCount=c;
	redCount=256;
	greenCount=256;
	blueCount=256;
	drawSquares(g);
	getRandomColorRed(g);
	drawRandomCircleRed(g);
	drawRandomCircleBlue(g);
	for (int k = 1; k<=circleCount;k++)
	drawRandomCircleRed(g);
	getRandomColorGreen(g);
	drawRandomCircleGreen(g);
	drawRandomCircleBlue(g);
		}
public void drawSquares(Graphics g)
		{
	g.setColor(Color.red);
	g.fillRect(10,100,30,30);
	g.setColor(Color.green);
	g.fillRect(10,250,30,30);
	g.setColor(Color.blue);	
	g.fillRect(10,400,30,30);
		}
public void getRandomColorRed(Graphics g)//red color
    {
	Random rand = new Random();
		for (int c=1;c<=17;c++)
		{
		int red=255;
		int green=rand.nextInt(256);
		int blue =rand.nextInt(256);
		g.setColor(new Color(red,green,blue));
		
		}
    }
public void drawRandomCircleRed(Graphics g)//red set
	{
	int x1=60;
	int y1=100;
	for (int n=1;n<=17;n++)
		{
		g.fillOval(x1,y1,30,30);
		x1+=50;
		}
	}

public void getRandomColorGreen(Graphics g)//green color
	{
	Random rand1 = new Random();
	for (int c=1;c<=17;c++)
		{
	int red=rand1.nextInt(256);
	int green=255;
	int blue =rand1.nextInt(256);
	g.setColor(new Color(red,green,blue));
		}
	}
public void drawRandomCircleGreen(Graphics g)//green set
{
	int x1=60;
	int y1=250;
	for (int n=1;n<=17;n++)
	{
	g.fillOval(x1,y1,30,30);
	x1+=50;
	}
}
public void getRandomColorBlue(Graphics g)//blue color
{
Random rand1 = new Random();
for (int c=1;c<=17;c++)
	{
int red=rand1.nextInt(256);
int green=rand1.nextInt(256);
int blue =255;
g.setColor(new Color(red,green,blue));
	}
}
public void drawRandomCircleBlue(Graphics g)//blue set
{
	int x1=60;
	int y1=400;
	for (int n=1;n<=17;n++)
	{
	g.fillOval(x1,y1,30,30);
	x1+=50;
	}
}
}
}




