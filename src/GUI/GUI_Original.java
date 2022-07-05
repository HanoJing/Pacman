package GUI;
import Screen.Gamescreen_Original;

public class GUI_Original {

    public static Frame f;
    private Gamescreen_Original painting;
    public GUI_Original() {

        f = new Frame("PacMan - Original",-1,-1,1279, 745);
        painting = new Gamescreen_Original();
        f.getContentPane().add(painting);
        f.setupFrame();

        Thread t2 = new Thread(() -> painting.getPacMan().movePlayer());
        t2.start();

        Thread t6 = new Thread(() -> painting.chooseMap3());t6.start();

    }
}
