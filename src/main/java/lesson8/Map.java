package lesson8;

import javax.swing.*;
import java.awt.*;

public class Map extends JPanel {
    private GameWindow gameWindow;
    private boolean indikator = false;

    // размеры клеток
    private int cellHight;
    private int cellWidht;

    private int mapSize;
    private int gameMode;


    public Map(GameWindow gameWindow) {
        try {
            UIManager.setLookAndFeel( UIManager.getCrossPlatformLookAndFeelClassName() );
        } catch (Exception e) {
            e.printStackTrace();
        }
        this.gameWindow = gameWindow;

        setBackground(Color.orange);


    }


    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        render(g);
    }
    private void render(Graphics g){

        if (!indikator){
            return;

        }

        int panelHight = getHeight();
        int panelWidth = getWidth();

        cellHight = getHeight()/panelHight;
        cellWidht = getWidth()/panelWidth;

        for (int i = 0; i < mapSize; i++) {
            int x = i * cellWidht;
            g.drawLine(x, 0, x, panelHight);
        }

        for (int i = 0; i < mapSize; i++) {
            int y = i * cellHight;
            g.drawLine(y, 0, y, panelWidth);
        }

    }



    public void startNewGame(int gameMode, int mapSize){
        this.mapSize = mapSize;
        this.gameMode = gameMode;
        System.out.println(" processing..." + mapSize + gameMode);
        indikator = true;
        repaint();
    }

}
