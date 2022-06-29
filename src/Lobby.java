import java.awt.*;
import javax.swing.*;
public class Lobby extends JPanel {

    private Geister b;
    private Geister p;
    private Geister c;
    private Geister i;
    private Geister s;

     public Lobby() {

         addKeyListener(Keyboard.getInstance());

         b = new Geister();
         p = new Geister();
         c = new Geister();
         i = new Geister();
         s = new Geister();

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
