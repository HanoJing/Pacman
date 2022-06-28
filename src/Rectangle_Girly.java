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
        g.fillRect(570,370,83,83);
        g.fillRoundRect(this.x,this.y,this.width,this.height,10,10);
        g.setColor(Color.MAGENTA);
        g.drawRoundRect(this.x,this.y,this.width,this.height,10,10);
        g.drawLine(589,354,655,418);
        g.drawLine(555,390,617,455);
        g.setColor(Color.BLACK);
        //g.fillRoundRect(this.x,this.y,this.width,this.height,10,10);
        //g.fillRoundRect(560,200,100,49,10,10);
        //g.fillRoundRect(560,306,100,49,10,10);
        //g.fillRoundRect(750,200,55,155,10,10);
        //g.fillRoundRect(850,300,55,155,10,10);
        g.fillRoundRect(50,150,105,55,10,10);
        g.fillRoundRect(50,450,105,55,10,10);
        g.fillRoundRect(450,500,105,55,10,10);
        g.fillRoundRect(500,500,55,153,10,10);
        g.fillRoundRect(500,4,55,149,10,10);
        g.fillRoundRect(200,200,55,255,10,10);
        g.fillRoundRect(200,400,155,55,10,10);
        g.fillRoundRect(850,300,155,55,10,10);
        g.fillRoundRect(150, 50, 255, 55,10,10);
        g.fillRoundRect(850,50,255,55,10,10);
        g.fillRoundRect(150, 550, 255, 55,10,10);
        g.fillRoundRect(850,550,255,55,10,10);
        g.fillRoundRect(450, 100, 105, 55,10,10);
        g.fillRoundRect(700, 100, 105, 55,10,10);
        g.fillRoundRect(700,200,55,255,10,10);
        g.fillRoundRect(500,305,90,85,10,10);
        g.fillRoundRect(500,200,150,50,10,10);
        //g.fillRoundRect(664,414,40,40,10,10);
        //g.fillRoundRect(600,350,40,40,10,10);
        g.fillRoundRect(700,4,49,149,10,10);
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
    }
}