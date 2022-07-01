import java.awt.*;
import javax.swing.*;
import Geisterchen.Blinky;
import Geisterchen.Clyde;
import Geisterchen.Inky;
import Geisterchen.Pinky;
import Geisterchen.Sady;
public class Lobby extends JPanel {

    private Blinky b;
    private Clyde c;
    private Inky i;
    private Pinky p;
    private Sady s;

     public Lobby() {

         addKeyListener(Keyboard.getInstance());

         b = new Blinky(1020,575);
         c = new Clyde(1060,575);
         i = new Inky(1100,575);
         p = new Pinky(1140,575);
         s = new Sady(1180,575);

     }

    public void paintComponent (Graphics g){
        super.paintComponent(g);

        setBackground(Color.BLACK);

        g.setColor(Color.YELLOW);
        g.drawRoundRect(530, 325, 230, 40, 10, 10);
        g.drawString("WILLKOMMEN IN DER LOBBY!!!", 550, 350);

        g.setColor(Color.white);
        g.drawString("Gebe in die Konsole 1 ein, um die erste Map zu oeffnen oder 2 um die zweite Map zu oeffnen!", 350, 400);
        g.drawString("Um zurueck in die Lobby zu kommen, gebe 0 in die Konsole ein!", 450, 425);

        b.drawBlinky(g);
        p.drawPinky(g);
        c.drawClyde(g);
        i.drawInky(g);
        s.drawSady(g);

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
