import java.awt.event.*;
import java.awt.*;

public class KeyDispatcher_Original implements KeyEventDispatcher {

	public static boolean upPressed;
	public static boolean leftPressed;
	public static boolean downPressed;
	public static boolean rightPressed;
	public static boolean spacePressed;
	public static boolean enterPressed;
	
	private Frame f;
	private Gamescreen_Original gs;
	private int keyCode;
	private int keyID;
	
	
	public KeyDispatcher_Original(Frame f, Gamescreen_Original gs) {
		this.f = f;
		this.gs = gs;
	}
	

	public boolean dispatchKeyEvent(KeyEvent e) {
		this.keyCode = e.getKeyCode();
		this.keyID = e.getID();


		
		if(this.keyID == KeyEvent.KEY_PRESSED){
			
			if(this.keyCode == KeyEvent.VK_W || this.keyCode == KeyEvent.VK_UP) {
				upPressed = true;
				this.gs.getPacMan().moveSpielfigur();
				gs.checkKollision();gs.score();
				if(gs.kollision == false) {
					f.repaint();
				}else {
					this.gs.getPacMan().startY+=50;
				}
				upPressed = false;
			}
			if(this.keyCode == KeyEvent.VK_A || this.keyCode== KeyEvent.VK_LEFT) {
				leftPressed = true;
				this.gs.getPacMan().moveSpielfigur();
				gs.checkKollision();gs.score();
				if(gs.kollision == false) {
					f.repaint();
				}else {
					this.gs.getPacMan().startX+=50;
				}	
				leftPressed = false;
			}
			if(this.keyCode == KeyEvent.VK_S || this.keyCode == KeyEvent.VK_DOWN) {
				downPressed = true;
				this.gs.getPacMan().moveSpielfigur();
				gs.checkKollision();gs.score();
				if(gs.kollision == false) {
					f.repaint();
				}else {
					this.gs.getPacMan().startY-=50;
				}
				downPressed = false;
			}
			if(this.keyCode == KeyEvent.VK_D || this.keyCode == KeyEvent.VK_RIGHT) {
				rightPressed = true;
				this.gs.getPacMan().moveSpielfigur();
				gs.checkKollision();gs.score();
				if(gs.kollision == false) {
					f.repaint();
				}else {
					this.gs.getPacMan().startX-=50;
				}	
				rightPressed = false;
			}
			if(this.keyCode == KeyEvent.VK_SPACE) {
				spacePressed = true;
				gs.initGame();
				f.repaint();
			}
			if(this.keyCode == KeyEvent.VK_ENTER) {
				enterPressed = true;
				gs.initGame();
				f.repaint();
			}
		}
		return true;
	}
}
