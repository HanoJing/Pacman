import java.awt.*;
import java.security.Key;

public class GamePiece_Girly {

    public Frame f = GUI_Girly.f;
    public int startX;
    public int startY;
    public int heigth;
    public int width;
    public int startAngle;
    public int arcAngle;
    public Color color;
    public boolean movePiece_Girly = false;
    public boolean right;
    public boolean left;
    public boolean above;


    public GamePiece_Girly(int startX, int startY, int width, int heigth, int startAngle, int arcAngle, Color color) {

        this.startX = startX;
        this.startY = startY;
        this.width = width;
        this.heigth = heigth;
        this.startAngle = startAngle;
        this.arcAngle = arcAngle;
        this.color = color;

    }

    public void drawGamePiece_Girly(Graphics g){

        g.setColor(color);
        g.fillArc(15, 670, width, heigth, 380, 300);
        g.fillArc(55, 670, width, heigth, 380, 300);
        g.fillArc(95, 670, width, heigth, 380, 300);

        g.setColor(Color.pink);
        g.fillRect(15,678,4,4);  //first ribbon
        g.fillRect(13,676,4,4);
        g.fillRect(19,670,4,4);
        g.fillRect(21,672,4,4);
        g.fillRect(17,674,2,2);
        g.fillRect(19,676,2,2);

        g.fillRect(55,678,4,4);  //second ribbon
        g.fillRect(53,676,4,4);
        g.fillRect(59,670,4,4);
        g.fillRect(61,672,4,4);
        g.fillRect(57,674,2,2);
        g.fillRect(59,676,2,2);

        g.fillRect(95,678,4,4);  //third ribbon
        g.fillRect(93,676,4,4);
        g.fillRect(99,670,4,4);
        g.fillRect(101,672,4,4);
        g.fillRect(97,674,2,2);
        g.fillRect(99,676,2,2);

        g.setColor(Color.magenta);
        g.fillRect(19,674,2,2);  //first ribbon
        g.fillRect(17,676,2,2);

        g.fillRect(59,674,2,2);  //second ribbon
        g.fillRect(57,676,2,2);

        g.fillRect(99,674,2,2);  //third ribbon
        g.fillRect(97,676,2,2);

        g.setColor(Color.BLACK);
        g.fillRect(21,676,2,2);  //first ribbon
        g.fillRect(19,678,2,4);
        g.fillRect(13,680,2,4);
        g.fillRect(25,672,2,4);
        g.fillRect(15,682,4,2);
        g.fillRect(21,676,4,2);
        g.fillRect(23,670,4,2);

        g.fillRect(61,676,2,2);  //second ribbon
        g.fillRect(59,678,2,4);
        g.fillRect(53,680,2,4);
        g.fillRect(65,672,2,4);
        g.fillRect(55,682,4,2);
        g.fillRect(61,676,4,2);
        g.fillRect(63,670,4,2);

        g.fillRect(101,676,2,2);  //third ribbon
        g.fillRect(99,678,2,4);
        g.fillRect(93,680,2,4);
        g.fillRect(105,672,2,4);
        g.fillRect(95,682,4,2);
        g.fillRect(101,676,4,2);
        g.fillRect(103,670,4,2);

        if(movePiece_Girly){
            g.fillRect(90,665,35,35);
        }
    }
    public void showGamePiece_Girly(Graphics g) {
        g.setColor(color);
        g.fillArc(startX, startY, width, heigth, startAngle, arcAngle);

        if (right == true) {
            // left above ribbon
            g.setColor(Color.pink);
            g.fillRect(startX, startY + 8, 4, 4);
            g.fillRect(startX - 2, startY + 6, 4, 4);
            g.fillRect(startX + 4, startY, 4, 4);
            g.fillRect(startX + 6, startY + 2, 4, 4);
            g.fillRect(startX + 2, startY + 4, 2, 2);
            g.fillRect(startX + 4, startY + 6, 2, 2);

            g.setColor(Color.magenta);
            g.fillRect(startX + 4, startY + 4, 2, 2);
            g.fillRect(startX + 2, startY + 6, 2, 2);

            g.setColor(Color.BLACK);
            g.fillRect(startX + 6, startY + 6, 2, 2);
            g.fillRect(startX + 4, startY + 8, 2, 4);
            g.fillRect(startX - 2, startY + 10, 2, 4);
            g.fillRect(startX + 10, startY + 2, 2, 4);
            g.fillRect(startX, startY + 12, 4, 2);
            g.fillRect(startX + 6, startY + 6, 4, 2);
            g.fillRect(startX + 8, startY, 4, 2);

        } else if (left == true) {
            // right above ribbon
            g.setColor(Color.pink);
            g.fillRect(startX + 26, startY + 6, 4, 4);
            g.fillRect(startX + 28, startY + 4, 4, 4);
            g.fillRect(startX + 22, startY - 2, 4, 4);
            g.fillRect(startX + 20, startY, 4, 4);
            g.fillRect(startX + 26, startY + 2, 2, 2);
            g.fillRect(startX + 24, startY + 4, 2, 2);

            g.setColor(Color.magenta);
            g.fillRect(startX + 24, startY + 2, 2, 2);
            g.fillRect(startX + 26, startY + 4, 2, 2);

            g.setColor(Color.BLACK);
            g.fillRect(startX + 18, startY - 2, 2, 6);
            g.fillRect(startX + 24, startY + 6, 2, 4);
            g.fillRect(startX + 20, startY + 4, 4, 2);
            g.fillRect(startX + 26, startY + 10, 4, 2);
            g.fillRect(startX + 20, startY - 2, 2, 2);

        } else if (above == true) {
            // left down ribbon
            g.setColor(Color.pink);
            g.fillRect(startX + 4, startY + 28, 4, 4);
            g.fillRect(startX + 6, startY + 26, 4, 4);
            g.fillRect(startX, startY + 20, 4, 4);
            g.fillRect(startX -2, startY + 22, 4, 4);
            g.fillRect(startX + 4, startY + 24, 2, 2);
            g.fillRect(startX + 2, startY + 26, 2, 2);

            g.setColor(Color.magenta);
            g.fillRect(startX + 2, startY + 24, 2, 2);
            g.fillRect(startX + 4, startY + 26, 2, 2);

            g.setColor(Color.BLACK);
            g.fillRect(startX, startY + 18, 4, 2);
            g.fillRect(startX + 4, startY + 20, 2, 4);
            g.fillRect(startX + 6, startY + 24, 4, 2);
            g.fillRect(startX + 10, startY + 26, 2, 4);
            g.fillRect(startX - 2, startY + 20, 2, 2);
            g.fillRect(startX + 8, startY + 30,2,4);

        }
    }

    public void moveGamePiece_Girly() {

        left = true; right = false; above = false;

        while (true) {
            if (Keyboard.upPressed && startY >= 30) {
                movePiece_Girly = true;
                this.startAngle = 480;
                this.startY -= 50;
                arcAngle = 300;
                above = true; left = false; right = false;
                for (Rectangle_Girly r : Map_Girly.rect) {
                    if (!Util.checkKollision_Girly(r, Gamescreen_Girly.getPacMan())) {
                        f.repaint();
                    } else {
                        this.startY += 50;
                        f.repaint();
                    }
                }
                Util.sleep();
            } else if (Keyboard.downPressed && startY <= 580) {
                movePiece_Girly = true;
                this.startAngle = 300;
                this.startY += 50;
                arcAngle = 300;
                left = true; right = false; above = false;
                for (Rectangle_Girly r : Map_Girly.rect) {
                    if (!Util.checkKollision_Girly(r, Gamescreen_Girly.getPacMan())) {
                        f.repaint();
                    } else {
                        this.startY -= 50;
                        f.repaint();
                    }
                }
                Util.sleep();
            } else if (Keyboard.leftPressed && startX >= 30) {
                movePiece_Girly = true;
                this.startAngle = 210;
                this.startX -= 50;
                arcAngle = 300;
                left = true; right = false; above = false;
                for (Rectangle_Girly r : Map_Girly.rect) {
                    if (!Util.checkKollision_Girly(r, Gamescreen_Girly.getPacMan())) {
                        f.repaint();
                    } else {
                        this.startX += 50;
                        f.repaint();
                    }
                }
                Util.sleep();
            } else if (Keyboard.rightPressed && startX <= 1200) {
                movePiece_Girly = true;
                this.startAngle = 380;
                this.startX += 50;
                arcAngle = 300;
                right = true; left = false; above = false;
                for (Rectangle_Girly r : Map_Girly.rect) {
                    if (!Util.checkKollision_Girly(r, Gamescreen_Girly.getPacMan())) {
                        f.repaint();
                    } else {
                        this.startX -= 50;
                        f.repaint();
                    }
                }
                Util.sleep();
            }

            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();

            }
        }
    }
}
