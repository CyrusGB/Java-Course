// Lab03BStudentLastName.java
// Student starting version of the Lab03B assignment.
// Student Name: Cyrus Gronblom Date: 2/7/24
// Purpose of Program: 
// Modifying a class to add a constructor and methods to 
// give it complete functionality for dealing with rational numbers  

import java.util.Scanner;


public class Main
{
	private static int num1, den1;   // numerator and denominator of the rational number

	public static void main (String[] args)
	{
		enterData();
		Lab3BRationalGronblom r1 = new Lab3BRationalGronblom(num1,den1);
		r1.displayData();
		enterData();
		Lab3BRationalGronblom r2 = new Lab3BRationalGronblom(num1,den1);
		r2.displayData();
	}

	public static void enterData()
	{
		Scanner input = new Scanner(System.in);
		System.out.print("\nEnter the 1st numerator ----> ");
    while (!input.hasNextInt()) //make sure an int was entered
    {
        input.nextLine(); //clear the invalid input before prompting again
        System.out.print("Please enter The numerator as an int (1,2,3) > ");
    }
		num1 = input.nextInt();

		System.out.print("\nEnter the 1st denominator --> ");
    while (!input.hasNextInt())  //make sure an int was entered
    {
        input.nextLine(); //clear the invalid input before prompting again
        System.out.print("Please enter The denominator as an int (1,2,3) > ");
    }
		den1 = input.nextInt();
	}
}


