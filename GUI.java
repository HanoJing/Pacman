import java.awt.*;
import java.util.Scanner;

public class GUI {

    private Frame f;
    private Lobby painting;


    public GUI() {

        f = new Frame("PacMan - Lobby", -1, -1, 1275, 740);
        this.painting = new Lobby(f);
        f.getContentPane().add(this.painting);
        f.setupFrame();

        System.out.println("Map Nr.:");
        Scanner s = new Scanner(System.in);
        int i = 0;

        for(i = 0; i < 3 ; i++){
            int help = s.nextInt();

            if (help == 1) {
                new GUI2();
            } else if (help == 2) {
                new GUI3();
            } else if (help == 0){
                new GUI();
            }
        }


    }
}