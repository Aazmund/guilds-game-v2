package com.vnc;

import javax.swing.*;
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



//    public void configurator(int num){
//        System.out.println("я принял цифру" + num);
//        for (int i = 0; i < num; i++){
//            Player player = new Player();
//            player.setStartPosition();
//            players.add(player);
//            System.out.println("я создал игрока");
//        }
//    }

    private static short[] skills = {1,2,3,4,5,6,7,8,9,10,11,12};

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
        ArrayList<Player> players = new ArrayList<>();

        Draw draw = new Draw();
        Player player = new Player();
        draw.getStartDialog();
        MapGenerator mapGenerator = new MapGenerator();
        mapGenerator.generateMap(tileMap);
        draw.setMap(tileMap);
//        draw.setPlayer(player);
//        player.getDraw(draw);
//        player.setStartPosition();
//        player.getCurrentPosition();

        draw.getFrame();
        for (int i = 0; i < draw.getPlayerCount(); i++){
            players.add(new Player());
        }
        int counter = 0;
        boolean end = true;
        while(true){
            if (counter == draw.getPlayerCount()){
                counter = 0;
            }else{
                System.out.println("Ходит игрок: " + (counter+1));
                draw.setPlayerName(new String("Player"+(counter+1)));
                draw.setPlayerGold(new String("Золото: "+((counter+1)*20)));
                draw.setPlayerSheep(new String("Овцы: "+(counter+3)));
                draw.setPlayerLog(new String("Брёвна: "+(counter+2)));
                CubeDialog cubeDialog = new CubeDialog();
                int step = cubeDialog.getStep();
                draw.setActionlabel(new String("Кубик выпал со стороной: " + step));
                System.out.println("Количество шагов " + step);
                players.get(counter).move(step);
                counter++;


                while (end){
                    end = draw.getEnd();
                    int buf = 0;
                    while(buf < 1000000){
                        buf++;
                    }
                }
                end = true;
                draw.setEnd(true);
            }
        }

//        for (int i = 0; i < players.size(); i++){
//            players.get(i).configurator(5);
//        }

    }

}
