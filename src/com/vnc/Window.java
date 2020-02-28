package com.vnc;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.util.Scanner;

public class Window {

    static JFrame jFrame = getFrame();

    static JFrame getFrame() {
        JFrame JFrame = new JFrame() {
        };
        JPanel Panel = new JPanel();
        JPanel Left = new JPanel();
        JPanel PlayerWindow = new JPanel();
        JPanel Card = new JPanel();
        JPanel Action = new JPanel();

        JFrame.add(Left);
        JFrame.add(PlayerWindow);
        JFrame.add(Card);
        JFrame.add(Action);
        JFrame.add(Panel);

//        Panel.setBackground(Color.black);
//        Card.setBackground(Color.black);
//        Left.setBackground(Color.black);
//        Action.setBackground(Color.red);
//        PlayerWindow.setBackground(Color.green);

        JFrame.setVisible(true);
        JFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        JFrame.setBounds(dimension.width / 2 - 400, dimension.height / 2 - 300, 800, 600);
        JFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
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

        PlayerWindow.setLayout(new GridLayout(8, 1, 6, 6));
        Label Player_Name = new Label("Игрок 1");
        Label Player_Gold = new Label("Золото: 0");
        Label Player_Sheep = new Label("Овцы: 0");
        Label Player_Log = new Label("Бревна: 0");
        PlayerWindow.add(Player_Name);
        PlayerWindow.add(Player_Gold);
        PlayerWindow.add(Player_Sheep);
        PlayerWindow.add(Player_Log);
        JLabel choice = new JLabel("Перейти на внутренний круг?");
        PlayerWindow.add(choice);
        JButton Yes = new JButton("Да");
        JButton No = new JButton("Нет");
        JButton End_button = new JButton("Завершить ход");
        PlayerWindow.add(Yes);
        PlayerWindow.add(No);
        PlayerWindow.add(End_button);


        Card.setLayout(new GridLayout(11, 11, 6, 6));
//        JButton button0 = new JButton();
//        button0.setToolTipText("Очень страшная хрень");
//
//        button0.setIcon(new ImageIcon(new ImageIcon("graphics/png/qqq.png").getImage().getScaledInstance(150, 55, Image.SCALE_DEFAULT)));
//
//        button0.setBorder(BorderFactory.createLineBorder(Color.red));

        JButton[][] buttons = new JButton[11][11];
        for (int a = 0; a < 11; a++) {
            for (int b = 0; b < 11; b++) {
                buttons[a][b] = new JButton();// вызов конструктора для создания объектов


                buttons[0][0].setBorder(BorderFactory.createLineBorder(Color.red));

            }
        }
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

                JLabel actionlabel = new JLabel();

                End_button.addActionListener(new ActionListener() {
                    @Override
                    public void actionPerformed(ActionEvent actionEvent) {
                        int movement = Main.steps();
                        Player.move(movement);
                        Player.getCurrentPosition();
                        actionlabel.setText("Кубик выпал со стороной: " + movement);
                        Player player = new Player();
                    buttons[player.getX()][player.getY()].setBorder(BorderFactory.createLineBorder(Color.red));
//               buttons[player.getY()-movement][player.getX()].setBorder(null);
                    }
                });


                JFrame.setJMenuBar(jMenuBar);



                //Теперь когда массив содержит объекты можна с ними работать
                for (int a = 0; a < 11; a++) {
                    for (int b = 0; b < 11; b++) {

                        Card.add(buttons[a][b]);
                    }
                }




                Left.setLayout(new BorderLayout(20, 20));
                Left.add(Card, BorderLayout.CENTER);
                Left.add(Action, BorderLayout.SOUTH);

                Panel.setLayout(new BorderLayout(20, 20));
                Panel.add(Left, BorderLayout.CENTER);
                Panel.add(PlayerWindow, BorderLayout.EAST);



                Action.add(actionlabel);

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
                            System.out.println("Количество игроков: " + num[0]);
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
