import java.awt.*;
import javax.swing.*;

public class Lobby extends JPanel {

	private KeyboardFocusManager manager;

    public Lobby(Frame f) {

        this.manager = KeyboardFocusManager.getCurrentKeyboardFocusManager();
        this.manager.addKeyEventDispatcher(new KeyDispatcher_Lobby(f, this));
    }

        public void paintComponent (Graphics g){
            super.paintComponent(g);

            setBackground(Color.BLACK);

            g.setColor(Color.YELLOW);
            g.drawRoundRect(530, 325, 230, 40, 10, 10);
            g.drawString("WILLKOMMEN IN DER LOBBY!!!", 550, 350);

            g.setColor(Color.white);
            g.drawString("Gebe in die Konsole 1 ein, um die erste Map zu oeffnen oder 2 um die zweite Map zu oeffnen!", 350, 400);
            g.drawString("Um zurueck in die Lobby zu kommen, gebe 0 in die Konsole ein!", 450, 425);

        }

        public void chooseMap(){

            if(KeyDispatcher_Lobby.nullPressed == true){
                new GUI_Lobby();
            }else if(KeyDispatcher_Lobby.onePressed == true){
                new GUI_Original();
            }else if(KeyDispatcher_Lobby.twoPressed == true){
                new GUI_Girly();
            }else if(KeyDispatcher_Lobby.threePressed == true) {
                System.out.println("Diese MAp exestiert noch nicht!");
            }
        }
}
