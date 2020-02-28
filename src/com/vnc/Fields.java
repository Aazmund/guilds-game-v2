package com.vnc;

import javax.swing.*;

public class Fields {
    public static JButton[][] buttons = new JButton[11][11];

    public Fields() {
        for (int a = 0; a < 11; a++) {
            for (int b = 0; b < 11; b++) {
                buttons[a][b] = new JButton();// вызов конструктора для создания объектов
            }
        }
    }
}
