package Geisterchen;

import java.awt.*;

public class Pinky {

    public static int startX;
    public static int startY;
    public static int links;
    public static int rechts;
    public static int oben;
    public static int unten;

    public Pinky(int startX,int startY,int links,int rechts,int oben,int unten){
        this.startX = startX;
        this.startY = startY;
        this.links = links;
        this.rechts = rechts;
        this.oben = oben;
        this.unten = unten;
    }

    public void drawPinky(Graphics g){
        g.setColor(Color.pink);
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
        //Augen nach rechts schauend
        g.setColor(Color.white);
        g.fillRect(startX+10,startY+6,4,10);
        g.fillRect(startX+8,startY+8,8,6);
        g.fillRect(startX+22,startY+6,4,10);
        g.fillRect(startX+20,startY+8,8,6);
        g.setColor(Color.blue);
        g.fillRect(startX+12,startY+10,4,4);
        g.fillRect(startX+24,startY+10,4,4);
        //Augen nach oben schauend
        g.setColor(Color.white);
        g.fillRect(startX+6,startY+6,4,10);
        g.fillRect(startX+4,startY+8,8,6);
        g.fillRect(startX+18,startY+6,4,10);
        g.fillRect(startX+16,startY+8,8,6);
        g.setColor(Color.blue);
        g.fillRect(startX+6,startY+6,4,4);
        g.fillRect(startX+18,startY+6,4,4);
        //Augen nach unten schauend
        g.setColor(Color.white);
        g.fillRect(startX+6,startY+6,4,10);
        g.fillRect(startX+4,startY+8,8,6);
        g.fillRect(startX+18,startY+6,4,10);
        g.fillRect(startX+16,startY+8,8,6);
        g.setColor(Color.blue);
        g.fillRect(startX+6,startY+12,4,4);
        g.fillRect(startX+18,startY+12,4,4);
    }
}