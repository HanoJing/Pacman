import javax.swing.*;
import java.awt.*;

public class Gamescreen2 extends JPanel{

    private KeyboardFocusManager manager;

    private Spielfigur2 pacMan;

    public boolean kollision = false;

    private Dots d;

    public Gamescreen2(Frame f) {

        this.manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        this.manager.addKeyEventDispatcher(new KeyDispatcher2(f,this));

        d = new Dots();

        pacMan = new Spielfigur2(615,315,30,30,380,360,Color.YELLOW);

    }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            setBackground(Color.BLACK);

            g.setColor(Color.MAGENTA);
            g.drawRoundRect(2, 2, 1253, 653, 10, 10);   //Map Umrandung
            g.drawRoundRect(10, 10, 1237, 637, 10, 10); //Map Umrandung


            d.drawDots(g);

            pacMan.drawSpielfigur2(g);

            pacMan.showSpielfigur2(g);

        }

    public Spielfigur2 getPacMan() {
        return pacMan;
    }

    public void checkKollision() {

    }
}