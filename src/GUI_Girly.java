
public class GUI_Girly {
    private Frame f;
    private Gamescreen_Girly painting;
    public GUI_Girly() {

        f = new Frame("PacMan - Mrs.PacMan", -1, -1, 1275, 740);
        this.painting = new Gamescreen_Girly(f);
        f.getContentPane().add(this.painting);
        f.setupFrame();
    }
}
