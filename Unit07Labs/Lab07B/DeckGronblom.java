// DeckStudentLastName.java
// Student starting version of the Lab07B assignment.
// Student Name: Cyrus Gronblom Date: 3/28/24
// Purpose of Program: 
// Create a deck of cards and output the ordered deck
// ask user if should shuffle, if yes output shuffled version  

class DeckGronblom {
	private CardGronblom[] cards;
	private final int SIZE = 52;

  //create other necessary class variables

  //default constructor that will create all 52 playing cards in a card array
	public DeckGronblom(){
		cards = new CardGronblom[SIZE];
    //build the deck of cards by creating 52 cards with the approriate suits, values, and ranks
    String[] suits = {"Spades", "Hearts", "Clubs", "Diamonds"};
    String[] ranks = {"Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King", "Ace"};
    int[] values = {2,3,4,5,6,7,8,9,10,10,10,10,11};
    
    int cardIndex = 0; // Card to replace with new card
    for (String suit : suits) { // Create all of the cards
      for (int i = 0; i < ranks.length; i++) { // Create all of the cards in a rank
        CardGronblom card = new CardGronblom(suit, ranks[i], values[i]); // newborn card
        // System.out.println(cardIndex);
        cards[cardIndex] = card; // Replace card
        cardIndex ++; // Iterate card index
      }
    }
  }   

  //create an overide of the toString method to printout the entire deck
  public String toString(){
    String thedeck = "";
    for (CardGronblom card : cards) {
      thedeck += card.toString();
      thedeck += "\n";
    }
    return thedeck;
  }

  //create a public shuffle method that can be called from the main method
  //shuffle will randomly shuffle the cards in the deck 1000 times
  public void shuffle(){
    for (int i = 0; i < 1000; i++) { // Replace every card in deck
      int newCardIndex = getRandom(0, 51);
      replaceCardAt(getRandom(0, 51), newCardIndex, cards[newCardIndex]);
      // System.err.println("Times shuffled = " + i);
    }
  }

  public void replaceCardAt(int indexToReplace, int newCardCurrIndex, CardGronblom newCard){ // Replaces a card at a given index using the new cards current index and the new card
      CardGronblom oldCard = cards[indexToReplace];
      cards[indexToReplace] = newCard;
      cards[newCardCurrIndex] = oldCard;
  }

  public int getRandom(int min, int max){ // Randomly generates a number, needs the min and max boundaries
    int range = max - min + 1;
    int random = (int)(Math.random() * range + min);
    return random;
 }

}//end Deck class
