import java.awt.*;

public class ActiveLeaf {
    int x;
    int y;
    int size;
    Color leafColor;
    Color skyColor;
    Graphics g;

    public ActiveLeaf(int x, int y, int size, Color leafColor, Color skyColor, Graphics g){
        this.x = x;
        this.y = y;
        this.size = size;
        this.leafColor = leafColor;
        this.skyColor = skyColor;
        this.g = g;
    }

    public void move(int newX, int newY){
        g.setColor(skyColor);
        g.fillRect(x, y, size, size);
        g.setColor(leafColor);
        g.fillRect(newX, newY, size, size);
    }
}
