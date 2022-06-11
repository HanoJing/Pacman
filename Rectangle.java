import java.awt.*;

public class Rectangle {
	
	public int x;
	public int y;
	public int width;
	public int height;
	
	
	public Rectangle(int x, int y, int width, int height) {
	    this.x = x;
	    this.y = y;
	    this.width = width;
	    this.height = height;
	}
	
	public void drawRectangle(Graphics g) {

		g.setColor(Color.BLUE);
		g.drawRoundRect(2, 2, 1153, 653, 10, 10);
		g.drawRoundRect(10, 10, 1137, 637, 10, 10);
		g.drawRoundRect(x,y,width,height, 10, 10);

		g.setColor(Color.BLACK);
		g.fillRoundRect(x,y,width,height,10,10);
		g.fillRoundRect(550,5,55,195,10,10);
		g.fillRoundRect(550,456,55,195, 10, 10);
		g.fillRoundRect(60,200,100,49,10,10);
		g.fillRoundRect(60,306,100,49,10,10);
    
	}
}