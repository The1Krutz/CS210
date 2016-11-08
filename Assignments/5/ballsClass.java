
// For this assignment you are limited to the language features in Chapters 1-5
// shown in lecture or the textbook.
import java.awt.*;
import java.util.*;

public class ballsClass {

    /**
     * program entry point
     * @param args command line args
     */
    public static void main(String[] args) {
        ballRunner a = new ballRunner();

        a.go();
    }
}

class ball {
    private static Random rand = new Random();

    private int y;
    private int x;
    private int speed;
    private String direction;
    private Color color;
    private int size;

    public ball(int _x, int _y, String _direction) {
        x = x;
        y = y;
        speed = rand.nextInt(30) + 1;
        direction = _direction;
        color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        size = rand.nextInt(100) + 51;     // random size 50-150
    }

    public void move(Graphics g) {
        // System.out.println("2");
        // System.out.println("" + direction);
        if (direction.equals("up")) {
            // System.out.println("2.1.1");
            y -= speed;
            if (y <= 0) {
                direction = "down";
            }
        } else if (direction.equals("down")) {
            // System.out.println("2.1.2");
            y += speed;
            if (y >= ballRunner.height) {
                direction = "up";
            }
        } else if (direction.equals("left")) {
            // System.out.println("2.1.3");
            x -= speed;
            if (x <= 0) {
                direction = "right";
            }
        } else if (direction.equals("right")) {
            // System.out.println("2.1.4");
            x += speed;
            if (x >= ballRunner.width - size) {
                direction = "left";
            }
        } else {
            // System.out.println("2.1.5");
            System.out.println("INVALID DIRECTION");
        }
        // System.out.println("2.2");
        g.setColor(color);
        // System.out.println("2.3");
        g.fillOval(x, y, size, size);
        // System.out.println("2.4");
    }
}

class ballRunner {
    public static Random rand = new Random();

    public static int width = 800;
    public static int height = 600;

    public ball[] allBalls = new ball[10];

    public void go() {
        DrawingPanel panel = new DrawingPanel(width, height);
        panel.setBackground(Color.LIGHT_GRAY);
        Graphics g = panel.getGraphics();

        // System.out.println("1.1");
        getInitialStatus();

        // System.out.println("1.2");
        while (true) {
            // System.out.println("1.3");
            for (int i = 0; i < 10; i++) {
                // System.out.println("1.3." + i);
                allBalls[i].move(g);
            }

            // adjusted sleep time up to mitigate flashing
            panel.sleep(200);
            g.clearRect(0, 0, width, height);
        }
    }

    /**
     * sets all the global ball variables to their initial values
     */
    public void getInitialStatus() {
        allBalls[0] = new ball(rand.nextInt(width), 0, "down");
        allBalls[1] = new ball(rand.nextInt(width), 0, "down");
        allBalls[2] = new ball(rand.nextInt(width), 0, "down");
        allBalls[3] = new ball(rand.nextInt(width), 0, "down");
        allBalls[4] = new ball(rand.nextInt(width), 0, "down");

        allBalls[5] = new ball(rand.nextInt(height), 0, "right");
        allBalls[6] = new ball(rand.nextInt(height), 0, "right");
        allBalls[7] = new ball(rand.nextInt(height), 0, "right");
        allBalls[8] = new ball(rand.nextInt(height), 0, "right");
        allBalls[9] = new ball(rand.nextInt(height), 0, "right");
    }

}
