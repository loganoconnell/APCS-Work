// Logan O'Connell

import java.awt.*;
import java.awt.image.BufferedImage;
import java.text.*;
import java.util.*;
 
public class Picture extends SimplePicture {
   public Picture () {
      super();  
   }
   
   public Picture(String fileName) {
      super(fileName);
   }
  
   public Picture(int height, int width) {
      super(width, height);
   }
  
   public Picture(Picture copyPicture) {
      super(copyPicture);
   }

   public Picture(BufferedImage image) {
      super(image);
   }

   public String toString() {
      return ("Picture, filename " + getFileName() + " height " + getHeight() + " width " + getWidth());
   }
  
   public void grayScale() {
      Pixel[][] array = getPixels2D();
         
      for (int row = 0; row < getHeight(); row++) {
         for (int col = 0; col < getWidth(); col++) {
            Pixel pixel = array[row][col];
            int average = (int)pixel.getAverage();
            pixel.updatePicture(1, average, average, average);
         }
      }
   }
   
   public void mirror() {  
      Pixel[][] pixels = getPixels2D();
      Pixel leftPixel, rightPixel;
      Color rightColor;
      
      for (int row = 0; row < getHeight(); row++) {
         for (int col = 0; col < getWidth() / 2; col++) {
            leftPixel = pixels[row][col];
            rightPixel = pixels[row][(getWidth() - 1) - col];
            rightColor = rightPixel.getColor();
            
            rightPixel.setColor(leftPixel.getColor());
            leftPixel.setColor(rightColor);
         }
      }
   } 

   public void upsideDown() {  
      Pixel[][] pixels = getPixels2D();
      Pixel topPixel, bottomPixel;
      Color bottomColor;
      
      for (int col = 0; col < getWidth(); col++) {
         for (int row = 0; row < getHeight() / 2; row++) {
            topPixel = pixels[row][col];
            bottomPixel = pixels[(getHeight() - 1) - row][col];
            bottomColor = bottomPixel.getColor();
                
            bottomPixel.setColor(topPixel.getColor());
            topPixel.setColor(bottomColor);
         }
      }   
   }    

   public void mirrorVertical() { 
      Pixel[][] pixels = getPixels2D();
      Pixel topPixel, bottomPixel;
      
      for (int col = 0; col < getWidth(); col++) {
         for (int row = 0; row < getHeight() / 2; row++) {
             topPixel = pixels[row][col];
             bottomPixel = pixels[(getHeight() - 1) - row][col];
             
             bottomPixel.setColor(topPixel.getColor());
         }
      }
   }
   
   public void mirrorHorizontal() { 
      Pixel[][] pixels = getPixels2D();
      Pixel leftPixel, rightPixel;
     
      for (int row = 0; row < getHeight(); row++) {
         for (int col = 0; col < getWidth() / 2; col++) {
            leftPixel = pixels[row][col];
            rightPixel = pixels[row][(getWidth() - 1) - col];
            
            rightPixel.setColor(leftPixel.getColor());
         }
      }
   }
   
   public void mirrorDiagonal() { 
      Pixel[][] pixels = getPixels2D();
      int x;
      
      if (getHeight() <= getWidth())
         x = getHeight();
      else
         x = getWidth();
      
      for (int r = 0; r < x; r++) {
         for (int c = 0; c < x; c++)
            pixels[r][c].setColor(pixels[c][r].getColor());
      }
   }
   
   public void mirrorTemple() { 
      Pixel[][] pixels = getPixels2D();
      
      for (int row = 0; row < 100; row++) {
         for (int col = 0; col < getWidth() / 2; col++)
            pixels[row][getWidth() - col - 1].setColor(pixels[row][col].getColor());
      }
   }

   public void rightEdgeDetection(int edgeDist) {
      Pixel[][] pixels = getPixels2D();
      Pixel leftPixel, rightPixel;
      Color rightColor;
      
      for (int row = 0; row < getHeight(); row++) {
         for (int col = 0; col < getWidth() - 1; col++) {
            leftPixel = pixels[row][col];
            rightPixel = pixels[row][col+1];
            rightColor = rightPixel.getColor();
            
            if (leftPixel.colorDistance(rightColor) > edgeDist)
               leftPixel.setColor(Color.BLACK);
            else
               leftPixel.setColor(Color.WHITE);
         }
      }
   }
   
   public void downEdgeDetection(int edgeDist) {
      Pixel[][] pixels = getPixels2D();
      Pixel topPixel, bottomPixel;
      Color bottomColor;
      
      for (int row = 0; row < getHeight() - 1; row++) {
         for (int col = 0; col < getWidth() - 1; col++) {
            topPixel = pixels[row][col];
            bottomPixel = pixels[row+1][col];
            bottomColor = bottomPixel.getColor();
            
            if (topPixel.colorDistance(bottomColor) > edgeDist)
               topPixel.setColor(Color.BLACK);
            else
               topPixel.setColor(Color.WHITE);
         }
      }
   }
}