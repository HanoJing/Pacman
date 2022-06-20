import java.awt.Color;
import java.awt.Graphics;

public class Rectangle_Girly {
    public int x;
    public int y;
    public int width;
    public int height;

    public Rectangle_Girly(int x,int y,int width,int height){
        this.x=x;
        this.y=y;
        this.width=width;
        this.height=height;
    }
    public void drawRectangle_Girly(Graphics g){
        g.setColor(Color.BLACK);
        g.fillRect(410,250,30,110);
        g.setColor(Color.MAGENTA);
        g.drawRoundRect(this.x,this.y,this.width,this.height,10,10);
        g.drawLine(405,250,427,275);
        g.drawLine(427,275,450,250);
        g.drawLine(405,320,427,345);
        g.drawLine(427,345,450,320);
        g.drawLine(639,354,705,418);
        g.drawLine(605,390,667,455);
        g.setColor(Color.BLACK);
        g.fillRoundRect(this.x,this.y,this.width,this.height,10,10);
        g.fillRoundRect(560,200,100,49,10,10);
        g.fillRoundRect(560,306,100,49,10,10);
        g.fillRoundRect(750,200,55,155,10,10);
        g.fillRoundRect(850,300,55,155,10,10);
        g.fillRoundRect(50,150,105,55,10,10);
        g.fillRoundRect(50,450,105,55,10,10);
        g.fillRoundRect(450,500,105,55,10,10);
        g.fillRoundRect(500,500,55,153,10,10);
        g.fillRoundRect(500,4,55,149,10,10);
        g.fillRoundRect(664,414,40,40,10,10);
        g.fillRoundRect(600,350,40,40,10,10);
        g.fillRoundRect(700,4,55,149,10,10);
        g.fillRoundRect(700,500,55,152,10,10);
        g.fillRoundRect(1100,150,105,55,10,10);
        g.fillRoundRect(1100,450,105,55,10,10);
        g.fillRect(5,50,50,55);
        g.fillRect(5,250,50,55);
        g.fillRect(5,350,50,55);
        g.fillRect(5,550,50,55);
        g.fillRect(1205,50,48,55);
        g.fillRect(1205,250,48,55);
        g.fillRect(1205,350,48,55);
        g.fillRect(1205,550,48,55);
        g.drawLine(405,251,405,320);
        g.drawLine(450,251,450,320);
    }
}
