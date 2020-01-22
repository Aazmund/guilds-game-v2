package com.vnc;

import javax.swing.*;

public class Main {

    private static String[][] tileMap = {
            {"7", "9", "9", "9", "9", "c", "9", "9", "9", "9", "7"},
            {"9", "*", "*", "0", "1", "c", "1", "0", "*", "*", "9"},
            {"9", "*", "0", "*", "*", "*", "*", "*", "0", "*", "9"},
            {"9", "0", "*", "*", "*", "*", "*", "*", "*", "0", "9"},
            {"9", "1", "*", "*", "*", "*", "*", "*", "*", "1", "9"},
            {"c", "c", "*", "*", "*", "*", "*", "*", "*", "c", "c"},
            {"9", "1", "*", "*", "*", "*", "*", "*", "*", "1", "9"},
            {"9", "0", "*", "*", "*", "*", "*", "*", "*", "0", "9"},
            {"9", "*", "0", "*", "*", "*", "*", "*", "0", "*", "9"},
            {"9", "*", "*", "0", "1", "c", "1", "0", "*", "*", "9"},
            {"7", "9", "9", "9", "9", "c", "9", "9", "9", "9", "7"}
    };

    public static void main(String[] args) {
//        JFrame jFrame = new JFrame("Guilds game");
//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jFrame.setSize(800, 600);
//        jFrame.setVisible(true);

        MapGenerator mapGenerator = new MapGenerator(tileMap);

        for (int i = 0; i < 11; i++){
            for (int j = 0; j < 11; j++){
                System.out.print(tileMap[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
