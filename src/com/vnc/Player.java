package com.vnc;

import java.util.ArrayList;
import java.util.Scanner;

public class Player {
    private int x;
    private int y;
    private Scanner sc = new Scanner(System.in);
    private ArrayList<Pair> pairs= new ArrayList<>();

    private void moveOnOuterCircle(int movement){
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

    public Player(){
        for (int i = 0; i < 47; i++){
            Pair pair = new Pair();
            short[] list = {1,5,1,6,1,7,2,8,3,9,4,9,5,9,6,9,7,9,8,8,9,7,9,6,9,5,9,4,9,3,8,2,7,1,6,1,5,1,4,1,3,1,2,2,1,3,1,4,1,5};
            pair.makePair(list[i], list[i+1]);
            pairs.add(pair);
            i += 1;
        }
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
        }else{
            for (int i = 0; i < pairs.size(); i++){
                if (pairs.get(i).getX() == x && pairs.get(i).getY() == y){

                    if (x >= 1 && x <= 4 && y >= 5 && y <= 9 && i + movement >= 6) {
                        int answer;
                        System.out.println("Хотите перейти на другой круг?");
                        System.out.println("1 - да");
                        System.out.println("0 - нет");
                        answer = sc.nextInt();

                        switch (answer){
                            case(1):
                                movement = movement - (6 - i) - 1;
                                x = 5;
                                y = 10;
                                moveOnOuterCircle(movement);
                                break;
                            case(2):
                                if (i + movement <= pairs.size()){
                                    x = pairs.get(i + movement).getX();
                                    y = pairs.get(i + movement).getY();
                                }else {
                                    x = pairs.get(i + movement - pairs.size()).getX();
                                    y = pairs.get(i + movement - pairs.size()).getY();
                                }
                                break;
                        }
                    } else if (x >= 5 && x <= 9 && y <= 9 && y >= 6 && i + movement >= 6){
                        int answer;
                        System.out.println("Хотите перейти на другой круг?");
                        System.out.println("1 - да");
                        System.out.println("0 - нет");
                        answer = sc.nextInt();

                        switch (answer){
                            case(1):
                                movement = movement - (6 - i) - 1;
                                x = 5;
                                y = 10;
                                moveOnOuterCircle(movement);
                                break;
                            case(2):
                                if (i + movement <= pairs.size()){
                                    x = pairs.get(i + movement).getX();
                                    y = pairs.get(i + movement).getY();
                                }else {
                                    x = pairs.get(i + movement - pairs.size()).getX();
                                    y = pairs.get(i + movement - pairs.size()).getY();
                                }
                                break;
                        }
                    }else if(x <=9 && x >= 6 && y <= 5 && y >= 1 && i + movement >= 12){
                        int answer;
                        System.out.println("Хотите перейти на другой круг?");
                        System.out.println("1 - да");
                        System.out.println("0 - нет");
                        answer = sc.nextInt();

                        switch (answer){
                            case(1):
                                movement = movement - (12 - i) - 1;
                                y = 0;
                                x = 5;
                                moveOnOuterCircle(movement);
                                break;
                            case(0):
                                if (i + movement <= pairs.size()){
                                    x = pairs.get(i + movement).getX();
                                    y = pairs.get(i + movement).getY();
                                }else {
                                    x = pairs.get(i + movement - pairs.size()).getX();
                                    y = pairs.get(i + movement - pairs.size()).getY();
                                }
                                break;
                        }
                    }else if(x >= 1 && x <= 5 && y >= 1 && y <= 4 && i + movement >= 18){
                        int answer;
                        System.out.println("Хотите перейти на другой круг?");
                        System.out.println("1 - да");
                        System.out.println("0 - нет");
                        answer = sc.nextInt();

                        switch (answer){
                            case(1):
                                movement = movement - (24 - i) - 1;
                                y = 5;
                                x = 0;
                                moveOnOuterCircle(movement);
                                break;
                            case(0):
                                if (i + movement <= pairs.size()){
                                    x = pairs.get(i + movement).getX();
                                    y = pairs.get(i + movement).getY();
                                }else {
                                    x = pairs.get(i + movement - pairs.size()).getX();
                                    y = pairs.get(i + movement - pairs.size()).getY();
                                }
                                break;
                        }
                    }else{
                        if (i + movement <= pairs.size()){
                            x = pairs.get(i + movement).getX();
                            y = pairs.get(i + movement).getY();
                        }else {
                            x = pairs.get(i + movement - pairs.size()).getX();
                            y = pairs.get(i + movement - pairs.size()).getY();
                        }
                    }
                    break;
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
