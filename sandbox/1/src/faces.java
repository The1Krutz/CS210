import java.awt.*;

public class faces {
    public static void main(String[] args){
        DrawingPanel panel = new DrawingPanel(220,150);
        Graphics g = panel.getGraphics();

        drawFace(g);
    }

    public static void drawFace(Graphics g){
        // circle face
        g.drawOval(10,30,100,100);

        // blue eyes
        g.setColor(Color.BLUE);
        g.fillOval(30,60,20,20);
        g.fillOval(70,60,20,20);

        // mouth line
        g.setColor(Color.RED);
        g.drawLine(40,100,80,100);
    }
}
