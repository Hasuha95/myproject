package lesson8;

import javax.swing.*;
import java.awt.*;

public class GameWindow extends JFrame {
    public static final int WINDOW_POS_X = 450;
    static final int WINDOW_POS_Y = 200;
    static final int WINDOW_WIDTH = 505;
    static final int WINDOW_HAIGHT = 555;
    private Settings settings;
    private Map map;



    public GameWindow(){
        try {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
        } catch (Exception e) {
            e.printStackTrace();
        }

        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HAIGHT);

        setTitle("Title");

        settings = new Settings(this);
        map = new Map(this);
        add(map, BorderLayout.CENTER);





        JPanel panel = new JPanel(new GridLayout(1,3));
        //  Start
        JButton buttonStart = new JButton("START");
        buttonStart.setBackground(Color.cyan);
        panel.add(buttonStart);
        buttonStart.addActionListener(e -> {
            startGame(settings.getMode(), settings.getMapSize());
        });

        //   settings
        JButton buttonSettings = new JButton("SETTINGS");
        panel.add(buttonSettings);
        buttonSettings.addActionListener(e -> {
            settings.setVisible(true);
        });


        //   EXIT
        JButton buttonExit = new JButton("EXIT");
        buttonExit.setBackground(Color.pink);
        panel.add(buttonExit);
        buttonExit.addActionListener(e -> {
            System.exit(0);
        });


        add(panel, BorderLayout.SOUTH);


        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void startGame(int gameMode, int mapSize){
        map.startNewGame(gameMode, mapSize);

    }
}
