import java.awt.*;

public class Flower {
    int x, y;
    Color petalColor;
    Scenery scene;
    Graphics g;


    public Flower(int x, int y, Color petalColor, Scenery scene, Graphics g){
        this.x = x; 
        this.y = y;
        this.petalColor = petalColor;
        this.scene = scene;
        this.g = g;
    }

    public void drawFlower(){ // Draw a flower at a given position in a given color
        Color stemColor = Color.green;
        Color centerColor = Color.yellow;
        int numberOfPetals = 5;
        int petalSize = 10;
        int centerSize = 12;
        int stemWidth = 5, stemHeight = 30;

        // Draw Stem
        g.setColor(stemColor);
        System.out.println("Flower Pos: " + x + ", " + y);
        g.fillRect(x - stemWidth / 2, y, stemWidth, stemHeight); // Stem
        g.setColor(petalColor);

        int radius = 10; // Radius of container circle
        int angle  = 140; // Angle to get pos on circle
        for (int petal = 0; petal < numberOfPetals; petal++) { // Draw firework particles 
            double petalX = radius * Math.cos(Math.PI * 2 * angle / 360) + x; // X pos of firework particle
            double petalY = radius * Math.sin(Math.PI * 2 * angle / 360) + y; // Y pos of firwork particle
            g.fillOval((int)(petalX - petalSize / 2), (int)(petalY - petalSize / 2), petalSize, petalSize);
            // System.out.println(((int)x + dotX - 50) + ", " + ((int)y + dotY - 50)); 
            angle += 360/numberOfPetals;
        }
        
        g.setColor(centerColor);
        g.fillOval((int)(x - centerSize / 2), (int)(y - centerSize / 2), centerSize, centerSize); // Center
        // Find center of flower pos vvv
        // g.setColor(Color.red);
        // g.fillOval(x -1, y-1, 2, 2);

    }
}
