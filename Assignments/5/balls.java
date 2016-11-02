
// For this assignment you are limited to the language features in Chapters 1-5
// shown in lecture or the textbook.
import java.awt.*;
import java.util.*;

public class balls {
    public static Random rand = new Random();

    public static int width = 800;
    public static int height = 600;

    // first five are vertical balls, and start moving down
    public static int ball_1_x;
    public static int ball_1_y;
    public static int ball_1_s;
    public static String ball_1_direction = "down";
    public static Color ball_1_Color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    public static int ball_1_Size = rand.nextInt(100) + 51; // random size 50-150

    public static int ball_2_x;
    public static int ball_2_y;
    public static int ball_2_s;
    public static String ball_2_direction = "down";
    public static Color ball_2_Color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    public static int ball_2_Size = rand.nextInt(100) + 51; // random size 50-150

    public static int ball_3_x;
    public static int ball_3_y;
    public static int ball_3_s;
    public static String ball_3_direction = "down";
    public static Color ball_3_Color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    public static int ball_3_Size = rand.nextInt(100) + 51; // random size 50-150

    public static int ball_4_x;
    public static int ball_4_y;
    public static int ball_4_s;
    public static String ball_4_direction = "down";
    public static Color ball_4_Color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    public static int ball_4_Size = rand.nextInt(100) + 51; // random size 50-150

    public static int ball_5_x;
    public static int ball_5_y;
    public static int ball_5_s;
    public static String ball_5_direction = "down";
    public static Color ball_5_Color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    public static int ball_5_Size = rand.nextInt(100) + 51; // random size 50-150

    // first five are horizontal balls, and start moving right
    public static int ball_6_x;
    public static int ball_6_y;
    public static int ball_6_s;
    public static String ball_6_direction = "right";
    public static Color ball_6_Color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    public static int ball_6_Size = rand.nextInt(100) + 51; // random size 50-150

    public static int ball_7_x;
    public static int ball_7_y;
    public static int ball_7_s;
    public static String ball_7_direction = "right";
    public static Color ball_7_Color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    public static int ball_7_Size = rand.nextInt(100) + 51; // random size 50-150

    public static int ball_8_x;
    public static int ball_8_y;
    public static int ball_8_s;
    public static String ball_8_direction = "right";
    public static Color ball_8_Color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    public static int ball_8_Size = rand.nextInt(100) + 51; // random size 50-150

    public static int ball_9_x;
    public static int ball_9_y;
    public static int ball_9_s;
    public static String ball_9_direction = "right";
    public static Color ball_9_Color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    public static int ball_9_Size = rand.nextInt(100) + 51; // random size 50-150

    public static int ball_10_x;
    public static int ball_10_y;
    public static int ball_10_s;
    public static String ball_10_direction = "right";
    public static Color ball_10_Color = new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    public static int ball_10_Size = rand.nextInt(100) + 51; // random size 50-150

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
            for (int i = 1; i <= 10; i++) {

                switch (i) {
                case 1:
                    if (ball_1_direction == "up") {
                        ball_1_y -= ball_1_s;
                        if (ball_1_y <= 0) {
                            ball_1_direction = "down";
                        }
                    } else {
                        ball_1_y += ball_1_s;
                        if (ball_1_y >= height - ball_1_Size) {
                            ball_1_direction = "up";
                        }
                    }
                    g.setColor(ball_1_Color);
                    g.fillOval(ball_1_x, ball_1_y, ball_1_Size, ball_1_Size);
                    break;
                case 2:
                    if (ball_2_direction == "up") {
                        ball_2_y -= ball_2_s;
                        if (ball_2_y <= 0) {
                            ball_2_direction = "down";
                        }
                    } else {
                        ball_2_y += ball_2_s;
                        if (ball_2_y >= height - ball_2_Size) {
                            ball_2_direction = "up";
                        }
                    }
                    g.setColor(ball_2_Color);
                    g.fillOval(ball_2_x, ball_2_y, ball_2_Size, ball_2_Size);
                    break;
                case 3:
                    if (ball_3_direction == "up") {
                        ball_3_y -= ball_3_s;
                        if (ball_3_y <= 0) {
                            ball_3_direction = "down";
                        }
                    } else {
                        ball_3_y += ball_3_s;
                        if (ball_3_y >= height - ball_3_Size) {
                            ball_3_direction = "up";
                        }
                    }
                    g.setColor(ball_3_Color);
                    g.fillOval(ball_3_x, ball_3_y, ball_3_Size, ball_3_Size);
                    break;
                case 4:
                    if (ball_4_direction == "up") {
                        ball_4_y -= ball_4_s;
                        if (ball_4_y <= 0) {
                            ball_4_direction = "down";
                        }
                    } else {
                        ball_4_y += ball_4_s;
                        if (ball_4_y >= height - ball_4_Size) {
                            ball_4_direction = "up";
                        }
                    }
                    g.setColor(ball_4_Color);
                    g.fillOval(ball_4_x, ball_4_y, ball_4_Size, ball_4_Size);
                    break;
                case 5:
                    if (ball_5_direction == "up") {
                        ball_5_y -= ball_5_s;
                        if (ball_5_y <= 0) {
                            ball_5_direction = "down";
                        }
                    } else {
                        ball_5_y += ball_5_s;
                        if (ball_5_y >= height - ball_5_Size) {
                            ball_5_direction = "up";
                        }
                    }
                    g.setColor(ball_5_Color);
                    g.fillOval(ball_5_x, ball_5_y, ball_5_Size, ball_5_Size);
                    break;
                case 6:
                    if (ball_6_direction == "left") {
                        ball_6_x -= ball_6_s;
                        if (ball_6_x <= 0) {
                            ball_6_direction = "right";
                        }
                    } else {
                        ball_6_x += ball_6_s;
                        if (ball_6_x >= height - ball_6_Size) {
                            ball_6_direction = "left";
                        }
                    }
                    g.setColor(ball_6_Color);
                    g.fillOval(ball_6_x, ball_6_y, ball_6_Size, ball_6_Size);
                    break;
                case 7:
                    if (ball_7_direction == "left") {
                        ball_7_x -= ball_7_s;
                        if (ball_7_x <= 0) {
                            ball_7_direction = "right";
                        }
                    } else {
                        ball_7_x += ball_7_s;
                        if (ball_7_x >= height - ball_7_Size) {
                            ball_7_direction = "left";
                        }
                    }
                    g.setColor(ball_7_Color);
                    g.fillOval(ball_7_x, ball_7_y, ball_7_Size, ball_7_Size);
                    break;
                case 8:
                    if (ball_8_direction == "left") {
                        ball_8_x -= ball_8_s;
                        if (ball_8_x <= 0) {
                            ball_8_direction = "right";
                        }
                    } else {
                        ball_8_x += ball_8_s;
                        if (ball_8_x >= height - ball_8_Size) {
                            ball_8_direction = "left";
                        }
                    }
                    g.setColor(ball_8_Color);
                    g.fillOval(ball_8_x, ball_8_y, ball_8_Size, ball_8_Size);
                    break;
                case 9:
                    if (ball_9_direction == "left") {
                        ball_9_x -= ball_9_s;
                        if (ball_9_x <= 0) {
                            ball_9_direction = "right";
                        }
                    } else {
                        ball_9_x += ball_9_s;
                        if (ball_9_x >= height - ball_9_Size) {
                            ball_9_direction = "left";
                        }
                    }
                    g.setColor(ball_9_Color);
                    g.fillOval(ball_9_x, ball_9_y, ball_9_Size, ball_9_Size);
                    break;
                case 10:
                    if (ball_10_direction == "left") {
                        ball_10_x -= ball_10_s;
                        if (ball_10_x <= 0) {
                            ball_10_direction = "right";
                        }
                    } else {
                        ball_10_x += ball_10_s;
                        if (ball_10_x >= height - ball_10_Size) {
                            ball_10_direction = "left";
                        }
                    }
                    g.setColor(ball_10_Color);
                    g.fillOval(ball_10_x, ball_10_y, ball_10_Size, ball_10_Size);
                    break;
                }
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
        // vertical balls start at a random x
        ball_1_x = rand.nextInt(width - ball_1_Size);
        ball_2_x = rand.nextInt(width - ball_2_Size);
        ball_3_x = rand.nextInt(width - ball_3_Size);
        ball_4_x = rand.nextInt(width - ball_4_Size);
        ball_5_x = rand.nextInt(width - ball_5_Size);
        // horizontal balls all start on left edge
        ball_6_x = 0;
        ball_7_x = 0;
        ball_8_x = 0;
        ball_9_x = 0;
        ball_10_x = 0;

        // vertical balls all start at top
        ball_1_y = 0;
        ball_2_y = 0;
        ball_3_y = 0;
        ball_4_y = 0;
        ball_5_y = 0;
        // horizontal balls all start at a random y
        ball_6_y = rand.nextInt(height - ball_6_Size);
        ball_7_y = rand.nextInt(height - ball_7_Size);
        ball_8_y = rand.nextInt(height - ball_8_Size);
        ball_9_y = rand.nextInt(height - ball_9_Size);
        ball_10_y = rand.nextInt(height - ball_10_Size);

        // all balls get a random speed
        ball_1_s = rand.nextInt(30) + 1;
        ball_2_s = rand.nextInt(30) + 1;
        ball_3_s = rand.nextInt(30) + 1;
        ball_4_s = rand.nextInt(30) + 1;
        ball_5_s = rand.nextInt(30) + 1;
        ball_6_s = rand.nextInt(30) + 1;
        ball_7_s = rand.nextInt(30) + 1;
        ball_8_s = rand.nextInt(30) + 1;
        ball_9_s = rand.nextInt(30) + 1;
        ball_10_s = rand.nextInt(30) + 1;
    }
}
