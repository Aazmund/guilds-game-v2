package com.vnc;

import java.util.ArrayList;
import java.util.Random;


public class Main {

    private static String[][] tileMap = {
            {"9", "9", "9", "9", "9", "9", "9", "9", "9", "9", "9"},
            {"9", "*", "*", "9", "9", "9", "9", "9", "*", "*", "9"},
            {"9", "*", "9", "*", "*", "*", "*", "*", "9", "*", "9"},
            {"9", "9", "*", "*", "*", "*", "*", "*", "*", "9", "9"},
            {"9", "9", "*", "*", "*", "*", "*", "*", "*", "9", "9"},
            {"9", "9", "*", "*", "*", "*", "*", "*", "*", "9", "9"},
            {"9", "9", "*", "*", "*", "*", "*", "*", "*", "9", "9"},
            {"9", "9", "*", "*", "*", "*", "*", "*", "*", "9", "9"},
            {"9", "*", "9", "*", "*", "*", "*", "*", "9", "*", "9"},
            {"9", "*", "*", "9", "9", "9", "9", "9", "*", "*", "9"},
            {"9", "9", "9", "9", "9", "9", "9", "9", "9", "9", "9"}
    };

    public static int steps() {
        int min = 1;
        int max = 6;
        int diff = max - min;
        Random random = new Random();
        int i = random.nextInt(diff + 1) + min;
        System.out.println("Выпало: " + i);
        return i;
    }


    public static void main(String[] args) {

        Draw draw = new Draw();
        Player player = new Player();

//        draw.getStartDialog();

        MapGenerator mapGenerator = new MapGenerator();
        mapGenerator.generateMap(tileMap);

        draw.setMap(tileMap);

        draw.setPlayer(player);
        player.getDraw(draw);

        player.setStartPosition();
        player.getCurrentPosition();
        draw.getFrame();

    }

}
