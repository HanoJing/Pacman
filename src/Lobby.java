import java.awt.*;
import javax.swing.*;
import Enemies.Blinky;
import Enemies.Clyde;
import Enemies.Inky;
import Enemies.Pinky;

public class Lobby extends JPanel {

    private Map_Lobby map;

    private Blinky b;
    private Clyde c;
    private Inky i;
    private Pinky p;
    private GamePiece_Original pacman;

    public Lobby() {

        addKeyListener(Keyboard.getInstance());

        map = new Map_Lobby(370,60);

        b = new Blinky(1020, 625, true, false, false, false);
        c = new Clyde(1060, 625, true, false, false, false);
        i = new Inky(1100, 625, true, false, false, false);
        p = new Pinky(1140, 625, true, false, false, false);
        pacman = new GamePiece_Original(950, 625, 30, 30, 210, 300, Color.YELLOW);


    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.BLACK);

        map.drawHeadline(g);

        g.setColor(Color.white);
        g.drawString("Press 1, to open the original Pac-Man Map!", 510, 400);
        g.drawString("Press 2, to open the Ms. Pac-Man Map!", 517, 425);

        g.fillOval(930, 637, 5, 5);
        g.fillOval(900, 637, 5, 5);
        g.fillOval(870, 637, 5, 5);

        b.drawBlinky(g);
        p.drawPinky(g);
        c.drawClyde(g);
        i.drawInky(g);

        pacman.showGamePiece(g);

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
