import java.awt.*;
import java.util.ArrayList;

public class Tree {
    int x, y;
    Color treeColor;
    Scenery scene;
    Graphics g;

    public Tree(int x, int y, Color treeColor, Scenery scene, Graphics g){
        this.x = x;
        this.y = y;
        this.treeColor = treeColor;
        this.scene = scene;
        this.g = g;
    }

    Color trunkColor = new Color(89, 28, 4);
    int trunkWidth = 60, trunkHeight = 300;
    int tuftSize = 100;
    ArrayList<Vector2> tuftPositions = new ArrayList<Vector2>();
    int leafSize = 10;
    int leavesPerTuft = 100;

    public void drawTree(){
        g.setColor(trunkColor);
        g.fillRect(x - trunkWidth / 2, y - trunkHeight, trunkWidth, trunkHeight); // Trunk

        g.setColor(treeColor);
        drawTreeTuft(x-30, y-300);
        tuftPositions.add(new Vector2(x-30, y-300));
        drawTreeTuft(x-75, y-350);
        tuftPositions.add(new Vector2(x-75, y-350));
        drawTreeTuft(x-100, y-250);
        tuftPositions.add(new Vector2(x-100, y-250));
        drawTreeTuft(x-70, y-200);
        tuftPositions.add(new Vector2(x-70, y-200));
        
        ActiveLeaf[] activeLeaves = new ActiveLeaf[50](); // This is going to kill my cpu
        for (ActiveLeaf activeLeaf : activeLeaves) {
            activeLeaf.move(random, y);
        }

        

    }

    public void drawTreeTuft(int x, int y){
        g.fillOval((int)(x - tuftSize / 2), (int)(y - tuftSize / 2), tuftSize, tuftSize);
        for (int leaf = 0; leaf < leavesPerTuft; leaf++) {
            drawStationaryLeaf(scene.getRandom(x - tuftSize / 2, x + tuftSize / 2), scene.getRandom(y - tuftSize / 2, y + tuftSize / 2), g);
        }
    }

    public void drawStationaryLeaf(int x, int y, Graphics g){
        int randomAdder = scene.getRandom(-50, 10); // Number to add or remove from the darkness of the leaf
        Color randomDarkness = new Color(scene.ClampInt(1, 255, treeColor.getRed() + randomAdder), scene.ClampInt(1, 255, treeColor.getGreen() + randomAdder), scene.ClampInt(1, 255, treeColor.getBlue() + randomAdder));
        g.setColor(randomDarkness);
        g.fillRect(x - leafSize / 2, y - leafSize / 2, leafSize, leafSize);
    }
}
