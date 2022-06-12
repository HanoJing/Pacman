public class GUI3 {

    private Frame f;
    private Gamescreen2 painting;

    public GUI3() {

        f = new Frame("PacMan - Mrs.PacMan", -1, -1, 1275, 740);
        this.painting = new Gamescreen2(f);
        f.getContentPane().add(this.painting);
        f.setupFrame();

    }
}
