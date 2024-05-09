import java.awt.*;

public abstract class ShapeCG implements IShapeCG{ // Base shape (Implements the shape interface)
	String shapeName; // Name of shape
	int numSides; // Number of sides
	int titleX, titleY; // Title position
	int shapeX, shapeY; // Shape position
	Color shapeColor; // Color of shape

	// Create new shape
	public ShapeCG(String shapeName, int numSides, int titleX, int titleY, int shapeX, int shapeY, Color shapeColor){
		this.shapeName = shapeName;
		this.numSides = numSides;
		this.titleX = titleX;
		this.titleY = titleY;
		this.shapeX = shapeX;
		this.shapeY = shapeY;
		this.shapeColor = shapeColor;
	}
}
