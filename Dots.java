import java.awt.*;

public class Dots {

	public int size = 5;
	public int x;
	public int y;

	
	public Dots() {

	}
	
	public void drawDots(Graphics g) {
		
		g.setColor(Color.WHITE);
		
		for(y = 25; y < 730-150; y+=50) {
			for(x = 25; x < 1200-25; x+=50) {
				g.fillOval(x,y,size,size);

			}
		}
	}
}
