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
      canvas.setBackground(Color.white);/* Set the background color of the canvas */
      frame.add(canvas);/* add the canvas object to the frame object */
      frame.pack();/* pack the canvas object into the frame object based on the canvas objects size and other settings */
      frame.setVisible(true);/* display the thing*/
      frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);//will end the application on close
        
   }
	public void paint(Graphics g)
	{
		int width = 980;
		int height = 630;
		int x1 = 10;
		int y1 = 640;
		int x2 = 990;
		int y2 = 640;
		g.drawRect(10,10,width,height);
      
      int loopAmt = 50; // Amount of times the loop iterates through drawing lines

      //code for lower right corner
      int xInd = 10;
      int yInd = 0;
      for (int i = 0; i < loopAmt; i++) {
         g.drawLine(xInd, y1, x2, yInd + y2);
         xInd += 990/(loopAmt - 1);
         yInd -= 640/(loopAmt - 1);
      }
      
      //code for lower left corner
      xInd = 990;
      yInd = 0;
      for (int i = 0; i < loopAmt; i++) {
         g.drawLine(xInd, y1, x1, yInd + y1);
         xInd -= 990/(loopAmt - 1);
         yInd -= 640/(loopAmt - 1);
      }
      
      //code for upper right corner
      xInd = 10;
      yInd = 0;
      for (int i = 0; i < loopAmt; i++) {
         g.drawLine(xInd, 10, x2, yInd + 10);
         xInd += 990/(loopAmt - 1);
         yInd += 640/(loopAmt - 1);
      }
      
      //code for upper left corner
      
      
      //******* Code for innerbox ***********
      
      
      //code for lower right corner
      
      
      //code for lower left corner
      
      
      //code for upper right corner
      
      
      //code for upper left corner
      
	}
   //this is a delay method that will allow you to watch your program do its drawing
   //you should call this at the end of your loops to delay your program before it excutes the next loop
   //delay() - is the code you need to make this work
   public static void delay()
   {
      int delaytime = 50;
      long startDelay = System.currentTimeMillis(); 
      long endDelay = 0;

      while (endDelay - startDelay < delaytime)
         endDelay = System.currentTimeMillis();
   }
   
   //this is another version of the delay method that will allow you to watch your program do its drawing
   //you should call this at the end of your loops to delay your program before it excutes the next loop
   //delay(50) - is the code you need to make this work, the number in the parentheses is how long the delay will last.
   public static void delay(int delay)
   {
      int delaytime = delay;
      long startDelay = System.currentTimeMillis(); 
      long endDelay = 0;

      while (endDelay - startDelay < delaytime)
         endDelay = System.currentTimeMillis();

   }

        

}