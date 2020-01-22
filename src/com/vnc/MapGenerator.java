package com.vnc;

public class MapGenerator extends Map {

    public MapGenerator(){}

    public MapGenerator(String map[][]){

        CellsGenerator cellsGenerator = new CellsGenerator();

        int counter = 0;
        int i_index = 0;
        int j_index = 0;
        int line_index = 0;

        for (int i = 0; i < 11; i++){
            for (int j = 0; j < 11; j++){
                if (map[i][j] == "7"){
                    switch (cellsGenerator.getSquareElem(counter)){
                        case (1):
                            map[i][j] = "p";
                            counter++;
                            break;
                        case (2):
                            map[i][j] = "s";
                            counter++;
                            break;
                        case (3):
                            map[i][j] = "h";
                            counter++;
                            break;
                        case (4):
                            map[i][j] = "m";
                            counter++;
                            break;
                    }
                }
            }
        }

        for (i_index = 0; i_index < 11; i_index++){
            if (map[i_index][j_index] == "9"){
                cellsGenerator.line_config();
                for (int i = i_index; i < i_index + 4; i++){
                    map[i][j_index] = cellsGenerator.getConfigLineElem(line_index);
                    line_index++;
                }
            }
            line_index = 0;
        }

        j_index = 10;

        for (i_index = 0; i_index < 11; i_index++){
            if (map[i_index][j_index] == "9"){
                cellsGenerator.line_config();
                for (int i = i_index; i < i_index + 4; i++){
                    map[i][j_index] = cellsGenerator.getConfigLineElem(line_index);
                    line_index++;
                }
            }
            line_index = 0;
        }

        i_index = 0;

        for (j_index = 0; j_index < 11; j_index++){
            if (map[i_index][j_index] == "9"){
                cellsGenerator.line_config();
                for (int j = j_index; j < j_index + 4; j++){
                    map[i_index][j] = cellsGenerator.getConfigLineElem(line_index);
                    line_index++;
                }
            }
            line_index = 0;
        }

        i_index = 10;
        for (j_index = 0; j_index < 11; j_index++){
            if (map[i_index][j_index] == "9"){
                cellsGenerator.line_config();
                for (int j = j_index; j < j_index + 4; j++){
                    map[i_index][j] = cellsGenerator.getConfigLineElem(line_index);
                    line_index++;
                }
            }
        }

        counter = 0;
        for (int i = 0; i < 11; i++){
            for(int j = 0; j < 11; j++){
                if (map[i][j] == "1"){
                    map[i][j] = cellsGenerator.getSpecCellElem(counter);
                    counter++;
                }
            }
        }
    }
}
