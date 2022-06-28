public class Util {


    public static boolean checkKollision(Rectangle_Original rect, Spielfigur_Original pacMan) {

        if(rect.x<=pacMan.startX && (rect.x+rect.width)>pacMan.startX && rect.y<=pacMan.startY && (rect.y+rect.height)>=pacMan.startY+pacMan.heigth) {
            return true;
        }else {
            return false;
        }

    }
    public static boolean checkKollision_Girly(Rectangle_Girly rect, Spielfigur_Girly pacMan){

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
