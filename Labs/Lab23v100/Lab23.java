// Lab23
// Logan O'Connell & Sai Daddiready

import java.awt.*;
import java.awt.event.*;
import java.applet.Applet;

public class Lab23 extends Applet implements MouseListener, MouseMotionListener, ActionListener {
   // Variables
   
   Button blackButton;
   Button redButton;
   Button greenButton;
   Button blueButton;
   Button penButton;
   Button lineButton;
   Button eraserButton;
   Button clearButton;
   Button smallButton;
   Button largeButton;
   
   Color currentColour;
   int toolType;
   
   int oldX = -1;
   int oldY = -1;
   int x1, y1;
   int xl, yl;
   int x2, y2; 
   
   public void init() {
      // Create buttons
      blackButton = new Button("Black");
      redButton = new Button("Red");
      greenButton = new Button("Green");
      blueButton = new Button("Blue");
      penButton = new Button("Pen");
      lineButton = new Button("Line");
      eraserButton = new Button("Eraser");
      clearButton = new Button("Clear");
      smallButton = new Button("Smaller");
      largeButton = new Button("Larger");

      // Make them react
      blackButton.addActionListener(this);
      redButton.addActionListener(this);
      greenButton.addActionListener(this);
      blueButton.addActionListener(this);
      penButton.addActionListener(this);
      lineButton.addActionListener(this);
      eraserButton.addActionListener(this);
      clearButton.addActionListener(this);
      smallButton.addActionListener(this);
      largeButton.addActionListener(this);

      // Create panel and add to page
      Panel buttonPanel = new Panel();
      buttonPanel.setLayout(new GridLayout(6, 2));
      
      buttonPanel.add(blackButton);
      blackButton.setBackground(Color.black);
      
      buttonPanel.add(redButton);
      redButton.setBackground(Color.red);
         
      buttonPanel.add(greenButton);
      greenButton.setBackground(Color.green);
         
      buttonPanel.add(blueButton);
      blueButton.setBackground(Color.blue);
         
      buttonPanel.add(penButton);
      buttonPanel.add(lineButton);
      buttonPanel.add(eraserButton);
      buttonPanel.add(clearButton);
      buttonPanel.add(smallButton);
      buttonPanel.add(largeButton);

      this.setLayout(new BorderLayout());
      this.add(buttonPanel, BorderLayout.NORTH);

      this.addMouseListener(this);
      this.addMouseMotionListener(this);
   }

   public void actionPerformed(ActionEvent e) {
      Graphics page = this.getGraphics();
      
      // Do action when button is clicked
      if (e.getSource().equals(redButton))
         currentColour = Color.red;
      
      if (e.getSource().equals(blueButton))
         currentColour = Color.blue;
      
      if (e.getSource().equals(greenButton))
         currentColour = Color.green;
      
      if (e.getSource().equals(blackButton))
         currentColour = Color.black;
      
      if (e.getSource().equals(penButton))
         toolType = 0;
      
      if (e.getSource().equals(eraserButton))
         toolType = 1;

      if (e.getSource().equals(lineButton))
         toolType = 6;
      
      if (e.getSource().equals(smallButton))
         toolType = 9;
        
      if (e.getSource().equals(largeButton))
         toolType = 8;
        
      if (e.getSource().equals(clearButton))
         this.getGraphics().clearRect(0, 0, 2000, 2500);
   }
   
   public void mousePressed(MouseEvent e) {
      // Mouse pressed, prepare for scribble/line drawing
      oldX = e.getX();
      oldY = e.getY();
      x1 = e.getX();
      y1 = e.getY();
      x2 = -1;
   }
   
   public void mouseDragged(MouseEvent e) {
      Graphics page = this.getGraphics();

      // Scribble
      if (toolType == 0) {
         page.setColor(currentColour);
         page.drawLine(oldX, oldY, e.getX(), e.getY());
      
         oldX = e.getX();
         oldY = e.getY();
      }
      
      // Eraser
      if (toolType == 1) {
         page.clearRect(e.getX(), e.getY(), 10, 10);
         page.setColor(currentColour);
      }
      
      // Draw line
      if (toolType == 6) {
         xl = x2;
         yl = y2;
        
         x2 = e.getX();
         y2 = e.getY();
        
         page.setXORMode(getBackground());
         
         if (xl != -1) {
            page.drawLine(x1, y1, xl, yl);
            
            if (x2 != -1)
               page.drawLine(x1, y1, x2, y2);
         }
      }
      
      // Larger stroke
      if (toolType == 8) {
         Graphics2D g2 = (Graphics2D)this.getGraphics();
         g2.setStroke(new BasicStroke(10));
         
         g2.setColor(currentColour);
         g2.drawLine(oldX, oldY, e.getX(), e.getY());
      
         oldX = e.getX();
         oldY = e.getY();
      }
      
      // Smaller stroke
      if (toolType == 9) {
         Graphics2D g2 = (Graphics2D)this.getGraphics();
         g2.setStroke(new BasicStroke(5));
         
         g2.setColor(currentColour);
         g2.drawLine(oldX, oldY, e.getX(), e.getY());
      
         oldX = e.getX();
         oldY = e.getY();
      }
   }
   
   // Handy method to move around X and Y values based on which is greater
   public int[] resolve(int newC, int oldC) {
      int start, end;
      
      if (newC < oldC) {
         start = newC;
         end = oldC;
      }
      
      else {
         start = oldC;
         end = newC;
      }
      
      int[] blah = {start, end};
      return blah;
   }
   
   // Mouse is released, draw line if needed
   public void mouseReleased(MouseEvent e) {
      Graphics page = this.getGraphics();
      
      int newX = e.getX();
      int newY = e.getY();
      int[] x = resolve(newX, oldX);
      int[] y = resolve(newY, oldY);
      
      if (toolType == 6) {
         page.setColor(currentColour);
         page.drawLine(oldX, oldY, newX, newY);
      }
      
      x2 = xl = -1;
   }
   
   // Satisfy other required listener methods
   public void mouseEntered(MouseEvent e) {}
   public void mouseExited(MouseEvent e) {}
   public void mouseMoved(MouseEvent e) {}
   public void mouseClicked(MouseEvent e) {}   
}