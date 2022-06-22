import java.awt.*;

public class Spielfigur_Girly {


    public int startX;
    public int startY;
    public int heigth;
    public int width;
    public int startAngle;
    public int arcAngle;
    public Color farbe;
    public boolean moveFigur2 = false;


    public Spielfigur_Girly(int startX, int startY, int width, int heigth, int startAngle, int arcAngle, Color farbe) {

        this.startX = startX;
        this.startY = startY;
        this.width = width;
        this.heigth = heigth;
        this.startAngle = startAngle;
        this.arcAngle = arcAngle;
        this.farbe = farbe;

    }

    public void drawSpielfigur_Girly(Graphics g){

        g.setColor(farbe);
        g.fillArc(15, 670, width, heigth, 380, 300);
        g.fillArc(55, 670, width, heigth, 380, 300);
        g.fillArc(95, 670, width, heigth, 380, 300);

        g.setColor(Color.pink);
        g.fillRect(15,678,4,4);  //erste Schleife
        g.fillRect(13,676,4,4);
        g.fillRect(19,670,4,4);
        g.fillRect(21,672,4,4);
        g.fillRect(17,674,2,2);
        g.fillRect(19,676,2,2);

        g.fillRect(55,678,4,4);  //zweite Schleife
        g.fillRect(53,676,4,4);
        g.fillRect(59,670,4,4);
        g.fillRect(61,672,4,4);
        g.fillRect(57,674,2,2);
        g.fillRect(59,676,2,2);

        g.fillRect(95,678,4,4);  //dritte Schleife
        g.fillRect(93,676,4,4);
        g.fillRect(99,670,4,4);
        g.fillRect(101,672,4,4);
        g.fillRect(97,674,2,2);
        g.fillRect(99,676,2,2);

        g.setColor(Color.magenta);
        g.fillRect(19,674,2,2);  //erste Schleife
        g.fillRect(17,676,2,2);

        g.fillRect(59,674,2,2);  //zweite Schleife
        g.fillRect(57,676,2,2);

        g.fillRect(99,674,2,2);  //dritte Schleife
        g.fillRect(97,676,2,2);

        g.setColor(Color.BLACK);
        g.fillRect(21,676,2,4);  //erste Schleife
        g.fillRect(19,678,2,6);
        g.fillRect(13,680,2,4);
        g.fillRect(25,672,2,6);
        g.fillRect(15,682,4,2);
        g.fillRect(21,676,4,2);
        g.fillRect(23,670,4,2);

        g.fillRect(61,676,2,2);  //zweite Schleife
        g.fillRect(59,678,2,4);
        g.fillRect(53,680,2,4);
        g.fillRect(65,672,2,4);
        g.fillRect(55,682,4,2);
        g.fillRect(61,676,4,2);
        g.fillRect(63,670,4,2);

        if(moveFigur2){
            g.fillRect(90,665,35,35);
        }
    }
    public void showSpielfigur_Girly(Graphics g) {

        g.setColor(farbe);
        g.fillArc(startX, startY, width, heigth, startAngle, arcAngle);

    }

    public void moveSpielfigur_Girly() {

        arcAngle = 300;

        if(KeyDispatcher_Girly.upPressed && startY >= 30) {
            this.startAngle = 480;
            this.startY -= 50;
            moveFigur2 = true;
        }else if(KeyDispatcher_Girly.downPressed && startY <= 580) {
            this.startAngle = 300;
            this.startY += 50;
            moveFigur2 = true;
        }else if(KeyDispatcher_Girly.leftPressed && startX >= 30) {
            this.startAngle = 210;
            this.startX -= 50;
            moveFigur2 = true;
        }else if(KeyDispatcher_Girly.rightPressed && startX <= 1200) {
            this.startAngle = 380;
            this.startX += 50;
            moveFigur2 = true;
        }


    }
}
