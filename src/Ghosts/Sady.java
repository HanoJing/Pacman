package Ghosts;

import java.awt.*;

public class Sady {

        public static int startX;
        public static int startY;

        public Sady(int startX,int startY){
            this.startX = startX;
            this.startY = startY;
        }
    public void drawSady(Graphics g){
        g.setColor(Color.blue);
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
        g.setColor(Color.white);
        g.fillRect(startX+8,startY+10,4,4);
        g.fillRect(startX+16,startY+10,4,4);
        g.fillRect(startX+4,startY+18,4,2);
        g.fillRect(startX+12,startY+18,4,2);
        g.fillRect(startX+20,startY+18,4,2);
        g.fillRect(startX+2,startY+20,2,2);
        g.fillRect(startX+8,startY+20,4,2);
        g.fillRect(startX+16,startY+20,4,2);
        g.fillRect(startX+24,startY+20,2,2);
    }
}
