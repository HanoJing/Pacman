import java.awt.*;
public class Spielfigur2 {

    public int startX;
    public int startY;
    public int heigth;
    public int width;
    public int startAngle;
    public int arcAngle;
    public Color farbe;


    public Spielfigur2(int startX, int startY, int heigth, int width, int startAngle, int arcAngle, Color farbe) {

        this.startX = startX;
        this.startY = startY;
        this.heigth = heigth;
        this.width = width;
        this.startAngle = startAngle;
        this.arcAngle = arcAngle;
        this.farbe = farbe;

    }

    public void drawSpielfigur2(Graphics g){

        g.setColor(farbe);
        g.fillArc(15, 670, heigth, width, 380, 300);
        g.fillArc(55, 670, heigth, width, 380, 300);
        g.fillArc(95, 670, heigth, width, 380, 300);
    }
    public void showSpielfigur2(Graphics g) {

        g.setColor(farbe);
        g.fillArc(startX, startY, heigth, width, startAngle, arcAngle);

    }

    public void moveSpielfigur2() {

        arcAngle = 300;

        if(KeyDispatcher2.upPressed == true && startY >= 30) {
            this.startAngle = 480;
            this.startY -= 50;
        }else if(KeyDispatcher2.downPressed == true && startY <= 580) {
            this.startAngle = 300;
            this.startY += 50;
        }else if(KeyDispatcher2.leftPressed == true && startX >= 30) {
            this.startAngle = 210;
            this.startX -= 50;
        }else if(KeyDispatcher2.rightPressed == true && startX <= 1200) {
            this.startAngle = 380;
            this.startX += 50;
        }


    }
}
