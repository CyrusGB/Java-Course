// Lab07AStudentLastName.java
// Student starting version of the Lab07A assignment.
// Student Name: Cyrus Gronblom Date: 3/25/24
// Purpose of Program: 
// Use the Sieve of Eratosthenes to compute primes  
// to an upper bound set by user input
// The indexes of a boolean array will be used to represent prime numbers 
// at end of algorithm anything still true is prime  

import java.util.Scanner;

class Lab07AGronblom {
  
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in); // scanner for input from user
    System.out.println("\n\n"); 
    final int MAX = enterData(input, "Enter the primes upper bound  ===>>  "); // upper bound of prime numbers
		boolean primes[] = new boolean[MAX]; // array of bools from 0 - MAX
		computePrimes(primes);
		displayPrimes(primes);
  }
  
  //method that uses Sieve of Eratosthenes and a 
  //Boolean array to calculate primes up to MAX
  public static void computePrimes(boolean primes[]){
		System.out.println("\n\nCOMPUTING PRIME NUMBERS");
    for (int i = 0; i < primes.length; i++) { // Set all indexes to true
      primes[i] = true;
    }
    for (int i = 2; i < primes.length; i++) { // First part of the Seive of Eratosthenes 
      for (int j = 2 * i; j < primes.length; j += i) { // set indexes which are not prime to false
        primes[j] = false;
      }
    }
  }

  //method that outputs the boolen array contents
  //output is set to 10 numbers per line
  //printf is used so each number is printed in 5 spaces
	public static void displayPrimes(boolean primes[]){
		System.out.println("\n\nPRIMES BETWEEN 1 AND "+ primes.length);
		int spaceIndex = 0; // counter for numbers per line
    for (int i = 2; i < primes.length; i++) { // Print formatted list of prime numbers
      if(primes[i]){ // Print only if prime number
          System.out.printf("%5d", i);
          spaceIndex ++;
        if((spaceIndex) % 10 == 0){ // Limit to 10 numbers a line
          System.out.println();
        }
      } 
    }
    System.out.println();

    
  }

  //method that checks for correct input from user
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

}