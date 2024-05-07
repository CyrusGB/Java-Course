import java.awt.*;

public class Cherry {
    Graphics g; // Graphics
    Color cherryColor = new Color(250, 68, 27); // Red 40 (May cause cancer only in California)

    public Cherry(Graphics g){ // Constructor of the great cherry
        this.g = g;
    }

    public void draw(int x, int y){ // Draws a cherry at the position
        // Cherry "body"
        g.setColor(cherryColor);
        g.fillOval(x - 15, y, 30, 30);
        // Stem
        g.setColor(cherryColor.darker());
        g.fillRect(x - 2, y - 8, 4, 14);
    }
}
