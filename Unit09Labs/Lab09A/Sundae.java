import java.awt.*;

public class Sundae extends MediumIceCream{
    Cup cup = new Cup(g); // Cup

    public Sundae(int x, int y, Graphics g) { // Constructor for sundae
        super(x, y, g);
        hasCone = false;   
    }
    
    @Override
    public void draw() { // Draw Sundae
        cup.draw(x,y); // Draw cup
        super.draw();
        g.setColor(iceCreamColor); // Extra scoop
        g.fillOval(x + 30, y - 80, 100, 100);

        // Draw "Fudge" army  "The value of fudge is not used... no way..."
        Fudge fudge = new Fudge(x, y - 120, g);
        Fudge fudge1 = new Fudge(x, y - 120, g);
        Fudge fudge2 = new Fudge(x, y - 120, g);
        Fudge fudge3 = new Fudge(x + 20, y - 120, g);
        Fudge fudge4 = new Fudge(x + 20, y - 120, g);
        Fudge fudge5 = new Fudge(x + 20, y - 120, g);
        Fudge fudge6 = new Fudge(x - 20, y - 110, g);
        Fudge fudge7 = new Fudge(x - 20, y - 110, g);
        Fudge fudge8 = new Fudge(x - 20, y - 110, g);

        // Top with cherry
        cherry.draw(x, y - 140);
    }
}
