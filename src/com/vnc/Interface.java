package com.vnc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class Interface {

    static JFrame jFrame = getFrame();


    static JFrame getFrame() {
        JFrame JFrame = new JFrame() {};
        JPanel Panel = new JPanel();
        JPanel Left = new JPanel();
        JPanel Player = new JPanel();
        JPanel Card = new JPanel();
        JPanel Action = new JPanel();

        JFrame.add(Left);
        JFrame.add(Player);
        JFrame.add(Card);
        JFrame.add(Action);
        JFrame.add(Panel);

        Panel.setBackground(Color.black);
        Card.setBackground(Color.black);
        Left.setBackground(Color.black);
        Action.setBackground(Color.red);
        Player.setBackground(Color.green);

        JFrame.setVisible(true);
        JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        JFrame.setBounds(dimension.width / 2 - 400, dimension.height / 2 - 300, 800, 600);
//        JFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        JFrame.setTitle("Guilds game");
        JFrame.setIconImage(null);

        JMenuBar jMenuBar = new JMenuBar();
        JMenu Game = new JMenu("Игра");
        JMenuItem New_Game = Game.add(new JMenuItem("Новая игра"));
        New_Game.setAccelerator(KeyStroke.getKeyStroke("ctrl N"));

        New_Game.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            }
        });

        JMenuItem Save_Game = Game.add(new JMenuItem("Сохранить игру"));
        Save_Game.setAccelerator(KeyStroke.getKeyStroke("ctrl S"));

        JMenuItem Load_Game = Game.add(new JMenuItem("Загрузить игру"));
        Load_Game.setAccelerator(KeyStroke.getKeyStroke("ctrl L"));
        Load_Game.setEnabled(false);

        Game.addSeparator();
        JMenuItem Exit_Game = Game.add(new JMenuItem("Выйти из игры"));
        Exit_Game.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                System.exit(0);
            }
        });

        Exit_Game.setAccelerator(KeyStroke.getKeyStroke("ctrl Q"));

        JMenu Settings = new JMenu("Настройки");
        JMenu Window_size = new JMenu("Экран");
        Settings.add(Window_size);
        Window_size.add(new JCheckBoxMenuItem("800x600"));
        Window_size.add(new JCheckBoxMenuItem("1152x768"));
        Window_size.add(new JCheckBoxMenuItem("1280x720"));
        Window_size.add(new JCheckBoxMenuItem("1280x1024"));
        Window_size.add(new JCheckBoxMenuItem("1920x1080"));
        Window_size.add(new JCheckBoxMenuItem("Fullscreen"));

        JMenuItem Voice = Settings.add(new JMenuItem("Звук"));


        JMenu Help = new JMenu("Помощь");
        JMenuItem Documet = Help.add(new JMenuItem("Открыть документацию"));
        Help.addSeparator();
        JMenuItem Author = Help.add(new JMenuItem("Об авторе"));

        jMenuBar.add(Game);
        jMenuBar.add(Settings);
        jMenuBar.add(Help);

        Author.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JFrame AuthorFrame = new JFrame();
                JPanel AuthorPanel = new JPanel();
                AuthorFrame.setVisible(true);
                AuthorFrame.add(AuthorPanel);
                Toolkit toolkit = Toolkit.getDefaultToolkit();
                Dimension dimension = toolkit.getScreenSize();
                AuthorFrame.setBounds(dimension.width / 2 - 180, dimension.height / 2 - 90, 360, 180);
                AuthorFrame.setTitle("Об авторе");
                AuthorFrame.setIconImage(null);
                JLabel label1 = new JLabel();
                label1.setText("Автор");
                AuthorPanel.add(label1);
            }
        });

        Player.setLayout(new GridLayout(8, 1, 6, 6));
        Label Player_Name = new Label("Игрок 1");
        Label Player_Gold = new Label("Золото: 0");
        Label Player_Sheep = new Label("Овцы: 0");
        Label Player_Log = new Label("Бревна: 0");
        Player.add(Player_Name);
        Player.add(Player_Gold);
        Player.add(Player_Sheep);
        Player.add(Player_Log);
        JLabel choice = new JLabel("Перейти на внутренний круг?");
        Player.add(choice);
        JButton Yes = new JButton("Да");
        JButton No = new JButton("Нет");
        JButton End_button = new JButton("Завершить ход");
        Player.add(Yes);
        Player.add(No);
        Player.add(End_button);
        Yes.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        No.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });
        End_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });


        JFrame.setJMenuBar(jMenuBar);

        Card.setLayout(new GridLayout(11, 11, 6, 6));
        JButton button = new JButton();
        button.setToolTipText("Очень страшная хрень");

        button.setIcon(new ImageIcon(new ImageIcon("graphics/png/qqq.png").getImage().getScaledInstance(150, 55, Image.SCALE_DEFAULT)));


//		Card.add(new Button("00"));
        Card.add(button);
        Card.add(new Button("01"));
        Card.add(new Button("02"));
        Card.add(new Button("03"));
        Card.add(new Button("04"));
        Card.add(new Button("05"));
        Card.add(new Button("06"));
        Card.add(new Button("07"));
        Card.add(new Button("08"));
        Card.add(new Button("09"));
        Card.add(new Button("010"));

        Card.add(new Button("10"));
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button("13"));
        Card.add(new Button("14"));
        Card.add(new Button("15"));
        Card.add(new Button("16"));
        Card.add(new Button("17"));
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button("110"));

        Card.add(new Button("20"));
        Card.add(new Button()).setVisible(false);
        Card.add(new Button("22"));
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button("28"));
        Card.add(new Button()).setVisible(false);
        Card.add(new Button("210"));

        Card.add(new Button("30"));
        Card.add(new Button("31"));
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button("39"));
        Card.add(new Button("310"));

        Card.add(new Button("40"));
        Card.add(new Button("41"));
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button("49"));
        Card.add(new Button("410"));

        Card.add(new Button("50"));
        Card.add(new Button("51"));
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button("59"));
        Card.add(new Button("510"));

        Card.add(new Button("60"));
        Card.add(new Button("61"));
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);

        Card.add(new Button("69"));
        Card.add(new Button("610"));

        Card.add(new Button("70"));
        Card.add(new Button("71"));
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button("79"));
        Card.add(new Button("710"));

        Card.add(new Button("80"));
        Card.add(new Button()).setVisible(false);
        Card.add(new Button("82"));
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button("88"));
        Card.add(new Button()).setVisible(false);
        Card.add(new Button("810"));

        Card.add(new Button("90"));
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button("93"));
        Card.add(new Button("94"));
        Card.add(new Button("95"));
        Card.add(new Button("96"));
        Card.add(new Button("97"));
        Card.add(new Button()).setVisible(false);
        Card.add(new Button()).setVisible(false);
        Card.add(new Button("910"));

        Card.add(new Button("100"));
        Card.add(new Button("101"));
        Card.add(new Button("102"));
        Card.add(new Button("103"));
        Card.add(new Button("104"));
        Card.add(new Button("105"));
        Card.add(new Button("106"));
        Card.add(new Button("107"));
        Card.add(new Button("108"));
        Card.add(new Button("109"));
        Card.add(new Button("110"));


        Left.setLayout(new BorderLayout(6, 6));
        Left.add(Card, BorderLayout.CENTER);
        Left.add(Action, BorderLayout.SOUTH);

        Panel.setLayout(new BorderLayout(6, 6));
        Panel.add(Left, BorderLayout.CENTER);
        Panel.add(Player, BorderLayout.EAST);

        Action.add(new JTextArea(String.valueOf("\n" +
                "Some say the world will end in fire, \n" +
                "Some say in ice.\n" +
                "\n" +
                "From what I’ve tasted of desire\n" +
                "\n" +
                "I hold with those who favor fire.\n" +
                "\n" +
                "But if it had to perish twice,\n" +
                "\n" +
                "I think I know enough of hate\n" +
                "\n" +
                "To say that for destruction ice\n" +
                "\n" +
                "Is also great\n" +
                "\n" +
                "And would suffice.")));
        JFrame.revalidate();

        return JFrame;
    }

    public static class StartDialog extends JDialog {
        public StartDialog() {
            super(jFrame, "Старт игры", true);


            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Dimension dimension = toolkit.getScreenSize();
            setBounds(dimension.width / 2 - 160, dimension.height / 2 - 75, 320, 150);

            JPanel Top_Panel = new JPanel();
            JPanel Center_Panel = new JPanel();
            JPanel Bottom_Panel = new JPanel();
            add(Top_Panel);
            add(Center_Panel);
            add(Bottom_Panel);
            //Добавление кнопок выбора количества игроков
            Top_Panel.add(new Label("Выберите количество игроков:"));
            JRadioButton player_2 = new JRadioButton("2");
            JRadioButton player_3 = new JRadioButton("3");
            JRadioButton player_4 = new JRadioButton("4");
            JRadioButton player_5 = new JRadioButton("5");
            JRadioButton player_6 = new JRadioButton("6");
            JRadioButton player_7 = new JRadioButton("7");
            JRadioButton player_8 = new JRadioButton("8");
            //Два игрока по умолчанию
            player_2.setSelected(true);
            //Создания группы выбора количества игроков
            ButtonGroup Players_num_Group = new ButtonGroup();
            Players_num_Group.add(player_2);
            Players_num_Group.add(player_3);
            Players_num_Group.add(player_4);
            Players_num_Group.add(player_5);
            Players_num_Group.add(player_6);
            Players_num_Group.add(player_7);
            Players_num_Group.add(player_8);
            //Добавления на панель кнопок выбора количества игроков
            Center_Panel.add(player_2);
            Center_Panel.add(player_3);
            Center_Panel.add(player_4);
            Center_Panel.add(player_5);
            Center_Panel.add(player_6);
            Center_Panel.add(player_7);
            Center_Panel.add(player_8);


            JButton Start = new JButton("Начать игру");
            Bottom_Panel.add(Start);
            final int[] num = {2};
            Main.configuration(num[0]);
            Start.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {

                    if (player_2.isSelected()) {
                    } else if (player_3.isSelected()) {
                        num[0] = 3;
                    } else if (player_4.isSelected()) {
                        num[0] = 4;
                    } else if (player_5.isSelected()) {
                        num[0] = 5;
                    } else if (player_6.isSelected()) {
                        num[0] = 6;
                    } else if (player_7.isSelected()) {
                        num[0] = 7;
                    } else if (player_8.isSelected()) {
                        num[0] = 8;
                    }
                    System.out.println(num[0]);
                    Main.configuration(num[0]);
                    setVisible(false);
                }
            });

            add(Top_Panel, BorderLayout.NORTH);
            add(Center_Panel, BorderLayout.CENTER);
            add(Bottom_Panel, BorderLayout.SOUTH);


        }
    }
}
