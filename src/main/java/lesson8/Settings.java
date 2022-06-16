package lesson8;

import lesson8.GameWindow;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Settings extends JFrame {
    private static final int WINDOW_POS_X = GameWindow.WINDOW_POS_X;
    private static final int WINDOW_POS_Y = GameWindow.WINDOW_POS_Y;
    private static final int WINDOW_WIDTH = GameWindow.WINDOW_WIDTH;
    private static final int WINDOW_HEIGHT = GameWindow.WINDOW_HAIGHT;

    private static final int MIN_FIELD_SIZE = 3;
    private static final int MAX_FIELD_SIZE = 10;

    static final int MODE_H_VS_Ai = 0;
    static final int MODE_H_VS_H = 1;
    private int mode;
    private int mapSize;

    private GameWindow gameWindow;

    private JRadioButton radioButtonHvsAi = new JRadioButton("Human vs Ai", true);
    private JRadioButton radioButtonHvsH = new JRadioButton("Human vs Human");
    private ButtonGroup gameMode = new ButtonGroup();

    private JSlider sliderFieldSize = new JSlider(MIN_FIELD_SIZE, MAX_FIELD_SIZE, MIN_FIELD_SIZE);
    private JSlider sliderDotsToWin = new JSlider(MIN_FIELD_SIZE, MIN_FIELD_SIZE, MIN_FIELD_SIZE);




    public Settings(GameWindow gameWindow){
        try {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
        } catch (Exception e) {
            e.printStackTrace();
        }


        this.gameWindow = gameWindow;
        setBounds(WINDOW_POS_X, WINDOW_POS_Y, WINDOW_WIDTH, WINDOW_HEIGHT);
        setTitle("Setting game");

        setLayout(new GridLayout(8,1));


        add(new JLabel(" Select game mode:"));
        add(radioButtonHvsAi);
        add(radioButtonHvsH);
        gameMode.add(radioButtonHvsAi);
        gameMode.add(radioButtonHvsH);

        add(new JLabel(" Select map size:"));
        sliderFieldSize.setMajorTickSpacing(1);
        sliderFieldSize.setPaintLabels(true);
        sliderFieldSize.setPaintTicks(true);
        add(sliderFieldSize);
        add(new JLabel(" Select dots to win:"));
        sliderDotsToWin.setMajorTickSpacing(1);
        sliderDotsToWin.setPaintLabels(true);
        sliderDotsToWin.setPaintTicks(true);
        add(sliderDotsToWin);

        JPanel exitPanel = new JPanel(new GridLayout(1, 2));
        add(exitPanel, BorderLayout.SOUTH);

//          кнопка  SAVE
        JButton buttonSave = new JButton("SAVE");
        buttonSave.setBackground(Color.cyan);
        exitPanel.add(buttonSave);

        buttonSave.addActionListener(e ->{

            if(radioButtonHvsAi.isSelected()){
                mode = MODE_H_VS_Ai;
            } else {
                mode = MODE_H_VS_H;
            }

            mapSize = sliderFieldSize.getValue();
//            int dotsToWin = sliderDotsToWin.getValue();

            setVisible(false);
        });



//      кнопка   CANSEL
        JButton buttonCansel = new JButton(" CANSEL");
        buttonCansel.setBackground(Color.pink);
        exitPanel.add(buttonCansel);
        buttonCansel.addActionListener(e -> {
            setVisible(false);
        });



    }

    public int getMode() {
        return mode;
    }

    public int getMapSize() {
        return mapSize;
    }
}
