import javax.swing.*;
import java.awt.*;

public class Gamescreen extends JPanel{

	private KeyboardFocusManager manager;
		
	private Spielfigur pacMan;
	
	public boolean kollision = false;
	
	private Rectangle h1;
	private Rectangle h2;
	private Rectangle h3;
	private Rectangle h4;
	private Rectangle h5;

	//private Rectangle h6;
	
	private Rectangle rO;
	private Rectangle rL;
	private Rectangle rU;
	private Rectangle rR;
	
	private Dots d;
	
	private int score = 0;
	
	public Gamescreen(Frame f){
		
  		this.manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
   		this.manager.addKeyEventDispatcher(new KeyDispatcher(f, this));
    	    	
		pacMan = new Spielfigur(0,0,50,50,380,300,Color.YELLOW);
		
    	h1 = new Rectangle(100,50,150,100);
    	h2 = new Rectangle(300,50,200,100);
    	h3 = new Rectangle(550,0,50,150);
    	h4 = new Rectangle(650,50,200,100);
    	h5 = new Rectangle(900,50,150,100);

		//h6 = new Rectangle(50, 50, 150, 100);
    	
    	d = new Dots();
    	
    	
    	}
    	
    
        	
	public void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	
    	setBackground(Color.BLACK);
        	
    	d.drawDots(g);
    	    	
    	h1.drawRectangel(g);
    	h2.drawRectangel(g);
    	h3.drawRectangel(g);
    	h4.drawRectangel(g);
    	h5.drawRectangel(g);

		//h6.drawRectangel(g);
     	
    	pacMan.showSpielfigur(g);
    	
      	countScore(g);
    
    }
   
    public Spielfigur getPacMan() {
		return pacMan;
	}
	
	public void checkKollision() {
		
		if(h1.x<=pacMan.startX && (h1.x+h1.width)>pacMan.startX && h1.y<=pacMan.startY && (h1.y+h1.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h2.x<=pacMan.startX && (h2.x+h2.width)>pacMan.startX && h2.y<=pacMan.startY && (h2.y+h2.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h3.x<=pacMan.startX && (h3.x+h3.width)>pacMan.startX && h3.y<=pacMan.startY && (h3.y+h3.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h4.x<=pacMan.startX && (h4.x+h4.width)>pacMan.startX && h4.y<=pacMan.startY && (h4.y+h4.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h5.x<=pacMan.startX && (h5.x+h5.width)>pacMan.startX && h5.y<=pacMan.startY && (h5.y+h5.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else {
			kollision = false;
		}
				
	}

	public void countScore(Graphics g) {
		
		if(d.x > pacMan.startX && d.y > pacMan.startY) {
			score++;
			g.setColor(Color.BLACK);
			g.drawRoundRect(d.x,d.y,d.size,d.size, 5, 5);
		}
		
		System.out.println(score);
		
	}
	    

     
     
     
     
}