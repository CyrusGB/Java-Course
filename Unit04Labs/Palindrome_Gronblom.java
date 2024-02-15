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
	public static boolean isPal(String s){
		String reversedString = "";
		for (int i = 0; i < s.length(); i++) {
			reversedString += s.charAt(s.length() - i);
			System.out.println("Reversed letter at: " + (s.length() - i) + " became: " + reversedString);
		}
		System.out.println(reversedString);
    	return reversedString.compareTo(s) == 1 ? true : false ;      // This statement is provided to allow initial compiling.
	}
	/*
    * Precondition:  s is a String of one character.
  	* Postcondition: The value of true is returned if s is a letter and false otherwise.
  	* Note:          >>>>> This method is only completed for the 100 point version  <<<<<
  	*/
  	private static boolean isLetter(String letter){
    	return true;      // This statement is provided to allow initial compiling.
  	}
   
	/*
	* Precondition:  s is an arbitrary String.
	* Postcondition: All non-letter characters are removed from s, and this "purged" String is returned.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
	*/
	private static String purge(String s){
    	return "";        // This statement is provided to allow initial compiling.
	}
   
    /*
	* Precondition:  s is an arbitrary String.
	* Postcondition: After purging all non-letter characters from s,
	*                the value of true is returned if the resulting String is a Palindrome, false otherwise.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
	*/
	public static boolean almostPal(String s){
		return true;      // This statement is provided to allow initial compiling.
	}

}
