// Lab07CStudentLastName.java
// Student starting version of the Lab07C assignment.
// Student Name: Cyrus Gronblom Date: 4/1/24
// Purpose of Program: 
// Create a magic square based on the users input
// output magic square and rows, columns and diagonals

import java.util.Scanner;

class Lab07CGronblom {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int size = enterData(input, "Enter the odd# size of the Magic Square  ===>>  ");
    MagicSquareGronblom magic = new MagicSquareGronblom(size);

    magic.computeMagicSquare();
    magic.displayMagicSquare();
    magic.checkRows();          
    magic.checkColumns();		 
    magic.checkDiagonals();	 	 
  }
  
  
  //method that checks for correct input from user
  //if incorrect input avoid error, send output to user and ask for correct input
  public static int enterData(Scanner console, String prompt){
    System.out.print(prompt);
    int num = 0;
    boolean looping = true;
    while(looping){
      while(!console.hasNextInt()){
        console.next();
        System.out.println("Not an integer; try again");
        System.out.print(prompt);
      }
      num = console.nextInt();
      if(num % 2 == 0){
        System.out.println("Not an odd integer; try again");
        System.out.print(prompt);
      }else{
        looping = false;
      }
    }
    return num;
  }
  
}