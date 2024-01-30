// Lab01CStudentLastName.java
// Student starting version of the Lab01C assignment.
// Student Name: Cyrus Gronblom     Date: 1/30/24
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
        int noOfRings = 3; //Number of rings
        for(int i = 1; i < noOfRings+1; i++){ //Draws rings
            int ovalWidth = i*80; //Oval Width
            g.drawOval(250 - ovalWidth/2, 100, ovalWidth, squareH);
            g.drawOval(100, 250-ovalWidth/2, squareW, ovalWidth);
        }

        // DRAW INSCRIBED/CIRCUMSCRIBED TRIANGLE
        g.drawOval(750, 300, squareW, squareH);
        g.drawLine(900,600,750,450);
        int cornerX = 1006, cornerY = 344;
        g.drawLine(750,450,cornerX,cornerY);
        g.drawLine(900,600,cornerX,cornerY);
        g.drawOval(805, 405, 140, 140);

        // DRAW APCS
        g.fillRect(50, 550, 20, 100); //P
        g.fillRect(70, 550, 20, 20);
        g.fillRect(70, 590, 20, 20);
        g.fillRect(90, 550, 20, 60);

        g.fillRect(130, 550, 20, 100); //H
        g.fillRect(150, 590, 20, 20);
        g.fillRect(170, 550, 20, 100);

        g.fillRect(210, 550, 60, 20); //S
        g.fillRect(210, 570, 20, 20);
        g.fillRect(210, 590, 60, 20);
        g.fillRect(250, 610, 20, 20);
        g.fillRect(210, 630, 60, 20);
        
        // DRAW PACMEN FLOWER
        g.fillArc(500, 500, 50, 50, 45, 270);
        g.fillArc(465, 465, 50, 50, 135, 270);
        g.fillArc(465, 535, 50, 50, -135, -270);
        g.fillArc(430, 500, 50, 50, 135, -270);
    }


        

}