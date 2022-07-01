package Util;

import Map.Rectangle_Girly;
import Map.Rectangle_Original;
import Player.Player_Girly;
import Player.Player_Original;

public class Util {


    public static boolean checkKollision(Rectangle_Original rect, Player_Original pacMan) {

        if(rect.x<=pacMan.startX && (rect.x+rect.width)>pacMan.startX && rect.y<=pacMan.startY && (rect.y+rect.height)>=pacMan.startY+pacMan.heigth) {
            return true;
        }else {
            return false;
        }

    }
    public static boolean checkKollision_Girly(Rectangle_Girly rect, Player_Girly pacMan){

        if(rect.x<=pacMan.startX && (rect.x+rect.width)>pacMan.startX && rect.y<=pacMan.startY && (rect.y+rect.height)>=pacMan.startY+pacMan.heigth) {
            return true;
        }else {
            return false;
        }
    }

    public static void sleep(){
        try {
            Thread.sleep(200);
        } catch (InterruptedException e) {
            e.printStackTrace();

        }
    }
}
