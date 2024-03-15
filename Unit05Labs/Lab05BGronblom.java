// Lab05BStudentLastName.java
// Student starting version of the Lab05B assignment.
// Student Name: Cyrus Gronblom Date: 3/12/24
// Purpose of Program: 
// Convert user input numbers to user input bases 
// output conversions will be in a string format
// input will check to make sure correct data type
// one method handles all bases less then 10 and the other handles hexadecimal 

import java.util.Scanner;
class Lab05BGronblom {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); //create scanner object for input
    int base = enterData(input, "Please enter the base (must be int, 2, 5, 8, or 16): "); // Base number
    int num = enterData(input, "Please enter an int to be converted into binary or hex: "); // Number to be converted
    if(base != 16){ // Check if user wants hex or binary
      System.out.println(num + " converted into binary with a base of " + base + " is: " + toBase(num, base));
    }else{ // Then hex
      System.out.println(num + " converted into hexidecimal is: " + toHex(num));
    }
  }

  //method checks for correct input from user
  //if incorrect input avoid error, send output to user and ask for correct input
  public static int enterData(Scanner console, String prompt){
      System.out.print(prompt);
      while(!console.hasNextInt()){ // Keep asking for correct input
        System.out.println("Not an int!");
        console.nextLine();
        System.out.print(prompt);
      }
      return console.nextInt();
  }

  //method for decimal input to a String base less than 10 format output
  public static String toBase(int x, int b){
    String binary = ""; // End binary number
    int currInt = x; // Get it curr-int, It's the current int 
    while(currInt > 0){ // Iterate until converted number is complete
      binary += currInt % b;
      currInt /= b;
    }
    return reverse(binary);
  }
  
  //method for decimal input to a String hex format output
  public static String toHex(int x){
    String hexi = ""; // End hexidecimal
    int currInt = x; // Get it curr-int, It's the current int 
    while(currInt > 0){ // Iterate until converted number is complete
      int remainder = currInt % 16;
      switch (remainder) { // Determine hex character for double digits
        case 10: // A
          hexi += "A";
          break;
      
        case 11: // B
          hexi += "B";
          break;

        case 12: // C
          hexi += "C";
          break;

        case 13: // D
          hexi += "D";
          break;

        case 14: // E
          hexi += "E";
          break;

        case 15: // F
          hexi += "F";
          break;

        default: // No hex character conversion
          hexi += remainder;
          break;
      }
      currInt = currInt/16;
    }
    return reverse(hexi);
  }

  //method for returning the reversed version of a string
  public static String reverse(String s){ // Returns reversed string
		String reversedString = ""; // reversed version of s
		for (int i = 0; i < s.length(); i++) { // Iterates through the string, taking the last letter - i and adding it to the reversed version.
			reversedString += s.charAt(s.length()-1 - i);
			//System.out.println("Reversed letter at: " + (s.length() - i -1) + " became: " + reversedString); DEBUG
		}
    return reversedString;      
	}
}