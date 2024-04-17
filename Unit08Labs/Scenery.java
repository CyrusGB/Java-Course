import java.awt.*;

public class Scenery {
    public void drawScene(Color sceneColor, Graphics g){
        g.setColor(sceneColor.darker());
        g.fillRect(0, 600, 800, 300); // Draw ground
        int flowerCount = getRandom(1, 5);
        int flowerMaxX = 800, flowerMinX = 50, flowerMaxY = 850, flowerMinY = 600;
        for (int i = 0; i < flowerCount; i++) {
            drawFlower(getRandom(flowerMinX, flowerMaxX), getRandom(flowerMinY, flowerMaxY), g);
        }
    }

    public void drawFlower(int x, int y, Graphics g){ // Draw a flower at a given position in a given color
        Color stemColor = Color.green;
        Color petalColor = new Color(getRandom(1, 255), getRandom(1, 255), getRandom(1, 255));
        Color centerColor = Color.yellow;
        int numberOfPetals = 5;
        int petalSize = 10;
        int centerSize = 8;

        // Draw Stem
        g.setColor(stemColor);
        g.fillRect(x, y, 10, 50);
        g.setColor(petalColor);

        int radius = 10; // Radius of container circle
        int angle  = 140; // Angle to get pos on circle
        for (int petal = 0; petal < numberOfPetals; petal++) { // Draw firework particles 
            double petalX = radius * Math.cos(Math.PI * 2 * angle / 360); // X pos of firework particle
            double petalY = radius * Math.sin(Math.PI * 2 * angle / 360); // Y pos of firwork particle
            g.fillOval((int)(petalX - petalSize / 2), (int)(petalY - petalSize / 2), petalSize, petalSize);
            // System.out.println(((int)x + dotX - 50) + ", " + ((int)y + dotY - 50)); 
            angle += 360/numberOfPetals;
        }

        g.setColor(centerColor);
        g.fillOval((int)(x - centerSize / 2), (int)(y - centerSize / 2), centerSize, centerSize);

    }

    public int getRandom(int min, int max){ // Randomly generates a number, needs the min and max boundaries
        int range = max - min + 1;
        int random = (int)(Math.random() * range + min);
        return random;
     }

}
