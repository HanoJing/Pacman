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
	private Rectangle h7;
	private Rectangle h8;
	private Rectangle h9;
	private Rectangle h10;
	private Rectangle h11;
	private Rectangle h12;
	private Rectangle h13;
	private Rectangle h14;
	private Rectangle h15;
	
	private Dots d;

	public boolean initGame = false;
	
	public Gamescreen(Frame f) {
		
  		this.manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
   		this.manager.addKeyEventDispatcher(new KeyDispatcher(f,this));
   	
   		h1 = new Rectangle(50,50,155,105);
    	h2 = new Rectangle(250,50,255,105);
    	h3 = new Rectangle(550,8,55,195);
    	h4 = new Rectangle(650,50,255,105);
    	h5 = new Rectangle(950,50,155,105);
		h6 = new Rectangle(50,500,155,105);
		h7 = new Rectangle(250,500,255,105);
		h8 = new Rectangle(550,450,55,200);
		h9 = new Rectangle(650,500,255,105);
		h10 = new Rectangle(950,500,155,105);
		h11 = new Rectangle(550,250,55,55);
		h12 = new Rectangle(550,350,55,55);
		h13 = new Rectangle(50,200,155,155);
		h14 = new Rectangle(50,200,55,255);
		h15 = new Rectangle(100,250,55,55);




    	d = new Dots();
    	
    	    	
		pacMan = new Spielfigur(565,315,30,30,380,300,Color.YELLOW);
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
			h7.drawRectangle(g);
			h8.drawRectangle(g);
			h9.drawRectangle(g);
			h10.drawRectangle(g);
			h11.drawRectangle(g);
			h12.drawRectangle(g);
			h13.drawRectangle(g);
			h14.drawRectangle(g);
			h15.drawRectangle(g);

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
		}else if(h7.x<=pacMan.startX && (h7.x+h7.width)>pacMan.startX && h7.y<=pacMan.startY && (h7.y+h7.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h8.x<=pacMan.startX && (h8.x+h8.width)>pacMan.startX && h8.y<=pacMan.startY && (h8.y+h8.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h9.x<=pacMan.startX && (h9.x+h9.width)>pacMan.startX && h9.y<=pacMan.startY && (h9.y+h9.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h10.x<=pacMan.startX && (h10.x+h10.width)>pacMan.startX && h10.y<=pacMan.startY && (h10.y+h10.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h11.x<=pacMan.startX && (h11.x+h11.width)>pacMan.startX && h11.y<=pacMan.startY && (h11.y+h11.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h12.x<=pacMan.startX && (h12.x+h12.width)>pacMan.startX && h12.y<=pacMan.startY && (h12.y+h12.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else {
			kollision = false;
		}
	}

    public void initGame() {
    	
    	if(KeyDispatcher.spacePressed == true || KeyDispatcher.enterPressed == true) {
    		initGame = true;
    	}
    }
}