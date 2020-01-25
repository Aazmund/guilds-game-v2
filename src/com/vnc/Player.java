package com.vnc;

public class Player {
    private int x;
    private int y;

    public void move(int movement){
        if(x == 0 && y <= 10){
            if (y + movement < 10){
                y += movement;
            }else{
                x = (y + movement) - 10;
                y = 10;
            }
        }
    }

    public void setStartPosition(){
        this.x = 0;
        this.y = 0;
    }

    public void getCurrentPosition(){
        x++;
        y++;
        System.out.println("x "+ x);
        System.out.println("y "+y);
        x--;
        y--;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
