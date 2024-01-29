// Lab01CStudentLastName.java
// Student starting version of the Lab01C assignment.
// Student Name:             Date:
// Purpose of Program: 
// Demonstrate knowledge of Canvas X&Y Coordinates and Graphics drawing methods  
import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Color;
import javax.swing.JFrame;

public class Lab01C_Shapes_Gronblom extends Canvas {
   
   /* We need to create the JFrame object that will contain the Canvas Object*/
   public static void main(String[] args) {
        JFrame frame = new JFrame("Lab 01C Drawing Shapes");/*Creates the JFrame and gives it a title */
        Canvas canvas = new Lab01C_Shapes_Gronblom();/*This class extends Canvas so it is itself a canvas class and inherits everything Canvas has, so the consructor call has to be the same name as the class we are in */
        canvas.setSize(1100, 800);/*Set dimensions of canvas changing these numbers will change the size of your canvas */
        canvas.setBackground(Color.white);/* Set the background color of the canvas */
        frame.add(canvas);/* add the canvas object to the frame object */
        frame.pack();/* pack the canvas object into the frame object based on the canvas objects size and other settings */
        frame.setVisible(true);/* display the thing*/
        frame.setDefaultCloseOperation (JFrame.EXIT_ON_CLOSE);//will end the application on close
        
    }
    public void paint(Graphics g) {
        
        // DRAW CUBE
        int squareW = 300, squareH= 300; //Square Dimensions
        g.drawRect(50, 50, squareW, squareH);
        g.drawRect(150, 150, squareW, squareH);
        g.drawLine(50, 50, 150, 150);
        g.drawLine(50 + squareW, 50, 150 + squareW, 150);
        g.drawLine(50, 50 + squareH, 150, 150 + squareH);
        g.drawLine(50 + squareW, 50 + squareH, 150 + squareW, 150 + squareH);

        // DRAW SPHERE
        g.drawOval(100, 100, squareW, squareH);
        //Rings

        int noOfRings = 3;
        for(int i = 1; i < noOfRings+1; i++){
            g.drawOval(250 - (25*i), 100, 50*i, squareH);
        }


        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE



        // DRAW APCS



        // DRAW PACMEN FLOWER

    }


        

}