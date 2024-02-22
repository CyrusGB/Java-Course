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
    //use getInt method to get error checked input from user
    int sections = getInt(input, "How many sections of fence would you like?");
    int distance = 60;
    for (int i = 0; i < sections; i++){
      drawPicket(g, i * distance);
    }
  }//end paint
  
  
  //method that checks for correct input from user
  //if incorrect input avoid error, send output to user and ask for correct input
  public static int getInt(Scanner console, String prompt){
    System.out.print(prompt);
    //console.next();
    return console.nextInt();
  }
  
  //method for painting a fence post to canvas window
  public static void drawPicket(Graphics g, int x){
    int picketWidth = 30;
    int picketHeight = 80;
    int pointHeight = 10;
    Polygon picket = new Polygon();
    picket.addPoint(x, 350);
    picket.addPoint(x, 350 - picketHeight + pointHeight); // To the bottom of the point
    picket.addPoint(x + picketWidth / 2, 350 - picketHeight); // To tip of point
    picket.addPoint(x + picketWidth, 350 - picketHeight + pointHeight); // Back to bottom
    picket.addPoint(x + picketWidth, 350);
    g.fillPolygon(picket);
  }
  
  //method for painting two rails inbetween posts.
  public static void drawRails(Graphics g, int x){
    
  }

   
}//end class