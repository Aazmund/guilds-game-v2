package com.vnc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static com.vnc.Draw.jFrame;

public class CubeDialog extends JDialog{

    private int step;

    public int getStep(){
        return step;
    }

    public CubeDialog(){
        super(jFrame, "Начало хода", true);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        setBounds(dimension.width / 2 - 75, dimension.height / 2 - 50, 150, 100);

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        JPanel Top_Panel = new JPanel();
        JPanel Center_Panel = new JPanel();
        add(Top_Panel);
        add(Center_Panel);

        JLabel action = new JLabel("Бросьте кубик");
        Top_Panel.add(action);

        JButton Start = new JButton("Бросить");
        Center_Panel.add(Start);

        Start.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                step = (int) (Math.random() * 6 + 1);
                setVisible(false);
//                    buttons[player.getX()][player.getY()].setBorder(null);
//                    int movement = Main.steps();
//                    setVisible(false);
//                    actionlabel.setText("Кубик выпал со стороной: " + movement);
//                    player.move(movement);
//                    player.getCurrentPosition();
//                    buttons[player.getX()][player.getY()].setBorder(BorderFactory.createLineBorder(Color.red));
//
            }
        });

        add(Top_Panel, BorderLayout.NORTH);
        add(Center_Panel, BorderLayout.CENTER);

        setVisible(true);
    }
}
