/*
Place your name and Date at the top of every file:
Name: Cyrus Gronblom
Date: 1/26/24
The purpose of this program is to spell the Word Mississippi vertically using the letters to make each letter.  
For 90 points get the program to work spelling the word Mississippi vertically like the sample output at the bottom of the page.
For 100 points get the same output using only four methods and eight calls to those methods
*/
public class Lab01MissGronblom
{
   public static void main(String[] args) //Writes Mississipi into the console.
   {
    m(); 
    i();
    ssi();
    ssi();
    p();
    p();
    i();

   }
   
   private static void m(){ //Prints in the letter M.
    System.out.println("M     M");
    System.out.println("MM   MM");
    System.out.println("M M M M");
    System.out.println("M  M  M");
    System.out.println("M     M");
    System.out.println("M     M");
    System.out.println("M     M");
    System.out.println("");
  }
   private static void i(){ //Prints in the letter I.
    System.out.println(" IIIII ");
    System.out.println("   I   ");
    System.out.println("   I   ");
    System.out.println("   I   ");
    System.out.println("   I   ");
    System.out.println("   I   ");
    System.out.println(" IIIII ");
    System.out.println("");
  }
  //  private static void writes(){ ////Prints in the letter S. (OLD)
  //   System.out.println(" SSSSS ");
  //   System.out.println("S     S");
  //   System.out.println("S      ");
  //   System.out.println(" SSSSS ");
  //   System.out.println("      S");
  //   System.out.println("S     S");
  //   System.out.println(" SSSSS ");
  //   System.out.println("");
  // }
   private static void p(){ //Prints in the letter P.
    System.out.println("PPPPPP ");
    System.out.println("P     P");
    System.out.println("P     P");
    System.out.println("PPPPPP ");
    System.out.println("P      ");
    System.out.println("P      ");
    System.out.println("P      ");
    System.out.println("");
  }
  
  private static void ssi(){ //Prints in the letters SSI.
    System.out.println(" SSSSS ");
    System.out.println("S     S");
    System.out.println("S      ");
    System.out.println(" SSSSS ");
    System.out.println("      S");
    System.out.println("S     S");
    System.out.println(" SSSSS ");
    System.out.println("");
    System.out.println(" SSSSS ");
    System.out.println("S     S");
    System.out.println("S      ");
    System.out.println(" SSSSS ");
    System.out.println("      S");
    System.out.println("S     S");
    System.out.println(" SSSSS ");
    System.out.println("");
    System.out.println(" IIIII ");
    System.out.println("   I   ");
    System.out.println("   I   ");
    System.out.println("   I   ");
    System.out.println("   I   ");
    System.out.println("   I   ");
    System.out.println(" IIIII ");
    System.out.println("");
  }
}

/*
Example output:

M     M
MM   MM
M M M M
M  M  M
M     M
M     M
M     M

 IIIII
   I  
   I  
   I  
   I 
   I  
 IIIII
 
  SSSSS 
 S     S
 S     
  SSSSS 
       S
 S     S
  SSSSS 
 
  SSSSS 
 S     S
 S     
  SSSSS 
       S
 S     S
  SSSSS 
 IIIII
   I  
   I  
   I  
   I 
   I  
 IIIII
 
  SSSSS 
 S     S
 S     
  SSSSS 
       S
 S     S
  SSSSS 
 
  SSSSS 
 S     S
 S     
  SSSSS 
       S
 S     S
  SSSSS 
  IIIII
    I  
    I  
    I  
    I  
    I  
  IIIII
 
 PPPPPP
 P     P
 P     P
 PPPPPP
 P     
 P     
 P     
 
 PPPPPP
 P     P
 P     P
 PPPPPP
 P     
 P     
 P     
 
  IIIII
    I  
    I  
    I  
    I  
    I  
  IIIII
*/