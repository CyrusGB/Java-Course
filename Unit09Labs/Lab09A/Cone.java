import java.awt.*;

public class Cone {
    Graphics g; // Graphics
    Color coneColor = new Color(214, 150, 101); // REAL waffle coloring!

    public Cone(Graphics g){ // Yeah you construct that cone
        this.g = g;
    }

    public void draw(int x, int y){ // Draw a cone at position
        // Main part of cone
        Polygon triangle = new Polygon();
        triangle.addPoint(x - 50, y);
        triangle.addPoint(x + 50, y);
        triangle.addPoint(x, y + 100);
        g.setColor(coneColor);
        g.fillPolygon(triangle);

        // 3D EFFECTS! 
        g.setColor(coneColor.darker());
        g.fillOval(x - 50, y - 25, 100, 50);
    }
}
