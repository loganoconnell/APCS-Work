// Logan O'Connell

public class Lab15bTester {
   public static void main(String[] args) {
      test80Points();
      test90Points();
      test100Points();
      test110Points();
   }

   public static void test80Points() {
      Picture pix = new Picture("beach.jpg");
      pix.explore();
      pix.grayScale();
      pix.explore();
      pix.mirror();
      pix.explore();
      pix.upsideDown();
      pix.explore();
   }
   
   public static void test90Points() {
      Picture pix1 = new Picture("motorcycle.jpg");
      pix1.explore();
      pix1.mirrorHorizontal();
      pix1.explore(); 
      Picture pix2 = new Picture("motorcycle.jpg");
      pix2.mirrorVertical();
      pix2.explore();
      Picture pix3 = new Picture("motorcycle.jpg");
      pix3.mirrorDiagonal();
      pix3.explore();
   }

   public static void test100Points() {
      Picture pix = new Picture("temple.jpg");
      pix.explore(); 
      pix.mirrorTemple();
      pix.explore();
   }
   
   public static void test110Points() {
      Picture pix = new Picture("swan.jpg");
      pix.explore(); 
      pix.rightEdgeDetection(10);
      pix.explore();
      Picture pix2 = new Picture("swan.jpg");
      pix2.downEdgeDetection(10);
      pix2.explore();
   }
}