import java.awt.*;
public class GUI_Lobby {
	private Frame f;
	private Lobby painting;
	public GUI_Lobby() {

		f = Game.f;
		painting = Game.l;
		f.getContentPane().add(painting);
		f.setupFrame();

		Thread t1 = new Thread(() -> Game.l.chooseMap());
		t1.start();
	}
}
