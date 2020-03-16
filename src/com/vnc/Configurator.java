package com.vnc;

import java.util.ArrayList;

public class Configurator {
    private int num;
    private ArrayList<Player> players = new ArrayList<>();

    private void createList(){
        for (int i = 0; i < num; i ++){
            Player player = new Player();
            player.setStartPosition();
            players.add(player);
        }
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
        createList();
    }

    public Player getByIndex(int index){
        return players.get(index);
    }
}
