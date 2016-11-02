
// For this assignment you are limited to the language features in Chapters 1-5
// shown in lecture or the textbook.
import java.awt.*;
import java.util.*;

public class balls {
    public static Random rand = new Random();

    public static int width = 800;
    public static int height = 600;

    public static int b1x;
    public static int b1y;
    public static int b1s;

    public static int b2x;
    public static int b2y;
    public static int b2s;

    public static int b3x;
    public static int b3y;
    public static int b3s;

    public static int b4x;
    public static int b4y;
    public static int b4s;

    public static int b5x;
    public static int b5y;
    public static int b5s;

    public static String b1d = "down";
    public static String b2d = "down";
    public static String b3d = "down";
    public static String b4d = "down";
    public static String b5d = "down";

    public static int ballSize = 50;

    public static void main(String[] args) {

        DrawingPanel panel = new DrawingPanel(width, height);
        panel.setBackground(Color.LIGHT_GRAY);
        Graphics g = panel.getGraphics();
        g.setColor(Color.GREEN);
        getInitialStatus();

        while (true) {
            for (int i = 1; i <= 5; i++) {

                switch (i) {
                case 1:
                    if (b1d == "up") {
                        b1y -= b1s;
                        if (b1y <= 0) {
                            b1d = "down";
                        }
                    } else {
                        b1y += b1s;
                        if (b1y >= height - ballSize) {
                            b1d = "up";
                        }
                    }
                    g.fillOval(b1x, b1y, ballSize, ballSize);
                    break;
                case 2:
                    if (b2d == "up") {
                        b2y -= b2s;
                        if (b2y <= 0) {
                            b2d = "down";
                        }
                    } else {
                        b2y += b2s;
                        if (b2y >= height - ballSize) {
                            b2d = "up";
                        }
                    }
                    g.fillOval(b2x, b2y, ballSize, ballSize);
                    break;
                case 3:
                    if (b3d == "up") {
                        b3y -= b3s;
                        if (b3y <= 0) {
                            b3d = "down";
                        }
                    } else {
                        b3y += b3s;
                        if (b3y >= height - ballSize) {
                            b3d = "up";
                        }
                    }
                    g.fillOval(b3x, b3y, ballSize, ballSize);
                    break;
                case 4:
                    if (b4d == "up") {
                        b4y -= b4s;
                        if (b4y <= 0) {
                            b4d = "down";
                        }
                    } else {
                        b4y += b4s;
                        if (b4y >= height - ballSize) {
                            b4d = "up";
                        }
                    }
                    g.fillOval(b4x, b4y, ballSize, ballSize);
                    break;
                case 5:
                    if (b5d == "up") {
                        b5y -= b5s;
                        if (b5y <= 0) {
                            b5d = "down";
                        }
                    } else {
                        b5y += b5s;
                        if (b5y >= height - ballSize) {
                            b5d = "up";
                        }
                    }
                    g.fillOval(b5x, b5y, ballSize, ballSize);
                    break;
                }
            }

            panel.sleep(100);
            g.clearRect(0, 0, width, height);
        }
    }

    public static void getInitialStatus() {

        Random rand = new Random();
        b1x = rand.nextInt(width - ballSize);
        b2x = rand.nextInt(width - ballSize);
        b3x = rand.nextInt(width - ballSize);
        b4x = rand.nextInt(width - ballSize);
        b5x = rand.nextInt(width - ballSize);

        b1y = 0;
        b2y = 0;
        b3y = 0;
        b4y = 0;
        b5y = 0;

        b1s = rand.nextInt(30) + 1;
        b2s = rand.nextInt(30) + 1;
        b3s = rand.nextInt(30) + 1;
        b4s = rand.nextInt(30) + 1;
        b5s = rand.nextInt(30) + 1;
    }

public static Color randomColor(){
    return new Color(rand.nextInt(256),rand.nextInt(256),rand.nextInt(256))
}

}
