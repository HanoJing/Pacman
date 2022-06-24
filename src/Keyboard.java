import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Keyboard implements KeyListener {
    public static boolean upPressed, leftPressed, downPressed, rightPressed, spacePressed, enterPressed, nullPressed, onePressed, twoPressed, threePressed;

    static Keyboard instance;
    private Keyboard(){ //Singleton Pattern

    }

    public static Keyboard getInstance(){
        if(instance == null){
            instance = new Keyboard();
        }
        return instance;
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_W, KeyEvent.VK_UP -> upPressed = true;
            case KeyEvent.VK_A, KeyEvent.VK_LEFT -> leftPressed = true;
            case KeyEvent.VK_D, KeyEvent.VK_RIGHT -> rightPressed = true;
            case KeyEvent.VK_S, KeyEvent.VK_DOWN -> downPressed = true;
            case KeyEvent.VK_SPACE -> spacePressed = true;
            case KeyEvent.VK_ENTER -> enterPressed = true;
            case KeyEvent.VK_0 -> nullPressed = true;
            case KeyEvent.VK_1 -> onePressed = true;
            case KeyEvent.VK_2 -> twoPressed = true;
            case KeyEvent.VK_3 -> threePressed = true;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        switch(e.getKeyCode()){
            case KeyEvent.VK_W, KeyEvent.VK_UP -> upPressed = false;
            case KeyEvent.VK_A, KeyEvent.VK_LEFT -> leftPressed = false;
            case KeyEvent.VK_D, KeyEvent.VK_RIGHT -> rightPressed = false;
            case KeyEvent.VK_S, KeyEvent.VK_DOWN -> downPressed = false;
            case KeyEvent.VK_SPACE -> spacePressed = false;
            case KeyEvent.VK_ENTER -> enterPressed = false;
            case KeyEvent.VK_0 -> nullPressed = false;
            case KeyEvent.VK_1 -> onePressed = false;
            case KeyEvent.VK_2 -> twoPressed = false;
            case KeyEvent.VK_3 -> threePressed = false;
        }

    }
}
