import java.awt.*;

public class Map_Original {

    public static Rectangle_Original[] rect = new Rectangle_Original[30];

    public Map_Original(){

        rect[0] = new Rectangle_Original(50,50,155,105);
        rect[1] = new Rectangle_Original(250,50,305,105);
        rect[2] = new Rectangle_Original(600,8,55,145);
        rect[3] = new Rectangle_Original(700,50,305,105);
        rect[4] = new Rectangle_Original(1050,50,155,105);
        rect[5] = new Rectangle_Original(50,500,155,105);
        rect[6] = new Rectangle_Original(250,500,305,105);
        rect[7] = new Rectangle_Original(600,500,55,150);
        rect[8] = new Rectangle_Original(710,260,30,90);
        rect[9] = new Rectangle_Original(1110,260,30,150);
        rect[10] = new Rectangle_Original(700,500,305,105);
        rect[11] = new Rectangle_Original(1050,500,155,105);
        rect[12] = new Rectangle_Original(50,200,155,155);   //P
        rect[13] = new Rectangle_Original(50,200,55,255);
        rect[14] = new Rectangle_Original(100,250,55,55);
        rect[15] = new Rectangle_Original(250,200,55,255);   //A
        rect[16] = new Rectangle_Original(350,200,55,255);
        rect[17] = new Rectangle_Original(250,200,155,155);
        rect[18] = new Rectangle_Original(300,250,55,55);
        rect[19] = new Rectangle_Original(450,200,55,255);   //C
        rect[20] = new Rectangle_Original(450,200,155,55);
        rect[21] = new Rectangle_Original(450,400,155,55);
        rect[22] = new Rectangle_Original(650,200,55,255);   //M
        rect[23] = new Rectangle_Original(750,200,55,255);
        rect[24] = new Rectangle_Original(850,200,55,255);   //A
        rect[25] = new Rectangle_Original(950,200,55,255);
        rect[26] = new Rectangle_Original(850,200,155,155);
        rect[27] = new Rectangle_Original(900,250,55,55);
        rect[28] = new Rectangle_Original(1050, 200, 55,255); //N
        rect[29] = new Rectangle_Original(1150,200,55,255);

    }

    public void drawMap_Original(Graphics g){

        for(Rectangle_Original r : rect){
            r.drawRectangle_Original(g);
        }

    }
}
