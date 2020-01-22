package com.vnc;

import java.util.ArrayList;

public class CellsGenerator {

    ArrayList<Integer>square = new ArrayList<>();
    ArrayList<Integer>line = new ArrayList<>();
    int spec_cell[] = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16};
    ArrayList<Integer>spec_cells = new ArrayList<>();

    public CellsGenerator(){
        gen_square();
        genSpecCells();
    }

    public void gen_square(){
        square.add(1);
        square.add(2);
        square.add(3);
        square.add(4);

        for (int i = 3; i >= 0; i--){
            int j = (int) (Math.random() * (i + 1));
            int buf = square.get(i);
            square.set(i, square.get(j));
            square.set(j, buf);
        }
    }

    public void genSpecCells(){

        for(int i = 0; i < 16; i++){
            spec_cells.add(i, i+1);
        }

        for (int i = 15; i >= 0; i--){
            int j = (int) (Math.random() * (i + 1));
            int buf = spec_cells.get(i);
            spec_cells.set(i, spec_cells.get(j));
            spec_cells.set(j, buf);
        }
    }

    public void line_config(){
        int config = (int) (Math.random()*2);
        switch (config){
            case (0):
                line.add(17);
                line.add(0);
                line.add(0);
                line.add(0);
                break;
            case(1):
                line.add(0);
                line.add(0);
                line.add(0);
                line.add(17);
                break;
        }
    }

    int getSquareElem(int index){
        return square.get(index);
    }

    String getConfigLineElem(int index){
        return line.get(index).toString();
    }

    String getSpecCellElem(int index){
        return spec_cells.get(index).toString();
    }
}
