
public class GUI_Girly {
    private Frame f;
    private Gamescreen_Girly painting;
    public GUI_Girly() {

        f = new Frame("PacMan - Mrs.PacMan", -1, -1, 1279, 763);
        this.painting = Game.gs_G;
        f.getContentPane().add(this.painting);
        f.setupFrame();
    }

}
