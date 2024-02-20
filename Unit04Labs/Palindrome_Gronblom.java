// Lab04BPalStudentLastName.java
// Student starting version of the Lab04B assignment.
// Student Name: Cyrus Gronblom Date: 2/15/24
// Purpose of Program: 
// Create a palindrome class the determines if a word is 
// the same, or almost the same, forwards and backwards 

class Palindrome_Gronblom{
	/*
	* Precondition:  s is an arbitrary String.
	* Postcondition: The value of true is returned if s is a Palindrome, false otherwise.
    * Note:          >>>>> This method is required for both the 80 point and the 100 point versions  <<<<<
	*/
	public static boolean isPal(String s){ // Returns if a given string is a palindrome or not
		String reversedString = ""; // reversed version of s
		for (int i = 0; i < s.length(); i++) { // Iterates through the string, taking the last letter - i and adding it to the reversed version.
			reversedString += s.charAt(s.length()-1 - i);
			//System.out.println("Reversed letter at: " + (s.length() - i -1) + " became: " + reversedString); DEBUG
		}
    	return reversedString.equals(s);      
	}
	/*
    * Precondition:  s is a String of one character.
  	* Postcondition: The value of true is returned if s is a letter and false otherwise.
  	* Note:          >>>>> This method is only completed for the 100 point version  <<<<<
  	*/
  	private static boolean isLetter(String letter){ // Checks if given string is a letter.
    	char character = letter.toUpperCase().charAt(0);
		int ascii = (int)(character);		
		if(ascii >= 65 && ascii <= 90){ // Checks if character is within the uppercase letters in acsii
			return true;
		}
		return false;      
  	}
   
	/*
	* Precondition:  s is an arbitrary String.
	* Postcondition: All non-letter characters are removed from s, and this "purged" String is returned.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
	*/
	private static String purge(String s){ // Remove all non letter chars in a string
    	String tmp = ""; // Temporary string to return
		for (char character : s.toCharArray()){ // Loop through characters in string
			if((isLetter(String.valueOf(character)))){ // Check if the character is a letter and add it to the string if so
				tmp += character;
			}
		}
		return tmp;
	}
   
    /*
	* Precondition:  s is an arbitrary String.
	* Postcondition: After purging all non-letter characters from s,
	*                the value of true is returned if the resulting String is a Palindrome, false otherwise.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
	*/
	public static boolean almostPal(String s){ // Check if the string is a palindrome after removing all non letter chars
		if(isPal(s) || !isPal(purge(s))){ // ^^^
			return false;
		}

		return true;
	}

}
