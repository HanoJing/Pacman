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

		g.setColor(Color.BLACK);
		g.fillRect(1125,260,25,130);
		g.fillRect(710,250,30,110);

		g.setColor(Color.BLUE);
		g.drawRoundRect(2, 2, 1253, 653, 10, 10);   //Map Umrandung
		g.drawRoundRect(10, 10, 1237, 637, 10, 10); //Map Umrandung
		g.drawRoundRect(x,y,width,height, 10, 10);
		g.drawLine(705,250,727,275);   //M
		g.drawLine(727,275,750,250);
		g.drawLine(705,320,727,345);
		g.drawLine(727,345,750,320);
		g.drawLine(1105,235,1155,320); //N
		g.drawLine(1105,350, 1155, 435);

		g.setColor(Color.BLACK);
		g.fillRoundRect(x,y,width,height,10,10);
		g.fillRoundRect(600,3,55,105,10,10);
		g.fillRoundRect(600, 520,55,134,10,10);
		g.fillRoundRect(60,200,100,49,10,10);
		g.fillRoundRect(60,306,100,49,10,10);
		g.fillRoundRect(250,305,55,135,10,10);
		g.fillRoundRect(350,305,55,135,10,10);
		g.fillRoundRect(450,230,55,225,10,10);
		g.fillRoundRect(850,305,55,135,10,10);
		g.fillRoundRect(950,305,55,135,10,10);
		g.drawLine(705,250,705,320);   //M
		g.drawLine(750,250,750,320);
		g.drawLine(1105,235,1105,350); //N
		g.drawLine(1150,310,1150,425);


    
	}
}