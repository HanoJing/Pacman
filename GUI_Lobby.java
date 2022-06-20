import java.awt.*;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class GUI_Lobby {

	 private Frame f;
	    private Lobby painting;



	    public GUI_Lobby() {

	        f = new Frame("PacMan - Lobby", -1, -1, 1275, 740);
	        this.painting = new Lobby(f);
	        f.getContentPane().add(this.painting);
	        f.setupFrame();
	    }
}
