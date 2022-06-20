import java.awt.event.*;
import java.awt.*;

public class KeyDispatcher2 implements KeyEventDispatcher{

    public static boolean upPressed;
    public static boolean leftPressed;
    public static boolean downPressed;
    public static boolean rightPressed;
    public static boolean spacePressed;
    public static boolean enterPressed;

    private Frame f2;
    private Gamescreen2 gs2;
    private int keyCode2;
    private int keyID2;


    public KeyDispatcher2(Frame f2, Gamescreen2 gs2) {
        this.f2 = f2;
        this.gs2 = gs2;
    }


    public boolean dispatchKeyEvent(KeyEvent e) {
        this.keyCode2 = e.getKeyCode();
        this.keyID2 = e.getID();



        if(this.keyID2 == KeyEvent.KEY_PRESSED){

            if(this.keyCode2 == KeyEvent.VK_W || this.keyCode2 == KeyEvent.VK_UP) {
                upPressed = true;
                this.gs2.getPacMan().moveSpielfigur2();
                gs2.checkKollision();gs2.score2();
                if(gs2.kollision == false) {
                    f2.repaint();
                }else {
                    this.gs2.getPacMan().startY+=50;
                }
                upPressed = false;
            }
            if(this.keyCode2 == KeyEvent.VK_A || this.keyCode2== KeyEvent.VK_LEFT) {
                leftPressed = true;
                this.gs2.getPacMan().moveSpielfigur2();
                gs2.checkKollision();gs2.score2();
                if(gs2.kollision == false) {
                    f2.repaint();
                }else {
                    this.gs2.getPacMan().startX+=50;
                }
                leftPressed = false;
            }
            if(this.keyCode2 == KeyEvent.VK_S || this.keyCode2 == KeyEvent.VK_DOWN) {
                downPressed = true;
                this.gs2.getPacMan().moveSpielfigur2();
                gs2.checkKollision();gs2.score2();
                if(gs2.kollision == false) {
                    f2.repaint();
                }else {
                    this.gs2.getPacMan().startY-=50;
                }
                downPressed = false;
            }
            if(this.keyCode2 == KeyEvent.VK_D || this.keyCode2 == KeyEvent.VK_RIGHT) {
                rightPressed = true;
                this.gs2.getPacMan().moveSpielfigur2();
                gs2.checkKollision();gs2.score2();
                if(gs2.kollision == false) {
                    f2.repaint();
                }else {
                    this.gs2.getPacMan().startX-=50;
                }
                rightPressed = false;
            }
            if(this.keyCode2 == KeyEvent.VK_SPACE) {
                spacePressed = true;
                f2.repaint();
            }
            if(this.keyCode2 == KeyEvent.VK_ENTER) {
                enterPressed = true;
                f2.repaint();
            }
        }
        return true;
    }
}
