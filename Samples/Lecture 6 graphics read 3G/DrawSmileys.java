import java.awt.*;

public class DrawSmileys {
    public static void main(String[] args) {
        DrawingPanel panel = new DrawingPanel(500, 120);
        Image smileyFace = panel.loadImage("smiley.png");
        Graphics g = panel.getGraphics();
        for (int i = 0; i < 4; i++) {
            g.drawImage(smileyFace, i * 110 + 10, 10, panel);
        }
    }
}
