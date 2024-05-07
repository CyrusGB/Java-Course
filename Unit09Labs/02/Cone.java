import java.awt.*;

public class Cone {
    Graphics g;
    Color coneColor = new Color(214, 150, 101);

    public Cone(Graphics g){
        this.g = g;
    }

    public void draw(int x, int y){ // Draw a cone at position
        Polygon triangle = new Polygon();
        triangle.addPoint(x - 50, y);
        triangle.addPoint(x + 50, y);
        triangle.addPoint(x, y + 100);
        g.setColor(coneColor);
        g.fillPolygon(triangle);
        g.setColor(coneColor.darker());
        g.fillOval(x - 50, y - 25, 100, 50);
    }
}
