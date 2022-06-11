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
	private Rectangle h6;

	
	private Dots d;

	public boolean initGame = false;
	
	public Gamescreen(Frame f) {
		
  		this.manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
   		this.manager.addKeyEventDispatcher(new KeyDispatcher(f, this));
   	
   		h1 = new Rectangle(50,50,155,105);
    	h2 = new Rectangle(250,10,55,195);
    	h3 = new Rectangle(350,50,205,105);
    	h4 = new Rectangle(650,50,205,105);
    	h5 = new Rectangle(900, 10, 55, 195);
    	h6 = new Rectangle(1000,50,155,105);

    	d = new Dots();
    	
    	    	
		pacMan = new Spielfigur(15,15,30,30,380,300,Color.YELLOW);
	}
    	
    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	
    	setBackground(Color.BLACK);
    	
    	if(initGame == false) {
    		
    		g.setColor(Color.WHITE);
    		g.drawString("Druecke Space um zu Starten!",500,350);
     
    	}else if(initGame == true) {
    		    	    		
    		d.drawDots(g);
    	    	
    		h1.drawRectangle(g);
    		h2.drawRectangle(g);
    		h3.drawRectangle(g);
    		h4.drawRectangle(g);
			h5.drawRectangle(g);
			h6.drawRectangle(g);

			pacMan.drawSpielfigur(g);

			pacMan.showSpielfigur(g);
    		
    	}
    
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
		}else if(h6.x<=pacMan.startX && (h6.x+h6.width)>pacMan.startX && h6.y<=pacMan.startY && (h6.y+h6.height)>=pacMan.startY+pacMan.heigth) {
		kollision = true;
		}else {
			kollision = false;
		}
	}

    public void initGame() {
    	
    	if(KeyDispatcher.spacePressed == true) {
    		initGame = true;
    	}
    }
	    

     
     
     
     
}