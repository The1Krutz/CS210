import java.awt.*;
import java.util.*;

/**
 * randomized balls program, refactored to use an array of objects instead of lots of global variables
 */
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

/**
 * ballRunner class: runs the balls all over the graphic panel
 * Holds variables to control the size of the drawing panel, and the number of balls.
 */
class ballRunner {
    private int verticalBalls = 5;
    private int horizontalBalls = 5;
    private int totalBalls = verticalBalls + horizontalBalls;
    private int sleepTime = 200;

    private static Random rand = new Random();

    public static int width = 800;
    public static int height = 600;

    public ball[] allBalls = new ball[totalBalls];

    /**
     * initializes and moves the balls
     */
    public void go() {
        DrawingPanel panel = new DrawingPanel(width, height);
        panel.setBackground(Color.LIGHT_GRAY);
        Graphics g = panel.getGraphics();

        getInitialStatus();

        while (true) {
            for (int i = 0; i < totalBalls; i++) {
                allBalls[i].move(g);
            }

            // adjusted sleep time up to mitigate flashing
            panel.sleep(sleepTime);
            g.clearRect(0, 0, width, height);
        }
    }

    /**
     * sets initial values for all the elements of the ball array
     */
    private void getInitialStatus() {
        int index = 0;
        for (int i = 0; i < verticalBalls; i++) {
            allBalls[index] = new ball(rand.nextInt(width), 0, "down");
            index++;
        }
        for (int i = 0; i < horizontalBalls; i++) {
            allBalls[index] = new ball( 0, rand.nextInt(height), "right");
            index++;
        }
    }
}

/**
 * A single ball object. Contains numerous private fields to control the properties of the ball,
 * and a public method to move and re-render the ball
 */
class ball {
    private static Random rand = new Random();

    private int y;
    private int x;
    private int speed;
    private String direction;
    private Color color;
    private int size;

    /**
     * Ball object constructor
     * @param   {int} _x X-coordinate of the ball
     * @param   {int} _y Y-coordinate of the ball
     * @param   {String} _direction  Initial direction the ball is moving
     * @return  {ball}  Fully initialized ball object
     */
    public ball(int _x, int _y, String _direction) {
        x = _x;
        y = _y;
        speed = rand.nextInt(20) + 10;
        direction = _direction;
        color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
        size = rand.nextInt(100) + 51;     // random size 50-150
    }

    /**
     * moves the ball, and performs edge-checking to reverse direction when the ball hits an edge
     * @param {Graphics} g Graphics object where the ball is to be rendered
     */
    public void move(Graphics g) {
        if (direction.equals("up")) {
            y -= speed;
            if (y <= 0) {
                direction = "down";
            }
        } else if (direction.equals("down")) {
            y += speed;
            if (y >= ballRunner.height - size) {
                direction = "up";
            }
        } else if (direction.equals("left")) {
            x -= speed;
            if (x <= 0) {
                direction = "right";
            }
        } else if (direction.equals("right")) {
            x += speed;
            if (x >= ballRunner.width - size) {
                direction = "left";
            }
        } else {
            // if the direction is somehow invalid, set some reasonable defaults and carry on
            System.out.println("INVALID DIRECTION");
            x = 0;
            y = 0;
            speed = 15;
            direction = "up";
        }
        g.setColor(color);
        g.fillOval(x, y, size, size);
    }
}
