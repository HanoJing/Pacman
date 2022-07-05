package Screen;

import javax.swing.*;
import java.awt.*;

import GUI.GUI_Menu;
import Map.Map_Original;
import Map.Dots;
import Map.Icons;
import Player.Player_Original;
import Util.Keyboard;

public class Gamescreen_Original extends JPanel {
	private static Player_Original pacMan;
	private Map_Original map;
	private Dots dots;
	private Icons cherry;
	private Icons strawberry;
	private Icons scoreLettering;

	public int score = 0;
	public boolean hit = false;


	public Gamescreen_Original() {


		map = new Map_Original();
		dots = new Dots();
		cherry = new Icons();
		strawberry = new Icons();
		scoreLettering = new Icons();

		pacMan = new Player_Original(613, 313, 30, 30, 380, 360, Color.YELLOW);
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);

		setBackground(Color.BLACK);


		dots.drawDots(g);
		map.drawMap_Original(g);

		g.setColor(Color.WHITE);
		g.drawString(" " + score, 670, 690);

		pacMan.drawPlayer(g);
		pacMan.showPlayer(g);

		cherry.drawCherry(g);
		strawberry.drawStrawberry(g);
		scoreLettering.drawScoreLettering(g);
	}


	public static Player_Original getPacMan() {
		return pacMan;
	}


/*
    public void score() {
      	    
    	for(int j = 1; j < dots.yW.length-1; j++) {
    		for(int i = 1; i < dots.xW.length-1; i++) {
    			if(pacMan.startY < dots.yW[j] && pacMan.startY < dots.yW[j+1] && pacMan.startY > dots.yW[j-1] && pacMan.startX < dots.xW[i] && pacMan.startX < dots.xW[i+1] && pacMan.startX > dots.xW[i-1]) {
    				score+=10;
      				hit = true;

    			}
    		}
    	}
    }*/

	public static void chooseMap3() {
		while (true) {

			if (Keyboard.spacePressed) {
				new GUI_Menu();
				break;
			}

			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				e.printStackTrace();

			}
		}
	}
}
