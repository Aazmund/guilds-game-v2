package com.vnc;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private int x;
    private int y;
    private int index;
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Pair> innerPairs= new ArrayList<>();
    private ArrayList<Pair> outerPairs= new ArrayList<>();

    public Player(){
        short[] innerList = {1,5,1,6,1,7,2,8,3,9,4,9,5,9,6,9,7,9,8,8,9,7,9,6,9,5,9,4,9,3,8,2,7,1,6,1,5,1,4,1,3,1,2,2,1,3,1,4,1,5};
        short[] outerList = {0,1,0,2,0,3,0,4,0,5,0,6,0,7,0,8,0,9,0,10,1,10,2,10,3,10,4,10,5,10,6,10,7,10,8,10,9,10,10,10,10,9,10,8,10,7,10,6,10,5,10,4,10,3,10,2,10,1,10,0,9,0,8,0,7,0,6,0,5,0,4,0,3,0,2,0,1,0};
        for (int i = 0; i < 47; i++){
            Pair pair = new Pair();
            pair.makePair(innerList[i], innerList[i+1]);
            innerPairs.add(pair);
            i += 1;
        }

        for(int i = 0; i < 39; i++){
            Pair pair = new Pair();
            pair.makePair(outerList[i], outerList[i+1]);
            outerPairs.add(pair);
            i += 1;
        }
    }

    private void moveOnOuterCircle(int param, int movement){
        searchOuterIndex();
        switch (param){
            case(1):
                if(y + movement > 5 && y < 6){
                    System.out.println("Перейти на другой круг?");
                    System.out.println("1 - yes");
                    System.out.println("2 - no");
                    int answer = sc.nextInt();
                    switch (answer){
                        case(1):
                            movement -= 5 - index - 1;
                            x = 1;
                            y = 5;
                            moveOnInnerCircle(5, movement);
                            break;

                        case(2):
                            x = outerPairs.get(index + movement).getX();
                            y = outerPairs.get(index + movement).getY();
                            break;
                    }
                }else{
                    x = outerPairs.get(index + movement).getX();
                    y = outerPairs.get(index + movement).getY();
                }
                break;
            case(2):
                if(x + movement > 5 && x < 6){
                    System.out.println("Перейти на другой круг?");
                    System.out.println("1 - yes");
                    System.out.println("2 - no");
                    int answer = sc.nextInt();
                    switch (answer){
                        case(1):
                            movement -= 5 -index -1;
                            x = 5;
                            y = 9;
                            moveOnInnerCircle(6, movement);
                        case(2):
                            x = outerPairs.get(index + movement).getX();
                            y = outerPairs.get(index + movement).getY();
                            break;
                    }
                }else{
                    x = outerPairs.get(index + movement).getX();
                    y = outerPairs.get(index + movement).getY();
                }
                break;
            case(3):
                if (y - movement < 5 && y > 5){
                    System.out.println("Перейти на другой круг?");
                    System.out.println("1 - yes");
                    System.out.println("2 - no");
                    int answer = sc.nextInt();
                    switch (answer){
                        case(1):
                            movement -= 5 -index -1;
                            x = 9;
                            y = 5;
                            moveOnInnerCircle(7, movement);
                        case(2):
                            x = outerPairs.get(index + movement).getX();
                            y = outerPairs.get(index + movement).getY();
                            break;
                    }
                }else{
                    x = outerPairs.get(index + movement).getX();
                    y = outerPairs.get(index + movement).getY();
                }
                break;
            case(4):
                if(x - movement < 5 && x > 5){
                    System.out.println("Перейти на другой круг?");
                    System.out.println("1 - yes");
                    System.out.println("2 - no");
                    int answer = sc.nextInt();
                    switch (answer){
                        case(1):
                            movement -= 5 -index -1;
                            x = 5;
                            y = 1;
                            moveOnInnerCircle(8, movement);
                        case(2):
                            if(index + movement > outerPairs.size()){
                                movement = (index + movement) - outerPairs.size();
                                x = 0;
                                y = 0;
                                moveOnOuterCircle(1, movement);
                            }else{
                                x = outerPairs.get(index + movement).getX();
                                y = outerPairs.get(index + movement).getY();
                            }
                            break;
                    }
                }else{
                    if(index + movement > outerPairs.size()){
                        movement = (index + movement) - outerPairs.size();
                        x = 0;
                        y = 0;
                        moveOnOuterCircle(1, movement);
                    }else{
                        x = outerPairs.get(index + movement).getX();
                        y = outerPairs.get(index + movement).getY();
                    }
                }
                break;
        }
    }

    private void moveOnInnerCircle(int param, int movement){
        searchInnerIndex();
        switch (param){
            case(5):
                if (index + movement > 6 && index < 6){
                    System.out.println("Перейти на другой круг?");
                    System.out.println("1 - yes");
                    System.out.println("2 - no");
                    int answer = sc.nextInt();
                    switch (answer){
                        case(1):
                            movement -= 6 - index - 1;
                            x = 5;
                            y = 10;
                            moveOnOuterCircle(2, movement);
                            break;

                        case(2):
                            x = innerPairs.get(index + movement).getX();
                            y = innerPairs.get(index + movement).getY();
                            break;
                    }
                }else{
                    x = innerPairs.get(index + movement).getX();
                    y = innerPairs.get(index + movement).getY();
                }
                break;
            case(6):
                if(index + movement > 12 && index < 12){
                    System.out.println("Перейти на другой круг?");
                    System.out.println("1 - yes");
                    System.out.println("2 - no");
                    int answer = sc.nextInt();
                    switch (answer){
                        case(1):
                            movement -= 12 - index - 1;
                            x = 10;
                            y = 5;
                            moveOnOuterCircle(3, movement);
                            break;

                        case(2):
                            x = innerPairs.get(index + movement).getX();
                            y = innerPairs.get(index + movement).getY();
                            break;
                    }
                }else{
                    x = innerPairs.get(index + movement).getX();
                    y = innerPairs.get(index + movement).getY();
                }
                break;
            case(7):
                if(index + movement > 18 && index < 18){
                    System.out.println("Перейти на другой круг?");
                    System.out.println("1 - yes");
                    System.out.println("2 - no");
                    int answer = sc.nextInt();
                    switch (answer){
                        case(1):
                            movement -= 18 - index - 1;
                            x = 5;
                            y = 0;
                            moveOnOuterCircle(4, movement);
                            break;

                        case(2):
                            x = innerPairs.get(index + movement).getX();
                            y = innerPairs.get(index + movement).getY();
                            break;
                    }
                }else{
                    x = innerPairs.get(index + movement).getX();
                    y = innerPairs.get(index + movement).getY();
                }
                break;
            case(8):
                if (index + movement > 24 && index < 24){
                    System.out.println("Перейти на другой круг?");
                    System.out.println("1 - yes");
                    System.out.println("2 - no");
                    int answer = sc.nextInt();
                    switch (answer){
                        case(1):
                            movement -= 24 - index - 1;
                            x = 0;
                            y = 5;
                            moveOnOuterCircle(1, movement);
                            break;

                        case(2):
                            if (index + movement > innerPairs.size()){
                                movement = (movement + index) - innerPairs.size();
                                x = 1;
                                y = 5;
                                moveOnInnerCircle(5, movement);
                            }else{
                                x = innerPairs.get(index + movement).getX();
                                y = innerPairs.get(index + movement).getY();
                            }
                            break;
                    }
                }else{
                    if (index + movement > innerPairs.size()){
                        movement = (movement + index) - innerPairs.size();
                        x = 1;
                        y = 5;
                        moveOnInnerCircle(5, movement);
                    }else{
                        x = innerPairs.get(index + movement).getX();
                        y = innerPairs.get(index + movement).getY();
                    }
                }
                break;
        }
    }

    private void searchOuterIndex(){
        for (int i = 0; i < 47; i++){
            if(x == outerPairs.get(i).getX() && y == outerPairs.get(i).getY()){
                index = i;
                break;
            }
        }
    }

    private void searchInnerIndex(){
        for (int i = 0; i < 39; i++){
            if(x == innerPairs.get(i).getX() && y == innerPairs.get(i).getY()){
                index = i;
                break;
            }
        }
    }

    public void move(int movement){

        if(x == 0 && y >= 0 && y <= 10){
            moveOnOuterCircle(1, movement);
        }else if(x >= 1 && x <= 10 && y == 10){
            moveOnOuterCircle(2, movement);
        }else if(x == 10 && y <= 10 && y >= 0){
            moveOnOuterCircle(3, movement);
        }else if(y == 0 && x <= 9 && x >= 1){
            moveOnOuterCircle(4, movement);
        }
    }

    public void setStartPosition(){
        this.x = 0;
        this.y = 0;
    }

    public void setPosition(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void getCurrentPosition(){
        System.out.println("x "+ x);
        System.out.println("y "+ y);
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
