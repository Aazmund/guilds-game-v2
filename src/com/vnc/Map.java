package com.vnc;

import javax.swing.*;

public class Map extends JPanel {

    final static int h_map = 11;
    final static int w_map = 11;


//    private void moveOnOuterCircle(int param, int movement){
//        searchOuterIndex();
//        switch (param){
//            case(1):
//                if(y + movement > 5 && y < 6 && resolution){
//                    System.out.println("Перейти на другой круг?");
//                    System.out.println("1 - yes");
//                    System.out.println("2 - no");
//                    int answer = sc.nextInt();
//                    switch (answer){
//                        case(1):
//                            movement = movement - (5 - index) - 1;
//                            x = 1;
//                            y = 5;
//                            resolution = false;
////                            moveOnInnerCircle(5, movement);
//                            move(movement);
//                            break;
//
//                        case(2):
//                            resolution = true;
//                            x = outerPairs.get(index + movement).getX();
//                            y = outerPairs.get(index + movement).getY();
//                            break;
//                    }
//                }else{
//                    resolution = true;
//                    x = outerPairs.get(index + movement).getX();
//                    y = outerPairs.get(index + movement).getY();
//                }
//                break;
//            case(2):
//                if(x + movement > 5 && x < 6 && resolution){
//                    System.out.println("Перейти на другой круг?");
//                    System.out.println("1 - yes");
//                    System.out.println("2 - no");
//                    int answer = sc.nextInt();
//                    switch (answer){
//                        case(1):
//                            movement = movement - (15 - index) - 1;
//                            x = 5;
//                            y = 9;
//                            resolution = false;
//                            move(movement);
////                            moveOnInnerCircle(6, movement);
//                        case(2):
//                            resolution = true;
//                            x = outerPairs.get(index + movement).getX();
//                            y = outerPairs.get(index + movement).getY();
//                            break;
//                    }
//                }else{
//                    resolution = true;
//                    x = outerPairs.get(index + movement).getX();
//                    y = outerPairs.get(index + movement).getY();
//                    resolution = true;
//                }
//                break;
//            case(3):
//                System.out.println("_______ " + y + " " +  movement);
//                if (y - movement < 5 && y > 5 && resolution){
//                    System.out.println("Перейти на другой круг?");
//                    System.out.println("1 - yes");
//                    System.out.println("2 - no");
//                    int answer = sc.nextInt();
//                    switch (answer){
//                        case(1):
//                            movement = movement - (25 - index) - 1;
//                            x = 9;
//                            y = 5;
//                            resolution = false;
//                            move(movement);
////                            moveOnInnerCircle(7, movement);
//                        case(2):
//                            resolution = true;
//                            x = outerPairs.get(index + movement).getX();
//                            y = outerPairs.get(index + movement).getY();
//                            break;
//                    }
//                }else{
//                    resolution = true;
//                    x = outerPairs.get(index + movement).getX();
//                    y = outerPairs.get(index + movement).getY();
//                }
//                break;
//            case(4):
//                if(x - movement < 5 && x > 5 && resolution){
//                    System.out.println("Перейти на другой круг?");
//                    System.out.println("1 - yes");
//                    System.out.println("2 - no");
//                    int answer = sc.nextInt();
//                    switch (answer){
//                        case(1):
//                            movement = movement - (35 - index) - 1;
//                            x = 5;
//                            y = 1;
//                            resolution = false;
//                            move(movement);
////                            moveOnInnerCircle(8, movement);
//                        case(2):
//                            if(index + movement > outerPairs.size()){
//                                movement = (index + movement) - outerPairs.size();
//                                x = 0;
//                                y = 0;
//                                resolution = true;
//                                move(movement);
////                                moveOnOuterCircle(1, movement);
//                            }else{
//                                resolution = true;
//                                x = outerPairs.get(index + movement).getX();
//                                y = outerPairs.get(index + movement).getY();
//                            }
//                            break;
//                    }
//                }else{
//                    resolution = true;
//                    if(index + movement > outerPairs.size()){
//                        movement = (index + movement) - outerPairs.size();
//                        x = 0;
//                        y = 0;
//                        move(movement);
////                        moveOnOuterCircle(1, movement);
//                    }else{
//                        resolution = true;
//                        x = outerPairs.get(index + movement).getX();
//                        y = outerPairs.get(index + movement).getY();
//                    }
//                }
//                break;
//        }
//    }
//
//    private void moveOnInnerCircle(int param, int movement){
//        searchInnerIndex();
//        switch (param){
//            case(5):
//                if (x == 1 && y == 5 && resolution){
//                    System.out.println("Перейти на внешний круг? (секция 1)");
//                    System.out.println("1 - yes");
//                    System.out.println("2 - no");
//                    int answer = sc.nextInt();
//                    switch (answer){
//                        case(1):
//                            movement --;
//                            x = 0;
//                            y = 5;
//                            resolution = false;
//                            move(movement);
////                            moveOnOuterCircle(1, movement);
//                            break;
//
//                        case(2):
//                            x = innerPairs.get(index + movement).getX();
//                            y = innerPairs.get(index + movement).getY();
//                            break;
//                    }
//                } else if (index + movement > 6 && index <= 6){
//                    System.out.println("Перейти внешний круг? (секция 2)");
//                    System.out.println("1 - yes");
//                    System.out.println("2 - no");
//                    int answer = sc.nextInt();
//                    resolution = true;
//                    switch (answer){
//                        case(1):
//                            movement = movement - (6 - index) - 1;
//                            x = 5;
//                            y = 10;
////                            moveOnOuterCircle(2, movement);
//                            move(movement);
//                            break;
//
//                        case(2):
//                            x = innerPairs.get(index + movement).getX();
//                            y = innerPairs.get(index + movement).getY();
//                            break;
//                    }
//                }else{
//                    resolution = true;
//                    x = innerPairs.get(index + movement).getX();
//                    y = innerPairs.get(index + movement).getY();
//                }
//                break;
//            case(6):
//                if (x == 5 && y == 9 && resolution){
//                    System.out.println("Перейти на внешний круг? (секция 2)");
//                    System.out.println("1 - yes");
//                    System.out.println("2 - no");
//                    int answer = sc.nextInt();
//                    switch (answer){
//                        case(1):
//                            movement --;
//                            x = 5;
//                            y = 10;
////                            resolution = false;
////                            moveOnOuterCircle(2, movement);
//                            move(movement);
//                            break;
//
//                        case(2):
//                            x = innerPairs.get(index + movement).getX();
//                            y = innerPairs.get(index + movement).getY();
//                            break;
//                    }
//                }else if(index + movement > 12 && index <= 12){
//                    System.out.println("Перейти на внешний круг? (секция 3)");
//                    System.out.println("1 - yes");
//                    System.out.println("2 - no");
//                    int answer = sc.nextInt();
//                    resolution = true;
//                    switch (answer){
//                        case(1):
//                            movement = movement - (12 - index) - 1;
//                            x = 10;
//                            y = 5;
////                            moveOnOuterCircle(3, movement);
//                            move(movement);
//                            break;
//
//                        case(2):
//                            x = innerPairs.get(index + movement).getX();
//                            y = innerPairs.get(index + movement).getY();
//                            break;
//                    }
//                }else{
//                    resolution = true;
//                    x = innerPairs.get(index + movement).getX();
//                    y = innerPairs.get(index + movement).getY();
//                }
//                break;
//            case(7):
//                if (x == 9 && y == 5 && resolution){
//                    System.out.println("Перейти на внешний круг? (секция 3)");
//                    System.out.println("1 - yes");
//                    System.out.println("2 - no");
//                    int answer = sc.nextInt();
//                    resolution = true;
//                    switch (answer){
//                        case(1):
//                            movement --;
//                            x = 10;
//                            y = 5;
//                            resolution = false;
////                            moveOnOuterCircle(3, movement);
//                            move(movement);
//                            break;
//
//                        case(2):
//                            x = innerPairs.get(index + movement).getX();
//                            y = innerPairs.get(index + movement).getY();
//                            break;
//                    }
//                }else if(index + movement > 18 && index <= 18){
//                    System.out.println("Перейти на внешний круг? (секция 4)");
//                    System.out.println("1 - yes");
//                    System.out.println("2 - no");
//                    int answer = sc.nextInt();
//                    resolution = true;
//                    switch (answer){
//                        case(1):
//                            movement = movement - (18 - index) - 1;
//                            x = 5;
//                            y = 0;
//                            resolution = false;
////                            moveOnOuterCircle(4, movement);
//                            move(movement);
//                            break;
//
//                        case(2):
//                            x = innerPairs.get(index + movement).getX();
//                            y = innerPairs.get(index + movement).getY();
//                            break;
//                    }
//                }else{
//                    resolution = true;
//                    x = innerPairs.get(index + movement).getX();
//                    y = innerPairs.get(index + movement).getY();
//                }
//
//                break;
//            case(8):
//                if (x == 5 && y == 1 && resolution){
//                    System.out.println("Перейти на внешний круг? (секция 4)");
//                    System.out.println("1 - yes");
//                    System.out.println("2 - no");
//                    int answer = sc.nextInt();
//                    resolution = true;
//                    switch (answer){
//                        case(1):
//                            movement --;
//                            x = 5;
//                            y = 0;
//                            resolution = false;
////                            moveOnOuterCircle(4, movement);
//                            move(movement);
//                            break;
//
//                        case(2):
//                            x = innerPairs.get(index + movement).getX();
//                            y = innerPairs.get(index + movement).getY();
//                            break;
//                    }
//                }else if (index + movement > 24 && index <= 24){
//                    System.out.println("Перейти на внешний круг? (секция 1)");
//                    System.out.println("1 - yes");
//                    System.out.println("2 - no");
//                    int answer = sc.nextInt();
//                    resolution = true;
//                    switch (answer){
//                        case(1):
//                            movement = movement - (24 - index) - 1;
//                            x = 0;
//                            y = 5;
////                            moveOnOuterCircle(1, movement);
//                            move(movement);
//                            break;
//
//                        case(2):
//                            if (index + movement > innerPairs.size()){
//                                movement = (movement + index) - innerPairs.size();
//                                x = 1;
//                                y = 5;
////                                moveOnInnerCircle(5, movement);
//                                move(movement);
//                            }else{
//                                x = innerPairs.get(index + movement).getX();
//                                y = innerPairs.get(index + movement).getY();
//                            }
//                            break;
//                    }
//                }else{
//                    if (index + movement > innerPairs.size()){
//                        movement = (movement + index) - innerPairs.size();
//                        x = 1;
//                        y = 5;
//                        resolution = true;
////                        moveOnInnerCircle(5, movement);
//                        move(movement);
//                    }else{
//                        resolution = true;
//                        x = innerPairs.get(index + movement).getX();
//                        y = innerPairs.get(index + movement).getY();
//                    }
//                }
//
//                break;
//        }
//    }
}
