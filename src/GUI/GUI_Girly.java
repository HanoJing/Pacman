package GUI;
import Screen.Gamescreen_Girly;
import Player.Player_Girly;

public class GUI_Girly {
    public static Frame f;
    private Gamescreen_Girly painting;
    public GUI_Girly() {

        f = new Frame("PacMan - Ms.PacMan", -1, -1, 1279, 745);
        this.painting = new Gamescreen_Girly(f);
        f.getContentPane().add(this.painting);
        f.setupFrame();

        Thread t3 = new Thread(() -> Gamescreen_Girly.getPacMan().movePlayer_Girly());
        t3.start();

        Thread t4 = new Thread(() -> painting.chooseMap2());
        t4.start();
    }

}
