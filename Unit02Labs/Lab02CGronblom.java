// Lab02CStudentsLastName.java
// Student Name: Cyrus Gronblom    Date: 2/1/24
// Purpose of Program: 
// Demonstrate knowledge of for loops and canvas x&y coordinates and use of graphics draw methods 

import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class Lab02CGronblom extends Canvas {
   
   /* We need to create the JFrame object that will contain the Canvas Object*/
   public static void main(String[] args) {
      JFrame frame = new JFrame("Lab 02C Drawing Lines with Loops");/*Creates the JFrame and gives it a title */
      Canvas canvas = new Lab02CGronblom();/*This class extends Canvas so it is itself a canvas class and inherits everything Canvas has, so the consructor call has to be the same name as the class we are in */
      canvas.setSize(1100, 800);/*Set dimensions of canvas changing these numbers will change the size of your canvas */
      canvas.setBackground(Color.black);/* Set the background color of the canvas */
      frame.add(canvas);/* add the canvas object to the frame object */
      frame.pack();/* pack the canvas object into the frame object based on the canvas objects size and other settings */
      frame.setVisible(true);/* display the thing */
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE); // will end the application on close
        
   }
	public void paint(Graphics g) {
		int width = 980;
		int height = 630;
		int x1 = 10;
		int y1 = (10);
      g.setColor(Color.red);
      // g.drawOval(x1 -5, y1-5, 10, 10); //Debug check values
		int x2 = (width + 10);
		int y2 = (height + 10);
      g.setColor(Color.black);
      // g.drawOval(x2 -5, y2-5, 10, 10); //Debug check values

		g.drawRect(10,10,width,height);
      
      int loopAmt = 50; // Amount of times the loop iterates through drawing lines

      //code for lower right corner
      g.setColor(Color.red);
      drawCorner(g, false, false, x1, y1, width, height, loopAmt, 50);
      
      //code for lower left corner
      g.setColor(Color.magenta);
      drawCorner(g, true, false, x2, y1, width, height, loopAmt, 10);

      //code for upper right corner
      g.setColor(Color.blue);
      drawCorner(g, false, true, x1, y2, width, height, loopAmt, 10);

      //code for upper left corner
      g.setColor(Color.orange);
      drawCorner(g, true, true, x2, y2, width, height, loopAmt, 10);


      // ******* Code for innerbox ***********
      width = 490;
		height = 315;
		x1 = 490/2 + 10;
		y1 = 315/2 + 10;
      // g.drawOval(x1 -5, y1-5, 10, 10); // Debug to check x1/y1
		x2 = x1 + 490;
		y2 = y1 + 315;
      // g.drawOval(x2 -5, y2-5, 10, 10); // Debug to check x1/y1
		g.drawRect(490 / 2 + 10, 315 / 2 + 10, width, height);
      
      //code for lower right corner
      g.setColor(Color.red);
      drawCorner(g, false, false, x1, y1, width, height, loopAmt, 10);
      
      //code for lower left corner
      g.setColor(Color.magenta);
      drawCorner(g, true, false, x2, y1, width, height, loopAmt, 10);

      //code for upper right corner
      g.setColor(Color.blue);
      drawCorner(g, false, true, x1, y2, width, height, loopAmt, 10);

      //code for upper left corner
      g.setColor(Color.orange);
      drawCorner(g, true, true, x2, y2, width, height, loopAmt, 10);
      
	}
   
   //this is another version of the delay method that will allow you to watch your program do its drawing
   //you should call this at the end of your loops to delay your program before it excutes the next loop
   //delay(50) - is the code you need to make this work, the number in the parentheses is how long the delay will last.
   public static void delay(int delay) {
      int delaytime = delay;
      long startDelay = System.currentTimeMillis(); 
      long endDelay = 0;

      while (endDelay - startDelay < delaytime)
         endDelay = System.currentTimeMillis();

   }

   // Draws one of the Corners.
   // Takes in the graphic, whether to flip x or y, starting position (x1, y1), dimensions of the rectangle to fill, the amount of times to loop and the delay time for the loop.
   // In the end you get a reusable method to draw a corner of the rectangle.
   public static void drawCorner(Graphics g, Boolean flipX, Boolean flipY, int x1, int y1, int width, int height, int loopAmt, int delayTime) {
      int x2 = x1; // Second X coordinate
      int y2 = y1; // Second Y coordinate
      int xMulti = 1; // Add or subtract from the position.
      int yMulti = -1; // ^^^
      if(flipX){ // Reverses X values if flip x.
         xMulti = -1;
         x2 -= width;
      }else{
         x2 += width;
      }
      if(flipY){ // Reverses Y values if flip Y.
         yMulti = 1;
         y2 -= height;
      }else{
         y2 += height;
      }

      int xInd = x1; // Iterating position for drawing lines.
      int yInd = y2; // ^^^
      for (int i = 0; i < loopAmt; i++) { // Draw the lines with disired delay in between.
         g.drawLine(xInd, y2, x2, yInd);
         xInd += xMulti * (width + 10) / (loopAmt - 1);
         yInd += yMulti * (height + 10) / (loopAmt - 1);
         // System.out.println("Drew Line from: " + xInd + ", " + y2 + " to " + x2 + ", " + yInd); // Debug line positions
         delay(delayTime); // Makes the animation play again for some reason, I cant tell why. Timmy has the same issue...
      }
      
      // I way overcomplicated this problem but, I think it was fun to find a "more effcient" solution. :)

   }

        

}