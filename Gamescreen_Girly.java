import javax.swing.*;
import java.awt.*;

public class Gamescreen_Girly extends JPanel {

	private KeyboardFocusManager manager;

    private Map_Girly map;
    private Spielfigur_Girly pacMan;
    public boolean kollision = false;
    private Dots d;
    private Icons i;
    private Icons j;
    public int score = 0;
    public boolean hit = false;

    public Gamescreen_Girly(Frame f) {

        this.manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        this.manager.addKeyEventDispatcher(new KeyDispatcher_Girly(f,this));

        map = new Map_Girly();

        d = new Dots();
        
        pacMan = new Spielfigur_Girly(613,163,30,30,380,360,Color.YELLOW);

        i = new Icons();
        j = new Icons();

    }

        public void paintComponent(Graphics g) {
            super.paintComponent(g);

            setBackground(Color.BLACK);

            g.setColor(Color.MAGENTA);
            g.drawRoundRect(2, 2, 1253, 653, 10, 10);   //Map Umrandung
            g.drawRoundRect(10, 10, 1237, 637, 10, 10); //Map Umrandung

            d.drawDots(g);

            map.drawMap_Girly(g);

            pacMan.drawSpielfigur_Girly(g);

            pacMan.showSpielfigur_Girly(g);

            i.drawDiamant(g);
            j.drawScore(g);

            g.setColor(Color.WHITE);
            g.drawString(" "+score,670,690);

        }

    public Spielfigur_Girly getPacMan() {
        return pacMan;
    }

    public void checkKollision() {

        if(map.h1.x<=pacMan.startX && (map.h1.x+map.h1.width)>pacMan.startX && map.h1.y<=pacMan.startY && (map.h1.y+map.h1.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h2.x<=pacMan.startX && (map.h2.x+map.h2.width)>pacMan.startX && map.h2.y<=pacMan.startY && (map.h2.y+map.h2.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h3.x<=pacMan.startX && (map.h3.x+map.h3.width)>pacMan.startX && map.h3.y<=pacMan.startY && (map.h3.y+map.h3.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h4.x<=pacMan.startX && (map.h4.x+map.h4.width)>pacMan.startX && map.h4.y<=pacMan.startY && (map.h4.y+map.h4.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h5.x<=pacMan.startX && (map.h5.x+map.h5.width)>pacMan.startX && map.h5.y<=pacMan.startY && (map.h5.y+map.h5.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h6.x<=pacMan.startX && (map.h6.x+map.h6.width)>pacMan.startX && map.h6.y<=pacMan.startY && (map.h6.y+map.h6.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h7.x<=pacMan.startX && (map.h7.x+map.h7.width)>pacMan.startX && map.h7.y<=pacMan.startY && (map.h7.y+map.h7.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h8.x<=pacMan.startX && (map.h8.x+map.h8.width)>pacMan.startX && map.h8.y<=pacMan.startY && (map.h8.y+map.h8.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h9.x<=pacMan.startX && (map.h9.x+map.h9.width)>pacMan.startX && map.h9.y<=pacMan.startY && (map.h9.y+map.h9.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h10.x<=pacMan.startX && (map.h10.x+map.h10.width)>pacMan.startX && map.h10.y<=pacMan.startY && (map.h10.y+map.h10.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h11.x<=pacMan.startX && (map.h11.x+map.h11.width)>pacMan.startX && map.h11.y<=pacMan.startY && (map.h11.y+map.h11.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h12.x<=pacMan.startX && (map.h12.x+map.h12.width)>pacMan.startX && map.h12.y<=pacMan.startY && (map.h12.y+map.h12.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h13.x<=pacMan.startX && (map.h13.x+map.h13.width)>pacMan.startX && map.h13.y<=pacMan.startY && (map.h13.y+map.h13.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h14.x<=pacMan.startX && (map.h14.x+map.h14.width)>pacMan.startX && map.h14.y<=pacMan.startY && (map.h14.y+map.h14.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h15.x<=pacMan.startX && (map.h15.x+map.h15.width)>pacMan.startX && map.h15.y<=pacMan.startY && (map.h15.y+map.h15.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h16.x<=pacMan.startX && (map.h16.x+map.h16.width)>pacMan.startX && map.h16.y<=pacMan.startY && (map.h16.y+map.h16.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h17.x<=pacMan.startX && (map.h17.x+map.h17.width)>pacMan.startX && map.h17.y<=pacMan.startY && (map.h17.y+map.h17.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h18.x<=pacMan.startX && (map.h18.x+map.h18.width)>pacMan.startX && map.h18.y<=pacMan.startY && (map.h18.y+map.h18.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h19.x<=pacMan.startX && (map.h19.x+map.h19.width)>pacMan.startX && map.h19.y<=pacMan.startY && (map.h19.y+map.h19.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h20.x<=pacMan.startX && (map.h20.x+map.h20.width)>pacMan.startX && map.h20.y<=pacMan.startY && (map.h20.y+map.h20.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h21.x<=pacMan.startX && (map.h21.x+map.h21.width)>pacMan.startX && map.h21.y<=pacMan.startY && (map.h21.y+map.h21.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h22.x<=pacMan.startX && (map.h22.x+map.h22.width)>pacMan.startX && map.h22.y<=pacMan.startY && (map.h22.y+map.h22.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h23.x<=pacMan.startX && (map.h23.x+map.h23.width)>pacMan.startX && map.h23.y<=pacMan.startY && (map.h23.y+map.h23.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h24.x<=pacMan.startX && (map.h24.x+map.h24.width)>pacMan.startX && map.h24.y<=pacMan.startY && (map.h24.y+map.h24.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h25.x<=pacMan.startX && (map.h25.x+map.h25.width)>pacMan.startX && map.h25.y<=pacMan.startY && (map.h25.y+map.h25.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h26.x<=pacMan.startX && (map.h26.x+map.h26.width)>pacMan.startX && map.h26.y<=pacMan.startY && (map.h26.y+map.h26.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h27.x<=pacMan.startX && (map.h27.x+map.h27.width)>pacMan.startX && map.h27.y<=pacMan.startY && (map.h27.y+map.h27.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h28.x<=pacMan.startX && (map.h28.x+map.h28.width)>pacMan.startX && map.h28.y<=pacMan.startY && (map.h28.y+map.h28.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h29.x<=pacMan.startX && (map.h29.x+map.h29.width)>pacMan.startX && map.h29.y<=pacMan.startY && (map.h29.y+map.h29.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h30.x<=pacMan.startX && (map.h30.x+map.h30.width)>pacMan.startX && map.h30.y<=pacMan.startY && (map.h30.y+map.h30.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h31.x<=pacMan.startX && (map.h31.x+map.h31.width)>pacMan.startX && map.h31.y<=pacMan.startY && (map.h31.y+map.h31.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h32.x<=pacMan.startX && (map.h32.x+map.h32.width)>pacMan.startX && map.h32.y<=pacMan.startY && (map.h32.y+map.h32.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h33.x<=pacMan.startX && (map.h33.x+map.h33.width)>pacMan.startX && map.h33.y<=pacMan.startY && (map.h33.y+map.h33.height)>=pacMan.startY+pacMan.heigth) {
            kollision = true;
        }else if(map.h33.x<=pacMan.startX && (map.h33.x+map.h33.width)>pacMan.startX && map.h33.y<=pacMan.startY && (map.h33.y+map.h33.height)>=pacMan.startY+pacMan.heigth) {
        	kollision = true;
        }else if(map.h33.x<=pacMan.startX && (map.h33.x+map.h33.width)>pacMan.startX && map.h33.y<=pacMan.startY && (map.h33.y+map.h33.height)>=pacMan.startY+pacMan.heigth) {
        	kollision = true;
        }else if(map.h33.x<=pacMan.startX && (map.h33.x+map.h33.width)>pacMan.startX && map.h33.y<=pacMan.startY && (map.h33.y+map.h33.height)>=pacMan.startY+pacMan.heigth) {
        	kollision = true;
        }else if(map.h33.x<=pacMan.startX && (map.h33.x+map.h33.width)>pacMan.startX && map.h33.y<=pacMan.startY && (map.h33.y+map.h33.height)>=pacMan.startY+pacMan.heigth) {
        	kollision = true;
        }else {
        	kollision = false;
        }
    }

    public void score() {

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
