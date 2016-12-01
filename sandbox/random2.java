import java.awt.*;
import java.util.*;

// different color, same ball size
public class random2 {

    public static int width = 800;
    public static int height = 600;
    public static int ballSize = 100;

    public static void main(String[] args) {

        DrawingPanel panel = new DrawingPanel(width, height);
        panel.setBackground(Color.LIGHT_GRAY);
        Graphics g = panel.getGraphics();
        Random rand = new Random();

        while (true) {

            g.setColor(new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)));




            int x = rand.nextInt(width);
            int y = rand.nextInt(height);
            g.fillOval(x, y, ballSize, ballSize);

            panel.sleep(100);
        }
    }
}
