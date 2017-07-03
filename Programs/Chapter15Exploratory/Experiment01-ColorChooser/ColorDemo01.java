// ColorDemo01.java
// This demo shows the Red, Green and Blue color
// with their highest (255) intensity values.

import java.awt.*;
import java.applet.*;


public class ColorDemo01 extends Applet
{
	public void paint(Graphics g)
	{
      Color brightRed = new Color(255,0,0);
      Color brightGreen = new Color(0,255,0);
      Color brightBlue = new Color(0,0,255);
      
      System.out.println("Red:   " + brightRed);
      System.out.println("Green: " + brightGreen);
      System.out.println("Blue:  " + brightBlue);
      
      g.setColor(brightRed);
      g.fillRect(50,100,200,200);
      
      g.setColor(brightGreen);
      g.fillRect(300,100,200,200);
      
      g.setColor(brightBlue);
      g.fillRect(550,100,200,200);
	}
}

