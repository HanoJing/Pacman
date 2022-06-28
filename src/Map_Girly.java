import java.awt.*;

public class Map_Girly {

    public static Rectangle_Girly[] rect = new Rectangle_Girly[37];


    public Map_Girly(){

        rect[0] = new Rectangle_Girly(6,50,105,55);
        rect[1] = new Rectangle_Girly(6,550,105,55);
        rect[2] = new Rectangle_Girly(6,250,55,55);
        rect[3] = new Rectangle_Girly(6,350,55,55);
        rect[4] = new Rectangle_Girly(1148,50,103,55);
        rect[5] = new Rectangle_Girly(1148,550,103,55);
        rect[6] = new Rectangle_Girly(1198,250,53,55);
        rect[7] = new Rectangle_Girly(1198,350,53,55);
        rect[8] = new Rectangle_Girly(600,50,55,105);
        rect[9] = new Rectangle_Girly(600,500,55,105);
        rect[10] = new Rectangle_Girly(50,150,105,55);
        rect[11] = new Rectangle_Girly(100,150,55,155);
        rect[12] = new Rectangle_Girly(50,450,105,55);
        rect[13] = new Rectangle_Girly(100,350,55,155);
        rect[14] = new Rectangle_Girly(500,500,55,150);
        rect[15] = new Rectangle_Girly(450,500,105,55);
        rect[16] = new Rectangle_Girly(500,6,55,149);
        rect[17] = new Rectangle_Girly(450,100,105,55);
        rect[18] = new Rectangle_Girly(350,200,55,255);    //M
        rect[19] = new Rectangle_Girly(450,200,55,255);
        rect[20] = new Rectangle_Girly(550,200,155,155);   //R
        rect[21] = new Rectangle_Girly(550,200,55,255);
        rect[22] = new Rectangle_Girly(600,250,55,55);
        rect[23] = new Rectangle_Girly(665,415,40,40);
        rect[24] = new Rectangle_Girly(750,200,55,155);    //S
        rect[25] = new Rectangle_Girly(850,300,55,155);
        rect[26] = new Rectangle_Girly(750,300,155,55);
        rect[27] = new Rectangle_Girly(750,200,155,55);
        rect[28] = new Rectangle_Girly(750,400,155,55);
        rect[29] = new Rectangle_Girly(700,6,55,149);      //...
        rect[30] = new Rectangle_Girly(700,500,55,150);
        rect[31] = new Rectangle_Girly(700,100,105,55);
        rect[32] = new Rectangle_Girly(700,500,105,55);
        rect[33] = new Rectangle_Girly(1100,150,105,55);
        rect[34] = new Rectangle_Girly(1100,150,55,155);
        rect[35] = new Rectangle_Girly(1100,450,105,55);
        rect[36] = new Rectangle_Girly(1100,350,55,155);
    }

    public void drawMap_Girly(Graphics g){

        for(Rectangle_Girly r : rect){
            r.drawRectangle_Girly(g);
        }


    }
}
