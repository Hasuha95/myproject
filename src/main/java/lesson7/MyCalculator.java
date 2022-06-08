package lesson7;

import javax.swing.*;
import java.awt.*;

public class MyCalculator extends JFrame {
    public MyCalculator() {
        setBounds(600, 500, 400, 500);
        setTitle("My Calculator");


//        setLayout(new BorderLayout());
//        JLabel label = new JLabel("MyCalculator");
//        add(label, BorderLayout.NORTH);

        setLayout(null);
        JTextField textField = new JTextField();
        textField.setBounds(0, 0, 400, 100);
        textField.setBackground(Color.GRAY);
        add(textField);


        //  верхние кнопки

        JButton buttonResoult = new JButton(" = ");
//        buttonResoult.setOpaque(true);
        buttonResoult.setBackground(Color.GREEN);
        buttonResoult.setBounds(300, 100,100, 70);
        add(buttonResoult);

        JButton buttonZero = new JButton(" 0 ");
        buttonZero.setBounds(0, 100,100, 70);
        add(buttonZero);

        JButton buttonProcent = new JButton(" % ");
        buttonProcent.setBounds(100, 100,100, 70);
        add(buttonProcent);

        JButton buttonQadro = new JButton(" Xˆ2 ");
        buttonQadro.setBounds(200, 100,100, 70);
        add(buttonQadro);


        // боковые кнопки

        JButton buttonPlus = new JButton("+");
        buttonPlus.setForeground(Color.ORANGE);
        buttonPlus.setBounds(300, 170,100, 100);
        add(buttonPlus);

        JButton buttonMinus = new JButton("-");
        buttonMinus.setForeground(Color.ORANGE);
        buttonMinus.setBounds(300, 270,100, 100);
        add(buttonMinus);

        JButton buttonMultiply = new JButton("x");
        buttonMultiply.setForeground(Color.ORANGE);
        buttonMultiply.setBounds(300, 370,100, 100);
        add(buttonMultiply);


        //   основные кнопки
        int number = 0;
        for (int i = 0; i < 3; i++) {
            int x = 0;
            for (int j = 0; j < 3; j++) {
                number++;
                JButton button = new JButton(""+ number);
                button.setBounds(100 * x, (170+100*i), 100, 100);
                add(button);
                x++;
            }
        }









        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
