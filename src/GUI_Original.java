
public class GUI_Original {
    private Frame f;
    private Gamescreen_Original painting;
    public GUI_Original() {

        f = new Frame("PacMan - Original PacMan", -1, -1, 1275, 740);
        this.painting = new Gamescreen_Original(f);
        f.getContentPane().add(this.painting);
        f.setupFrame();

    }
}
