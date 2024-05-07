import java.awt.*;

public class Cup {
    Graphics g; // Graphics
    Color cupColor = new Color(125, 88, 45); // The color of 80 y/o cardboard

    public Cup(Graphics g){ // Cup construct
        this.g = g;
    }

    public void draw(int x, int y){ // Draw cup at position
        // Base of cup
        g.setColor(cupColor);
        g.fillOval(x - 50, y + 50, 180, 50);

        // Mid part
        Polygon cupMidPart = new Polygon();
        // Find positions for pts
        // g.setColor(Color.red);
        // g.drawRect(x - 60, y + 5, 1, 1);
        // g.drawRect(x - 50, y + 75, 1, 1);
        // g.drawRect(x + 130, y + 75, 1, 1);
        // g.drawRect(x + 140, y + 5, 1, 1);
        cupMidPart.addPoint(x - 60, y + 5);
        cupMidPart.addPoint(x - 50, y + 75);
        cupMidPart.addPoint(x + 130, y + 75);
        cupMidPart.addPoint(x + 140, y + 5);
        g.fillPolygon(cupMidPart);
        
        // REVOLUNTIONARY TECHNOLOGY TO CREATE 3D FX
        g.setColor(cupColor.darker());
        g.fillOval(x - 60, y - 20, 200, 50);
        
        
    }
}
