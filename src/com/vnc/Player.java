package com.vnc;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private int x;
    private int y;
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Pair> pairs= new ArrayList<>();
    private short list[] = {2,6,2,7,2,8,3,9,4,10,5,10,6,10,7,10,8,10,9,9,10,8,10,7,10,6,10,5,10,4,9,3,8,2,7,2,6,2,5,2,4,2,3,3,2,4,2,5};

    public Player(){
        for (int i = 0; i < 47; i++){
            Pair pair = new Pair();
            pair.makePair(list[i] - 1, list[i+1] - 1);
            pairs.add(pair);
            i += 1;
        }
//        for(int i = 0; i < 24; i++){
//            pairs.get(i).print();
//        }
    }

    public void move(int movement){
        if(x == 0 && y <= 10){
            if (y == 5 || y + movement >= 6){
                int answer;
                System.out.println("Хотите перейти на другой круг?");
                System.out.println("1 - да");
                System.out.println("0 - нет");
                answer = sc.nextInt();

                switch (answer){
                    case(1):
                        System.out.println("Перехожу");
                        movement = movement - (5 - y) - 1;
                        x = pairs.get(movement).getX();
                        y = pairs.get(movement).getY();
                        break;
                    case(0):
                        if (y + movement <= 10){
                            y += movement;
                        }else{
                            x = (y + movement) - 10;
                            y = 10;
                        }
                        break;
                }
            }else{
                if (y + movement <= 10){
                    y += movement;
                }else{
                    x = (y + movement) - 10;
                    y = 10;
                }
            }
        }else if(x <= 10 && y == 10){
            if (x == 5 || x + movement >= 6){
                int answer;
                System.out.println("Хотите перейти на другой круг?");
                System.out.println("1 - да");
                System.out.println("0 - нет");
                answer = sc.nextInt();

                switch (answer){
                    case(1):
                        System.out.println("Перехожу");
                        movement = movement - (5 - x) - 1;
                        x = pairs.get(6 + movement).getX();
                        y = pairs.get(6 + movement).getY();
                        break;
                    case(0):
                        if (x + movement <= 10){
                            x += movement;
                        }else{
                            movement -= 10 - x;
                            y = 10 - movement;
                            x = 10;
                        }
                        break;
                }
            }else{
                if (x + movement <= 10){
                    x += movement;
                }else{
                    movement -= 10 - x;
                    y = 10 - movement;
                    x = 10;
                }
            }
        }else if(x == 10 && y <= 10){
            if (y == 5 || y - movement <= 4){
                int answer;
                System.out.println("Хотите перейти на другой круг?");
                System.out.println("1 - да");
                System.out.println("0 - нет");
                answer = sc.nextInt();

                switch (answer){
                    case(1):
                        System.out.println("Перехожу");
                        movement = movement - (y - 5) - 1;
                        x = pairs.get(12 + movement).getX();
                        y = pairs.get(12 + movement).getY();
                        break;
                    case(0):
                        if (y - movement >= 0){
                            y -= movement;
                        }else{
                            movement -= y;
                            x = 10 - movement;
                            y = 0;
                        }
                        break;
                }
            }else{
                if (y - movement >= 0){
                    y -= movement;
                }else{
                    movement -= y;
                    x = 10 - movement;
                    y = 0;
                }
            }

        }else if(x <= 10 && y == 0){
            if (x == 5 || x - movement <= 4){
                int answer;
                System.out.println("Хотите перейти на другой круг?");
                System.out.println("1 - да");
                System.out.println("0 - нет");
                answer = sc.nextInt();

                switch (answer){
                    case(1):
                        System.out.println("Перехожу");
                        if(movement - 1 > 5){
                            movement = (movement - (x - 5) - 1) - 6;
                            x = pairs.get(movement).getX();
                            y = pairs.get(movement).getY();
                        }else{
                            movement = movement - (x - 5) - 1;
                            x = pairs.get(18 + movement).getX();
                            y = pairs.get(18 + movement).getY();
                        }
                        break;
                    case(0):
                        if (x - movement >= 0){
                            x -= movement;
                        }else{
                            movement -= x;
                            y = movement;
                            x = 0;
                        }
                        break;
                }
            }else{
                if (x - movement >= 0){
                    x -= movement;
                }else{
                    movement -= x;
                    y = movement;
                    x = 0;
                }
            }
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
