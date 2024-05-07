// Unit08Labs
// Unit 8 Drawing on a canvas using classes.
// Student Name: Cyrus Gronblom Date: 04/16/24
// Purpose of Program: 
// Demonstrate my knoledge of objects and classes and draw a "nice" scene.

import java.awt.*;
import javax.swing.JFrame;
import java.util.Scanner;

public class CanvasClassesMainGronblom extends Canvas {
    
   //set width and height of canvas
   private static int Cwidth = 640; 
   private static int Cheight = 360;

   static Color skyColor = new Color(191, 248, 255); // Sky Color
   
   public static void main(String[] args) {
      JFrame frame = new JFrame("Cyrus Gronblom");
      //main method has to exist in file being run
      //code below create a jframe with a canvas on it
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Canvas canvas = new CanvasClassesMainGronblom();//constructor must match class name
      canvas.setSize(Cwidth, Cheight);
      canvas.setBackground(skyColor);//colors:RED,GREEN,BLUE,YELLOW,MAGENTA,CYAN,WHITE,BLACK,GRAY,LIGHT_GRAY,DARK_GRAY,PINK,ORANGE    
      frame.add(canvas);
      frame.pack();
      frame.setVisible(true);
      //end canvas code, do not edit
   }

   public void paint(Graphics g){
      Scanner input = new Scanner(System.in); //create scanner object for input
      // Season determines color of scene
      int season = getInt(input, "Please choose season (1 = Spring, 2 = Summer, 3 = Fall, 4 = Winter): ");
      // int season = 1;
      Color seasonColor = Color.white; 
      Color treeColor = Color.black;
      
      switch (season) { // Changes the scene color based on user input
         case 1: // Spring
            seasonColor = new Color(133, 176, 74);
            treeColor = new Color(251, 169, 252);
            break;
      
         case 2: // Summer
            seasonColor = new Color(41, 143, 63);
            treeColor = new Color(91, 176, 110);
            break;
      
         case 3: // Fall
            seasonColor = new Color(145, 90, 13);
            treeColor = Color.orange;
            break;
      
         case 4: // Winter
            seasonColor = new Color(242, 252, 252);
            treeColor = seasonColor;
            break;
       
         default:
            System.out.println("You may have chosen an incompatible integer. Please try again.");
            break;
      }
   
      drawScene(seasonColor, treeColor, skyColor, g);
   
   }

   public void drawScene(Color sceneColor, Color treeColor, Color skyColor, Graphics g){
      Scenery scene = new Scenery(sceneColor, treeColor, skyColor, g); // Creates a scene
      scene.drawScene();
   }
   
   
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
    
}//end class

