package GUI;
import Screen.Lobby;

import javax.swing.*;

public class GUI_Lobby {
	private Frame f;
	private Lobby painting;

	public GUI_Lobby() {

		f = new GUI.Frame("PacMan-Lobby", -1, -1, 1279, 745);
		painting = new Lobby();
		f.getContentPane().add(painting);
		f.setupFrame();

		Thread t1 = new Thread(() -> painting.chooseMap());
		t1.start();
	}

}
