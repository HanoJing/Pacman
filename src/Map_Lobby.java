import java.awt.*;

public class Map_Lobby {

    public int startX;
    public int startY;

    public Map_Lobby(int startX, int startY){
        this.startX = startX;
        this.startY = startY;

    }

    public void drawHeadline(Graphics g){

        int[] xPointA = {startX + 60,startX + 110,startX + 160};
        int[] yPointA = {startY + 90,startY,startY + 90};
        int[] xPointALine = {startX + 142,startX + 139,startX + 152,startX + 155};
        int[] yPointALine = {startY + 64,startY + 66,startY + 87,startY + 87};
        int[] xPointCLine = {startX + 215,startX + 217,startX + 240,startX + 238};
        int[] yPointCLine = {startY + 57,startY + 55,startY + 69,startY + 71};
        int[] xPointM = {startX + 300,startX + 300,startX + 340,startX + 380,startX + 380};
        int[] yPointM = {startY + 90,startY,startY + 40,startY,startY + 90};
        int[] xPointAA = {startX + 390,startX + 440,startX + 490};
        int[] yPointAA = {startY + 90,startY,startY + 90};
        int[] xPointAALine = {startX + 472,startX + 469,startX + 482,startX + 485};
        int[] yPointAALine = {startY + 64,startY + 66,startY + 87,startY + 87};
        int[] xPointN = {startX + 500,startX + 500,startX + 550,startX + 550,startX + 580,startX + 580};
        int[] yPointN = {startY + 90,startY,startY + 50,startY,startY,startY + 90};

        g.setColor(Color.YELLOW);
        g.fillRect(startX,startY,30,90);                                            //P
        g.fillOval(startX + 10,startY,60,60);
        g.fillRect(startX,startY,43,30);
        g.fillRect(startX,startY + 30,43,30);
        g.fillPolygon(xPointA,yPointA,3);                                                //A
        g.fillArc(startX + 160,startY,90,90,390,300);         //C
        g.fillRect(startX + 255,startY + 37,30,15);                           //-
        g.fillPolygon(xPointM,yPointM,5);                                                //M
        g.fillPolygon(xPointAA,yPointAA,3);                                              //AA
        g.fillPolygon(xPointN,yPointN,6);                                                //N

        g.setColor(Color.BLACK);
        g.fillOval(startX + 25,startY + 23, 15,15);                          //P
        g.fillRect(startX + 5,startY + 84,22,3);
        g.fillRect(startX + 24,startY + 56,3,30);
        g.fillRect(startX + 24,startY + 54,15,3);
        g.drawArc(startX + 5, startY - 5,60,60,260,70);
        g.drawArc(startX + 5, startY - 4,60,60,260,70);
        g.drawArc(startX + 5, startY - 4,60,60,265,65);
        g.fillOval(startX + 103,startY + 50, 15,15);                          //A
        g.fillRect(startX + 120,startY + 84,33,3);
        g.fillPolygon(xPointALine,yPointALine,4);
        g.fillPolygon(xPointCLine,yPointCLine,4);
        g.fillRect(startX + 348,startY + 84,26,3);                            //M
        g.fillRect(startX + 374,startY + 62,3,25);
        g.fillOval(startX + 433,startY + 50, 15,15);                          //AA
        g.fillRect(startX + 458,startY + 84,26,3);
        g.fillPolygon(xPointAALine,yPointAALine,4);
        g.fillRect(startX + 548,startY + 84,26,3);                            //N
        g.fillRect(startX + 574,startY + 62,3,25);

    }
}
