import javax.swing.JFrame;
import javax.swing.JLabel;

public class GUI {

    private Frame f;
    private Gamescreen painting;
   

    public GUI() {
        this.f = new Frame("PacMan", -1, -1, 1220, 730);
        this.painting = new Gamescreen(this.f);
        this.f.getContentPane().add(this.painting);
        this.f.setupFrame();
     
    }
}
