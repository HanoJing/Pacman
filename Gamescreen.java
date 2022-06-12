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
	private Rectangle h16;
	private Rectangle h17;
	private Rectangle h18;
	private Rectangle h19;
	private Rectangle h20;
	private Rectangle h21;
	private Rectangle h22;
	private Rectangle h23;
	private Rectangle h24;
	private Rectangle h25;
	private Rectangle h26;
	private Rectangle h27;
	private Rectangle h28;
	private Rectangle h29;
	private Rectangle h30;

	
	private Dots d;
	private Icons i;
	private Icons j;

	public boolean initGame = false;
	
	public Gamescreen(Frame f) {
		
  		this.manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
   		this.manager.addKeyEventDispatcher(new KeyDispatcher(f,this));
   	
   		h1 = new Rectangle(50,50,155,105);
    	h2 = new Rectangle(250,50,305,105);
    	h3 = new Rectangle(600,8,55,145);
    	h4 = new Rectangle(700,50,305,105);
    	h5 = new Rectangle(1050,50,155,105);
		h6 = new Rectangle(50,500,155,105);
		h7 = new Rectangle(250,500,305,105);
		h8 = new Rectangle(600,500,55,150);
		h9 = new Rectangle(700,500,305,105);
		h10 = new Rectangle(1050,500,155,105);
		h11 = new Rectangle(50,200,155,155);   //P
		h12 = new Rectangle(50,200,55,255);
		h13 = new Rectangle(100,250,55,55);
		h14 = new Rectangle(250,200,55,255);   //A
		h15 = new Rectangle(350,200,55,255);
		h16 = new Rectangle(250,200,155,155);
		h17 = new Rectangle(300,250,55,55);
		h18 = new Rectangle(450,200,55,255);   //C
		h19 = new Rectangle(450,200,155,55);
		h20 = new Rectangle(450,400,155,55);
		h21 = new Rectangle(650,200,55,255);   //M
		h22 = new Rectangle(750,200,55,255);
		h23 = new Rectangle(700,250,55,105);
		h24 = new Rectangle(850,200,55,255);   //A
		h25 = new Rectangle(950,200,55,255);
		h26 = new Rectangle(850,200,155,155);
		h27 = new Rectangle(900,250,55,55);
		h28 = new Rectangle(1050, 200, 55,255); //N
		h29 = new Rectangle(1150,200,55,255);
		h30 = new Rectangle(1100,300,55,105);


    	d = new Dots();
		i = new Icons();
		j = new Icons();

		pacMan = new Spielfigur(615,315,30,30,380,360,Color.YELLOW);
	}
    	
    public void paintComponent(Graphics g) {
    	super.paintComponent(g);
    	
    	setBackground(Color.BLACK);
    	
    	if(initGame == false) {
    		
    		g.setColor(Color.WHITE);
			g.drawRoundRect(530,325,230,40,10,10);
    		g.drawString("Druecke Space um zu Starten!",550,350);
     
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
			h16.drawRectangle(g);
			h17.drawRectangle(g);
			h18.drawRectangle(g);
			h19.drawRectangle(g);
			h20.drawRectangle(g);
			h21.drawRectangle(g);
			h22.drawRectangle(g);
			h23.drawRectangle(g);
			h24.drawRectangle(g);
			h25.drawRectangle(g);
			h26.drawRectangle(g);
			h27.drawRectangle(g);
			h28.drawRectangle(g);
			h29.drawRectangle(g);
			h30.drawRectangle(g);

			pacMan.drawSpielfigur(g);

			pacMan.showSpielfigur(g);

			i.drawCherry(g);
			j.drawStrawberry(g);
    		
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
		}else if(h13.x<=pacMan.startX && (h13.x+h13.width)>pacMan.startX && h13.y<=pacMan.startY && (h13.y+h13.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h14.x<=pacMan.startX && (h14.x+h14.width)>pacMan.startX && h14.y<=pacMan.startY && (h14.y+h14.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h15.x<=pacMan.startX && (h15.x+h15.width)>pacMan.startX && h15.y<=pacMan.startY && (h15.y+h15.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h16.x<=pacMan.startX && (h16.x+h16.width)>pacMan.startX && h16.y<=pacMan.startY && (h16.y+h16.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h17.x<=pacMan.startX && (h17.x+h17.width)>pacMan.startX && h17.y<=pacMan.startY && (h17.y+h17.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h18.x<=pacMan.startX && (h18.x+h18.width)>pacMan.startX && h18.y<=pacMan.startY && (h18.y+h18.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h19.x<=pacMan.startX && (h19.x+h19.width)>pacMan.startX && h19.y<=pacMan.startY && (h19.y+h19.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h20.x<=pacMan.startX && (h20.x+h20.width)>pacMan.startX && h20.y<=pacMan.startY && (h20.y+h20.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h21.x<=pacMan.startX && (h21.x+h21.width)>pacMan.startX && h21.y<=pacMan.startY && (h21.y+h21.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h22.x<=pacMan.startX && (h22.x+h22.width)>pacMan.startX && h22.y<=pacMan.startY && (h22.y+h22.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h23.x<=pacMan.startX && (h23.x+h23.width)>pacMan.startX && h23.y<=pacMan.startY && (h23.y+h23.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h24.x<=pacMan.startX && (h24.x+h24.width)>pacMan.startX && h24.y<=pacMan.startY && (h24.y+h24.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h25.x<=pacMan.startX && (h25.x+h25.width)>pacMan.startX && h25.y<=pacMan.startY && (h25.y+h25.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h26.x<=pacMan.startX && (h26.x+h26.width)>pacMan.startX && h26.y<=pacMan.startY && (h26.y+h26.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h27.x<=pacMan.startX && (h27.x+h27.width)>pacMan.startX && h27.y<=pacMan.startY && (h27.y+h27.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h28.x<=pacMan.startX && (h28.x+h28.width)>pacMan.startX && h28.y<=pacMan.startY && (h28.y+h28.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h29.x<=pacMan.startX && (h29.x+h29.width)>pacMan.startX && h29.y<=pacMan.startY && (h29.y+h29.height)>=pacMan.startY+pacMan.heigth) {
			kollision = true;
		}else if(h30.x<=pacMan.startX && (h30.x+h30.width)>pacMan.startX && h30.y<=pacMan.startY && (h30.y+h30.height)>=pacMan.startY+pacMan.heigth) {
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