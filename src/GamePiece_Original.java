import java.awt.*;

public class GamePiece_Original {

    public Frame f = GUI_Original.f;
    public static int startX;
    public static int startY;
    public static int heigth;
    public int width;
    public int startAngle;
    public int arcAngle;
    public Color color;
    public boolean movePiece = false;


    public GamePiece_Original(int startX, int startY, int width, int heigth, int startAngle, int arcAngle, Color color) {

        this.startX = startX;
        this.startY = startY;
        this.width = width;
        this.heigth = heigth;
        this.startAngle = startAngle;
        this.arcAngle = arcAngle;
        this.color = color;

    }

    public void drawGamePiece(Graphics g) {

        g.setColor(color);
        g.fillArc(15, 670, width, heigth, 380, 300);
        g.fillArc(55, 670, width, heigth, 380, 300);
        g.fillArc(95, 670, width, heigth, 380, 300);

    }

    public void showGamePiece(Graphics g) {

        g.setColor(color);
        g.fillArc(startX, startY, width, heigth, startAngle, arcAngle);

        g.setColor(Color.BLACK);
        if (movePiece) {
            g.fillRect(95, 670, width, heigth);
        }
    }

    public void moveGamePiece() {

        while (true){
            if (Keyboard.upPressed && startY >= 30) {
                movePiece = true;
                this.startAngle = 480;
                this.startY -= 50;
                arcAngle = 300;
                for (Rectangle_Original r : Map_Original.rect) {
                    if(!Util.checkKollision(r, Gamescreen_Original.getPacMan())){
                        f.repaint();
                    }else{
                        this.startY += 50;
                        f.repaint();
                    }
                }
                Util.sleep();
            } else if (Keyboard.downPressed && startY <= 580) {
                movePiece = true;
                this.startAngle = 300;
                this.startY += 50;
                arcAngle = 300;
                for (Rectangle_Original r : Map_Original.rect) {
                    if (!Util.checkKollision(r, Gamescreen_Original.getPacMan())) {
                        f.repaint();
                    } else {
                        this.startY -= 50;
                        f.repaint();
                    }
                }
                Util.sleep();
            } else if (Keyboard.leftPressed && startX >= 30) {
                movePiece = true;
                this.startAngle = 210;
                this.startX -= 50;
                arcAngle = 300;
                for (Rectangle_Original r : Map_Original.rect) {
                    if (!Util.checkKollision(r, Gamescreen_Original.getPacMan())) {
                        f.repaint();
                    } else {
                        this.startX += 50;
                        f.repaint();
                    }
                }
                Util.sleep();
            } else if (Keyboard.rightPressed && startX <= 1200) {
                movePiece = true;
                this.startAngle = 380;
                this.startX += 50;
                arcAngle = 300;
                for (Rectangle_Original r : Map_Original.rect) {
                    if (!Util.checkKollision(r, Gamescreen_Original.getPacMan())) {
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
