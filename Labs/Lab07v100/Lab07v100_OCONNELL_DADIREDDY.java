// Lab07v100_OCONNELL_DADIREDDY.java
// Student Version

import java.awt.*;
import java.applet.*;
import java.util.*;							

public class Lab07v100_OCONNELL_DADIREDDY extends Applet {
	public void paint(Graphics g) {
      // ELEPHANT
   
      // Force applet to be a set size
	   this.setSize(800, 600);
      
      // Draw backround
      Background.drawBackground(g);
      // Draw body and generate a tail and 20 random hairs
      Body.drawBody(g, true, 20);
      // Draw head and generate a trunk
      Head.drawHead(g, true);
      // Draw clouds with the lightGrey color and generate 5 of them
      Clouds.drawClouds(g, Color.lightGray, 5);
	}
}