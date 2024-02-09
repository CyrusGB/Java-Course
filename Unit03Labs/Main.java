// Lab03BStudentLastName.java
// Student starting version of the Lab03B assignment.
// Student Name: Cyrus Gronblom Date: 2/7/24
// Purpose of Program: 
// Modifying a class to add a constructor and methods to 
// give it complete functionality for dealing with rational numbers  

import java.util.Scanner; // Imports scanner for input
public class Main
{
	private static int num1, den1;   // numerator and denominator of the rational number
	public static void main (String[] args) // Main program
	{
		enterData(false); // Prompt input
		Lab3BRationalGronblom r1 = new Lab3BRationalGronblom(num1,den1); // 1st fraction
		r1.displayData();
		enterData(true); // Prompt input for the second time
		Lab3BRationalGronblom r2 = new Lab3BRationalGronblom(num1,den1); // 2nd fraction
		r2.displayData();

		System.out.println();

		Lab3BRationalGronblom multiplied = new Lab3BRationalGronblom(); // Multiply fractions
		multiplied.multiply(r1, r2);
		System.err.println("\n" + r1.getReduced() + " * " + r2.getReduced() + " = " + multiplied.getReduced()); // Print multiplied fractions

		Lab3BRationalGronblom divided = new Lab3BRationalGronblom(); // Divide fractions
		divided.divide(r1,r2); 
		System.err.println("\n" + r1.getReduced() + " / " + r2.getReduced() + " = " + divided.getReduced()); // Print divided fractions

		Lab3BRationalGronblom added = new Lab3BRationalGronblom(); // Add fractions
		added.add(r1,r2); 
		System.err.println("\n" + r1.getReduced() + " + " + r2.getReduced() + " = " + added.getReduced()); // Print added fractions

		Lab3BRationalGronblom subtracted = new Lab3BRationalGronblom(); // Subtract fractions
		subtracted.subtract(r1,r2); 
		System.err.println("\n" + r1.getReduced() + " - " + r2.getReduced() + " = " + subtracted.getReduced()); // Print subtracted fractions
		System.err.println();
	}

	public static void enterData(Boolean secondTime) // Prompts user for data. Needs to know if its the first or second time so it can adjust text.
	{
		String text = !secondTime ? "1st" : "2nd"; // 1st or 2nd in prompt
		Scanner input = new Scanner(System.in); // Input scanner
		System.out.print("\nEnter the " + text + " numerator ----> ");
		while (!input.hasNextInt()) //make sure an int was entered
		{
			input.nextLine(); //clear the invalid input before prompting again
			System.out.print("Please enter The numerator as an int (1,2,3) > ");
		}
			
		num1 = input.nextInt();

		System.out.print("\nEnter the " + text + " denominator --> ");
		while (!input.hasNextInt())  //make sure an int was entered
		{
			input.nextLine(); //clear the invalid input before prompting again
			System.out.print("Please enter The denominator as an int (1,2,3) > ");
		}

		den1 = input.nextInt();
	}
}


