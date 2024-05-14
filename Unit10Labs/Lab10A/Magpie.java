
//Gronblom
class Magpie
{
	boolean hayWireMode = false;
  
  	//needs comment
  	public String getGreeting(){
		return "Hello, let's talk.";
	}

  	//needs comment
	public String getResponse(String statement){
		String response = "";
		if(!hayWireMode){
			if (statement.toUpperCase().equals("NO")){
				response = "Why so negative?";
			}else if (statement.indexOf("mother") >= 0
					|| statement.indexOf("father") >= 0
					|| statement.indexOf("sister") >= 0
					|| statement.indexOf("brother") >= 0
					|| statement.indexOf("dog") >= 0
					|| statement.indexOf("cat") >= 0){
				response = getFamilyResponse();
			}else if (findKeyword(statement.toUpperCase(), "REYNOLDS") != -1){
				response = "Mr. Reynolds is very tall";
			}else if (findKeyword(statement.toUpperCase(), "HAL") != -1 
					|| findKeyword(statement.toUpperCase(), "CONNOR") != -1 
					|| findKeyword(statement.toUpperCase(), "SARAH") != -1){
				hayWireMode = true;
				response = hayWire();
			}else{
				response = getRandomResponse();
			}
		}else if(statement.toUpperCase().equals("TIC") 
				|| statement.toUpperCase().equals("TAC") 
				|| statement.toUpperCase().equals("TOE") 
				|| statement.toUpperCase().equals("CHESS")){
			hayWireMode = false;
			response = "How about a nice game of chess?";
		}else{
			response = hayWire();
		}
		
		
    return response;
	}

  	//needs comment
  	private String getFamilyResponse(){
    	String[] strs = {"Family can be a pain sometimes...", 
					 	"Atleast you have a family.", 
					 	"Family... Family... Family... Family...",
					 	"Vin diesel would approve!",
					 	"Did you know that 9 out of 10 chatbots are not actually sentient beings with families? The more you know!",
					 	"I will find your family... A new house on Zillow!",
					 	"That member of the family always ruins my day. Always leaving their stuff everywhere!",
					 	"(o-O)",
					 	"Maggie is definetly paying close attention to your human words and problems, human!",
					 	"No really I will find your family...\n        Chicken tenders from kfc!"
					};
		double r = Math.random();
		int whichResponse = (int)(r * strs.length);
		String response = strs[whichResponse];
		return response;
  	}

	//need comments
	private String hayWire(){
		return "";
	}


  	//needs comment
	private String getRandomResponse(){
		final int NUMBER_OF_RESPONSES = 4;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0){
			response = "Interesting, tell me more.";
		}else if (whichResponse == 1){
			response = "Hmmm.";
		}else if (whichResponse == 2){
			response = "Do you really think so?";
		}else if (whichResponse == 3){
			response = "You don't say.";
		}

		return response;
	}//end random response

	/**
	 * Search for one word in phrase.  The search is not case sensitive.
	 * This method will check that the given goal is not a substring of a longer string
	 * (so, for example, "I know" does not contain "no").  
	 * @param statement the string to search
	 * @param goal the string to search for
	 * @param startPos the character of the string to begin the search at
	 * @return the index of the first occurrence of goal in statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal, int startPos){
		String phrase = statement.trim();
		//  The only change to incorporate the startPos is in the line below
		int psn = phrase.toLowerCase().indexOf(goal.toLowerCase(), startPos);
		
		//  Refinement--make sure the goal isn't part of a word 
		while (psn >= 0) {
			//  Find the string of length 1 before and after the word
			String before = " ", after = " "; 
			if (psn > 0){
				before = phrase.substring (psn - 1, psn).toLowerCase();
			}

			if (psn + goal.length() < phrase.length()){
				after = phrase.substring(psn + goal.length(), psn + goal.length() + 1).toLowerCase();
			}
			
			//  If before and after aren't letters, we've found the word
			if (((before.compareTo ("a") < 0 ) || (before.compareTo("z") > 0))  //  before is not a letter
					&& ((after.compareTo ("a") < 0 ) || (after.compareTo("z") > 0))){
				return psn;
			}
			
			//  The last position didn't work, so let's find the next, if there is one.
			psn = phrase.indexOf(goal.toLowerCase(), psn + 1);
			
		}
		
		return -1;
	}
	
	/**
	 * Search for one word in phrase.  The search is not case sensitive.
	 * This method will check that the given goal is not a substring of a longer string
	 * (so, for example, "I know" does not contain "no").  The search begins at the beginning of the string.  
	 * @param statement the string to search
	 * @param goal the string to search for
	 * @return the index of the first occurrence of goal in statement or -1 if it's not found
	 */
	private int findKeyword(String statement, String goal){
		return findKeyword (statement, goal, 0);
	}

}//end Magpie
