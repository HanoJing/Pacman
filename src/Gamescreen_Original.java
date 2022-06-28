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

	
	public Gamescreen_Original() {


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


		d.drawDots(g);
		map.drawMap_Original(g);

			g.setColor(Color.WHITE);
			g.drawString(" " + score, 670, 690);

			pacMan.drawSpielfigur(g);
			pacMan.showSpielfigur(g);

			i.drawCherry(g);
			j.drawStrawberry(g);
			k.drawScore(g);
		}

    

   
    public static Spielfigur_Original getPacMan() {
		return pacMan;
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
