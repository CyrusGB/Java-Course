import java.awt.*;

public class Flower { // Draw a flower
   int x, y; // Position
   Color petalColor; // Color of petals
   Scenery scene; // Reference to scene
   Graphics g; // Reference to graphics

   public Flower(int x, int y, Color petalColor, Scenery scene, Graphics g){ // Create new flower
      this.x = x; 
      this.y = y;
      this.petalColor = petalColor;
      this.scene = scene;
      this.g = g;
   }

   public void drawFlower(){ // Draw a flower at a given position in a given color
      Color stemColor = Color.green; // Stem color
      Color centerColor = Color.yellow; // Center color
      int numberOfPetals = 5; // Number of petals
      int petalSize = 10; // Diameter of petals
      int centerSize = 12; // Diameter of center
      int stemWidth = 5, stemHeight = 30; // Stem dimensions
   
      // Draw Stem
      g.setColor(stemColor);
      // System.out.println("Flower Pos: " + x + ", " + y);
      g.fillRect(x - stemWidth / 2, y, stemWidth, stemHeight); // Stem
      g.setColor(petalColor);
   
      int radius = 10; // Radius of container circle
      int angle  = 140; // Angle to get pos on circle
      for (int petal = 0; petal < numberOfPetals; petal++) { // Draw petals around center 
         double petalX = radius * Math.cos(Math.PI * 2 * angle / 360) + x; // X pos of petal
         double petalY = radius * Math.sin(Math.PI * 2 * angle / 360) + y; // Y pos of petal
         g.fillOval((int)(petalX - petalSize / 2), (int)(petalY - petalSize / 2), petalSize, petalSize); // Draw petal
         angle += 360/numberOfPetals;
      }
      
      // Draw center
      g.setColor(centerColor);
      g.fillOval((int)(x - centerSize / 2), (int)(y - centerSize / 2), centerSize, centerSize); // Center
      // Find center of flower pos vvv
      // g.setColor(Color.red);
      // g.fillOval(x -1, y-1, 2, 2);
   
   }
}
