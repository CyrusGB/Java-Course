// Shape2Triangle.java
// Lab9b
// Student starting version

import java.awt.*;

public class Shape2TriangleCG extends ShapeCG{
  // Create new triangle
  public Shape2TriangleCG(String shapeName, int numSides, int titleX, int titleY, int shapeX, int shapeY, Color shapeColor) {
    super(shapeName, numSides, titleX, titleY, shapeX, shapeY, shapeColor);
  }

  // Draw a triangle
  public void drawShape(Graphics g){
    Polygon triangle = new Polygon();
    triangle.addPoint(shapeX, shapeY + 100); // Bottom left
    triangle.addPoint(shapeX + 50, shapeY); // Top
    triangle.addPoint(shapeX + 100, shapeY + 100); // Bottom Right

    g.setColor(shapeColor);
    g.fillPolygon(triangle);
  }

  // Draw name
  public void displayName(Graphics g){
		g.setColor(shapeColor);
		g.drawString(shapeName, titleX, titleY + 25);
	}

  // Draw number of sides
	public void displayNumSides(Graphics g){
		g.setColor(shapeColor);
		g.drawString("A " + shapeName + " has "+ String.valueOf(numSides + " sides."), titleX, titleY + 175);
	}
}
