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
    private boolean resolution = true;
    short[] innerList = {1,5,1,6,1,7,2,8,3,9,4,9,5,9,6,9,7,9,8,8,9,7,9,6,9,5,9,4,9,3,8,2,7,1,6,1,5,1,4,1,3,1,2,2,1,3,1,4};
    short[] outerList = {0,0,0,1,0,2,0,3,0,4,0,5,0,6,0,7,0,8,0,9,0,10,1,10,2,10,3,10,4,10,5,10,6,10,7,10,8,10,9,10,10,10,10,9,10,8,10,7,10,6,10,5,10,4,10,3,10,2,10,1,10,0,9,0,8,0,7,0,6,0,5,0,4,0,3,0,2,0,1,0};


    public Player(){

        for (int i = 0; i < innerList.length; i++){
            Pair pair = new Pair();
            pair.makePair(innerList[i], innerList[i+1]);
            innerPairs.add(pair);
            i += 1;
        }

        for(int i = 0; i < outerList.length; i++){
            Pair pair = new Pair();
            pair.makePair(outerList[i], outerList[i+1]);
            outerPairs.add(pair);
            i += 1;
        }
    }

    private void searchOuterIndex(){
        for (int i = 0; i < outerPairs.size(); i++){
            if(x == outerPairs.get(i).getX() && y == outerPairs.get(i).getY()){
                index = i;
            }
        }
    }

    private void searchInnerIndex(){
        for (int i = 0; i < innerPairs.size(); i++){
            if(x == innerPairs.get(i).getX() && y == innerPairs.get(i).getY()){
                index = i;
            }
        }
    }

    private void moveOnOuterCircle(int param, int movement){
        searchOuterIndex();
        switch (param){
            case(1):
                if (y + movement > 5 && y < 6 && resolution){
                    System.out.println("Перейти на внутреннйи круг? (секция 5)");
                    System.out.println("1 - yes");
                    System.out.println("2 - no");
                    int answer = sc.nextInt();
                    switch (answer){
                        case(1):
                            movement = movement - (5 - y) - 1;
                            x = 1;
                            y = 5;
                            resolution = false;
                            move(movement);
                            break;

                        case(2):
                            if (y + movement > 9){
                                movement = movement - (9 - y) - 1;
                                x = 0;
                                y = 10;
                                move(movement);
                            }else{
                                x = outerPairs.get(index + movement).getX();
                                y = outerPairs.get(index + movement).getY();
                            }
                            break;
                    }
                }else{
                    resolution = true;
                    if (y + movement > 9){
                        movement = movement - (9 - y) - 1;
                        x = 0;
                        y = 10;
                        move(movement);
                    }else{
                        x = outerPairs.get(index + movement).getX();
                        y = outerPairs.get(index + movement).getY();
                    }
                }
                break;
            case(2):
                if(x + movement > 5 && x < 6 && resolution){
                    System.out.println("Перейти на внутреннйи круг? (секция 6)");
                    System.out.println("1 - yes");
                    System.out.println("2 - no");
                    int answer = sc.nextInt();
                    switch (answer){
                        case(1):
                            movement = movement - (5 - x) - 1;
                            x = 5;
                            y = 9;
                            resolution = false;
                            move(movement);
                            break;
                        case(2):
                            if (x + movement > 9){
                                movement = movement - (9 - x) - 1;
                                x = 10;
                                y = 10;
                                move(movement);
                            }else{
                                x = outerPairs.get(index + movement).getX();
                                y = outerPairs.get(index + movement).getY();
                            }
                            break;
                    }
                }else{
                    resolution = true;
                    if (x + movement > 9){
                        movement = movement - (9 - x) - 1;
                        x = 10;
                        y = 10;
                        move(movement);
                    }else{
                        x = outerPairs.get(index + movement).getX();
                        y = outerPairs.get(index + movement).getY();
                    }
                }
                break;
            case(3):
                if (y - movement < 5 && y > 5 && resolution){
                    System.out.println("Перейти на внутреннйи круг? (секция 7)");
                    System.out.println("1 - yes");
                    System.out.println("2 - no");
                    int answer = sc.nextInt();
                    switch (answer){
                        case(1):
                            movement = movement - (10 - y) - 1;
                            x = 9;
                            y = 5;
                            resolution = false;
                            move(movement);
                            break;
                        case(2):
                            if (y - movement < 1){
                                movement = movement - y;
                                x = 10;
                                y = 0;
                                move(movement);
                            }else{
                                x = outerPairs.get(index + movement).getX();
                                y = outerPairs.get(index + movement).getY();
                            }
                            break;
                    }
                }else{
                    resolution = true;
                    if (y - movement < 1){
                        movement = movement - y;
                        x = 10;
                        y = 0;
                        move(movement);
                    }else{
                        x = outerPairs.get(index + movement).getX();
                        y = outerPairs.get(index + movement).getY();
                    }
                }
                break;
            case(4):
                if(x - movement < 5 && x > 5 && resolution){
                    System.out.println("Перейти на внутреннйи круг? (секция 8)");
                    System.out.println("1 - yes");
                    System.out.println("2 - no");
                    int answer = sc.nextInt();
                    switch (answer){
                        case(1):
                            movement = movement - (x - 5) - 1;
                            x = 5;
                            y = 1;
                            resolution = false;
                            move(movement);
                            break;
                        case(2):
                            if(x - movement < 1){
                                movement = movement - x;
                                x = 0;
                                y = 0;
                                move(movement);
                            }else{
                                x = outerPairs.get(index + movement).getX();
                                y = outerPairs.get(index + movement).getY();
                            }
                            break;
                    }
                }else{
                    resolution = true;
                    if(x - movement < 1){
                        movement = movement - x;
                        x = 0;
                        y = 0;
                        move(movement);
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
                if (index + movement > 0 && index < 1 && resolution && movement != 0){
                    System.out.println("Перейти на внешний круг? (секция 1)");
                    System.out.println("1 - yes");
                    System.out.println("2 - no");
                    int answer = sc.nextInt();
                    switch (answer){
                        case(1):
                            movement --;
                            x = 0;
                            y = 5;
                            resolution = false;
                            move(movement);
                            break;

                        case(2):
                            if(index + movement > 5){
                                movement = (index + movement) - movement;
                                x = 5;
                                y = 9;
                                move(movement);
                            }else{
                                x = innerPairs.get(index + movement).getX();
                                y = innerPairs.get(index + movement).getY();
                            }
                            break;
                    }
                }else{
                    resolution = true;
                    if(index + movement > 5){
                        movement = (index + movement) - movement;
                        x = 5;
                        y = 9;
                        move(movement);
                    }else{
                        x = innerPairs.get(index + movement).getX();
                        y = innerPairs.get(index + movement).getY();
                    }
                }
                break;
            case(6):
                if (index + movement > 6 && index < 7 && resolution && movement != 0){
                    System.out.println("Перейти на внешний круг? (секция 2)");
                    System.out.println("1 - yes");
                    System.out.println("2 - no");
                    int answer = sc.nextInt();
                    switch (answer){
                        case(1):
                            movement --;
                            x = 5;
                            y = 10;
                            resolution = false;
                            move(movement);
                            break;

                        case(2):
                            if(index + movement > 11){
                                movement = (index - 6 + movement) - movement;
                                x = 9;
                                y = 5;
                                move(movement);
                            }else{
                                x = innerPairs.get(index + movement).getX();
                                y = innerPairs.get(index + movement).getY();
                            }
                            break;
                    }
                }else{
                    resolution = true;
                    if(index + movement > 11){
                        movement = (index - 6 + movement) - movement;
                        x = 9;
                        y = 5;
                        move(movement);
                    }else{
                        x = innerPairs.get(index + movement).getX();
                        y = innerPairs.get(index + movement).getY();
                    }
                }
                break;
            case(7):
                if (index + movement > 12 && index < 13 && resolution && movement != 0){
                    System.out.println("Перейти на внешний круг? (секция 3)");
                    System.out.println("1 - yes");
                    System.out.println("2 - no");
                    int answer = sc.nextInt();
                    switch (answer){
                        case(1):
                            movement --;
                            x = 10;
                            y = 5;
                            resolution = false;
                            move(movement);
                            break;

                        case(2):
                            if(index + movement > 17){
                                movement = (index - 12 + movement) - movement;
                                x = 5;
                                y = 1;
                                move(movement);
                            }else{
                                x = innerPairs.get(index + movement).getX();
                                y = innerPairs.get(index + movement).getY();
                            }
                            break;
                    }
                }else{
                    resolution = true;
                    if(index + movement > 17){
                        movement = (index - 12 + movement) - movement;
                        x = 5;
                        y = 1;
                        move(movement);
                    }else{
                        x = innerPairs.get(index + movement).getX();
                        y = innerPairs.get(index + movement).getY();
                    }
                }
                break;
            case(8):
                if (index + movement > 18 && index < 19 && resolution && movement != 0){
                    System.out.println("Перейти на внешний круг? (секция 4)");
                    System.out.println("1 - yes");
                    System.out.println("2 - no");
                    int answer = sc.nextInt();
                    switch (answer){
                        case(1):
                            movement --;
                            x = 5;
                            y = 0;
                            resolution = false;
                            move(movement);
                            break;

                        case(2):
                            if(index + movement > 23){
                                movement = (index - 18 + movement) - movement;
                                x = 1;
                                y = 5;
                                move(movement);
                            }else{
                                x = innerPairs.get(index + movement).getX();
                                y = innerPairs.get(index + movement).getY();
                            }
                            break;
                    }
                }else{
                    resolution = true;
                    if(index + movement > 23){
                        movement = (index - 18 + movement) - movement;
                        x = 1;
                        y = 5;
                        move(movement);
                    }else{
                        x = innerPairs.get(index + movement).getX();
                        y = innerPairs.get(index + movement).getY();
                    }
                }
                break;
        }
    }

    public void move(int movement){

        if(x == 0 && y >= 0 && y <= 9){
            System.out.println("Кидаю в 1 кейс");
            moveOnOuterCircle(1, movement);
        }else if(x >= 0 && x <= 9 && y == 10){
            System.out.println("Кидаю в 2 кейс");
            moveOnOuterCircle(2, movement);
        }else if(x == 10 && y <= 10 && y >= 1){
            System.out.println("Кидаю в 3 кейс");
            moveOnOuterCircle(3, movement);
        }else if(y == 0 && x <= 10 && x >= 1){
            System.out.println("Кидаю в 4 кейс");
            moveOnOuterCircle(4, movement);


        }else if(x >= 1 && x <= 4 && y >= 5 && y <= 9){
            System.out.println("Кидаю в 5 кейс");
            moveOnInnerCircle(5, movement);
        }else if(x >= 5 && x <= 9 && y <= 9 && y >= 6){
            System.out.println("Кидаю в 6 кейс");
            moveOnInnerCircle(6, movement);
        }else if(x <= 9 && x >= 6 && y <= 5 && y >=1){
            System.out.println("Кидаю в 7 кейс");
            moveOnInnerCircle(7, movement);
        }else if(x >= 1 && x<= 5 && y >= 1 && y <= 4){
            System.out.println("Кидаю в 8 кейс");
            moveOnInnerCircle(8, movement);
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
