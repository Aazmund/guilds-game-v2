package com.vnc;

import java.util.ArrayList;

public class MapGenerator {

    private static short[] mini_line = {11,0,0,0,12};
    private static short[] mini_line_2 = {21,0,0,0,22};
    private static short[] mini_line_3 = {31,0,0,0,32};
    private static short[] mini_line_4 = {41,0,0,0,42};
    private static short[] line = {51,0,0,0,531,532,52,53,0,0,0};
    private static short[] line_2 = {61,0,0,0,631,632,62,0,0,0,63};
    private static short[] line_3 = {0,0,0,71,731,732,72,73,0,0,0};
    private static short[] line_4 = {81,0,0,0,831,832,82,83,0,0,0};

    private static short[] rnd_minList = {1,2,3,4};
    private static short[] rnd_List = {1,2,3,4};

    private void rnd(short[] list){
        for (int i = 3; i >= 0; i--){
            int j = (int) (Math.random() * (i + 1));
            short buf = list[i];
            list[i] = list[j];
            list[j] = buf;
        }
    }

    private void gen_sec_1(int param, String map[][]){
        switch (param){
            case(1):
                map[0][0] = String.valueOf(mini_line[0]);
                map[1][0] = String.valueOf(mini_line[1]);
                map[2][0] = String.valueOf(mini_line[2]);
                map[3][0] = String.valueOf(mini_line[3]);
                map[4][0] = String.valueOf(mini_line[4]);
                break;
            case(2):
                map[0][0] = String.valueOf(mini_line_2[0]);
                map[1][0] = String.valueOf(mini_line_2[1]);
                map[2][0] = String.valueOf(mini_line_2[2]);
                map[3][0] = String.valueOf(mini_line_2[3]);
                map[4][0] = String.valueOf(mini_line_2[4]);
                break;
            case(3):
                map[0][0] = String.valueOf(mini_line_3[0]);
                map[1][0] = String.valueOf(mini_line_3[1]);
                map[2][0] = String.valueOf(mini_line_3[2]);
                map[3][0] = String.valueOf(mini_line_3[3]);
                map[4][0] = String.valueOf(mini_line_3[4]);
                break;
            case(4):
                map[0][0] = String.valueOf(mini_line_4[0]);
                map[1][0] = String.valueOf(mini_line_4[1]);
                map[2][0] = String.valueOf(mini_line_4[2]);
                map[3][0] = String.valueOf(mini_line_4[3]);
                map[4][0] = String.valueOf(mini_line_4[4]);
                break;
        }
    }

    private void gen_sec_2(int param, String map[][]){
        switch (param){
            case(1):
                map[0][6] = String.valueOf(mini_line[4]);
                map[0][7] = String.valueOf(mini_line[3]);
                map[0][8] = String.valueOf(mini_line[2]);
                map[0][9] = String.valueOf(mini_line[1]);
                map[0][10] = String.valueOf(mini_line[0]);
                break;
            case(2):
                map[0][6] = String.valueOf(mini_line_2[4]);
                map[0][7] = String.valueOf(mini_line_2[3]);
                map[0][8] = String.valueOf(mini_line_2[2]);
                map[0][9] = String.valueOf(mini_line_2[1]);
                map[0][10] = String.valueOf(mini_line_2[0]);
                break;
            case(3):
                map[0][6] = String.valueOf(mini_line_3[4]);
                map[0][7] = String.valueOf(mini_line_3[3]);
                map[0][8] = String.valueOf(mini_line_3[2]);
                map[0][9] = String.valueOf(mini_line_3[1]);
                map[0][10] = String.valueOf(mini_line_3[0]);
                break;
            case(4):
                map[0][6] = String.valueOf(mini_line_4[4]);
                map[0][7] = String.valueOf(mini_line_4[3]);
                map[0][8] = String.valueOf(mini_line_4[2]);
                map[0][9] = String.valueOf(mini_line_4[1]);
                map[0][10] = String.valueOf(mini_line_4[0]);
                break;
        }
    }

    private void gen_sec_3(int param, String map[][]){
        switch (param){
            case(1):
                map[6][10] = String.valueOf(mini_line[4]);
                map[7][10] = String.valueOf(mini_line[3]);
                map[8][10] = String.valueOf(mini_line[2]);
                map[9][10] = String.valueOf(mini_line[1]);
                map[10][10] = String.valueOf(mini_line[0]);
                break;
            case(2):
                map[6][10] = String.valueOf(mini_line_2[4]);
                map[7][10] = String.valueOf(mini_line_2[3]);
                map[8][10] = String.valueOf(mini_line_2[2]);
                map[9][10] = String.valueOf(mini_line_2[1]);
                map[10][10] = String.valueOf(mini_line_2[0]);
                break;
            case(3):
                map[6][10] = String.valueOf(mini_line_3[4]);
                map[7][10] = String.valueOf(mini_line_3[3]);
                map[8][10] = String.valueOf(mini_line_3[2]);
                map[9][10] = String.valueOf(mini_line_3[1]);
                map[10][10] = String.valueOf(mini_line_3[0]);
                break;
            case(4):
                map[6][10] = String.valueOf(mini_line_4[4]);
                map[7][10] = String.valueOf(mini_line_4[3]);
                map[8][10] = String.valueOf(mini_line_4[2]);
                map[9][10] = String.valueOf(mini_line_4[1]);
                map[10][10] = String.valueOf(mini_line_4[0]);
                break;
        }
    }

    private void gen_sec_4(int param, String map[][]){
        switch (param){
            case(1):
                map[10][0] = String.valueOf(mini_line[4]);
                map[10][1] = String.valueOf(mini_line[3]);
                map[10][2] = String.valueOf(mini_line[2]);
                map[10][3] = String.valueOf(mini_line[1]);
                map[10][4] = String.valueOf(mini_line[0]);
                break;
            case(2):
                map[10][0] = String.valueOf(mini_line_2[4]);
                map[10][1] = String.valueOf(mini_line_2[3]);
                map[10][2] = String.valueOf(mini_line_2[2]);
                map[10][3] = String.valueOf(mini_line_2[1]);
                map[10][4] = String.valueOf(mini_line_2[0]);
                break;
            case(3):
                map[10][0] = String.valueOf(mini_line_3[4]);
                map[10][1] = String.valueOf(mini_line_3[3]);
                map[10][2] = String.valueOf(mini_line_3[2]);
                map[10][3] = String.valueOf(mini_line_3[1]);
                map[10][4] = String.valueOf(mini_line_3[0]);
                break;
            case(4):
                map[10][0] = String.valueOf(mini_line_4[0]);
                map[10][1] = String.valueOf(mini_line_4[1]);
                map[10][2] = String.valueOf(mini_line_4[2]);
                map[10][3] = String.valueOf(mini_line_4[3]);
                map[10][4] = String.valueOf(mini_line_4[4]);
                break;
        }
    }

    private void gen_sec_5(int param, String map[][]){
        switch (param){
            case(1):
                map[0][1] = String.valueOf(line[0]);
                map[0][2] = String.valueOf(line[1]);
                map[0][3] = String.valueOf(line[2]);
                map[0][4] = String.valueOf(line[3]);
                map[0][5] = String.valueOf(line[4]);
                map[1][5] = String.valueOf(line[5]);
                map[1][6] = String.valueOf(line[6]);
                map[1][7] = String.valueOf(line[7]);
                map[2][8] = String.valueOf(line[8]);
                map[3][9] = String.valueOf(line[9]);
                map[4][9] = String.valueOf(line[10]);
                break;
            case(2):
                map[0][1] = String.valueOf(line_2[0]);
                map[0][2] = String.valueOf(line_2[1]);
                map[0][3] = String.valueOf(line_2[2]);
                map[0][4] = String.valueOf(line_2[3]);
                map[0][5] = String.valueOf(line_2[4]);
                map[1][5] = String.valueOf(line_2[5]);
                map[1][6] = String.valueOf(line_2[6]);
                map[1][7] = String.valueOf(line_2[7]);
                map[2][8] = String.valueOf(line_2[8]);
                map[3][9] = String.valueOf(line_2[9]);
                map[4][9] = String.valueOf(line_2[10]);
                break;
            case(3):
                map[0][1] = String.valueOf(line_3[0]);
                map[0][2] = String.valueOf(line_3[1]);
                map[0][3] = String.valueOf(line_3[2]);
                map[0][4] = String.valueOf(line_3[3]);
                map[0][5] = String.valueOf(line_3[4]);
                map[1][5] = String.valueOf(line_3[5]);
                map[1][6] = String.valueOf(line_3[6]);
                map[1][7] = String.valueOf(line_3[7]);
                map[2][8] = String.valueOf(line_3[8]);
                map[3][9] = String.valueOf(line_3[9]);
                map[4][9] = String.valueOf(line_3[10]);
                break;
            case(4):
                map[0][1] = String.valueOf(line_4[0]);
                map[0][2] = String.valueOf(line_4[1]);
                map[0][3] = String.valueOf(line_4[2]);
                map[0][4] = String.valueOf(line_4[3]);
                map[0][5] = String.valueOf(line_4[4]);
                map[1][5] = String.valueOf(line_4[5]);
                map[1][6] = String.valueOf(line_4[6]);
                map[1][7] = String.valueOf(line_4[7]);
                map[2][8] = String.valueOf(line_4[8]);
                map[3][9] = String.valueOf(line_4[9]);
                map[4][9] = String.valueOf(line_4[10]);
                break;
        }
    }

    private void gen_sec_6(int param, String map[][]){
        switch (param){
            case(1):
                map[1][10] = String.valueOf(line[0]);
                map[2][10] = String.valueOf(line[1]);
                map[3][10] = String.valueOf(line[2]);
                map[4][10] = String.valueOf(line[3]);
                map[5][10] = String.valueOf(line[4]);
                map[5][9] = String.valueOf(line[5]);
                map[6][9] = String.valueOf(line[6]);
                map[7][9] = String.valueOf(line[7]);
                map[8][8] = String.valueOf(line[8]);
                map[9][7] = String.valueOf(line[9]);
                map[9][6] = String.valueOf(line[10]);
                break;
            case(2):
                map[1][10] = String.valueOf(line_2[0]);
                map[2][10] = String.valueOf(line_2[1]);
                map[3][10] = String.valueOf(line_2[2]);
                map[4][10] = String.valueOf(line_2[3]);
                map[5][10] = String.valueOf(line_2[4]);
                map[5][9] = String.valueOf(line_2[5]);
                map[6][9] = String.valueOf(line_2[6]);
                map[7][9] = String.valueOf(line_2[7]);
                map[8][8] = String.valueOf(line_2[8]);
                map[9][7] = String.valueOf(line_2[9]);
                map[9][6] = String.valueOf(line_2[10]);
                break;
            case(3):
                map[1][10] = String.valueOf(line_3[0]);
                map[2][10] = String.valueOf(line_3[1]);
                map[3][10] = String.valueOf(line_3[2]);
                map[4][10] = String.valueOf(line_3[3]);
                map[5][10] = String.valueOf(line_3[4]);
                map[5][9] = String.valueOf(line_3[5]);
                map[6][9] = String.valueOf(line_3[6]);
                map[7][9] = String.valueOf(line_3[7]);
                map[8][8] = String.valueOf(line_3[8]);
                map[9][7] = String.valueOf(line_3[9]);
                map[9][6] = String.valueOf(line_3[10]);
                break;
            case(4):
                map[1][10] = String.valueOf(line_4[0]);
                map[2][10] = String.valueOf(line_4[1]);
                map[3][10] = String.valueOf(line_4[2]);
                map[4][10] = String.valueOf(line_4[3]);
                map[5][10] = String.valueOf(line_4[4]);
                map[5][9] = String.valueOf(line_4[5]);
                map[6][9] = String.valueOf(line_4[6]);
                map[7][9] = String.valueOf(line_4[7]);
                map[8][8] = String.valueOf(line_4[8]);
                map[9][7] = String.valueOf(line_4[9]);
                map[9][6] = String.valueOf(line_4[10]);
                break;
        }
    }

    private void gen_sec_7(int param, String map[][]){
        switch (param){
            case(1):
                map[10][9] = String.valueOf(line[0]);
                map[10][8] = String.valueOf(line[1]);
                map[10][7] = String.valueOf(line[2]);
                map[10][6] = String.valueOf(line[3]);
                map[10][5] = String.valueOf(line[4]);
                map[9][5] = String.valueOf(line[5]);
                map[9][4] = String.valueOf(line[6]);
                map[9][3] = String.valueOf(line[7]);
                map[8][2] = String.valueOf(line[8]);
                map[7][1] = String.valueOf(line[9]);
                map[6][1] = String.valueOf(line[10]);
                break;
            case(2):
                map[10][9] = String.valueOf(line_2[0]);
                map[10][8] = String.valueOf(line_2[1]);
                map[10][7] = String.valueOf(line_2[2]);
                map[10][6] = String.valueOf(line_2[3]);
                map[10][5] = String.valueOf(line_2[4]);
                map[9][5] = String.valueOf(line_2[5]);
                map[9][4] = String.valueOf(line_2[6]);
                map[9][3] = String.valueOf(line_2[7]);
                map[8][2] = String.valueOf(line_2[8]);
                map[7][1] = String.valueOf(line_2[9]);
                map[6][1] = String.valueOf(line_2[10]);
                break;
            case(3):
                map[10][9] = String.valueOf(line_3[0]);
                map[10][8] = String.valueOf(line_3[1]);
                map[10][7] = String.valueOf(line_3[2]);
                map[10][6] = String.valueOf(line_3[3]);
                map[10][5] = String.valueOf(line_3[4]);
                map[9][5] = String.valueOf(line_3[5]);
                map[9][4] = String.valueOf(line_3[6]);
                map[9][3] = String.valueOf(line_3[7]);
                map[8][2] = String.valueOf(line_3[8]);
                map[7][1] = String.valueOf(line_3[9]);
                map[6][1] = String.valueOf(line_3[10]);
                break;
            case(4):
                map[10][9] = String.valueOf(line_4[0]);
                map[10][8] = String.valueOf(line_4[1]);
                map[10][7] = String.valueOf(line_4[2]);
                map[10][6] = String.valueOf(line_4[3]);
                map[10][5] = String.valueOf(line_4[4]);
                map[9][5] = String.valueOf(line_4[5]);
                map[9][4] = String.valueOf(line_4[6]);
                map[9][3] = String.valueOf(line_4[7]);
                map[8][2] = String.valueOf(line_4[8]);
                map[7][1] = String.valueOf(line_4[9]);
                map[6][1] = String.valueOf(line_4[10]);
                break;
        }
    }

    private void gen_sec_8(int param, String map[][]){
        switch (param){
            case(1):
                map[9][0] = String.valueOf(line[0]);
                map[8][0] = String.valueOf(line[1]);
                map[7][0] = String.valueOf(line[2]);
                map[6][0] = String.valueOf(line[3]);
                map[5][0] = String.valueOf(line[4]);
                map[5][1] = String.valueOf(line[5]);
                map[4][1] = String.valueOf(line[6]);
                map[3][1] = String.valueOf(line[7]);
                map[2][2] = String.valueOf(line[8]);
                map[1][3] = String.valueOf(line[9]);
                map[1][4] = String.valueOf(line[10]);
                break;
            case(2):
                map[9][0] = String.valueOf(line_2[0]);
                map[8][0] = String.valueOf(line_2[1]);
                map[7][0] = String.valueOf(line_2[2]);
                map[6][0] = String.valueOf(line_2[3]);
                map[5][0] = String.valueOf(line_2[4]);
                map[5][1] = String.valueOf(line_2[5]);
                map[4][1] = String.valueOf(line_2[6]);
                map[3][1] = String.valueOf(line_2[7]);
                map[2][2] = String.valueOf(line_2[8]);
                map[1][3] = String.valueOf(line_2[9]);
                map[1][4] = String.valueOf(line_2[10]);
                break;
            case(3):
                map[9][0] = String.valueOf(line_3[0]);
                map[8][0] = String.valueOf(line_3[1]);
                map[7][0] = String.valueOf(line_3[2]);
                map[6][0] = String.valueOf(line_3[3]);
                map[5][0] = String.valueOf(line_3[4]);
                map[5][1] = String.valueOf(line_3[5]);
                map[4][1] = String.valueOf(line_3[6]);
                map[3][1] = String.valueOf(line_3[7]);
                map[2][2] = String.valueOf(line_3[8]);
                map[1][3] = String.valueOf(line_3[9]);
                map[1][4] = String.valueOf(line_3[10]);
                break;
            case(4):
                map[9][0] = String.valueOf(line_4[0]);
                map[8][0] = String.valueOf(line_4[1]);
                map[7][0] = String.valueOf(line_4[2]);
                map[6][0] = String.valueOf(line_4[3]);
                map[5][0] = String.valueOf(line_4[4]);
                map[5][1] = String.valueOf(line_4[5]);
                map[4][1] = String.valueOf(line_4[6]);
                map[3][1] = String.valueOf(line_4[7]);
                map[2][2] = String.valueOf(line_4[8]);
                map[1][3] = String.valueOf(line_4[9]);
                map[1][4] = String.valueOf(line_4[10]);
                break;
        }
    }

    public void generateMap(String map[][]){

        rnd(rnd_minList);
        rnd(rnd_List);
        gen_sec_1(rnd_minList[0], map);
        gen_sec_2(rnd_minList[1], map);
        gen_sec_3(rnd_minList[2], map);
        gen_sec_4(rnd_minList[3], map);
        gen_sec_5(rnd_List[0], map);
        gen_sec_6(rnd_List[1], map);
        gen_sec_7(rnd_List[2], map);
        gen_sec_8(rnd_List[3], map);

    }
}
