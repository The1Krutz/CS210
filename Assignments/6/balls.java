
// For this assignment you are limited to the language features in Chapters 1-5
// shown in lecture or the textbook.
import java.awt.*;
import java.util.*;


public class balls {
    public static Random rand = new Random();

    public static int width = 800;
    public static int height = 600;

    public static int verticalBalls = 5;
    public static int horizontalBalls = 5;
    public static int totalBalls = verticalBalls + horizontalBalls;

    public static int[] x = new int[totalBalls];
    public static int[] y = new int[totalBalls];
    public static int[] speed = new int[totalBalls];
    public static String[] direction = new String[totalBalls];
    public static Color[] color = new Color[totalBalls];
    public static int[] size = new int[totalBalls];

    /**
     * program entry point
     * @param args command line args
     */
    public static void main(String[] args) {

        DrawingPanel panel = new DrawingPanel(width, height);
        panel.setBackground(Color.LIGHT_GRAY);
        Graphics g = panel.getGraphics();
        getInitialStatus();

        while (true) {
            for (int i = 0; i < totalBalls; i++) {
                if (direction[i].equals("up")) {
                    y[i] -= speed[i];
                    if (y[i] <= 0) {
                        direction[i] = "down";
                    }
                } else if (direction[i].equals("down")) {
                    y[i] += speed[i];
                    if (y[i] >= height - size[i]) {
                        direction[i] = "up";
                    }
                } else if (direction[i].equals("left")) {
                    x[i] -= speed[i];
                    if (x[i] <= 0) {
                        direction[i] = "right";
                    }
                } else if (direction[i].equals("right")) {
                    x[i] += speed[i];
                    if (x[i] >= width - size[i]) {
                        direction[i] = "left";
                    }
                }
                g.setColor(color[i]);
                g.fillOval(x[i], y[i], size[i], size[i]);
            }

            // adjusted sleep time up to mitigate flashing
            panel.sleep(200);
            g.clearRect(0, 0, width, height);
        }
    }

    /**
     * sets all the global ball variables to their initial values
     */
    public static void getInitialStatus() {
        int count = 0;
        for (int i = 0; i < verticalBalls; i++) {
            size[count] = rand.nextInt(100) + 51; // random size 50-150
            x[count] = rand.nextInt(width - size[count]);
            y[count] = 0;
            color[count] = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            speed[count] = rand.nextInt(30) + 1;
            direction[count] = "down";
            count++;
        }

        for (int i = 0; i < horizontalBalls; i++) {
            size[count] = rand.nextInt(100) + 51; // random size 50-150
            x[count] = 0;
            y[count] = rand.nextInt(height - size[count]);
            color[count] = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
            speed[count] = rand.nextInt(30) + 1;
            direction[count] = "right";
            count++;
        }
    }
}
