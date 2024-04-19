import java.awt.*;

public class Scenery {
    private Color sceneColor, treeColor;
    private Graphics g;

    public Scenery(Color sceneColor, Color treeColor, Graphics g){ // Scene constructor
        this.sceneColor = sceneColor;
        this.treeColor = treeColor;
        this.g = g;
    }

    public void drawScene(){
        g.setColor(sceneColor.darker());
        g.fillRect(0, 210, 640, 150); // Draw ground
        int flowerCount = getRandom(10, 25);
        int flowerMaxX = 320, flowerMinX = 50, flowerMaxY = 360, flowerMinY = 180;
        for (int i = 0; i < flowerCount; i++) {
            Color petalColor = new Color(getRandom(1, 255), getRandom(1, 255), getRandom(1, 255));
            Flower flower = new Flower(getRandom(flowerMinX, flowerMaxX), 
                                       getRandom(flowerMinY, flowerMaxY), 
                                       petalColor, 
                                       this, 
                                       g);
            flower.drawFlower();
        }

        Tree tree = new Tree(590, 360, treeColor, this, g); 
        tree.drawTree();
    }

    public int getRandom(int min, int max){ // Randomly generates a number, needs the min and max boundaries
        int range = max - min + 1;
        int random = (int)(Math.random() * range + min);
        // System.out.println(random);
        return random;
    }

    public int ClampInt(int min, int max, int value){
        if(value <= max && value >= min){
            // System.out.println(value + " : value");
            return value;
        }
        else if(value < min){
            // System.out.println(min + " : min");
            return min;
        }
        else{
            // System.out.println(max + " : max");
            return max;
        }
    }

}
