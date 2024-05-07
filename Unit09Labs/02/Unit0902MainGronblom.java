import java.awt.*;
import javax.swing.JFrame;

public class Unit0902MainGronblom extends Canvas{
    // set width and height of canvas
    private static int Cwidth = 640; 
    private static int Cheight = 360;
   
    public static void main(String[] args) {
        JFrame frame = new JFrame("Cyrus Gronblom");
        // main method has to exist in file being run
        // code below create a jframe with a canvas on it
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Canvas canvas = new Unit0902MainGronblom(); //constructor must match class name
        canvas.setSize(Cwidth, Cheight);
        canvas.setBackground(Color.white); //colors:RED,GREEN,BLUE,YELLOW,MAGENTA,CYAN,WHITE,BLACK,GRAY,LIGHT_GRAY,DARK_GRAY,PINK,ORANGE    
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
        // end canvas code, do not edit
    }

    public void paint(Graphics g){
        SmallIceCream sm = new SmallIceCream(100, 200, g);
        sm.draw();
        MediumIceCream md = new MediumIceCream(225, 200, g);
        md.draw();
        Sundae sun = new Sundae(350, 200, g);
        sun.draw();
    }
}
