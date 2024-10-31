package org.codeforall.AfterMidnight.Game;

import org.academiadecodigo.simplegraphics.pictures.Picture;


public class Game {

    public static boolean outOfMenu = false;

    private static String path;

    public static String lastImg;

    public static Picture back;

    public static final String PREFIX = "" ;

    public void run() {
    }

    public static void draw(int X, int Y, String caminho){
        lastImg = path;
        path = caminho;
        back = new Picture(X, Y, path);
        back.draw();
    }


    public static void delete(){
        back.delete();
    }


}
