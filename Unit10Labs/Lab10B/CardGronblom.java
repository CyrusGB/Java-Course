// CardStudentLastName.java
// Student starting version of the Lab07B Card assignment.
// Student Name: Cyrus Gronblom Date: 5/23/24
// Purpose of Program: 
// Create a deck of cards and output the ordered deck
// ask user if should shuffle, if yes output shuffled version  

public class CardGronblom
{
   private String suit;
   private String rank;
   private int value;

   public CardGronblom(String s, String r, int v){
      suit = s;
      rank = r;
      value = v;
   }

   public String getSuit()       { 
      return suit; }
   public String getRank()       { 
      return rank; }
   public int getValue()         { 
      return value; }

   public void setSuit(String s) { suit = s; }
   public void setRank(String r) { rank = r; }
   public void setValue(int v)   { value = v; } 
    
   public String toString(){
      return "[" + suit + ", " + rank + ", " + value + "]";
   }
    
   public boolean matches(CardGronblom otherCard){
      return otherCard.getSuit().equals(this.suit)
           && otherCard.getRank().equals(this.rank)
           && otherCard.getValue() == this.value;
   }
}//end Card Class
