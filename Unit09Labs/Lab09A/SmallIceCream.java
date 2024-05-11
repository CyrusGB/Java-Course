import java.awt.*;

public class SmallIceCream {
   int x, y; // X and y position of icecream
   protected boolean hasCone = true; // Has cone instead of cup
   Graphics g; // Graphics
   Cone cone; // Cone object, still created even if there is a cup instead of cone. (not rendered)

   Color iceCreamColor = new Color(255, 232, 184); // Flavor of icecream

   public SmallIceCream(int x, int y, Graphics g){ // Constructor
      this.x = x;
      this.y = y;
      this.g = g;
      cone = new Cone(g); // Create new cone
   }

   public void draw(){ // Draw small icecream
      if(hasCone){ // Draw cone if cone is needed
         cone.draw(x,y);
      }
   
      // Draw scoop
      g.setColor(iceCreamColor);
      g.fillOval(x - 50, y - 80, 100, 100);
   }

}
