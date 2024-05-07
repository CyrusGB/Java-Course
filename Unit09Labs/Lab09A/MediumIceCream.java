import java.awt.*;

public class MediumIceCream extends SmallIceCream {
    Cherry cherry = new Cherry(g); // Cherry DLC

    public MediumIceCream(int x, int y, Graphics g) { // Constructor
        super(x, y, g);
    }

    @Override
    public void draw() { // Draw medium icecream
        super.draw();
        // Draw extra scoop
        g.setColor(iceCreamColor);
        g.fillOval(x - 50, y - 120, 100, 100);

        // Top it off with a cherry
        cherry.draw(x, y - 140);
    }
    
}
