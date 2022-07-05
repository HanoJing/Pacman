package Screen;
import java.awt.*;
import javax.swing.*;
import Enemies.Blinky;
import Enemies.Clyde;
import Enemies.Inky;
import Enemies.Pinky;
import Map.Map_Lobby;
import Map.Rectangle_Girly;
import Util.Keyboard;
import GUI.GUI_Lobby;
import GUI.GUI_Original;
import GUI.GUI_Girly;
import Player.Player_Original;
import Player.Player_Girly;

public class Lobby extends JPanel {

    private Map_Lobby headline;

    private Blinky b;
    private Clyde c;
    private Inky i;
    private Pinky p;
    private Player_Original pacman;
    private Player_Girly ribbon;

    public Lobby() {

        addKeyListener(Keyboard.getInstance());

        headline = new Map_Lobby(370,80);

        b = new Blinky(1020, 625, true, false, false, false);
        c = new Clyde(1060, 625, true, false, false, false);
        i = new Inky(1100, 625, true, false, false, false);
        p = new Pinky(1140, 625, true, false, false, false);
        pacman = new Player_Original(950, 625, 30, 30, 210, 300, Color.YELLOW);
        ribbon = new Player_Girly(682,390,10,10,10,10,Color.pink);

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.BLACK);

        headline.drawHeadline(g);

        for(int y = 300; y < 345; y += 20) {
            for(int y2 = 380; y2 < 425; y2 += 20) {
                for (int y3 = 460; y3 < 505; y3 += 20) {
                    for (int x = 500; x < 800; x += 20) {
                        g.setColor(Color.WHITE);
                        g.fillOval(x, y, 3, 3);
                        g.fillOval(x, y2, 3, 3);
                        g.fillOval(x, y3, 3, 3);
                    }
                }
            }
        }
        g.setColor(Color.BLACK);
        g.fillRect(515,308,260,20);
        g.fillRect(515,388,260,20);
        g.fillRect(515,468,260,20);

        g.setColor(Color.white);
        g.drawString("Original Pac-Man Map (1)", 560, 325);
        g.drawString("Girly Pac-Man Map (2)", 570, 405);
        g.drawString("Map... (3)", 610, 485);

        g.fillOval(930, 637, 5, 5);
        g.fillOval(900, 637, 5, 5);
        g.fillOval(870, 637, 5, 5);

        b.drawBlinky(g);
        p.drawPinky(g);
        c.drawClyde(g);
        i.drawInky(g);

        pacman.showPlayer(g);
        ribbon.drawRibbon(g);

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
                System.out.println("This Map still not exist!");
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
