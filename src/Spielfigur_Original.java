import java.awt.*;

public class Spielfigur_Original {

	public int startX;
	public int startY;
	public int heigth;
	public int width;
	public int startAngle;
	public int arcAngle;
	public Color farbe;
	public boolean moveFigur = false;


	public Spielfigur_Original(int startX, int startY, int width, int heigth, int startAngle, int arcAngle, Color farbe) {
	  
	    this.startX = startX;
	    this.startY = startY;
	    this.width = width;
	    this.heigth = heigth;
	    this.startAngle = startAngle;
	    this.arcAngle = arcAngle;
	    this.farbe = farbe;
	 
    }
	public void drawSpielfigur(Graphics g){

		g.setColor(farbe);
		g.fillArc(15, 670, width, heigth, 380, 300);
		g.fillArc(55, 670, width, heigth, 380, 300);
		g.fillArc(95, 670, width, heigth, 380, 300);

	}
    public void showSpielfigur(Graphics g) {

		g.setColor(farbe);
		g.fillArc(startX, startY, width, heigth, startAngle, arcAngle);

		g.setColor(Color.BLACK);
		if (moveFigur) {
			g.fillRect(95, 670, width, heigth);

		}
	}
	public void moveSpielfigur() {
		arcAngle = 300;
		while(true) {
			for (Rectangle_Original r : Map_Original.rect) {
				if (Util.checkKollision(r, Game.gs_O.getPacMan()) == false) {
					if (Keyboard.upPressed && startY >= 30) {
						this.startAngle = 480;
						this.startY -= 50;
						moveFigur = true;
					} else if (Keyboard.downPressed && startY <= 580) {
						this.startAngle = 300;
						this.startY += 50;
						moveFigur = true;
					} else if (Keyboard.leftPressed && startX >= 30) {
						this.startAngle = 210;
						this.startX -= 50;
						moveFigur = true;
					} else if (Keyboard.rightPressed && startX <= 1200) {
						this.startAngle = 380;
						this.startX += 50;
						moveFigur = true;
					}
				}
			}
		}
	}
}
