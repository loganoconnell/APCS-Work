// Lab12bv100_OCONNELL.java     This is the Student-Starting file. 
// This version is implemented with "Dynamic Arrays"
// This assignment pertains to some of the "Elevens" AP Lab Materials
//***************************************************************************
// The "Elevens" AP Lab is created for the College Board APCS
// curriculum by Michael Clancy, Robert Glen Martin and Judith Hromcik.
// Leon Schram has altered some of the "Elevens" files to focus on 
// specific CS topics as the "Elevens" Lab is integrated into the curriculum.

import java.util.ArrayList;

public class Lab12bv100_OCONNELL {
	public static void main(String[] args) {   
      Deck deck = new Deck();
      System.out.println(deck);
	}
}

class Deck {
	private ArrayList<Card> cards;
	private int size;

	public Deck() {
      cards = new ArrayList<Card>();
      
      String[] suits = {"Clubs", "Diamonds", "Hearts", "Spades"};
      String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
      int[] values = {2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11};
      
      int counter = 0;
      int suitCounter = 0;
      
      for (int i = 0; i < 52; i++) {
         if (counter == 13) {
            counter = 0;
            suitCounter++;
         }
         
         cards.add(new Card(suits[suitCounter], ranks[counter], values[counter]));
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
   
   /* shuffle() for 90 point
   private void shuffle() {
      for (int i = 0; i < 1000; i++) {
         int rand1 = (int)(Math.random() * 52);
         int rand2 = (int)(Math.random() * 52);
         Card temp1 = cards.get(rand1);
         cards.set(rand1, cards.get(rand2));
         cards.set(rand2, temp1);
      }
   } */
   
   public void shuffle() {
      for (int i = 0; i < 1000; i++) {
         for (int j = 0; j < cards.size(); j++) {
            Card card = cards.get(j);
            cards.remove(cards.indexOf(card));
            cards.add((int)(Math.random() * 52), card);
         }
      }
   }
}