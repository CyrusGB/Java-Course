// Lab02BStudentLastName.java
// Student starting version of the Lab02B assignment.
// Student Name: Cyrus Gronblom            Date: 1/31/24
// Purpose of Program: 
// Computes the Mortgage Payment, Total Payments, and Total Interest of a loan. 

import java.security.Principal;

public class Lab02BGronblom
{
	public static void main(String[] args)
	{
		System.out.println("Lab02B, Student Version\n");

		double principal  = 250000; // loan amount
		double annualRate = 4.25; // Yearly Rate
		double numYears   = 30; // # of years

		double R = annualRate / 12; // Month Rate
		double N = numYears * 12; // # of Months
		// Monthly Payment
		double monthlyPayment = ((R * Math.pow(R + 1, N)) / (Math.pow(R + 1, N) - 1)) * principal; 
		//Print out data
		System.out.println("Principal:         " + "$" + Math.round(principal * 100.0) / 100.0);
		System.out.println("Annual Rate:       " + "$" + Math.round(annualRate * 100.0) / 100.0);
		System.out.println("Number Of Years:   " + Math.round(numYears * 100.0) / 100.0);
		System.out.println("Monthly Payment:   " + "$" + Math.round(monthlyPayment * 100.0) / 100.0);
		System.out.println("Total:             " + "$" + Math.round(monthlyPayment * 12 * 100.0) / 100.0);
		System.out.println("Total Interest:    " + "$" + Math.round((monthlyPayment * 12 - principal) * 100.0) / 100.0);










		System.out.println();
	}
}

