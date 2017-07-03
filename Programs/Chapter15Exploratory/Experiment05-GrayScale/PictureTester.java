/**
 * Experiment05 (Test grayScale) 
 *
 * This class contains class (static) methods
 * that will help you test the Picture class 
 * methods.  Uncomment the methods and the code
 * in the main to test.
 * 
 * @author Barbara Ericson 
 *
 * Altered slightly by Leon Schram 02-23-15
 * Methods have been removed to focus on testing grayScale.
 *
 * This is the student starting file of experiment05.
 */
public class PictureTester
{
  
   //////////////////////////////////////////////////////////////////////////////////////////  
   
   public static void testZeroBlue()
   {
      Picture pix = new Picture("beach.jpg");
      pix.explore();
      pix.zeroBlue();
      pix.explore();
   }
  
   public static void testGrayScale()
   {
   	picture pix = new Picture("beach.jpg");
		pix.explore();
		pix.grayScale();
		pix.explore();

   }

   ////////////////////////////////////////////////////////////////////////////////////////         
  

   public static void main(String[] args)
   {
    //testZeroBlue();
    //testKeepOnlyBlue();
    //testKeepOnlyRed();
    //testKeepOnlyGreen();
    //testNegate();
    //testGrayScale();
    //testFixUnderwater();
    //testMirrorVertical();
    //testMirrorTemple();
    //testMirrorArms();
    //testMirrorGull();
    //testMirrorDiagonal();
    //testCollage();
    //testCopy();
    //testEdgeDetection();
    //testEdgeDetection2();
    //testChromakey();
    //testEncodeAndDecode();
    //testGetCountRedOverValue(250);
    //testSetRedToHalfValueInTopHalf();
    //testClearBlueOverValue(200);
    //testGetAverageForColumn(0);
   }
}