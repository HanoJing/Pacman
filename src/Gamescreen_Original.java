import javax.swing.*;
import java.awt.*;
public class Gamescreen_Original extends JPanel {
	private KeyboardFocusManager manager;
	private static Spielfigur_Original pacMan;
	private Map_Original map;
	public boolean kollision = false;
	private Dots d;
	private Icons i;
	private Icons j;
	private Icons k;
	public boolean initGame = false;
	public int score = 0;
	
	public boolean hit = false;

	
	public Gamescreen_Original(Frame f) {
		
  		this.manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
   		this.manager.addKeyEventDispatcher(new KeyDispatcher_Original(f, this));

		map = new Map_Original();
		d = new Dots();
    	i = new Icons();
		j = new Icons();
		k = new Icons();

    	pacMan = new Spielfigur_Original(613,313,30,30,380,360,Color.YELLOW);
	}
    	
    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	
    	setBackground(Color.BLACK);

		if(!initGame){
			g.setColor(Color.WHITE);
			g.drawRoundRect(550,250,200,50,10,10);
			g.drawString("Drücke Space/Enter um zu starten",560,275);

		}else {




			map.drawMap_Original(g);

			g.setColor(Color.WHITE);
			g.drawString(" " + score, 670, 690);

			pacMan.drawSpielfigur(g);
			pacMan.showSpielfigur(g);

			i.drawCherry(g);
			j.drawStrawberry(g);
			k.drawScore(g);
		}
	}
    

   
    public static Spielfigur_Original getPacMan() {
		return pacMan;
	}


	


	public void initGame(){
		if(KeyDispatcher_Original.spacePressed || KeyDispatcher_Original.enterPressed){
			initGame = true;
		}
	}
    public void score() {
      	    
    	for(int j = 1; j < d.yW.length-1; j++) {
    		for(int i = 1; i < d.xW.length-1; i++) {    	
    			if(pacMan.startY < d.yW[j] && pacMan.startY < d.yW[j+1] && pacMan.startY > d.yW[j-1] && pacMan.startX < d.xW[i] && pacMan.startX < d.xW[i+1] && pacMan.startX > d.xW[i-1]) {
    				score+=10;
      				hit = true;

    			}
    		}
    	}
    }
}
