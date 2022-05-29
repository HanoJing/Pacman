import javax.swing.*;
import java.awt.*;

public class Gamescreen extends JPanel{

	private KeyboardFocusManager manager;
		
	private Spielfigur pacMan;
	private Map map;
	private Game game;
		
	public Gamescreen(Frame f){
    	
    	this.manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
    	this.manager.addKeyEventDispatcher(new KeyDispatcher(f, this));
    	   	
    	pacMan = new Spielfigur(200,200,30,30,380,300, Color.YELLOW);
    	map = new Map();
    	game = new Game();
    	
    }

    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	
    	setBackground(Color.BLACK);
    	
    	game.showStartscreen(g);
    	
    	map.drawMap(g);
      
    	pacMan.showSpielfigur(g);
    	
    }

	public Spielfigur getPacMan() {
		return pacMan;
	}
	
    

     
     
     
     
}