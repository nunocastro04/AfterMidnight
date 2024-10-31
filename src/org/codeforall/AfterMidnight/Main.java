package org.codeforall.AfterMidnight;

import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.codeforall.AfterMidnight.Enemies.MainChar;
import org.codeforall.AfterMidnight.Game.Game;
import org.codeforall.AfterMidnight.Game.MainMenu;
import org.codeforall.AfterMidnight.MovementHandler.MyKeyboardHandler;
import org.codeforall.AfterMidnight.MovementHandler.MyMouseHandler;
import org.codeforall.AfterMidnight.Objects.Flashlight;
import org.codeforall.AfterMidnight.Objects.door.Door;
import org.codeforall.AfterMidnight.Objects.flash.Flash;


public class Main {
    public static void main(String[] args) {
        Canvas.setMaxY(1920);
        Canvas.setMaxY(1080);
        Game AM =  new Game();
        MainMenu menu = new MainMenu();
        Flashlight flashlight = new Flashlight();
        Flash flash = new Flash();
        Door door = new Door();
        MainChar TZ = new MainChar();
        new MyMouseHandler();
        new MyKeyboardHandler(flashlight, flash, TZ, door);
        menu.drawback();
        AM.run();






    }
}


