package Ghosts;

import java.awt.*;

public class Inky {

        public static int startX;
        public static int startY;

        public Inky(int startX,int startY){
            this.startX = startX;
            this.startY = startY;
        }

    public void drawInky(Graphics g){
        g.setColor(Color.cyan);
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
        //Augen nach oben schauend
        g.setColor(Color.white);
        g.fillRect(startX+6,startY+6,4,10);
        g.fillRect(startX+4,startY+8,8,6);
        g.fillRect(startX+18,startY+6,4,10);
        g.fillRect(startX+16,startY+8,8,6);
        g.setColor(Color.blue);
        g.fillRect(startX+6,startY+6,4,4);
        g.fillRect(startX+18,startY+6,4,4);
    }
}
