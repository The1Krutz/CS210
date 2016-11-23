// 10. Complete the following balls.java program as we discussed at the class (up-down only). You have to use the class movingObject.

import java.awt.*;
import java.util.*;

public class balls {
    public static int width = 800;
    public static int height = 600;
    public static int howMany = 20;
    public static int ballSizeMax = 70;

    public static movingObject[] ball = new movingObject[howMany];
    public static Random rand = new Random();

    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(width, height);
        panel.setBackground(Color.LIGHT_GRAY);
        Graphics g = panel.getGraphics();
        getInitialStatus();

        while (true) {
            for (int i = 0; i < howMany; i++) {
                if (ball[i].direction.equals("up")) {
                    ball[i].y -= ball[i].speed;
                    if (ball[i].y <= 0) {
                        ball[i].direction = "down";
                    }
                } else {
                    ball[i].y += ball[i].speed;
                    if (ball[i].y >= height - ball[i].size) {
                        ball[i].direction = "up";
                    }
                }
                g.setColor(ball[i].color);
                g.fillOval(ball[i].x, ball[i].y, ball[i].size, ball[i].size);
            }

            panel.sleep(50);
            g.clearRect(0, 0, width, height);
        }
    }

    public static void getInitialStatus() {
        for (int i = 0; i < howMany; i++) {
            ball[i] = new movingObject();

            ball[i].x = rand.nextInt(width);
            ball[i].y = 0;
            ball[i].size = rand.nextInt(ballSizeMax) + 10;
            ball[i].speed = rand.nextInt(30) + 10;
            ball[i].direction = "down";
            ball[i].color = getColor();
        }
    }

    public static Color getColor() {
        return new Color(rand.nextInt(256), rand.nextInt(256), rand.nextInt(256));
    }
}

class movingObject {
    int x;
    int y;
    int size;
    int speed;
    String direction;
    Color color;
}
