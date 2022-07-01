package Geisterchen;

import java.awt.*;

public class Blinky {
    public static int startX;
    public static int startY;

    public Blinky(int startX,int startY){
        this.startX = startX;  //1150
        this.startY = startY;  //678
    }

    public void drawBlinky(Graphics g){
        g.setColor(Color.red);
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
        //Augen nach links schauend
        g.setColor(Color.white);
        g.fillRect(startX+4,startY+6,4,10);
        g.fillRect(startX+2,startY+8,8,6);
        g.fillRect(startX+16,startY+6,4,10);
        g.fillRect(startX+14,startY+8,8,6);
        g.setColor(Color.blue);
        g.fillRect(startX+2,startY+10,4,4);
        g.fillRect(startX+14,startY+10,4,4);
    }
}