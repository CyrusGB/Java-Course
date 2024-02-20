// Lab04BStudentLastName.java
// Student starting version of the Lab04B assignment.
// Student Name: Cyrus Gronblom Date: 2/15/24
// Purpose of Program: 
// Create a palindrome class that determines if a word is 
// the same, or almost the same, forwards and backwards 

import java.util.Scanner;

class MainLab04BGronblom {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // User input
    boolean notFinished = false; // Done looking for palindromes
    do{ // Keep asking user for new strings until they say "N"
        System.out.print("Enter a string  ===>>  ");
        String str = input.nextLine();
        System.out.println();
        System.out.println("Entered String:     " + str);
        System.out.println("Palindrome:         " + Palindrome_Gronblom.isPal(str));
        System.out.println("Almost Palindrome:  " + Palindrome_Gronblom.almostPal(str));   
        System.out.print("Do you wish to repeat this program [Y/N]?  ===>>  ");
        String repeat = input.nextLine().toUpperCase();
        notFinished = (repeat.equals("Y"));
        System.out.println();
    }while (notFinished);
    System.out.println("Fine! I didnt want to check for any more palindromes anyway! >:(");
  }
}