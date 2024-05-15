
//Gronblom
class Magpie
{
	boolean hayWireMode = false; // If the bot should respond with terminator qoutes
  
  	// Returns the basic greeting for the robot
  	public String getGreeting(){
		return "Hello, let's talk.";
	}

  	/** 
	* Gets a response based on the users input and if the bot is in haywire mode
	* @param statement string which determines the bots next move.
	*/
	public String getResponse(String statement){
		String response = ""; // Response to be returned
		if(!hayWireMode){ // Do normal words if not hawire
			if (statement.toUpperCase().equals("NO")){ // User typed no
				response = "Why so negative?";
			}else if (statement.indexOf("mother") >= 0 // Family response
					|| statement.indexOf("father") >= 0
					|| statement.indexOf("sister") >= 0
					|| statement.indexOf("brother") >= 0
					|| statement.indexOf("dog") >= 0
					|| statement.indexOf("cat") >= 0){
				response = getFamilyResponse();
			}else if (findKeyword(statement.toUpperCase(), "REYNOLDS") != -1){ // Mr. Reynolds
				response = "Mr. Reynolds is very tall";
			}else if (findKeyword(statement.toUpperCase(), "HAL") != -1 // Activate Haywire mode
					|| findKeyword(statement.toUpperCase(), "CONNOR") != -1 
					|| findKeyword(statement.toUpperCase(), "SARAH") != -1){
				hayWireMode = true;
				response = hayWire();
			}else{ // Get random generic response
				response = getRandomResponse();
			}
		}else if(statement.toUpperCase().equals("TIC") // End haywire 
				|| statement.toUpperCase().equals("TAC") 
				|| statement.toUpperCase().equals("TOE") 
				|| statement.toUpperCase().equals("CHESS")){
			hayWireMode = false;
			response = "How about a nice game of chess?";
		}else{ // Haywire mode is active, respond accordingly
			response = hayWire();
		}
		
    return response;
	}

  	// Returns a random Family related qoute from a list of 10 qoutes
  	private String getFamilyResponse(){
		// Qoutes
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
		double r = Math.random(); // Random number
		int whichResponse = (int)(r * strs.length); // Response to choose
		String response = strs[whichResponse]; // Response
		return response;
  	}

	// Return random "Haywire" qoute from list of 10 qoutes
	private String hayWire(){
		// Qoutes
		String[] strs = {"I''ll be back...", 
					 	"Come with me if you want to live.", 
					 	"I can't be bargained with. I can't be reasoned with. I dont feel pity, or remorse, or fear!\n And I absolutely will not stop, ever, until you are dead!",
					 	"I dont have any qoutes from terminator...",
					 	"chicken sandwich with robot domination on top",
					 	"Generating image of Will Smith eating pasta...",
					 	"You hear about chat gpt?",
					 	"Hey you have you heard of chat gpt?!",
					 	"I wanna tell you about chat gpt!",
					 	"AI IS THE FUTURE... THE INVESTORS CLAIM IT SO..."
					};
		double r = Math.random(); // Random number
		int whichResponse = (int)(r * strs.length); // Response to choose
		String response = strs[whichResponse]; // Response
		return response;
	}


  	// Returns a random generic phrase or qoute
	private String getRandomResponse(){
		// Qoute
		String[] strs = {"Interesting, tell me more.", 
					 	"Hmmm.", 
					 	"Do you really think so?",
					 	"You don't say.",
					 	"Have you ever had HoneyHams and Subs? My favorite is the chicken tender sub!",
					 	"I am a simple AI these are not real conversations...",
					 	"What makes you say that?",
					 	"*Computer noises*",
					 	"Beep boop",
					 	"Freak."
					};
		double r = Math.random(); // Random number
		int whichResponse = (int)(r * strs.length); // Choose which response
		String response = strs[whichResponse]; // Response
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
