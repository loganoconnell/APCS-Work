/**
 * This is the runner class for the Card2 objects, which should be completed befoe this class is used.
 * 
 * @author Logan O'Connell 
 * @version 11.29.2016
 */
public class CardRunner {
    public static void main(String[] args) {
      Card2 QS = new Card2();
      QS.setSuit("Spades");
      QS.setRank("Queen");
      QS.setPointValue(10);
   
    //  Card2 JD = new Card2("Jack", "Diamonds", 10);
      
      System.out.println(QS.toString());
    //  System.out.println(JD.toString());                       
    
    }
}