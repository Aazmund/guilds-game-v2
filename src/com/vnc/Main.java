package com.vnc;

import java.util.ArrayList;
import java.util.Scanner;

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

    private static ArrayList<Player> players = new ArrayList<>();
    private static short[] skills = {1,2,3,4,5,6,7,8,9,10,11,12};

    private static void configuration(){

        MapGenerator mapGenerator = new MapGenerator();
        mapGenerator.generateMap(tileMap);

        for(int i = 11; i > 0; i--){
            int j = (int) (Math.random() * (i + 1));
            short buf = skills[i];
            skills[i] = skills[j];
            skills[j] = buf;
        }
        System.out.println("Введите количество игроков");
        Scanner sc = new Scanner(System.in);
        int player_count = sc.nextInt();
        for (int i = 0; i < player_count; i++){
            Player player = new Player();
            players.add(player);
            switch (skills[i]){
                case(1):
                    player.setGold(150);
                    player.setForest(2);
                    player.setSheep(2);
                    break;
                case(2):
                    player.setGold(210);
                    player.setForest(2);
                    player.setSheep(2);
                    break;
                case(3):
                    player.setGold(50);
                    player.setForest(2);
                    player.setSheep(2);
                    break;
                case(4):
                    player.setGold(150);
                    player.setForest(2);
                    player.setSheep(2);
                    break;
                case(5):
                    player.setGold(150);
                    player.setForest(2);
                    player.setSheep(2);
                    break;
                case(6):
                    player.setGold(150);
                    player.setForest(2);
                    player.setSheep(2);
                    break;
                case(7):
                    player.setGold(150);
                    player.setForest(2);
                    player.setSheep(3);
                    break;
                case(8):
                    player.setGold(300);
                    player.setForest(1);
                    player.setSheep(1);
                    break;
                case(9):
                    player.setGold(150);
                    player.setForest(2);
                    player.setSheep(2);
                    break;
                case(10):
                    player.setGold(150);
                    player.setForest(2);
                    player.setSheep(2);
                    break;
                case(11):
                    player.setGold(150);
                    player.setForest(1);
                    player.setSheep(1);
                    player.setHorse(1);
                    break;
                case(12):
                    player.setGold(100);
                    player.setForest(2);
                    player.setSheep(2);
                    break;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        configuration();

        int choice;
        int movement = 0;

//        player.setStartPosition();
//        while (true){
//            System.out.println("1 - задать ход");
//            System.out.println("0 - выход");
//            choice = sc.nextInt();
//            if (choice == 1) {
//                System.out.print("Введи ход: ");
//                movement = sc.nextInt();
//                player.move(movement);
//                player.getCurrentPosition();
//            }else{
//                break;
//            }
//        }


        for (int i = 0; i < 11; i++){
            for (int j = 0; j < 11; j++){
                System.out.print(tileMap[i][j] + "  ");
            }
            System.out.println();
        }
    }
}
