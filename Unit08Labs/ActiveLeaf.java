import java.awt.*;

public class ActiveLeaf { //Leaf which moves around
   Vector2 pos; // Current pos of leaf
   int size; // Size of leaf
   Color leafColor; // Leaf color
   Color skyColor; // Color of the sky
   Color groundColor; // Color of the ground
   Graphics g; // Main canvas / graphics

   // Create new active leaf with position to create at, size colors, and graphics
   public ActiveLeaf(Vector2 pos, int size, Color leafColor, Color skyColor, Color groundColor, Graphics g){
      this.pos = pos;
      this.size = size;
      this.leafColor = leafColor;
      this.skyColor = skyColor;
      this.groundColor = groundColor;
      this.g = g;
   }

   public void move(Vector2 addPos){ // Move leaf a given amount
      if(pos.y < 210){ // Check if the leaf is overwriting the sky or the ground
         g.setColor(skyColor);
      }else{
         g.setColor(groundColor);
      }
      g.fillRect(pos.x, pos.y, size, size); // Recolor previous pos
      g.setColor(leafColor); 
      g.fillRect(pos.x + addPos.x, pos.y + addPos.y, size, size); // Draw leaf
      pos.x += addPos.x; pos.y += addPos.y; // Set new pos
   }
}
