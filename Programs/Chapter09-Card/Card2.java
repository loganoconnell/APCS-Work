// The <Card3> class is encapsulated - great.  Our next task is to create two constructor methods.  
// The first will be the default, no parameter, method that will contruct, by default, a 2 of clubs.  
// The second, overloaded method, will construct a card of your choosing, using the parameters suit, rank and value.
public class Card2 {
   private String suit;
   private String rank;
   private int pointValue;

 //Add in the default constructor Card2() that will by default construct a 2 of clubs. In other words,
 //it should assign "Clubs" to suit, '2' to rank and '2' to pointValue.   
   public Card2() {
       suit = "Clubs";
       rank = "2";
       pointValue = 2;
        
   }

 //Add in a second, now overloaded, constructor that allows you to instantiate any card.
   public Card2(String s, String r, int pV) {
       suit = s;
       rank = r;
       pointValue = pV;
        
   }
        
   public String getSuit() { return suit; }

   public String getRank() { return rank; }

   public int getPointValue() { return pointValue; }
   
   public void setSuit(String s) { suit = s; }
   
   public void setRank(String r) { rank = r; }
   
   public void setPointValue(int pV) { pointValue = pV; }
   
 //Add in a toString() method that will return a card's attributes in the form: [Hearts, Jack, 10], for example.
   public String toString() {
       return ("[" + suit + ", " + rank + ", " + String.valueOf(pointValue) + "]");
    } 
 }