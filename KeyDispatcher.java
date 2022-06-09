import java.awt.event.*;
import java.awt.*;

public class KeyDispatcher implements KeyEventDispatcher {

	public static boolean upPressed;
	public static boolean leftPressed;
	public static boolean downPressed;
	public static boolean rightPressed;
	
	private Frame f;
	private Gamescreen gs;
	private int keyCode;
	private int keyID;
	
	
	public KeyDispatcher(Frame f, Gamescreen gs) {
		this.f = f;
		this.gs = gs;
	}
	

	public boolean dispatchKeyEvent(KeyEvent e) {
		this.keyCode = e.getKeyCode();
		this.keyID = e.getID();
		
		if(this.keyID == KeyEvent.KEY_PRESSED) {
			
			if(this.keyCode == KeyEvent.VK_W || this.keyCode == KeyEvent.VK_UP) {
				upPressed = true;
				this.gs.getPacMan().moveSpielfigur();
				gs.checkKollision();
				if(gs.kollision == false) {
					this.f.repaint();
				}else {
					this.gs.getPacMan().startY+=50;
				}		
				upPressed = false;
			}
			if(this.keyCode == KeyEvent.VK_A || this.keyCode== KeyEvent.VK_LEFT) {
				leftPressed = true;
				this.gs.getPacMan().moveSpielfigur();
				gs.checkKollision();
				if(gs.kollision == false) {
					this.f.repaint();
				}else {
					this.gs.getPacMan().startX+=50;
				}	
				leftPressed = false;
			}
			if(this.keyCode == KeyEvent.VK_S || this.keyCode == KeyEvent.VK_DOWN) {
				downPressed = true;
				this.gs.getPacMan().moveSpielfigur();
				gs.checkKollision();
				if(gs.kollision == false) {
					this.f.repaint();
				}else {
					this.gs.getPacMan().startY-=50;
				}
				downPressed = false;
			}
			if(this.keyCode == KeyEvent.VK_D || this.keyCode == KeyEvent.VK_RIGHT) {
				rightPressed = true;
				this.gs.getPacMan().moveSpielfigur();
				gs.checkKollision();
				if(gs.kollision == false) {
					this.f.repaint();
				}else {
					this.gs.getPacMan().startX-=50;
				}	
				rightPressed = false;
			}
		}
		
		return true;
	}

}
	


