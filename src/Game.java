import java.awt.*;
public class Game {
	public static Frame f;
	public static Lobby l;
	public static void main(String[] args) {

		f = new Frame("PACMAN-Lobby",-1,-1,1279, 763);
		l = new Lobby();



		new GUI_Lobby();




	}
}
