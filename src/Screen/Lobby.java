package Screen;

import java.awt.*;
import javax.swing.*;

import GUI.GUI_Girly;
import GUI.GUI_Lobby;
import GUI.GUI_Original;
import Ghosts.Blinky;
import Ghosts.Clyde;
import Ghosts.Inky;
import Ghosts.Pinky;
import Ghosts.Sady;
import Player.Player_Original;
import Util.Keyboard;

public class Lobby extends JPanel {

    private Blinky b;
    private Clyde c;
    private Inky i;
    private Pinky p;
    private Sady s;
    private Player_Original pacman;

     public Lobby() {

         addKeyListener(Keyboard.getInstance());


         b = new Blinky(1020, 625, true, false, false, false);
         c = new Clyde(1060, 625, true, false, false, false);
         i = new Inky(1100, 625, true, false, false, false);
         p = new Pinky(1140, 625, true, false, false, false);
         pacman = new Player_Original(950, 625, 30, 30, 210, 380, Color.YELLOW);

     }

    public void paintComponent (Graphics g){
        super.paintComponent(g);

        setBackground(Color.BLACK);

        g.setColor(Color.YELLOW);
        g.drawRoundRect(575, 325, 150, 40, 10, 10);
        g.drawString("PAC-MAN", 620, 350);

        g.setColor(Color.white);
        g.drawString("Drücke 1 um die Originale Pac-Man Welt zu öffnen!", 500, 400);
        g.drawString("Drücke 2 um die Girly-Edition Pac-Man Welt zu öffnen!", 490, 425);

        g.fillOval(930, 637, 5, 5);
        g.fillOval(900, 637, 5, 5);
        g.fillOval(870, 637, 5, 5);

        b.drawBlinky(g);
        p.drawPinky(g);
        c.drawClyde(g);
        i.drawInky(g);

        pacman.showSpielfigur(g);
    }
    public static void chooseMap() {
        while(true) {
            if (Keyboard.nullPressed) {
                new GUI_Lobby();
                break;
            }
            if (Keyboard.onePressed) {
                new GUI_Original();
                break;
            }
            if (Keyboard.twoPressed) {
                new GUI_Girly();
                break;
            }
            if (Keyboard.threePressed) {
                System.out.println("Diese Map existiert noch nicht!");
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
