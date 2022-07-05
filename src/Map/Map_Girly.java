package Map;

import java.awt.*;

public class Map_Girly {

    public static Rectangle_Girly[] rect = new Rectangle_Girly[53];


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
        rect[18] = new Rectangle_Girly(200,200,55,255);
        rect[19] = new Rectangle_Girly(200,200,155,55);
        rect[20] = new Rectangle_Girly(200,400,155,55);
        rect[21] = new Rectangle_Girly(300,300,55,155);
        rect[22] = new Rectangle_Girly(400,200,55,255);
        rect[23] = new Rectangle_Girly(500,200,155,155);
        rect[24] = new Rectangle_Girly(500,200,55,255);
        rect[25] = new Rectangle_Girly(550,250,55,55);
        rect[26] = new Rectangle_Girly(615,415,40,40);
        rect[27] = new Rectangle_Girly(700,200,55,255);
        rect[28] = new Rectangle_Girly(700,400,155,55);
        rect[29] = new Rectangle_Girly(850,300,155,55);
        rect[30] = new Rectangle_Girly(850,200,55,155);
        rect[31] = new Rectangle_Girly(950,200,55,155);
        rect[32] = new Rectangle_Girly(500,6,55,149);
        rect[33] = new Rectangle_Girly(700,500,55,150);
        rect[34] = new Rectangle_Girly(700,100,105,55);
        rect[35] = new Rectangle_Girly(700, 500, 105, 55);
        rect[36] = new Rectangle_Girly(1100, 150, 105, 55);
        rect[37] = new Rectangle_Girly(1100, 150, 55, 155);
        rect[38] = new Rectangle_Girly(1100, 450, 105, 55);
        rect[39] = new Rectangle_Girly(1100, 350, 55, 155);
        rect[40] = new Rectangle_Girly(150, 50, 255, 55);
        rect[41] = new Rectangle_Girly(850, 50, 255, 55);
        rect[42] = new Rectangle_Girly(150, 550, 255, 55);
        rect[43] = new Rectangle_Girly(850, 550, 255, 55);
        rect[44] = new Rectangle_Girly(700, 6, 49, 148);
        rect[45] = new Rectangle_Girly(900, 300, 55, 155);
        rect[46] = new Rectangle_Girly(1000, 400, 55, 55);
        rect[47] = new Rectangle_Girly(250, 50, 55, 105);
        rect[48] = new Rectangle_Girly(950, 50, 55, 105);
        rect[49] = new Rectangle_Girly(250, 500, 55, 105);
        rect[50] = new Rectangle_Girly(950, 500, 55, 105);
        rect[51] = new Rectangle_Girly(560,360,90,45);
        rect[52] = new Rectangle_Girly(560,410,45,45);
    }

    public void drawMap_Girly(Graphics g){

        for(Rectangle_Girly r : rect){
            r.drawRectangle_Girly(g);
        }


    }
}
