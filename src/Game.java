import java.awt.*;
public class Game {
	public static Frame f;
	public static Lobby l;
	public static Gamescreen_Original gs_O;
	public static Gamescreen_Girly gs_G;
	public static Spielfigur_Girly pacMan_Girly;
	public static Map_Girly m2;
	public static void main(String[] args) {

		f = new Frame("PACMAN-Lobby",-1,-1,1279, 763);
		l = new Lobby();



		new GUI_Lobby();




	}
}
