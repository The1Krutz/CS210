import java.awt.*;

public class multipleFaces {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(520, 180);
        Graphics g = panel.getGraphics();

        for (int i = 0; i < 5; i++) {
            int x = 10 + (100 * i);
            int y = 30 + (10 * i);

            drawFace(g, x, y);
        }
    }

    public static void drawFace(Graphics g, int x, int y) {
        g.setColor(Color.black);
        // circle face
        g.drawOval(x, y, 100, 100);

        // blue eyes
        g.setColor(Color.BLUE);
        g.fillOval(x + 20, y + 30, 20, 20);
        g.fillOval(x + 60, y + 30, 20, 20);

        // mouth line
        g.setColor(Color.RED);
        g.drawLine(x + 30, y + 70, x + 70, y + 70);
    }
}