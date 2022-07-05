package Screen;

import javax.swing.*;
import java.awt.*;
import Enemies.Blinky;
import Enemies.Pinky;
import GUI.*;
import GUI.Frame;
import Map.Map_Girly;
import Map.Icons;
import Map.Dots;
import Player.Player_Girly;
import Util.Keyboard;

public class Gamescreen_Girly extends JPanel {
    private Map_Girly map;
    private static Player_Girly pacMan;

    private Dots dots;
    private Icons diamond;
    private Icons heart;
    private Icons scoreLettering;
    private Blinky blinky;
    private Pinky pinky;
    public int score = 0;
    public boolean hit = false;

    public int x;
    public int y;

    public Gamescreen_Girly(Frame f) {

        map = new Map_Girly();

        dots = new Dots();
        diamond = new Icons();
        heart = new Icons();
        scoreLettering = new Icons();

        blinky = new Blinky(15, 315, false, true, false, false);
        pinky = new Pinky(1215, 315, true, false, false, false);

        pacMan = new Player_Girly(663, 313, 30, 30, 380, 360, Color.YELLOW);
    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.BLACK);

        dots.drawDots(g);

        map.drawMap_Girly(g);

        pacMan.drawPlayer_Girly(g);

        blinky.drawBlinky(g);
        pinky.drawPinky(g);

        pacMan.showPlayer_Girly(g);

        diamond.drawDiamond(g);
        heart.drawHeart(g);
        scoreLettering.drawScoreLettering(g);

        g.setColor(Color.WHITE);
        g.drawString(" " + score, 670, 690);
    }

    public static Player_Girly getPacMan() {
        return pacMan;
    }

    /*
    public void score(Frame f) {

        for(y = 1; y < dots.yW.length-1; y++) {
            for(x= 1; x < dots.xW.length-1; x++) {
                if(pacMan.startY < dots.yW[y] && pacMan.startY < dots.yW[y+1] && pacMan.startY > dots.yW[y-1] && pacMan.startX < dots.xW[x] && pacMan.startX < dots.xW[x+1] && pacMan.startX > dots.xW[x-1]) {
                    score+=10;
                    hit = true;
                }
            }
        }
        System.out.println(hit);
    }*/

    public static void chooseMap2() {
        while (true) {

            if (Keyboard.spacePressed) {
                new GUI_Menu();
                break;
            }

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}