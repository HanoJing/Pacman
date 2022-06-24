import javax.swing.*;
import java.awt.*;
public class Gamescreen_Girly extends JPanel {
    private Map_Girly map;
    private static Spielfigur_Girly pacMan;
    public boolean kollision = false;
    private Dots d;
    private Icons i;
    private Icons j;
    public int score = 0;
    public boolean hit = false;

    public int x;
    public int y;

    public Gamescreen_Girly(Frame f) {

        map = new Map_Girly();

        d = new Dots();
        
        pacMan = new Spielfigur_Girly(613,163,30,30,380,360,Color.YELLOW);

        i = new Icons();
        j = new Icons();


        System.out.println("Thread started");
        Thread t1 = new Thread(() -> Gamescreen_Girly.getPacMan().moveSpielfigur_Girly());
        t1.start();

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
