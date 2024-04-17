// MagicStudentLastName.java
// Student starting version of the Lab07C assignment.
// Student Name: Cyrus Gronblom Date: 4/1/24
// Purpose of Program: 
// Create a magic square based on the users input
// output magic square and rows, columns and diagonals

import java.text.DecimalFormat;

class MagicSquareGronblom
{
	private int size; // Size of magic square
	private int magic[][]; // Magic square 
	private DecimalFormat output; // Format for the numbers in the square

	public MagicSquareGronblom(int s){ 
		size = s;
		magic = new int[size][size];
		output = new DecimalFormat("000");
	}

	public void computeMagicSquare(){ // Computer magic sqaure
		int r = 0; // Row
		int c = size/2; // Column, start at middle square 
		magic[r][c] = 1;
		
		for (int num = 2; num < Math.pow(size, 2) + 1; num++){ // Iterate through square while checking for special conditions
			if(num % size == 1){ // Normal operation
				r++;
			}else{ // Special condition
				r--;
				c++;
				if(r < 0){ // Number outside of box
					r = size - 1;
				}
				
				if(c == size){ // Number outside of box
					c = 0;
				}
			}

			// System.out.println(num + " | " + c + ", " + r);
			magic[r][c] = num;
			// System.out.println(num);
		}
	}

	public void displayMagicSquare(){
		System.out.println();
		System.out.println(size + "x" + size + " Magic Square");
		System.out.println("==================");
		System.out.println();

		for (int r = 0; r < magic.length; r++) { // Print out magic square
			for (int c = 0; c < magic.length; c++) { // Print out cell
				System.out.print(output.format(magic[r][c])+" ");
			}
			System.out.println();
		}
	}

	public void checkRows(){ // Check rows of square
		System.out.println();
		System.out.println("Checking Rows");
		System.out.println("=============");
		System.out.println();

		int total = 0;  // Total once checked
		for (int r = 0; r < magic.length; r++) { // Check rows
			for (int c = 0; c < magic.length; c++) { // Check columns
				total += magic[r][c];
				if(c < size -1){ // Print out number and plus sign
					System.out.print(output.format(magic[r][c]) + " + ");
				}else{ // Last number in row, print number and equals sign then total
					System.out.print(output.format(magic[r][c]) + " = " + total + "\n");
					total = 0;
				}
			}
			
		}
	}

	public void checkColumns(){ // Check columns of square
		System.out.println();
		System.out.println("Checking Columns");
		System.out.println("================");
		System.out.println();

		int total = 0; // Total once checked
		for (int c = 0; c < magic.length; c++) { // Check each column
			for (int r = 0; r < magic.length; r++) { // Each cell in column
				total += magic[r][c];
				if(r < size -1){ // Print out number and plus sign
					System.out.print(output.format(magic[r][c]) + " + ");
				}else{ // Last number in row, print number and equals sign then total
					System.out.print(output.format(magic[r][c]) + " = " + total + "\n");
					total = 0;
				}
			}
			
		}
   }

	public void checkDiagonals(){ // Check diagnals on square
		System.out.println();
		System.out.println("Checking Diagonals");
		System.out.println("==================");
		System.out.println();

		int total = 0; // Total once checked
		int r = 0; // Rows
		int c = 0; // Columns
		while(r < size - 1){ // Down to the right
			System.out.print(output.format(magic[r][c]) + " + ");
			total += magic[r][c];
			r++;
			c++;
		}
		total += magic[r][c];
		System.out.print(output.format(magic[r][c]) + " = " + total + "\n");

		total = 0;
		c = 0;
		r = 4;
		while(c < size - 1){ // Up to the right
			System.out.print(output.format(magic[r][c]) + " + ");
			total += magic[r][c];
			r--;
			c++;
		}
		total += magic[r][c];
		System.out.print(output.format(magic[r][c]) + " = " + total + "\n");
	}
}
