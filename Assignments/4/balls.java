// 10. Complete the following balls.java program as we discussed at the class (up-down only). You have to use the class movingObject.

import java.awt.* ;
import java.util.* ;

public class balls {
   public static int width = 800;  public static int height = 600;
   public static int howMany = 20; public static int ballSizeMax = 70;
   public static

 public static void main(String[] args) {
	DrawingPanel panel = new DrawingPanel(width, height);
	panel.setBackground(Color.LIGHT_GRAY);
	Graphics g = panel.getGraphics();
	getInitialStatus();
    while (true) {    
	 for (int i = 0; i < howMany; i++) {
       g.setColor(




	}
   panel.sleep(50);
   g.clearRect(0, 0, width, height);
   }
}
public static void getInitialStatus() {
  Random rand = new Random();    
for (int i = 0; i < howMany; i++) {  
ball[i] = new movingObject();
ball[i].size=rand.nextInt(ballSizeMax) + 10;






 }
}

 public static Color getColor() {




	return myColor;

   } 
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
