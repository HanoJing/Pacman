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


	public Spielfigur_Original(int startX, int startY, int heigth, int width, int startAngle, int arcAngle, Color farbe) {
	  
	    this.startX = startX;
	    this.startY = startY;
	    this.heigth = heigth;
	    this.width = width;
	    this.startAngle = startAngle;
	    this.arcAngle = arcAngle;
	    this.farbe = farbe;
	 
    }

	public void drawSpielfigur(Graphics g){

		g.setColor(farbe);
		g.fillArc(15, 670, heigth, width, 380, 300);
		g.fillArc(55, 670, heigth, width, 380, 300);
		g.fillArc(95, 670, heigth, width, 380, 300);

	}
    public void showSpielfigur(Graphics g) {

		g.setColor(farbe);
		g.fillArc(startX, startY, heigth, width, startAngle, arcAngle);

		g.setColor(Color.BLACK);
		if (moveFigur == true) {
			g.fillRect(95, 670, heigth, width);

		}

		}

	public void moveSpielfigur() {
		arcAngle = 300;

		if (KeyDispatcher_Original.upPressed == true && startY >= 30) {
			this.startAngle = 480;
			this.startY -= 50;
			moveFigur = true;
		} else if (KeyDispatcher_Original.downPressed == true && startY <= 580) {
			this.startAngle = 300;
			this.startY += 50;
			moveFigur = true;
		} else if (KeyDispatcher_Original.leftPressed == true && startX >= 30) {
			this.startAngle = 210;
			this.startX -= 50;
			moveFigur = true;
		} else if (KeyDispatcher_Original.rightPressed == true && startX <= 1200) {
			this.startAngle = 380;
			this.startX += 50;
			moveFigur = true;
		}
	}
}
