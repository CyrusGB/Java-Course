import java.awt.*;

public class Scenery { // Scene which interacts with all of the parts
   private Color sceneColor, treeColor; // Colors for scene
   Color skyColor; // Sky color (should be private and have a getter but im out of time)
   private Graphics g; // Reference to graphics
   
   public Scenery(Color sceneColor, Color treeColor, Color skyColor, Graphics g){ // Scene constructor
      this.sceneColor = sceneColor;
      this.treeColor = treeColor;
      this.skyColor = skyColor;
      this.g = g;
   }
   
   public Color getSceneColor()         { 
      return sceneColor; } // Returns scene color
   
   public void drawScene(){ // Draw scene 
      g.setColor(sceneColor.darker()); // Ground color
      g.fillRect(0, 210, 640, 150); // Draw ground
      int flowerCount = getRandom(10, 25); // Number of flowers
      int flowerMaxX = 320, flowerMinX = 50, flowerMaxY = 360, flowerMinY = 180; // Flower bounds
      for (int i = 0; i < flowerCount; i++) { // Draw flowers
         // Petal color
         Color petalColor = new Color(getRandom(1, 255), getRandom(1, 255), getRandom(1, 255));
         // Flower obj
         Flower flower = new Flower(getRandom(flowerMinX, flowerMaxX), 
                                   getRandom(flowerMinY, flowerMaxY), 
                                   petalColor, 
                                   this, 
                                   g);
         flower.drawFlower();
      }
   
      // Tree
      Tree tree = new Tree(590, 360, treeColor, this, g); 
      tree.drawTree();
   }

   public int getRandom(int min, int max){ // Randomly generates a number, needs the min and max boundaries
      int range = max - min + 1; // Range
      int random = (int)(Math.random() * range + min); // Random number
      // System.out.println(random);
      return random;
   }

   public int ClampInt(int min, int max, int value){ // Clamps an int to a range
      if(value <= max && value >= min){ // Value in range
         // System.out.println(value + " : value");
         return value;
      }
      else if(value < min){ // Value less than range
         // System.out.println(min + " : min");
         return min;
      }
      else{ // Value greater than range
         // System.out.println(max + " : max");
         return max;
      }
   }

   public void delay(int delay){ // Pause runtime for given time in mils
      int delaytime = delay; // Time to wait
      long startDelay = System.currentTimeMillis(); // Current time
      long endDelay = 0; // Time to end of delay
   
      while (endDelay - startDelay < delaytime) // Wait while delayed
         endDelay = System.currentTimeMillis();
   
   }      

}
