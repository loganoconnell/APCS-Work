// ColorDemo02.java
// This color demo shows a new random color and its
// RGB values each time it is executed.


import java.awt.*;
import java.applet.*;


public class ColorDemo02 extends Applet
{
	public void paint(Graphics g)
	{
      int rndRed = (int) (Math.random() * 255);
      int rndGreen = (int) (Math.random() * 255);
      int rndBlue = (int) (Math.random() * 255);
      Color randomColor = new Color(rndRed,rndGreen,rndBlue);
      g.setColor(randomColor);
      g.fillRect(50,50,400,400);
      
      g.setColor(Color.black); 
      g.setFont(new Font("Arial",Font.BOLD,48)); 
      String colorString = "[" + rndRed + "," + rndGreen + "," + rndBlue + "]"; 
      g.drawString(colorString,100,225);
	}
}

