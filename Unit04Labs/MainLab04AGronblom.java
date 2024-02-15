// Lab04AStudentLastName.java
// Student starting version of the Lab04A assignment.
// Student Name: Cyrus Gronblom Date: 2/13/24
// Purpose of Program: 
// take in length of three sides of triangle and output:
// if side lengths meet Triangle Inequality Theorem
// if triangle is isosceles, equilateral, or scalene
// if scalene triangle output if right angle or not
// isosceles 5 7 7
// equilateral 6 6 6
// scalene 5 7 8
// right scalene 3 4 5

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

class MainLab04AGronblom{
  //class variables represent length of triangle sides input by user 
  //declare three side int variables
  static int side1, side2, side3;

  //main method is just a fact of the Java life
  public static void main(String[] args){
    side1 = enterData(0);
    side2 = enterData(1);
    side3 = enterData(2);
    System.out.println("The side lengths entered are: " + side1 + ", " + side2 + ", " + side3);
    System.out.print("\n");
    printTriangleType(side1, side2, side3);
  }

  //takes input of three integer variables that are the lengths of three sides of a triangle
  //will make sure that the three lengths meet the triangle inequality theorem 
  //will printout if the triangle is isosceles, equilateral, or scalene, and if it is scalene
  //it will output if it is a right triangle or not
  public static void printTriangleType(int s1, int s2, int s3){
    if(s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1){ // Check if triangle follows triangle inequality theorem
      if(s1 == s2 && s1 == s3){ // Check if forms a equalateral triangle
        System.out.println("The inputted sides form an equalateral triangle.");
      }else if((s1 == s2 && s1 != s3 || s1 == s3 && s1 != s2 || s2 == s3 && s2 != s1)){ // Isosceles triangle
        System.out.println("The inputted sides form an isosceles triangle.");
      }else{ // Scalene
        List<Integer> sides = new ArrayList<Integer>(); // List of sides
        sides.add(s1);
        sides.add(s2);
        sides.add(s3);
        Collections.sort(sides); // Sort so that c is the largest side
        System.out.println("The sorted side lengths are: " + sides); 
        int a = sides.get(0), b = sides.get(1), c = sides.get(2); // Set tempory sides to side lengths
        if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2)){ // a^2 + b^2 = c^2 (to check if its a right triangle)
          System.out.println("The inputted sides form a scalene triangle which also happens to be a right triangle.");
        }else{ // its just a scalene triangle
          System.out.println("The inputted sides form a scalene triangle.");
        }
      }
    }else{ // The sides do not follow the triangle inequality theorem
      System.out.println("The inputted sides are unable to form a triangle \nas they do not conform to the triangle inequality theorem.");
    }
  
  }// endprintTriangleType

  //gets user input of three int variables that are assigned to three class int class variables
  //makes sure the user has input an int and will output an error message if incorrect input
  //and ask for correct input again and correct input entered
  public static int enterData(int timesCalled) // Prompts user for data. Needs to know if its the first or second time so it can adjust text.
	{
		String text = "1st"; // Text which changes based on the amount of times called
    if(timesCalled == 1){ // Change text to match times called
      text = "2nd";
    }else if (timesCalled == 2){ // Change text to match times called 
      text = "final";
    }
		Scanner input = new Scanner(System.in); // Input scanner
		System.out.print("\nEnter the length of the " + text + " side ----> ");
		while (!input.hasNextInt()) //make sure an int was entered
		{
			input.nextLine(); //clear the invalid input before prompting again
			System.out.print("Please enter the side length as an int (1,2,3) > ");
		}
		
    return input.nextInt();
	}
}