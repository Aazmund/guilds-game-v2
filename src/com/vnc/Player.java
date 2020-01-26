package com.vnc;

public class Player {
    private int x;
    private int y;

    public void move(int movement){
        if(x == 0 && y <= 10){
            if (y + movement <= 10){
                y += movement;
            }else{
                x = (y + movement) - 10;
                y = 10;
            }
        }else if(x <= 10 && y == 10){
            if (x + movement <= 10){
                x += movement;
            }else{
                movement -= 10 - x;
                y = 10 - movement;
                x = 10;
            }
        }else if(x == 10 && y <= 10){
            if (y - movement >= 0){
                y -= movement;
            }else{
                movement -= y;
                x = 10 - movement;
                y = 0;
            }
        }else if(x <= 10 && y == 0){
            if (x - movement >= 0){
                x -= movement;
            }else{
                movement -= x;
                y = movement;
                x = 0;
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
