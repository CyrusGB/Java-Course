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
		int y1 = (10);
      g.setColor(Color.red);
      g.drawOval(x1 -5, y1-5, 10, 10); //DEbug check values
		int x2 = (width + 10);
		int y2 = (height + 10);
      g.setColor(Color.black);
      g.drawOval(x2 -5, y2-5, 10, 10); //DEbug check values

		g.drawRect(10,10,width,height);
      
      int loopAmt = 50; // Amount of times the loop iterates through drawing lines

      //code for lower right corner


      int xInd = x1;
      int yInd = y2;
      g.setColor(Color.red);
      for (int i = 0; i < loopAmt; i++) {
         g.drawLine(xInd, y2, x2, yInd);
         xInd += (width + 10) / (loopAmt - 1);
         yInd -= (height + 10) / (loopAmt - 1);
      }
      
      //code for lower left corner

      //code for upper right corner

      //code for upper left corner
      
      //******* Code for innerbox ***********
      width = 490;
		height = 315;
		x1 = 490/2 + 10;
		y1 = 315/2 + 325;
      // g.drawOval(x1 -5, y1-5, 10, 10); Debug to check x1/y1
		x2 = x1 + 490;
		y2 = y1;
		g.drawRect(490 / 2 + 10, 315 / 2 + 10, width, height);
      
      //code for lower right corner
      xInd = x1;
      yInd = 0;
      g.setColor(Color.red);
      for (int i = 0; i < loopAmt; i++) {
         g.drawLine(xInd, y1, x2, yInd + y2);
         xInd += (width + 10) / (loopAmt - 1);
         yInd -= (height + 10) / (loopAmt - 1);
      }
      
      //code for lower left corner
      xInd = x2;
      yInd = 0;
      g.setColor(Color.magenta);
      for (int i = 0; i < loopAmt; i++) {
         g.drawLine(xInd, y1, x1, yInd + y1);
         xInd -= (width + 10) / (loopAmt - 1);
         yInd -= (height + 10) / (loopAmt - 1);
      }
      
      //code for upper right corner
      xInd = x1;
      yInd = 0;
      g.setColor(Color.blue);
      for (int i = 0; i < loopAmt; i++) {
         g.drawLine(xInd, 10, x2, yInd + 10);
         xInd += (width + 10) / (loopAmt - 1);
         yInd += (height + 10) / (loopAmt - 1);
      }
      
      //code for upper left corner
      xInd = (width + 10);
      yInd = 0;
      g.setColor(Color.orange);
      for (int i = 0; i < loopAmt; i++) {
         g.drawLine(xInd, 10, x1, yInd + 10);
         xInd -= (width + 10) / (loopAmt - 1);
         yInd += (height + 10) / (loopAmt - 1);
      }
      
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

   public static void drawCorner(Graphics g, Boolean flipX, Boolean flipY, int x1, int y1, int width, int height, int loopAmt){
      int x2 = x1 + width;
      int y2 = y1 + height;
      int xInd = x1;
      int yInd = y2;
      g.setColor(Color.red);
      if(flipX){
            
      }
      if(flipY){

      }
      for (int i = 0; i < loopAmt; i++) {
         g.drawLine(xInd, y2, x2, yInd);
         xInd += (width + 10) / (loopAmt - 1);
         yInd -= (height + 10) / (loopAmt - 1);
      }
   }

        

}