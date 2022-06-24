import java.awt.*;
public class GUI_Lobby {
	private Frame f;
	private Lobby painting;
	public GUI_Lobby() {

	        f = new Frame("PacMan - Lobby", -1, -1, 1275, 740);
	        this.painting = new Lobby();
	        f.getContentPane().add(this.painting);
	        f.setupFrame();

			Thread t2 = new Thread(() -> Lobby.chooseMap());
			t2.start();
	    }

}
