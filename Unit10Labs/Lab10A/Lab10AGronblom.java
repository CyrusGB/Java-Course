import java.util.Scanner;

/**
 * A simple class to run the Magpie class.
 * @author Cyrus Gronblom
 * @version May 15, 2024
 */

class Lab10AGronblom {
   public static void main(String[] args){
      Magpie maggie = new Magpie(); // Maggie chatbot
      System.out.println("Hi im Maggie the \"chat bot\". If you want to stop talking please type \"bye\" in the chat.");
      System.out.println ("Maggie: " + maggie.getGreeting());
      Scanner in = new Scanner (System.in); // User input
      System.out.print("User:   ");
      String statement = in.nextLine();
   	
      while (!statement.toUpperCase().equals("BYE")){ // Keep sending responses until user is done
         System.out.println ("Maggie: " + maggie.getResponse(statement));
         System.out.print("User:   ");
         statement = in.nextLine();
      }
   
      System.out.println("Maggie: Fine! I didnt want to talk to you anyway.");
      in.close(); // Kill input
   }
}