import java.awt.*;

public class Spielfigur {
	
	public int startX;
	public int startY;
	public int heigth;
	public int width;
	public int startAngle;
	public int arcAngle;
	public Color farbe;
		

    public Spielfigur(int startX, int startY, int heigth, int width, int startAngle, int arcAngle, Color farbe) {
	  
	    this.startX = startX;
	    this.startY = startY;
	    this.heigth = heigth;
	    this.width = width;
	    this.startAngle = startAngle;
	    this.arcAngle = arcAngle;
	    this.farbe = farbe;
	    
    }

    public void showSpielfigur(Graphics g) {
	  
	    g.setColor(farbe);
	    g.fillArc(startX, startY, heigth, width, startAngle, arcAngle);
	    
	}

    public void moveSpielfigur() {
    	
    	if(KeyDispatcher.upPressed == true && startY > -1) {
        	this.startAngle = 480;
     		this.startY -= 15;
     	}else if(KeyDispatcher.downPressed == true && startY < 730) {
     		this.startAngle = 300;
     		this.startY += 15;
     	}else if(KeyDispatcher.leftPressed == true && startX > -1) {
     		this.startAngle = 210;
     		this.startX -= 15;
     	}else if(KeyDispatcher.rightPressed == true && startX < 1200) {
     		this.startAngle = 380;
     		this.startX += 15;
     	}
    	
    	
    }
    
    
  
  
}
