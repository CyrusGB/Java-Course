// Shape3Octagon.java
// Lab9b
// Student starting version

import java.awt.*;

public class Shape3OctagonCG extends ShapeCG{
  // Create new octagon
   public Shape3OctagonCG(String shapeName, int numSides, int titleX, int titleY, int shapeX, int shapeY, Color shapeColor) {
      super(shapeName, numSides, titleX, titleY, shapeX, shapeY, shapeColor);
   }
  
  // Draw octagon
   public void drawShape(Graphics g){
      Polygon octagon = new Polygon();
      octagon.addPoint(shapeX, shapeY + 33);
      octagon.addPoint(shapeX, shapeY + 66);
      octagon.addPoint(shapeX + 33, shapeY + 99);
      octagon.addPoint(shapeX + 66, shapeY + 99);
      octagon.addPoint(shapeX + 99, shapeY + 66);
      octagon.addPoint(shapeX + 99, shapeY + 33);
      octagon.addPoint(shapeX + 66, shapeY);
      octagon.addPoint(shapeX + 33, shapeY);
   
      g.setColor(shapeColor);
      g.fillPolygon(octagon);
   }

  // Draw name
   public void displayName(Graphics g){
      g.setColor(shapeColor);
      g.drawString(shapeName, titleX, titleY + 25);
   }

  // Draw number of sides
   public void displayNumSides(Graphics g){
      g.setColor(shapeColor);
      g.drawString("An " + shapeName + " has "+ String.valueOf(numSides + " sides."), titleX, titleY + 175);
   }
}

