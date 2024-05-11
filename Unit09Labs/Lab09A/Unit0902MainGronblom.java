// Lab9A - Composition & Inheritance Drawing 
// Student Name: Cyrus Gronblom Date: 5/7/24
/* Purpose of Program: 
   - Demonstrate multilevel inheritance while passing constructor parameters from the lowest subclass to the highest level superclass.
   - Demonstrate composition by using an object from a class that the student has created as a class variable of another class.
   - Create an independent drawing that demonstrates the concepts of multilevel inheritance and composition. 
*/

import java.awt.*;
import javax.swing.JFrame;

public class Unit0902MainGronblom extends Canvas{
   // set width and height of canvas
   private static int Cwidth = 550; 
   private static int Cheight = 360;
  
   public static void main(String[] args) {
      JFrame frame = new JFrame("Cyrus Gronblom");
      // main method has to exist in file being run
      // code below create a jframe with a canvas on it
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      Canvas canvas = new Unit0902MainGronblom(); //constructor must match class name
      canvas.setSize(Cwidth, Cheight);
      canvas.setBackground(Color.white); //colors:RED,GREEN,BLUE,YELLOW,MAGENTA,CYAN,WHITE,BLACK,GRAY,LIGHT_GRAY,DARK_GRAY,PINK,ORANGE    
      frame.add(canvas);
      frame.pack();
      frame.setVisible(true);
      // end canvas code, do not edit
   }

   public void paint(Graphics g){
      SmallIceCream sm = new SmallIceCream(100, 200, g); // Single scoop icecream ($ an arm and a leg)
      sm.draw();
      MediumIceCream md = new MediumIceCream(225, 200, g); // Double scoop icecream with cherry DLC (+$69.99)
      md.draw();
      Sundae sun = new Sundae(350, 200, g); // Triple scoop icecream with THE ULTIMATE fudge AND cherry DLC all packaged into a bowl (+$420.69)
      sun.draw();
   }
}
