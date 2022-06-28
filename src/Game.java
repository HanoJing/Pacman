import java.awt.*;
public class Game {
	public static Frame f;
	public static Lobby l;
	public static Gamescreen_Original gs_O;
	public static Gamescreen_Girly gs_G;
	public static Spielfigur_Original pacMan;
	public static Spielfigur_Girly pacMan_Girly;
	public static Map_Original m1;
	public static Map_Girly m2;
	public static void main(String[] args) {

		f = new Frame("PACMAN",0,0,1366, 768);
		l = new Lobby();
		gs_O = new Gamescreen_Original(f);
		gs_G = new Gamescreen_Girly(f);

		pacMan_Girly = new Spielfigur_Girly(613,163,30,30,380,360, Color.YELLOW);

		m2 = new Map_Girly();



		new GUI_Lobby();




	}
}
