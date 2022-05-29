import javax.swing.*;
import java.awt.*;

public class Game {

	private String player;
	private int score;
	private int highscore;
	
	
		
	public static void main(String[] args) {
		
		new GUI();
		
	}
	
	public void showStartscreen(Graphics g) {
		
		player = "Eden";	
		
		g.setColor(Color.WHITE);
		
		g.drawString("Spieler: "+player, 750, 50);
		
	}

	
	

}
