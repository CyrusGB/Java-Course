import java.awt.*;

public class Fudge {
   Graphics g; // Graphics
   int currentX, currentY; // Current position of fudge particle
   Color fudgeColor = new Color(36, 22, 5); // Fudge color
   int size = 10; // Maximum size of fudge particle
   int times2Spread = 15; // Amount of times to move fudge down icecream
   int maxSpread = 5; // Max amount of spread

   public Fudge(int x, int y, Graphics g){ // Construct the fudge
      this.currentX = x;
      this.currentY = y;
      this.g = g;
      // Draw fudge
      g.setColor(fudgeColor);
      for (int i = 0; i < times2Spread; i++) {
         move(getRandom(-maxSpread, maxSpread), getRandom(1, maxSpread));
      }
   }

   public void move(int moveX, int moveY){ // Move fudge particle by given x and y amounts
      currentX += moveX;
      currentY += moveY;
      // Draw fudge
      g.fillRect(currentX, currentY, getRandom(size - 5, size), getRandom(size - 5, size));
      
   }

   public int getRandom(int min, int max){ // Randomly generates a number, needs the min and max boundaries
      int range = max - min + 1; // Range
      int random = (int)(Math.random() * range + min); // Random number
      // System.out.println(random);
      return random;
   }
}
