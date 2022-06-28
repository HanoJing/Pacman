public class GUI_Original {
    private Frame f;
    private Gamescreen_Original painting;
    public GUI_Original() {

        f = new Frame("PacMan",0,0,1366, 768);
        painting = Game.gs_O;
        f.getContentPane().add(painting);
        f.setupFrame();

        Thread t2 = new Thread(() -> Game.gs_O.getPacMan().moveSpielfigur());
        t2.start();
    }
}
