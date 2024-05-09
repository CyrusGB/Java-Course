import java.awt.*;

public interface IShapeCG { // Interface for every shape
    public abstract void drawShape(Graphics g); // Draws the shape

	public abstract void displayName(Graphics g); // Displays the name of the shape

	public abstract void displayNumSides(Graphics g); // Displays the number of sides
}
