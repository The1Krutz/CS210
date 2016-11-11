
//This project is to set 10 balls with random color, random speed and random size. 

import java.awt.*;
import java.util.*;

public class ballsSample {
  
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
  public static int b6x;
  public static int b6y;
  public static int b6s;
  public static int b7x;
  public static int b7y;
  public static int b7s;
  public static int b8x;
  public static int b8y;
  public static int b8s;
  public static int b9x;
  public static int b9y;
  public static int b9s;
  public static int b10x;
  public static int b10y;
  public static int b10s;
  public static String b1d="down";
  public static String b2d="down";
  public static String b3d="down";
  public static String b4d="down";
  public static String b5d="down";
  public static String b6d="right";
  public static String b7d="right";
  public static String b8d="right";
  public static String b9d="right";
  public static String b10d="right";
  public static int ballSizeMax=70;
  
  public static int ballSize1;
  public static int ballSize2;
  public static int ballSize3;
  public static int ballSize4;
  public static int ballSize5;
  public static int ballSize6;
  public static int ballSize7;
  public static int ballSize8;
  public static int ballSize9;
  public static int ballSize10;  
  
  public static Color color1;
  public static Color color2;
  public static Color color3;
  public static Color color4;
  public static Color color5;
  public static Color color6;
  public static Color color7;
  public static Color color8;
  public static Color color9;
  public static Color color10;

 // This method is to creat random color.
 public static Color color()
{
         Random rand= new Random(); 
         int red = rand.nextInt(256);
         int green=rand.nextInt(256);
         int blue=rand.nextInt(256);
         Color myColor=new Color(red,green,blue);
         return myColor;
 }
  
  public static void main(String[] args) {
    
        DrawingPanel panel = new DrawingPanel(width, height);
        panel.setBackground(Color.LIGHT_GRAY);
        Graphics g = panel.getGraphics();
        Random rand = new Random();
        getInitialStatus();
                 
      while(true){  
         for (int i=1; i<=10; i++) {
         
         switch(i) {
           case 1: 
                   g.setColor(color1); //color1=g.setcolor(myColor);
                   if (b1d=="up") {
                     b1y-=b1s;
                    if (b1y<=0) {
                     b1d="down";
                    }
                    } else {
                    b1y+=b1s;
                    if (b1y>=height-ballSize1) {
                     b1d="up";
                    }
                    }
                    
                    g.fillOval(b1x,b1y, ballSize1, ballSize1);
                   break;
          case 2: 
                     
                   g.setColor(color2);
                   if (b2d=="up") {
                     b2y-=b2s;
                    if (b2y<=0) {
                     b2d="down";
                    }
                    } else {
                    b2y+=b2s;
                    if (b2y>=height-ballSize2) {
                     b2d="up";
                    }
                    }
                    g.fillOval(b2x,b2y, ballSize2, ballSize2);
                   break;
          case 3: 
                    g.setColor(color3);
                    if (b3d=="up") {
                     b3y-=b3s;
                    if (b3y<=0) {
                     b3d="down";
                    }
                    } else {
                    b3y+=b3s;
                    if (b3y>=height-ballSize3) {
                     b3d="up";
                    }
                    }
                    g.fillOval(b3x,b3y, ballSize3, ballSize3);
                   break;
          case 4:
                    g.setColor(color4);
                   if (b4d=="up") {
                     b4y-=b4s;
                    if (b4y<=0) {
                     b4d="down";
                    }
                    } else {
                    b4y+=b4s;
                    if (b4y>=height-ballSize4) {
                     b4d="up";
                    }
                    }
                   g.fillOval(b4x,b4y, ballSize4, ballSize4);                    
                   break;
           case 5:
                    g.setColor(color5);
                   if (b5d=="up") {
                     b5y-=b5s;
                    if (b5y<=0) {
                     b5d="down";
                    }
                    } else {
                    b5y+=b5s;
                    if (b5y>=height-ballSize5) {
                     b5d="up";
                    }
                    }
                    g.fillOval(b5x,b5y, ballSize5, ballSize5);
                   break;
            case 6:
                   g.setColor(color6);
                   if(b6d=="left")
                   {
                     b6x-=b6s;
                     if(b6x<=0)
                     {
                        b6d="right";
                     }
                    }
                    else
                    {
                     b6x+=b6s;
                     if(b6x>=width-ballSize6){
                        b6d="left";
                     }
                    } 
                     g.fillOval(b6x,b6y, ballSize6, ballSize6);
                    break;
               case 7:
                    g.setColor(color7);
                   if(b7d=="left")
                   {
                     b7x-=b7s;
                     if(b7x<=0)
                     {
                        b7d="right";
                     }
                    }
                    else
                    {
                     b7x+=b7s;
                     if(b7x>=width-ballSize7){
                        b7d="left";
                     }
                    } 
                     g.fillOval(b7x,b7y, ballSize7, ballSize7);
                    break;
               case 8:
                    g.setColor(color8);
                   if(b8d=="left")
                   {
                     b8x-=b8s;
                     if(b8x<=0)
                     {
                        b8d="right";
                     }
                    }
                    else
                    {
                     b8x+=b8s;
                     if(b8x>=width-ballSize8){
                        b8d="left";
                     }
                    } 
                     g.fillOval(b8x,b8y, ballSize8, ballSize8);
                    break;
               case 9:
                     g.setColor(color9);
                   if(b9d=="left")
                   {
                     b9x-=b9s;
                     if(b9x<=0)
                     {
                        b9d="right";
                     }
                    }
                    else
                    {
                     b9x+=b9s;
                     if(b9x>=width-ballSize9){
                        b9d="left";
                     }
                    } 
                     g.fillOval(b9x,b9y, ballSize9, ballSize9);
                    break;
               case 10:
                     g.setColor(color10);
                   if(b10d=="left")
                   {
                     b10x-=b10s;
                     if(b10x<=0)
                     {
                        b10d="right";
                     }
                    }
                    else
                    {
                     b10x+=b10s;
                     if(b10x>=width-ballSize10){
                        b10d="left";
                     }
                    } 
                     g.fillOval(b10x,b10y, ballSize10, ballSize10);
                    break;
          }
         }

       panel.sleep(100);
       g.clearRect(0,0,width,height);  
     }
    }
    public static void getInitialStatus(){
    
     Random rand = new Random();
     b1x=rand.nextInt(width-ballSize1);
     b2x=rand.nextInt(width-ballSize2);
     b3x=rand.nextInt(width-ballSize3);
     b4x=rand.nextInt(width-ballSize4);
     b5x=rand.nextInt(width-ballSize5);
     b6x=0;
     b7x=0;
     b8x=0;
     b9x=0;
     b10x=0;
          
     b1y=0;
     b2y=0;
     b3y=0;
     b4y=0;
     b5y=0;
     b6y=rand.nextInt(height-ballSize6);
     b7y=rand.nextInt(height-ballSize7);
     b8y=rand.nextInt(height-ballSize8);
     b9y=rand.nextInt(height-ballSize9);
     b10y=rand.nextInt(height-ballSize10);
     
     b1s=rand.nextInt(30)+1;
     b2s=rand.nextInt(30)+1;
     b3s=rand.nextInt(30)+1;
     b4s=rand.nextInt(30)+1;
     b5s=rand.nextInt(30)+1;
     b6s=rand.nextInt(30)+1;
     b7s=rand.nextInt(30)+1;
     b8s=rand.nextInt(30)+1;
     b9s=rand.nextInt(30)+1;
     b10s=rand.nextInt(30)+1;
     
     ballSize1=rand.nextInt(ballSizeMax)+1;
     ballSize2=rand.nextInt(ballSizeMax)+1;
     ballSize3=rand.nextInt(ballSizeMax)+1;
     ballSize4=rand.nextInt(ballSizeMax)+1;
     ballSize5=rand.nextInt(ballSizeMax)+1;
     ballSize6=rand.nextInt(ballSizeMax)+1;
     ballSize7=rand.nextInt(ballSizeMax)+1;
     ballSize8=rand.nextInt(ballSizeMax)+1;
     ballSize9=rand.nextInt(ballSizeMax)+1;
     ballSize10=rand.nextInt(ballSizeMax)+1;

        color1=color();
        color2=color();
        color3=color();
        color4=color();
        color5=color();
        color6=color();
        color7=color();
        color8=color();
        color9=color();
        color10=color();

    }
}

  
 