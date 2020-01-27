package com.vnc;

public class Pair {
    private int x;
    private int y;

    public void makePair(int firstChild, int secondChild){
        x = firstChild;
        y = secondChild;
    }

    public void print(){
        System.out.println(x + " " + y);
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
