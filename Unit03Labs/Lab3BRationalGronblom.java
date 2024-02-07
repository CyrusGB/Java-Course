// Lab03BRationalStudentLastName.java
// Student starting version of the Lab03B assignment.
// Student Name: Cyrus Gronblom Date: 2/7/24
// Purpose of Program: 
// Modifying a class to add a constructor and methods to 
// give it complete functionality for dealing with rational numbers  

public class Lab3BRationalGronblom{
	int startNum; // Start numerator
	int startDen; // Start denominator
	
	int gcf = 1; // Greatest common factor
	
	int reducedNum; // Reduced numerator
	int reducedDen; // Reduced denominator

	public Lab3BRationalGronblom(int numerator, int denominator){
		startNum = numerator;
		startDen = denominator;
		reducedNum = numerator;
		reducedDen = denominator;
	}

	//method will output the original, reduced, 
  	//and fractional versions of Rational object
  	//once the correct methods are created the print
  	//statements calling those methods should be
  	//uncommented for ouput in the main method
	public void displayData(){
		System.out.println();
		System.out.println(getOriginal() + " equals " + getDecimal());
		System.out.println();
		System.out.println("and reduces to " + getReduced());
		System.out.println();
	}

  	//given two ints this will calculate the 
  	//Greatest Common Factor for given numbers
	private void getGCF(int n1,int n2){
		//System.out.println("\n\nOutput getGCF process for:");
    	//System.out.println(this.getReduced());
    	int rem = 0;  //set remainder to 0, which will end while loop
		do{//begin do loop stop when remainder 0
			rem = n1 % n2;
      			//System.out.println(n1 + " % " + n2 + " = " + rem);

			if (rem == 0){//does n2 go evenly into n1?
        		gcf = n2;
       			//System.out.println("gcf = " + gcf);
      		}else{//if not switch or reset n1 & n2 to check for next possible gcf
				n1 = n2;
				n2 = rem;
        		//System.out.println("n1 = " + n1 + " & n2 = " + n2 + " & rem = " + rem);
			}//end if

		}while (rem != 0);//if remainder is 0 you have found gcf
	}

	private void reduce(){ // Reduces the numerator and denominator of the current rational.
		getGCF(startNum, startDen);
		reducedNum = reducedNum / gcf;
		reducedDen = reducedDen / gcf;
	}	

	private double getDecimal(){ // Returns the decimal equivlent to the rational.
		return (double)(reducedNum) / (double)(reducedDen);
	}

	private String getOriginal(){ // Returns the original rational that was provided as a string.
		int n1 = reducedNum * gcf; // numerator
		int n2 = reducedDen * gcf; // denominator;
		return n1 + "/" + n2;
	}

	private String getReduced(){ // Returns the reduced rational as string.
		reduce();
		return reducedNum + "/" + reducedDen;
	}
}
