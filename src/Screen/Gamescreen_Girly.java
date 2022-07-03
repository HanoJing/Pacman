package Screen;

import javax.swing.*;
import java.awt.*;
import Ghosts.*;
import Map.Dots;
import Map.Map_Girly;
import Player.Player_Girly;
import Map.Icons;
public class Gamescreen_Girly extends JPanel {
    private Map_Girly map;
    private static Player_Girly pacMan;

    private Dots d;
    private Icons i;
    private Icons j;
    private Icons k;
    private Blinky blinky;
    private Pinky pinky;
    public int score = 0;

    public int x;
    public int y;


    public Gamescreen_Girly(Frame f) {

        map = new Map_Girly();

        d = new Dots();
        i = new Icons();
        j = new Icons();
        k = new Icons();

        blinky = new Blinky(15,315,false,true,false,false);
        pinky = new Pinky(1215,315,true,false,false,false);

        pacMan = new Player_Girly(663,313,30,30,380, 360, Color.YELLOW);
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.BLACK);
        
        g.setColor(Color.MAGENTA);
        g.drawRoundRect(2, 2, 1253, 653, 10, 10);   //Map Umrandung
        g.drawRoundRect(10, 10, 1237, 637, 10, 10); //Map Umrandung

        d.drawDots(g);

        map.drawMap_Girly(g);

        pacMan.drawSpielfigur_Girly(g);

        blinky.drawBlinky(g);
        pinky.drawPinky(g);

        pacMan.showSpielfigur_Girly(g);

        i.drawDiamant(g);
        j.drawScore(g);
        k.drawHeart(g);

        g.setColor(Color.WHITE);
        g.drawString(" "+score,670,690);
    }
    public static Player_Girly getPacMan() {
        return pacMan;
    }

   /* public void score(GUI.Frame f) {

        for(y = 1; y < d.yW.length-1; y++) {
            for(x= 1; x < d.xW.length-1; x++) {
                if(pacMan.startY < d.yW[y] && pacMan.startY < d.yW[y+1] && pacMan.startY > d.yW[y-1] && pacMan.startX < d.xW[x] && pacMan.startX < d.xW[x+1] && pacMan.startX > d.xW[x-1]) {
                    score+=10;
                    hit = true;
                }
            }
        }
        System.out.println(hit);
    }*/
}
