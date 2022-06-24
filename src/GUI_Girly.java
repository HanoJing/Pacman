
public class GUI_Girly {
    private Frame f;
    private Gamescreen_Girly painting;
    public GUI_Girly() {

        f = new Frame("PacMan - Mrs.PacMan", -1, -1, 1366, 768);
        this.painting = new Gamescreen_Girly(f);
        f.getContentPane().add(this.painting);
        f.setupFrame();

        Thread t1 = new Thread(this::printUpPressed);
        t1.start();


    }

    public void printUpPressed(){
        while(true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            System.out.println("upPressed: " + Keyboard.upPressed);
            System.out.println("twoPressed: " + Keyboard.twoPressed);
        }
    }
}
