import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {
    public static boolean upPressed, leftPressed, downPressed, rightPressed, spacePressed, enterPressed;

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyChar()){
            case 'w' -> upPressed = true;
            case 'a' -> leftPressed = false;
            //TODO: andere Tasten ergänzen

        }

    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch(e.getKeyChar()){
            case 'w' -> upPressed = false;
            case 'a' -> leftPressed = false;

        }

    }
}
