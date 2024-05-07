import java.awt.*;

public class SmallIceCream {
    int x, y;
    protected boolean hasCone = true;
    Graphics g;
    Cone cone;

    Color iceCreamColor = new Color(255, 232, 184);

    public SmallIceCream(int x, int y, Graphics g){
        this.x = x;
        this.y = y;
        this.g = g;
        cone = new Cone(g);
    }

    public void draw(){
        if(hasCone){
            cone.draw(x,y);
        }

        g.setColor(iceCreamColor);
        g.fillOval(x - 50, y - 80, 100, 100);
    }

}
