package Enemies;

import java.awt.*;

public class Clyde {

    public static int startX;
    public static int startY;
    public static boolean left;
    public static boolean right;
    public static boolean above;
    public static boolean down;

    public Clyde(int startX,int startY,boolean left,boolean right,boolean above,boolean down){
        this.startX = startX;
        this.startY = startY;
        this.left = left;
        this.right = right;
        this.above = above;
        this.down = down;
    }


    public void drawClyde(Graphics g){
        g.setColor(Color.orange);
        g.fillRect(startX+10,startY,8,2);
        g.fillRect(startX+6,startY+2,16,2);
        g.fillRect(startX+4,startY+4,20,20);
        g.fillRect(startX+2,startY+6,2,20);
        g.fillRect(startX+24,startY+6,2,20);
        g.fillRect(startX,startY+12,2,16);
        g.fillRect(startX+26,startY+12,2,16);
        g.fillRect(startX+6,startY+24,6,2);
        g.fillRect(startX+8,startY+26,4,2);
        g.fillRect(startX+16,startY+24,6,2);
        g.fillRect(startX+16,startY+26,4,2);

        if(left = true) {
            //Augen sind nach links gerichtet
            g.setColor(Color.white);
            g.fillRect(startX + 4, startY + 6, 4, 10);
            g.fillRect(startX + 2, startY + 8, 8, 6);
            g.fillRect(startX + 16, startY + 6, 4, 10);
            g.fillRect(startX + 14, startY + 8, 8, 6);
            g.setColor(Color.blue);
            g.fillRect(startX + 2, startY + 10, 4, 4);
            g.fillRect(startX + 14, startY + 10, 4, 4);
        }else if(right = true) {
            //Augen sind nach rechts gerichtet
            g.setColor(Color.white);
            g.fillRect(startX + 10, startY + 6, 4, 10);
            g.fillRect(startX + 8, startY + 8, 8, 6);
            g.fillRect(startX + 22, startY + 6, 4, 10);
            g.fillRect(startX + 20, startY + 8, 8, 6);
            g.setColor(Color.blue);
            g.fillRect(startX + 12, startY + 10, 4, 4);
            g.fillRect(startX + 24, startY + 10, 4, 4);
        }else if(above = true) {
            //Augen sind nach oben gerichtet
            g.setColor(Color.white);
            g.fillRect(startX + 6, startY + 6, 4, 10);
            g.fillRect(startX + 4, startY + 8, 8, 6);
            g.fillRect(startX + 18, startY + 6, 4, 10);
            g.fillRect(startX + 16, startY + 8, 8, 6);
            g.setColor(Color.blue);
            g.fillRect(startX + 6, startY + 6, 4, 4);
            g.fillRect(startX + 18, startY + 6, 4, 4);
        }else if(down = true) {
            //Augen sind nach oben gerichtet
            g.setColor(Color.white);
            g.fillRect(startX + 6, startY + 6, 4, 10);
            g.fillRect(startX + 4, startY + 8, 8, 6);
            g.fillRect(startX + 18, startY + 6, 4, 10);
            g.fillRect(startX + 16, startY + 8, 8, 6);
            g.setColor(Color.blue);
            g.fillRect(startX + 6, startY + 12, 4, 4);
            g.fillRect(startX + 18, startY + 12, 4, 4);
        }
    }
}
