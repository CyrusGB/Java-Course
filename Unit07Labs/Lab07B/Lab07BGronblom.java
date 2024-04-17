// Lab07BStudentLastName.java
// Student starting version of the Lab07B assignment.
// Student Name: Cyrus Gronblom Date: 3/28/24
// Purpose of Program: 
// Create a deck of cards and output the ordered deck
// ask user if should shuffle, if yes output shuffled version  

import java.util.Scanner;

class Lab07BGronblom {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    DeckGronblom deck = new DeckGronblom();
    System.out.println(deck);
    String shuff = enterData(input, "Would you like the deck shuffled [yes/no]? ");
  
    //if user responds yes shuffle the deck
    if(shuff.equals("YES")){
      deck.shuffle();
      System.out.println(deck);
    }
  }

  //get user input and check that it is what we want
  public static String enterData(Scanner console, String prompt){
    System.out.print(prompt);
    String in = console.nextLine().toUpperCase();
    //System.out.print(console.nextLine().toUpperCase());
    while(!in.equals("YES") && !in.equals("NO")){
      System.out.print(prompt);
      in = console.nextLine().toUpperCase();
    }
    return in;
  }
}