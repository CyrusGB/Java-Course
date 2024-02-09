// Lab03CStudentLastName.java
// Student starting version of the Lab03C assignment.
// Student Name:             Date:
// Purpose of Program: 
// Using the Math.random() method to randomly draw lines, circles, 
// and squares within a set grid area  

import java.awt.*;
import javax.swing.JFrame;

public class Lab3CGronblom extends Canvas {
   
   /* We need to create the JFrame object that will contain the Canvas Object*/
   public static void main(String[] args) {
    JFrame frame = new JFrame("Lab 03C Drawing Random Shapes");/*Creates the JFrame and gives it a title */
    Canvas canvas = new Lab3CGronblom();/*This class extends Canvas so it is itself a canvas class and inherits everything Canvas has, so the consructor call has to be the same name as the class we are in */
    canvas.setSize(1100, 800);/*Set dimensions of canvas changing these numbers will change the size of your canvas */
    canvas.setBackground(Color.white);/* Set the background color of the canvas */
    frame.add(canvas);/* add the canvas object to the frame object */
    frame.pack();/* pack the canvas object into the frame object based on the canvas objects size and other settings */
    frame.setVisible(true);/* display the thing*/
    frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);//will end the application on close
        
   }

   public int getRandom(int min, int max){
      int range = max - min + 1;
      int random = (int)(Math.random() * range + min);
      return random;
   }

	public void paint(Graphics g){
		// Draw Grid
		g.drawRect(10,10,780,580);
		g.drawLine(400,10,400,590);
		g.drawLine(10,300,790,300);
		
		
		
		// Draw Random Lines
      for (int i = 0; i < 100; i++) {
         Color color = new Color(getRandom(1, 255), getRandom(1, 255), getRandom(1, 255));
         g.setColor(color);
         g.drawLine(getRandom(10, 400), getRandom(10, 300), getRandom(10, 400), getRandom(10, 300));
      }

		// Draw Random Squares
      for (int i = 0; i < 100; i++) {
         Color color = new Color(getRandom(1, 255), getRandom(1, 255), getRandom(1, 255));
         g.setColor(color);
         g.drawRect(getRandom(400, 740), getRandom(10, 250), 50, 50);
      }



		
		// Draw Random Circles




		
		// Draw 3-D Box
	
	
	
	
	

   }

   //this is a delay method that will allow you to watch your program do its drawing
   //you should call this at the end of your loops to delay your program before it excutes the next loop
   //delay() - is the code you need to make this work
   public static void delay(){
      int delaytime = 50;
      long startDelay = System.currentTimeMillis(); 
      long endDelay = 0;

      while (endDelay - startDelay < delaytime)
         endDelay = System.currentTimeMillis();
   }
   
   //this is another version of the delay method that will allow you to watch your program do its drawing
   //you should call this at the end of your loops to delay your program before it excutes the next loop
   //delay(50) - is the code you need to make this work, the number in the parentheses is how long the delay will last.
   public static void delay(int delay){
      int delaytime = delay;
      long startDelay = System.currentTimeMillis(); 
      long endDelay = 0;

      while (endDelay - startDelay < delaytime)
         endDelay = System.currentTimeMillis();

   }    

}