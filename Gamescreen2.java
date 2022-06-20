import javax.swing.*;
import java.awt.*;

public class Gamescreen2 extends JPanel{

    private KeyboardFocusManager manager2;

    private Spielfigur2 pacMan;

    public boolean kollision = false;

    private Rectangle2 h1;
    private Rectangle2 h2;
    private Rectangle2 h3;
    private Rectangle2 h4;
    private Rectangle2 h5;
    private Rectangle2 h6;
    private Rectangle2 h7;
    private Rectangle2 h8;
    private Rectangle2 h9;
    private Rectangle2 h10;
    private Rectangle2 h11;
    private Rectangle2 h12;
    private Rectangle2 h13;
    private Rectangle2 h14;
    private Rectangle2 h15;
    private Rectangle2 h16;
    private Rectangle2 h17;
    private Rectangle2 h18;
    private Rectangle2 h19;
    private Rectangle2 h20;
    private Rectangle2 h21;
    private Rectangle2 h22;
    private Rectangle2 h23;
    private Rectangle2 h24;
    private Rectangle2 h25;
    private Rectangle2 h26;
    private Rectangle2 h27;
    private Rectangle2 h28;
    private Rectangle2 h29;
    private Rectangle2 h30;
    private Rectangle2 h31;
    private Rectangle2 h32;
    private Rectangle2 h33;
    private Rectangle2 h34;
    private Rectangle2 h35;
    private Rectangle2 h36;
    private Rectangle2 h37;


    private Dots2 d;

    private Icons i;
    private Icons j;

    public int score = 0;

    public boolean hit = false;

    public Gamescreen2(Frame f2) {

        this.manager2 = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        this.manager2.addKeyEventDispatcher(new KeyDispatcher2(f2,this));

        d = new Dots2(this);

        h1 = new Rectangle2(6,50,105,55);
        h2 = new Rectangle2(6,550,105,55);
        h3 = new Rectangle2(6,250,55,55);
        h4 = new Rectangle2(6,350,55,55);
        h5 = new Rectangle2(1148,50,103,55);
        h6 = new Rectangle2(1148,550,103,55);
        h7 = new Rectangle2(1198,250,53,55);
        h8 = new Rectangle2(1198,350,53,55);
        h9 = new Rectangle2(600,50,55,105);
        h10 = new Rectangle2(600,500,55,105);
        h11 = new Rectangle2(50,150,105,55);
        h12 = new Rectangle2(100,150,55,155);
        h13 = new Rectangle2(50,450,105,55);
        h14 = new Rectangle2(100,350,55,155);
        h15 = new Rectangle2(500,500,55,150);
        h16 = new Rectangle2(450,500,105,55);
        h17 = new Rectangle2(500,6,55,149);
        h18 = new Rectangle2(450,100,105,55);
        h19 = new Rectangle2(350,200,55,255);    //M
        h20 = new Rectangle2(450,200,55,255);
        h21 = new Rectangle2(550,200,155,155);   //R
        h22 = new Rectangle2(550,200,55,255);
        h23 = new Rectangle2(600,250,55,55);
        h24 = new Rectangle2(665,415,40,40);
        h25 = new Rectangle2(750,200,55,155);    //S
        h26 = new Rectangle2(850,300,55,155);
        h27 = new Rectangle2(750,300,155,55);
        h28 = new Rectangle2(750,200,155,55);
        h29 = new Rectangle2(750,400,155,55);
        h30 = new Rectangle2(700,6,55,149);      //...
        h31 = new Rectangle2(700,500,55,150);
        h32 = new Rectangle2(700,100,105,55);
        h33 = new Rectangle2(700,500,105,55);
        h34 = new Rectangle2(1100,150,105,55);
        h35 = new Rectangle2(1100,150,55,155);
        h36 = new Rectangle2(1100,450,105,55);
        h37 = new Rectangle2(1100,350,55,155);


        pacMan = new Spielfigur2(613,163,30,30,380,360,Color.YELLOW);

        i = new Icons();
        j = new Icons();

    }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            d.drawDots2(g);

            setBackground(Color.BLACK);

            g.setColor(Color.MAGENTA);
            g.drawRoundRect(2, 2, 1253, 653, 10, 10);   //Map Umrandung
            g.drawRoundRect(10, 10, 1237, 637, 10, 10); //Map Umrandung

            h1.drawRectangle2(g);
            h2.drawRectangle2(g);
            h3.drawRectangle2(g);
            h4.drawRectangle2(g);
            h5.drawRectangle2(g);
            h6.drawRectangle2(g);
            h7.drawRectangle2(g);
            h8.drawRectangle2(g);
            h9.drawRectangle2(g);
            h10.drawRectangle2(g);
            h11.drawRectangle2(g);
            h12.drawRectangle2(g);
            h13.drawRectangle2(g);
            h14.drawRectangle2(g);
            h15.drawRectangle2(g);
            h16.drawRectangle2(g);
            h17.drawRectangle2(g);
            h18.drawRectangle2(g);
            h19.drawRectangle2(g);
            h20.drawRectangle2(g);
            h21.drawRectangle2(g);
            h22.drawRectangle2(g);
            h23.drawRectangle2(g);
            h24.drawRectangle2(g);
            h25.drawRectangle2(g);
            h26.drawRectangle2(g);
            h27.drawRectangle2(g);
            h28.drawRectangle2(g);
            h29.drawRectangle2(g);
            h30.drawRectangle2(g);
            h31.drawRectangle2(g);
            h32.drawRectangle2(g);
            h33.drawRectangle2(g);
            h34.drawRectangle2(g);
            h35.drawRectangle2(g);
            h36.drawRectangle2(g);
            h37.drawRectangle2(g);



            pacMan.drawSpielfigur2(g);

            pacMan.showSpielfigur2(g);

            i.drawDiamant(g);
            j.drawScore(g);

            g.setColor(Color.WHITE);
            g.drawString(" "+score,670,690);

        }

    public Spielfigur2 getPacMan() {
        return pacMan;
    }

    public void checkKollision() {

        if(h1.x<=pacMan.startX && (h1.x+h1.width)>pacMan.startX && h1.y<=pacMan.startY && (h1.y+h1.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h2.x<=pacMan.startX && (h2.x+h2.width)>pacMan.startX && h2.y<=pacMan.startY && (h2.y+h2.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h3.x<=pacMan.startX && (h3.x+h3.width)>pacMan.startX && h3.y<=pacMan.startY && (h3.y+h3.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h4.x<=pacMan.startX && (h4.x+h4.width)>pacMan.startX && h4.y<=pacMan.startY && (h4.y+h4.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h5.x<=pacMan.startX && (h5.x+h5.width)>pacMan.startX && h5.y<=pacMan.startY && (h5.y+h5.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h6.x<=pacMan.startX && (h6.x+h6.width)>pacMan.startX && h6.y<=pacMan.startY && (h6.y+h6.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h7.x<=pacMan.startX && (h7.x+h7.width)>pacMan.startX && h7.y<=pacMan.startY && (h7.y+h7.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h8.x<=pacMan.startX && (h8.x+h8.width)>pacMan.startX && h8.y<=pacMan.startY && (h8.y+h8.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h9.x<=pacMan.startX && (h9.x+h9.width)>pacMan.startX && h9.y<=pacMan.startY && (h9.y+h9.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h10.x<=pacMan.startX && (h10.x+h10.width)>pacMan.startX && h10.y<=pacMan.startY && (h10.y+h10.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h11.x<=pacMan.startX && (h11.x+h11.width)>pacMan.startX && h11.y<=pacMan.startY && (h11.y+h11.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h12.x<=pacMan.startX && (h12.x+h12.width)>pacMan.startX && h12.y<=pacMan.startY && (h12.y+h12.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h13.x<=pacMan.startX && (h13.x+h13.width)>pacMan.startX && h13.y<=pacMan.startY && (h13.y+h13.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h14.x<=pacMan.startX && (h14.x+h14.width)>pacMan.startX && h14.y<=pacMan.startY && (h14.y+h14.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h15.x<=pacMan.startX && (h15.x+h15.width)>pacMan.startX && h15.y<=pacMan.startY && (h15.y+h15.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h16.x<=pacMan.startX && (h16.x+h16.width)>pacMan.startX && h16.y<=pacMan.startY && (h16.y+h16.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h17.x<=pacMan.startX && (h17.x+h17.width)>pacMan.startX && h17.y<=pacMan.startY && (h17.y+h17.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h18.x<=pacMan.startX && (h18.x+h18.width)>pacMan.startX && h18.y<=pacMan.startY && (h18.y+h18.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h19.x<=pacMan.startX && (h19.x+h19.width)>pacMan.startX && h19.y<=pacMan.startY && (h19.y+h19.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h20.x<=pacMan.startX && (h20.x+h20.width)>pacMan.startX && h20.y<=pacMan.startY && (h20.y+h20.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h21.x<=pacMan.startX && (h21.x+h21.width)>pacMan.startX && h21.y<=pacMan.startY && (h21.y+h21.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h22.x<=pacMan.startX && (h22.x+h22.width)>pacMan.startX && h22.y<=pacMan.startY && (h22.y+h22.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h23.x<=pacMan.startX && (h23.x+h23.width)>pacMan.startX && h23.y<=pacMan.startY && (h23.y+h23.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h24.x<=pacMan.startX && (h24.x+h24.width)>pacMan.startX && h24.y<=pacMan.startY && (h24.y+h24.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h25.x<=pacMan.startX && (h25.x+h25.width)>pacMan.startX && h25.y<=pacMan.startY && (h25.y+h25.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h26.x<=pacMan.startX && (h26.x+h26.width)>pacMan.startX && h26.y<=pacMan.startY && (h26.y+h26.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h27.x<=pacMan.startX && (h27.x+h27.width)>pacMan.startX && h27.y<=pacMan.startY && (h27.y+h27.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h28.x<=pacMan.startX && (h28.x+h28.width)>pacMan.startX && h28.y<=pacMan.startY && (h28.y+h28.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h29.x<=pacMan.startX && (h29.x+h29.width)>pacMan.startX && h29.y<=pacMan.startY && (h29.y+h29.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h30.x<=pacMan.startX && (h30.x+h30.width)>pacMan.startX && h30.y<=pacMan.startY && (h30.y+h30.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h31.x<=pacMan.startX && (h31.x+h31.width)>pacMan.startX && h31.y<=pacMan.startY && (h31.y+h31.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h32.x<=pacMan.startX && (h32.x+h32.width)>pacMan.startX && h32.y<=pacMan.startY && (h32.y+h32.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(h33.x<=pacMan.startX && (h33.x+h33.width)>pacMan.startX && h33.y<=pacMan.startY && (h33.y+h33.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }
    }

    public void score2() {

        for(int j = 1; j < d.yW.length-1; j++) {
            for(int i = 1; i < d.xW.length-1; i++) {
                if(pacMan.startY < d.yW[j] && pacMan.startY < d.yW[j+1] && pacMan.startY > d.yW[j-1] && pacMan.startX < d.xW[i] && pacMan.startX < d.xW[i+1] && pacMan.startX > d.xW[i-1]) {
                    score+=10;
                    hit = true;
                }
            }
        }
    }
}