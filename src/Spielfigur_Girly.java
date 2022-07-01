import java.awt.*;
import java.security.Key;

public class Spielfigur_Girly {
    public Frame f = GUI_Girly.f;
    public int startX;
    public int startY;
    public int heigth;
    public int width;
    public int startAngle;
    public int arcAngle;
    public Color farbe;
    public boolean moveFigur_Girly = false;
    public boolean rechts;
    public boolean links;
    public boolean oben;


    public Spielfigur_Girly(int startX, int startY, int width, int heigth, int startAngle, int arcAngle, Color farbe) {

        this.startX = startX;
        this.startY = startY;
        this.width = width;
        this.heigth = heigth;
        this.startAngle = startAngle;
        this.arcAngle = 300;
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
        g.fillRect(21,676,2,2);  //erste Schleife
        g.fillRect(19,678,2,4);
        g.fillRect(13,680,2,4);
        g.fillRect(25,672,2,4);
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

        g.fillRect(101,676,2,2);  //dritte Schleife
        g.fillRect(99,678,2,4);
        g.fillRect(93,680,2,4);
        g.fillRect(105,672,2,4);
        g.fillRect(95,682,4,2);
        g.fillRect(101,676,4,2);
        g.fillRect(103,670,4,2);

        if(moveFigur_Girly){
            g.fillRect(90,665,35,35);
        }
    }
    public void showSpielfigur_Girly(Graphics g) {
        g.setColor(farbe);
        g.fillArc(startX, startY, width, heigth, startAngle, arcAngle);

        if (rechts == true) {
            // nach rechts laufen
            g.setColor(Color.pink);
            g.fillRect(startX, startY + 8, 4, 4);  // Schleife
            g.fillRect(startX - 2, startY + 6, 4, 4);
            g.fillRect(startX + 4, startY, 4, 4);
            g.fillRect(startX + 6, startY + 2, 4, 4);
            g.fillRect(startX + 2, startY + 4, 2, 2);
            g.fillRect(startX + 4, startY + 6, 2, 2);

            g.setColor(Color.magenta);
            g.fillRect(startX + 4, startY + 4, 2, 2);  // Schleife
            g.fillRect(startX + 2, startY + 6, 2, 2);

            g.setColor(Color.BLACK);
            g.fillRect(startX + 6, startY + 6, 2, 2);  // Schleife
            g.fillRect(startX + 4, startY + 8, 2, 4);
            g.fillRect(startX - 2, startY + 10, 2, 4);
            g.fillRect(startX + 10, startY + 2, 2, 4);
            g.fillRect(startX, startY + 12, 4, 2);
            g.fillRect(startX + 6, startY + 6, 4, 2);
            g.fillRect(startX + 8, startY, 4, 2);

        } else if (links == true) {
            // nach links laufen
            g.setColor(Color.pink);
            g.fillRect(startX + 26, startY + 6, 4, 4);  // Schleife
            g.fillRect(startX + 28, startY + 4, 4, 4);
            g.fillRect(startX + 22, startY - 2, 4, 4);
            g.fillRect(startX + 20, startY, 4, 4);
            g.fillRect(startX + 26, startY + 2, 2, 2);
            g.fillRect(startX + 24, startY + 4, 2, 2);

            g.setColor(Color.magenta);
            g.fillRect(startX + 24, startY + 2, 2, 2);  // Schleife
            g.fillRect(startX + 26, startY + 4, 2, 2);

            g.setColor(Color.BLACK);
            g.fillRect(startX + 18, startY - 2, 2, 6);  // Schleife
            g.fillRect(startX + 24, startY + 6, 2, 4);
            g.fillRect(startX + 20, startY + 4, 4, 2);
            g.fillRect(startX + 26, startY + 10, 4, 2);
            g.fillRect(startX + 20, startY - 2, 2, 2);

        } else if (oben == true) {
            // nach unten laufen
            g.setColor(Color.pink);
            g.fillRect(startX + 6, startY + 26, 4, 4);  // Schleife
            g.fillRect(startX + 8, startY + 24, 4, 4);
            g.fillRect(startX + 2, startY + 18, 4, 4);
            g.fillRect(startX, startY + 20, 4, 4);
            g.fillRect(startX + 6, startY + 22, 2, 2);
            g.fillRect(startX + 4, startY + 24, 2, 2);

            g.setColor(Color.magenta);
            g.fillRect(startX + 4, startY + 22, 2, 2);  // Schleife
            g.fillRect(startX + 6, startY + 24, 2, 2);

            g.setColor(Color.BLACK);
            g.fillRect(startX - 2, startY + 18, 2, 6);  // Schleife
            g.fillRect(startX + 4, startY + 26, 2, 4);
            g.fillRect(startX, startY + 24, 4, 2);
            g.fillRect(startX + 6, startY + 30, 4, 2);
            g.fillRect(startX, startY + 18, 2, 2);

        }
    }

        public void moveSpielfigur_Girly() {


            while (true) {
                if (Keyboard.upPressed && startY >= 30) {
                    moveFigur_Girly = true;
                    this.startAngle = 480;
                    this.startY -= 50;
                    links = true;
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
                    moveFigur_Girly = true;
                    this.startAngle = 300;
                    this.startY += 50;
                    oben = true;
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
                    moveFigur_Girly = true;
                    this.startAngle = 210;
                    this.startX -= 50;
                    links = true;
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
                    moveFigur_Girly = true;
                    this.startAngle = 380;
                    this.startX += 50;
                    rechts = true;
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


