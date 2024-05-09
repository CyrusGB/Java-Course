// Shape4Circle.java
// Lab9b
// Student starting version

import java.awt.*;

public class Shape4CircleCG extends ShapeCG{
  // Create new circle
  public Shape4CircleCG(String shapeName, int numSides, int titleX, int titleY, int shapeX, int shapeY, Color shapeColor) {
    super(shapeName, numSides, titleX, titleY, shapeX, shapeY, shapeColor);
  }

  // Draw circle
  public void drawShape(Graphics g){
    g.setColor(shapeColor);
    g.fillOval(shapeX, shapeY, 100, 100);
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
