// Lab11bv100_OCONNELL.java
// This is the Student starting version of the <Deck> class lab11b assignment. 

public class Lab11bv100_OCONNELL {
	public static void main(String[] args) { 
      Deck deck = new Deck();
      System.out.println(deck);
	}
}

class Deck {
	private Card[] cards;

	public Deck() {
		cards = new Card[52];
      
      String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
      String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
      int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
      
      int suitCounter = 0;
      int counter = 0;
      
      for (int i = 0; i < 52; i++) {
         if (counter == 13) {
            counter = 0;
            suitCounter++;
         }
         
         cards[i] = new Card(suits[suitCounter], ranks[counter], values[counter]);
         counter++;
      }
      
      shuffle();
	}
   
   public String toString() {
      String ret = "";
      
      for (Card card: cards)
         ret += card.toString() + "\n";
         
      return ret;
   }
   
   private void shuffle() {
      for (int i = 0; i < 1000; i++) {
         int rand1 = (int)(Math.random() * 52);
         int rand2 = (int)(Math.random() * 52);
         Card temp1 = cards[rand1];
         cards[rand1] = cards[rand2];
         cards[rand2] = temp1;
      }
   }
}