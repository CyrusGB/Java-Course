/* Cyrus Gronblom
   1/26/24 */

/*******************
This program draws a rocket to the output window
This program has redundancy in it that should be eliminated
It also does not take advantage of using methods all the code is
in the main method and only the input and method calls should be
in the main method
Finally this program should use String variables for placing the name on the rocket

rename this class Lab01BRocketYourLastName and save the new file with that name
*******************/

import java.util.Random; //Imports Random for use in country selection
public class Lab01B_Gronblom
{
   public static void main(String[] args) //Creates the rocket when ran.
   {
      cone();
      module();
      chooseCountry();
      module();
      
      System.out.println("+------+"); //Prints the booster at the end.
      System.out.println("   /\\");
      System.out.println("  /  \\");
      System.out.println(" /    \\");
   }
   
   //This is provided as a sample of what a method should look like
   //private: means the method can only be called by this class
   //static: this method will not be used by objects of this class
   //void:means the method will not return anything
   //if the method did not say void it may say String, boolean, int, etc. this would 
   //show what data type the method returns.
   private static void cone(){ //Draws the cone of the rocket.
      System.out.println("   /\\");
      System.out.println("  /  \\");
      System.out.println(" /    \\");
   }//close cone method

   private static void module(){ //Draws a module of the rocket.
      System.out.println("+------+");
      System.out.println("|      |");
      System.out.println("|      |");
      System.out.println("|      |");
   }

   private static void country(String firstText, String secondText){ //Draws the country name module of the rocket.
      System.out.println("+------+");
      System.out.println("|      |");
      System.out.println("|" + firstText.toString() + "|");
      System.out.println("|" + secondText.toString() + "|");
      System.out.println("|      |");
   }

   private static void chooseCountry(){ //Randomly chooses a country.
      Random random = new Random(); //Random number.
      switch (random.nextInt(0, 3)){ //Determines the name of the country based on random number from 0 to 2.
         case 0: //Country is United States.
            country("United", "States");
            break;

         case 1: //Country is Russia.
            country("Russia", "      ");
            break;

         case 2: //Coutnry is Japan.
            country("Japan ", "      ");
      }
   }

}//close class

