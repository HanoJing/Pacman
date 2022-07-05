package GUI;
import Screen.Menu;

public class GUI_Menu {

    public static Frame f;
    private Menu painting;

    public GUI_Menu() {

        f = new Frame("PacMan - Menu", -1, -1, 1279, 745);
        painting = new Menu();
        f.getContentPane().add(painting);
        f.setupFrame();

    }
}
