import java.awt.*;
import java.util.*;

/**
 * animates some number of randomized balls moving across the screen
 */
public class balls {
    public static Random rand = new Random();

    // dimensions of the drawing panel
    public static int width = 800;
    public static int height = 600;

    // number of balls to draw in each direction
    public static int verticalBalls = 5;
    public static int horizontalBalls = 5;
    public static int totalBalls = verticalBalls + horizontalBalls;

    // track the characteristics of each ball
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

        // infinite loop is intentional
        while (true) {
            // iterate through balls, animating them across the screen
            for (int i = 0; i < totalBalls; i++) {
                // move the ball based on its current direction
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
                // re-draw the ball in its new position
                g.setColor(color[i]);
                g.fillOval(x[i], y[i], size[i], size[i]);
            }

            // adjusted sleep time up to mitigate flashing
            panel.sleep(200);
            // clear drawing panel to re-draw next frame
            g.clearRect(0, 0, width, height);
        }
    }

    /**
     * sets all the global ball variables to their initial values
     */
    public static void getInitialStatus() {
        // one counter to track across both sets of balls
        int count = 0;

        // set values for vertical balls
        for (int i = 0; i < verticalBalls; i++) {
            // random x and 0 y means vertical balls start at a random point along the top edge of the frame
            x[count] = rand.nextInt(width - size[count]);
            y[count] = 0;

            // all vertical balls start by going down
            direction[count] = "down";
            count++;
        }

        // set values for horizontal balls
        for (int i = 0; i < horizontalBalls; i++) {
            // random y and 0 x mean all horizontal balls start at a random point along the left edge of the frame
            x[count] = 0;
            y[count] = rand.nextInt(height - size[count]);

            // all horizontal balls start by going right
            direction[count] = "right";
            count++;
        }

        // set values that are the same for all balls
        // these could have been set in the above loops, but this reduces duplicate code
        for (int i = 0; i < totalBalls; i++) {
            size[i] = rand.nextInt(101) + 50; // random size 50-150
            color[i] = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256)); // random color
            speed[i] = rand.nextInt(31) + 10; // random speed 10-40
        }
    }
}
