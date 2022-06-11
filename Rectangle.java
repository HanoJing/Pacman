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
	
	public void drawRectangel(Graphics g) {

		g.setColor(Color.BLACK);
		g.fillRect(x,y,width,height);
		g.setColor(Color.BLUE);
		g.drawRoundRect(x,y,width,height, 10, 10);
    
	}
	
	

}
