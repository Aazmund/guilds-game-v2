package com.vnc;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    private static String[][] tileMap = {
            {"7", "9", "9", "9", "9", "1", "9", "9", "9", "9", "7"},
            {"9", "*", "*", "0", "0", "1", "1", "1", "*", "*", "9"},
            {"9", "*", "0", "*", "*", "*", "*", "*", "0", "*", "9"},
            {"9", "1", "*", "*", "*", "*", "*", "*", "*", "0", "9"},
            {"9", "1", "*", "*", "*", "*", "*", "*", "*", "0", "9"},
            {"1", "1", "*", "*", "*", "*", "*", "*", "*", "1", "1"},
            {"9", "0", "*", "*", "*", "*", "*", "*", "*", "1", "9"},
            {"9", "0", "*", "*", "*", "*", "*", "*", "*", "1", "9"},
            {"9", "*", "0", "*", "*", "*", "*", "*", "0", "*", "9"},
            {"9", "*", "*", "1", "1", "1", "0", "0", "*", "*", "9"},
            {"7", "9", "9", "9", "9", "1", "9", "9", "9", "9", "7"}
    };

    public static void main(String[] args) {
//        JFrame jFrame = new JFrame("Guilds game");
//        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        jFrame.setSize(800, 600);
//        jFrame.setVisible(true);

        MapGenerator mapGenerator = new MapGenerator();
        mapGenerator.generateMap(tileMap);

        Player player = new Player();

        int choice;
        int movement = 0;
        Scanner sc = new Scanner(System.in);
        player.setStartPosition();
        while (true){
            System.out.println("1 - задать ход");
            System.out.println("0 - выход");
            choice = sc.nextInt();
            if (choice == 1) {
                System.out.print("Введи ход: ");
                movement = sc.nextInt();
                player.move(movement);
                player.getCurrentPosition();
            }else{
                break;
            }
        }


//        for (int i = 0; i < 11; i++){
//            for (int j = 0; j < 11; j++){
//                System.out.print(tileMap[i][j] + "  ");
//            }
//            System.out.println();
//        }
    }
}
