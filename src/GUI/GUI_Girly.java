package GUI;

import Screen.Gamescreen_Girly;

public class GUI_Girly {
    public static Frame f;
    private Gamescreen_Girly painting;
    public GUI_Girly() {

        f = new Frame("PacMan - Mrs.PacMan", -1, -1, 1279, 745);
        this.painting = new Gamescreen_Girly(f);
        f.getContentPane().add(this.painting);
        f.setupFrame();

        Thread t3 = new Thread(() -> Gamescreen_Girly.getPacMan().moveSpielfigur_Girly());
        t3.start();
    }

}
