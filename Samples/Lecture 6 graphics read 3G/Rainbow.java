import java.awt.*;

public class Rainbow {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(280, 200);
		Image rainbow = panel.loadImage("rainbow.png");
		Graphics g = panel.getGraphics();
		g.drawImage(rainbow, 0, 0, panel);
		g.drawString("Somewhere over the rainbow...", 10, 180);
	}
}
