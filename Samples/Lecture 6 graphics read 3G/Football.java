import java.awt.*;

public class Football {
	public static void main(String[] args) {
		DrawingPanel panel = new DrawingPanel(250, 250);
		Graphics g = panel.getGraphics();
		g.drawRect(10, 30, 200, 200);

		// top-left lines
		for (int i = 0; i < 20; i++) {
			g.drawLine(210 - i*10, 30, 10, 30 + i*10);
		}

		// bottom-right lines
		for (int i = 0; i < 20; i++) {
			g.drawLine(210, 30 + i*10, 210 - i*10, 230);
		}
	}
}
