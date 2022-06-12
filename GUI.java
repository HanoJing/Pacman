import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.*;

public class GUI {

    private Frame f;
    private Gamescreen painting;
   

    public GUI() {
        f = new Frame("PacMan", -1, -1, 1260, 740);
        this.painting = new Gamescreen(f);
        f.getContentPane().add(this.painting);
        f.setupFrame();
    }
}
