import java.awt.*;

public class draw2 {
    public static DrawingPanel panel = new DrawingPanel(300, 200);

    public static void main(String[] args) {
        Graphics g = panel.getGraphics();

        drawTest(g);
    }

    public static void drawTest(Graphics g) {
        g.drawOval(50, 50, 10, 10);
        g.setColor(Color.RED);

        g.fillRect(50, 100, 10, 10);

        g.drawString("1", 1, 1);


        int style = Font.TRUETYPE_FONT;
        Font font = new Font ("Courier New", style , 50);

        g.setFont(font);
        g.drawString("testing", 50,50);
    }
}
