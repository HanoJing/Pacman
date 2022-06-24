/*
import java.awt.event.*;
import java.awt.*;
public class KeyDispatcher_Lobby implements KeyEventDispatcher {

    public static boolean nullPressed;
    public static boolean onePressed;
    public static boolean twoPressed;
    public static boolean threePressed;

    private Lobby l;
    private int keyCode;
    private int keyID;

    public KeyDispatcher_Lobby(Lobby l) {
         this.l = l;
    }

    public boolean dispatchKeyEvent(KeyEvent e) {
        this.keyCode = e.getKeyCode();
        this.keyID = e.getID();

        if (this.keyID == KeyEvent.KEY_PRESSED) {

            if (this.keyCode == KeyEvent.VK_0) {
                nullPressed = true;
                l.chooseMap();
                nullPressed = false;
            }
            if (this.keyCode == KeyEvent.VK_1) {
                onePressed = true;
                l.chooseMap();
                onePressed = false;
            }
            if (this.keyCode == KeyEvent.VK_2) {
                twoPressed = true;
                l.chooseMap();
                twoPressed = false;
            }
            if (this.keyCode == KeyEvent.VK_3) {
                threePressed = true;
                l.chooseMap();
                threePressed = false;
            }
        }
        return true;
    }
}

 */
