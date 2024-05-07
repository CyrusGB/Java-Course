import java.awt.*;

public class MediumIceCream extends SmallIceCream {

    Cherry cherry = new Cherry(g);

    public MediumIceCream(int x, int y, Graphics g) {
        super(x, y, g);
    }

    @Override
    public void draw() {
        super.draw();
        g.setColor(iceCreamColor);
        g.fillOval(x - 50, y - 120, 100, 100);

        cherry.draw(x, y - 140);
    }
    
}
