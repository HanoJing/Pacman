package Player;

import GUI.GUI_Original;
import Map.Map_Original;
import Map.Rectangle_Original;
import Screen.Gamescreen_Original;
import Util.Keyboard;
import Util.Util;

import java.awt.*;
public class Player_Original {
	public Frame f = GUI_Original.f;
	public static int startX;
	public static int startY;
	public static int heigth;
	public int width;
	public int startAngle;
	public int arcAngle;
	public Color farbe;
	public boolean moveFigur = false;


	public Player_Original(int startX, int startY, int width, int heigth, int startAngle, int arcAngle, Color farbe) {

		this.startX = startX;
		this.startY = startY;
		this.width = width;
		this.heigth = heigth;
		this.startAngle = startAngle;
		this.arcAngle = 360;
		this.farbe = farbe;

	}

	public void drawSpielfigur(Graphics g) {

		g.setColor(farbe);
		g.fillArc(15, 670, width, heigth, 380, 300);
		g.fillArc(55, 670, width, heigth, 380, 300);
		g.fillArc(95, 670, width, heigth, 380, 300);

	}

	public void showSpielfigur(Graphics g) {

		g.setColor(farbe);
		g.fillArc(startX, startY, width, heigth, startAngle, arcAngle);

		g.setColor(Color.BLACK);
		if (moveFigur) {
			g.fillRect(95, 670, width, heigth);
		}
	}

	public void moveSpielfigur() {

		while (true){
			if (Keyboard.upPressed && startY >= 30) {
					moveFigur = true;
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
				moveFigur = true;
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
				moveFigur = true;
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
				moveFigur = true;
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

