import java.awt.*;

public class Tree { // Create tree in scene
   int x, y; // Position of tree
   Color treeColor; // Tree color
   Scenery scene; // Reference to scene which has created tree
   Graphics g; // Graphics

   // Create new tree using position colors and references to scene and graphics
   public Tree(int x, int y, Color treeColor, Scenery scene, Graphics g){
      this.x = x;
      this.y = y;
      this.treeColor = treeColor;
      this.scene = scene;
      this.g = g;
   }

   Color trunkColor = new Color(89, 28, 4); // Color of trunk
   int trunkWidth = 60, trunkHeight = 300; // Trunk dimensions
   int tuftSize = 100; // Size of tufts
   int leafSize = 10; // Leaf size
   int leavesPerTuft = 100; // Amount of static leaves to draw per tuft 

   public void drawTree(){ // Draw tree
      g.setColor(trunkColor);
      g.fillRect(x - trunkWidth / 2, y - trunkHeight, trunkWidth, trunkHeight); // Trunk
   
      g.setColor(treeColor); // Tufts
      drawTreeTuft(x-30, y-300);
      drawTreeTuft(x-75, y-350);
      drawTreeTuft(x-100, y-250);
      drawTreeTuft(x-70, y-200);
      
      ActiveLeaf[] activeLeaves = new ActiveLeaf[25]; // List of leaves which move 
      for (int leaf = 0; leaf < activeLeaves.length; leaf++) { // Set each leaf to default values
         activeLeaves[leaf] = new ActiveLeaf(getStartingPos(), 10, treeColor, scene.skyColor, scene.getSceneColor().darker(), g);
      }
      
      while(true){ // Move leaves constantly
         for (ActiveLeaf activeLeaf : activeLeaves) { // Move each leaf
            if(scene.getRandom(1,100) == 1){ // Keeps the same leaves in rotation so we dont have to create new leaf objects
               activeLeaf.pos = getStartingPos();
            }else{
               activeLeaf.move(new Vector2(scene.getRandom(-2, 0), scene.getRandom(1, 2)));
            }
            // System.out.println(activeLeaf.pos.x);
            scene.delay(1);
         }
      }
   }

   private Vector2 getStartingPos(){ // Returns a random position within the starting bounds for a leaf
      Vector2 leafMinPos = new Vector2(400, 200);
      Vector2 leafMaxPos = new Vector2(500, 220);
   
      return new Vector2(scene.getRandom(leafMinPos.x, leafMaxPos.x), scene.getRandom(leafMinPos.y, leafMaxPos.y));
   }

   public void drawTreeTuft(int x, int y){ // Draw a tuft at a position
      g.fillOval((int)(x - tuftSize / 2), (int)(y - tuftSize / 2), tuftSize, tuftSize);
      for (int leaf = 0; leaf < leavesPerTuft; leaf++) { // Draw static leaves on tuft
         drawStationaryLeaf(scene.getRandom(x - tuftSize / 2, x + tuftSize / 2), scene.getRandom(y - tuftSize / 2, y + tuftSize / 2), g);
      }
   }

   public void drawStationaryLeaf(int x, int y, Graphics g){ // Draw a static leaf of a random color variation
      int randomAdder = scene.getRandom(-50, 10); // Number to add or remove from the darkness of the leaf
      // Random color variation of tree color vvv
      Color randomDarkness = new Color(scene.ClampInt(1, 255, treeColor.getRed() + randomAdder), scene.ClampInt(1, 255, treeColor.getGreen() + randomAdder), scene.ClampInt(1, 255, treeColor.getBlue() + randomAdder));
      g.setColor(randomDarkness);
      g.fillRect(x - leafSize / 2, y - leafSize / 2, leafSize, leafSize);
   }
}
