package com.vnc;

import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Draw {

    public static JFrame jFrame = new JFrame();

    private boolean end = true;

    private static String[][] tileMap = {
            {"9", "9", "9", "9", "9", "9", "9", "9", "9", "9", "9"},
            {"9", "*", "*", "9", "9", "9", "9", "9", "*", "*", "9"},
            {"9", "*", "9", "*", "*", "*", "*", "*", "9", "*", "9"},
            {"9", "9", "*", "*", "*", "*", "*", "*", "*", "9", "9"},
            {"9", "9", "*", "*", "*", "*", "*", "*", "*", "9", "9"},
            {"9", "9", "*", "*", "*", "*", "*", "*", "*", "9", "9"},
            {"9", "9", "*", "*", "*", "*", "*", "*", "*", "9", "9"},
            {"9", "9", "*", "*", "*", "*", "*", "*", "*", "9", "9"},
            {"9", "*", "9", "*", "*", "*", "*", "*", "9", "*", "9"},
            {"9", "*", "*", "9", "9", "9", "9", "9", "*", "*", "9"},
            {"9", "9", "9", "9", "9", "9", "9", "9", "9", "9", "9"}
    };


    private  JButton[][] buttons = new JButton[11][11];

//    public Configurator configurator = new Configurator();

//    private static JPanel [][] panels = new JPanel[11][11];

//    private static Player player;

//    public void setPlayer(Player player){
//        this.player = player;
//    }

    public void setEnd(boolean end){
        this.end = end;
    }

    public boolean getEnd(){
        return end;
    }

    public JLabel playerName = new JLabel();

    public void setPlayerName(String playerName) {
        this.playerName.setText(playerName);
    }

    public JLabel playerGold = new JLabel();

    public void setPlayerGold(String playerGold) {
        this.playerGold.setText(playerGold);
    }

    public JLabel playerSheep = new JLabel();

    public void setPlayerSheep(String playerSheep) {
        this.playerSheep.setText(playerSheep);
    }

    public JLabel playerLog = new JLabel();

    public void setPlayerLog(String playerLog) {
        this.playerLog.setText(playerLog);
    }

    public void setActionlabel(String actionlabel) {
        this.actionlabel.setText(actionlabel);
    }

    private  JLabel actionlabel = new JLabel();

    private int playerCount;

    public int getPlayerCount() {
        return playerCount;
    }

    public void setMap(String map[][]){
        for (int i = 0; i < 11; i++){
            for (int j = 0; j < 11; j++){
                tileMap[i][j] = map[i][j];
                System.out.print(map[i][j]+"\t");;
            }
            System.out.println();
        }
    }

    public JFrame getFrame(){

        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width / 2 - 400, dimension.height / 2 - 300, 800, 600);
        jFrame.setExtendedState(JFrame.MAXIMIZED_BOTH);
        jFrame.setTitle("Guilds game");
        jFrame.setIconImage(null);

        setMenuBar();

        JPanel Panel = new JPanel();
        JPanel Top = new JPanel();
        JPanel Bottom = new JPanel();
        JPanel Card =  Card();
        JPanel Action = Action();
        JPanel PlayerWindow = PlayerWindow();
        JPanel ButtonAction = ButtonAction();


        Panel.setBorder(new EmptyBorder(5,5,5,5));


        Top.setLayout(new BorderLayout(5,5));
        Top.add(Card, BorderLayout.CENTER);
        Top.add(PlayerWindow, BorderLayout.EAST);

        Bottom.setLayout(new BorderLayout(5,5));
        Bottom.add(Action, BorderLayout.CENTER);
        Bottom.add(ButtonAction, BorderLayout.EAST);


        Panel.setLayout(new BorderLayout(5,5));
        Panel.add(Top, BorderLayout.CENTER);
        Panel.add(Bottom, BorderLayout.SOUTH);


//        Left.setLayout(new BorderLayout(20, 20));
//        Left.add(Card, BorderLayout.CENTER);
//        Left.add(Action, BorderLayout.SOUTH);
//
//        Panel.setLayout(new BorderLayout(20, 20));
//        Panel.add(Left, BorderLayout.CENTER);
//        Panel.add(PlayerWindow, BorderLayout.EAST);

        Card.setBorder(BorderFactory.createMatteBorder(0, 0, 1, 1, Color.GRAY));

        jFrame.add(Panel);

        jFrame.revalidate();

//        new StartStep();

        return jFrame;
    }

    private class StartDialog extends JDialog {
        private StartDialog() {
            super(jFrame, "Старт игры", true);
            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Dimension dimension = toolkit.getScreenSize();
            setBounds(dimension.width / 2 - 160, dimension.height / 2 - 75, 320, 150);

            setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);

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

            Start.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent actionEvent) {
                    int num = 0;
                    if (player_2.isSelected()) {
                        num = 2;
                        playerCount = 2;

                    } else if (player_3.isSelected()) {
                        num = 3;
                        playerCount = 3;
                    } else if (player_4.isSelected()) {
                        num = 4;
                        playerCount = 4;
                    } else if (player_5.isSelected()) {
                        num = 5;
                        playerCount = 5;
                    } else if (player_6.isSelected()) {
                        num = 6;
                        playerCount = 6;
                    } else if (player_7.isSelected()) {
                        num = 7;
                        playerCount = 7;
                    } else if (player_8.isSelected()) {
                        num = 8;
                        playerCount = 8;
                    }


                    System.out.println("Количество игроков: " + num);
                    setVisible(false);
                }
            });

            add(Top_Panel, BorderLayout.NORTH);
            add(Center_Panel, BorderLayout.CENTER);
            add(Bottom_Panel, BorderLayout.SOUTH);

            setVisible(true);

        }
    }

    public void getStartDialog(){
       new StartDialog();
    }

    private  JMenuBar setMenuBar(){
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


        JMenu Help = new JMenu("Помощь");
        JMenuItem Documet = Help.add(new JMenuItem("Открыть документацию"));
        Help.addSeparator();
        JMenuItem Author = Help.add(new JMenuItem("Об авторе"));

        jMenuBar.add(Game);
        jMenuBar.add(Help);

        Documet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {

            }
        });

        Author.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                new AuthorDialog();
            }
        });
        jFrame.setJMenuBar(jMenuBar);

        return jMenuBar;
    }

    private  class AuthorDialog extends JDialog {
        private AuthorDialog() {
            super(jFrame, "Об авторе", true);

            Toolkit toolkit = Toolkit.getDefaultToolkit();
            Dimension dimension = toolkit.getScreenSize();
            setBounds(dimension.width / 2 - 180, dimension.height / 2 - 90, 360, 180);

            JPanel jpanel = new JPanel();

            jpanel.add(new Label("Автор"));

            add(jpanel, BorderLayout.CENTER);

            setVisible(true);
        }
    }

    private  JPanel Card(){
        JPanel Card = new JPanel();

        Card.setLayout(new GridLayout(11, 11, 1, 1));

        for (int a = 0; a < 11; a++) {
            for (int b = 0; b < 11; b++) {
                buttons[a][b] = new JButton();
                buttons[a][b].setBorder(null);
                buttons[a][b].setFocusPainted(false);
                buttons[a][b].setContentAreaFilled(false);
                if (tileMap[a][b]!="*") {
                    buttons[a][b].setIcon(new ImageIcon("graphics/rsz_1.png"));
                }
                Card.add(buttons[a][b]);
            }
        }

//        buttons[0][0].setBorder(BorderFactory.createLineBorder(Color.red));

//        for (int a = 0; a < 11; a++) {
//            for (int b = 0; b < 11; b++) {
//                panels[a][b] = new JPanel();
//                JLabel imageLabel = new JLabel(new ImageIcon("graphics/rsz_11.png"));
//                panels[a][b].add(imageLabel);
//                Card.add(panels[a][b]);
//            }
//        }

        return Card;
    }

    private JPanel Action(){
        JPanel Action = new JPanel();
        Action.add(new Label("История действий:") );
        Action.add(actionlabel);
        return Action;
    }

    private JPanel PlayerWindow(){
        JPanel PlayerWindow = new JPanel();

        PlayerWindow.setLayout(new GridLayout(4, 1, 1, 1));
        JLabel Player_Name = playerName;
        JLabel Player_Gold = playerGold;
        JLabel Player_Sheep = playerSheep;
        JLabel Player_Log = playerLog;
        PlayerWindow.add(Player_Name);
        PlayerWindow.add(Player_Gold);
        PlayerWindow.add(Player_Sheep);
        PlayerWindow.add(Player_Log);

        return PlayerWindow;
    }

    public JPanel ButtonAction(){
        JPanel ButtonAction = new JPanel();

        JButton End_button = new JButton("Завершить ход");

        ButtonAction.add(End_button);

        End_button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                end = false;
            }
        });

        return ButtonAction;
    }

    public class StartStep extends JDialog {
       public StartStep(){
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

    public int YesOrNO() {
        int select = 0;
        boolean check = false;
        while (check == false) {
        select = JOptionPane.showConfirmDialog(null, "Совершить переход на другой круг?",null, JOptionPane.YES_NO_OPTION, JOptionPane.WARNING_MESSAGE);
            if (select == JOptionPane.YES_OPTION) {
                select = 1;
                check = true;
                System.out.println("Выбрал переходить " + select);
            } else if (select == JOptionPane.NO_OPTION) {
                select = 2;
                check = true;
                System.out.println("Выбрал не переходить " + select);
            }
        }
        return select;
    }

//    public int getCount(){
//        return configurator.getNum();
//    }
//
//    public Player getListElement(int index){
//        return configurator.getByIndex(index);
//    }

}