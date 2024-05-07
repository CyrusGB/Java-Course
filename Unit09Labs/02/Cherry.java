import java.awt.*;

public class Cherry {
    Graphics g;
    Color cherryColor = new Color(250, 68, 27);

    public Cherry(Graphics g){
        this.g = g;
    }

    public void draw(int x, int y){
        g.setColor(cherryColor);
        g.fillOval(x - 15, y, 30, 30);
        g.setColor(cherryColor.darker());
        g.fillRect(x - 2, y - 8, 4, 14);
    }
}
