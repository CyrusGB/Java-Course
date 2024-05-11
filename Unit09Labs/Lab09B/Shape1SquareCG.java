// Shape1Square.java
// Lab9b
// Student starting version

import java.awt.*;

public class Shape1SquareCG extends ShapeCG{
  // Create new square
   public Shape1SquareCG(String shapeName, int numSides, int titleX, int titleY, int shapeX, int shapeY, Color shapeColor) {
      super(shapeName, numSides, titleX, titleY, shapeX, shapeY, shapeColor);
   }

  // Draw a square
   public void drawShape(Graphics g){
      g.setColor(shapeColor);
      g.fillRect(shapeX, shapeY, 100, 100);
   }

  // Draw the name
   public void displayName(Graphics g){
      g.setColor(shapeColor);
      g.drawString(shapeName, titleX, titleY + 25);
   }

  // Draw the number of sides
   public void displayNumSides(Graphics g){
      g.setColor(shapeColor);
      g.drawString("A " + shapeName + " has "+ String.valueOf(numSides + " sides."), titleX, titleY + 175);
   }
}
