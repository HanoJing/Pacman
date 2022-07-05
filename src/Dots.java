import java.awt.*;

public class Dots {

	public int size = 5;
	public int x;
	public int y;
	public int[] xW = new int[27];
	public int[] yW = new int[15];

	public Dots() {

		int i = 0;
		int j = 0;
				
		for(x = -25; x < 1325; x+=50) {
			xW[i] = x;
			i++;
		}
		
		for(y = -25; y < 725; y+=50) {
			yW[j] = y;
			j++;
		}
	}
	
	public void drawDots(Graphics g) {
				
		for(y = 25; y < 650; y+=50) {
			for(x = 25; x < 1240; x+=50) {
				g.setColor(Color.WHITE);
				g.fillOval(x,y,size,size);

			}
		}
	}
}
