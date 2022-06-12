public class GUI2 {

    private Frame f;
    private Gamescreen painting;

    public GUI2() {

        f = new Frame("PacMan - Original PacMan", -1, -1, 1275, 740);
        this.painting = new Gamescreen(f);
        f.getContentPane().add(this.painting);
        f.setupFrame();

    }
}
