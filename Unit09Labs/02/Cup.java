import java.awt.*;

public class Cup {
    Graphics g;
    
    Color cupColor = new Color(125, 88, 45);

    public Cup(Graphics g){
        this.g = g;
    }

    public void drawCup(int x, int y){
        g.setColor(cupColor);
        g.fillOval(x - 60, y, x, y); // Base 

        Polygon cupMidPart = new Polygon();
        cupMidPart.addPoint(x, y);
        cupMidPart.addPoint(x, y);
        cupMidPart.addPoint(x, y);
        cupMidPart.addPoint(x, y);
        g.fillPolygon(cupMidPart);

        g.fillOval(x, y, x, y);
    }
}
