package Screen;

import GUI.GUI_Menu;
import Util.Keyboard;
import GUI.GUI_Girly;
import GUI.GUI_Original;
import javax.swing.*;
import java.awt.*;

public class Menu extends JPanel {
    JPanel p2;
    public Menu() {

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        setBackground(Color.BLACK);

        g.setColor(Color.white);
        g.drawString("Zwischenlobby...!", 560, 400);

        g.drawRoundRect(2, 2, 1253, 653, 10, 10);   //map border
        g.drawRoundRect(10, 10, 1237, 637, 10, 10); //map border

    }

    }

