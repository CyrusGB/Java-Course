import java.awt.*;
import javax.swing.JFrame;

//BELOW IS A LINK THAT HAS THE NEEDED MATH
//FOR CALCULATING THE X & Y COORDINATES OF A CIRCLE
//THE SAMPLE CODE IS IN JAVASCRIPT SO YOU WILL HAVE
//TO MAKE SLIGHT MODIFICATIONS SO IT WORKS IN JAVA
//THE FIRST RESPONSE HAS THE MATH YOU NEED, BUT IN JAVASCRIPT. YOU DO NOT NEED THE CONSOLE.LOG CODE
//https://stackoverflow.com/questions/43641798/how-to-find-x-and-y-coordinates-on-a-flipped-circle-using-javascript-methods

//Main class holds the main method and paint and all the methods that are used in my program
public class Mid_Gronblom extends Canvas {
  //set width and height of canvas
  private static int Cwidth = 1200;
  private static int Cheight = 500;
  
  //this is the special main method that can only exist
  //once in a java program.  Java will look for this
  //method to start the running of your program
  //you should not add or edit any code in this method.
  public static void main(String[] args) {
    JFrame frame = new JFrame("Your Name Here");
    //main method has to exist in file being run
    //code below create a jframe with a canvas on it
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    Canvas canvas = new Mid_Gronblom();//constructor must match class name
    canvas.setSize(Cwidth, Cheight);
    canvas.setBackground(Color.black);//colors:RED,GREEN,BLUE,YELLOW,MAGENTA,CYAN,WHITE,BLACK,GRAY,LIGHT_GRAY,DARK_GRAY,PINK,ORANGE    
    frame.add(canvas);
    frame.pack();
    frame.setVisible(true);
    //end canvas code, do not edit
  }

  //the paint method is like the main method
  //because the Canvas code in the main method
  //will cause this method to be called when you 
  //run your program.  The code to run your program goes here
  //like the main method your program should only have one paint method
  //anything outputting to the Canvas must have the
  //Graphics g object in order to output or affect the Canvas 
  public void paint(Graphics g){

    // Draw dots
    int dotX = 85, dotY = 600; // Dot x and y
    for (int dot = 0; dot < 47; dot++) { // Draw dots in a diagnal line every 50 milliseconds
      g.setColor(Color.red);
      g.fillOval(dotX, dotY, 3, 3);
      dotX += 10;
      dotY -= 10;
      delay(50);
      g.setColor(getBackground());
      g.fillOval(dotX - 30, dotY + 30, 3, 3);
    }

    g.setColor(getBackground()); // Clear dots
    g.fillRect(450, 25, 250, 250);

    //Start firework
    int radius = 60; // Radius of container circle
    int angle  = 140; // Angle to get pos on circle
    int whiteModulo = 10; // Modulo scaler for white fireworks
    for (int firework = 0; firework < 150; firework++) { // Draw firework particles 
      g.setColor(getBackground());
      if(firework < 75){ // Make fireworks random color if first 75
        randomColor(g);
        if(firework % whiteModulo == 0){ // White firework
          g.setColor(Color.white);
        }
      }
      double x = radius * Math.cos(Math.PI * 2 * angle / 360); // X pos of firework particle
      double y = radius * Math.sin(Math.PI * 2 * angle / 360); // Y pos of firwork particle
      g.drawOval((int)x + dotX - 50, (int)y + dotY - 50, 100, 100);
      // System.out.println(((int)x + dotX - 50) + ", " + ((int)y + dotY - 50)); 
      angle += 25;
      delay(30);
    }
    g.setColor(getBackground());
    g.fillRect(450, 25, 250, 250);
  }

  public static void randomColor(Graphics g){ // Set g color to random
    int large = 255; // Highest possible output
    int small = 1; // Smallest possible output
    int range = large - small + 1; // Range
    int r = (int) (Math.random() * range + small); // Red
    int gr = (int) (Math.random() * range + small); // Gree (gree)
    int b = (int) (Math.random() * range + small); // Blue

    g.setColor(new Color(r,gr,b));
  }

  public static void delay(int delaytime){ // Have system wait for provided time
    long startDelay = System.currentTimeMillis(); // Start time before delay
    long endDelay = 0; // Time after delay finished

    while (endDelay - startDelay < delaytime) // Wait till end delay
        endDelay = System.currentTimeMillis();
  }

}//end class
