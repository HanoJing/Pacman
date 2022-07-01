import javax.swing.*;
import java.awt.*;
import Geisterchen.Blinky;
import Geisterchen.Clyde;
import Geisterchen.Inky;
import Geisterchen.Pinky;
import Geisterchen.Sady;

public class Gamescreen_Girly extends JPanel {
    private Map_Girly map;
    private static Spielfigur_Girly pacMan;

    private Dots d;
    private Icons i;
    private Icons j;
    private Blinky blinky;
    public int score = 0;
    public boolean hit = false;

    public int x;
    public int y;

    public Gamescreen_Girly(Frame f) {

        map = new Map_Girly();

        d = new Dots();
        i = new Icons();
        j = new Icons();

        blinky = new Blinky(15,315,false,true,false,false);

        pacMan = new Spielfigur_Girly(265,365,30,30,380,360,Color.YELLOW);
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

        pacMan.showSpielfigur_Girly(g);

        i.drawDiamant(g);
        j.drawScore(g);

        g.setColor(Color.WHITE);
        g.drawString(" "+score,670,690);
    }
    public static Spielfigur_Girly getPacMan() {
        return pacMan;
    }

    public void score(Frame f) {

        for(y = 1; y < d.yW.length-1; y++) {
            for(x= 1; x < d.xW.length-1; x++) {
                if(pacMan.startY < d.yW[y] && pacMan.startY < d.yW[y+1] && pacMan.startY > d.yW[y-1] && pacMan.startX < d.xW[x] && pacMan.startX < d.xW[x+1] && pacMan.startX > d.xW[x-1]) {
                    score+=10;
                    hit = true;
                }
            }
        }
        System.out.println(hit);
    }
}
