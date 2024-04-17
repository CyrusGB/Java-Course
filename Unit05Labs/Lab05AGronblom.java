// Lab05AStudentLastName.java
// Student starting version of the Lab05A assignment.
// Student Name: Cyrus Gronblom Date: 2/20/24
// Purpose of Program: 
// demonstrate solution of the fencepost problem by drawing a fence 
// program will be able to draw a fence with a for, while or do while loop
// program will also check for proper user input 

import java.awt.*;
import javax.swing.JFrame;
import java.util.Scanner;

public class Lab05AGronblom extends Canvas {
   
  //set width and height of canvas
  private static int Cwidth = 1600;
  private static int Cheight = 500;
  
  public static void main(String[] args) {
    JFrame frame = new JFrame("Cyrus Gronblom");
    //main method has to exist in file being run
    //code below create a jframe with a canvas on it
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Canvas canvas = new Lab05AGronblom();//constructor must match class name
    canvas.setSize(Cwidth, Cheight);
    canvas.setBackground(Color.WHITE);//colors:RED,GREEN,BLUE,YELLOW,MAGENTA,CYAN,WHITE,BLACK,GRAY,LIGHT_GRAY,DARK_GRAY,PINK,ORANGE    
    frame.add(canvas);
    frame.pack();
    frame.setVisible(true);
    //end canvas code, do not edit
  }

  public void paint(Graphics g){
    Scanner input = new Scanner(System.in); //create scanner object for input
    int distance = 60; // Distance inbetween fence posts

    int sections = getInt(input, "How many sections of fence would you like?: "); // Sections of fence
    int loopType = getInt(input, "Which loop type should be used? (1 = for, 2 = while, 3 = do while)?: "); // Loop type
    
    input.close(); // Kill input

    switch (loopType) { // Determine loop type
      case 1: // For loop
        for (int i = 0; i < sections; i++) {
          drawPicket(g, i * distance);
          if(i < sections){
            drawRails(g, i * distance);
          }
        }
        break;
      
      case 2: // While loop
        int sectionsDone = 0;
        while (sectionsDone < sections){
          drawPicket(g, sectionsDone * distance);
          if(sectionsDone < sections){
            drawRails(g, sectionsDone * distance);
          }
          sectionsDone ++;
        }

      case 3: // Do while loop
        int sectionsComplete = 0;
        do{
          drawPicket(g, sectionsComplete * distance);
          if(sectionsComplete < sections){
            drawRails(g, sectionsComplete * distance);
          }
          sectionsComplete ++;
        }while (sectionsComplete < sections);
        break;
    } // End Switch
    drawPicket(g, distance * sections);
    System.out.println("Done!");
  }//end paint
  
  
  //method that checks for correct input from user
  //if incorrect input avoid error, send output to user and ask for correct input
  public static int getInt(Scanner console, String prompt){
    System.out.print(prompt);
    while(!console.hasNextInt()){ // Keep asking for correct input
      System.out.println("Not an int!");
      console.nextLine();
      System.out.print(prompt);
    }
    return console.nextInt();
  }
  
  //method for painting a fence post to canvas window
  public static void drawPicket(Graphics g, int x){
    int picketWidth = 30; // Width of picket
    int picketHeight = 80; // Height of picket
    int pointHeight = 10; // Height of pointy part (included in picket height)
    g.setColor(Color.LIGHT_GRAY);
    Polygon picket = new Polygon(); // Picket polygon
    picket.addPoint(x, 350);
    picket.addPoint(x, 350 - picketHeight + pointHeight); // To the bottom of the point
    picket.addPoint(x + picketWidth / 2, 350 - picketHeight); // To tip of point
    picket.addPoint(x + picketWidth, 350 - picketHeight + pointHeight); // Back to bottom
    picket.addPoint(x + picketWidth, 350); 
    g.fillPolygon(picket);
  }
  
  //method for painting two rails inbetween posts.
  public static void drawRails(Graphics g, int x){
    g.setColor(Color.BLACK);
    g.fillRect(x + 30, 300, 60, 20);
    g.fillRect(x + 30, 325, 60, 20);
  }

   
}//end class