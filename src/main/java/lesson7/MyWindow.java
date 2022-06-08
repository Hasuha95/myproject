package lesson7;

import javax.swing.*;
import java.awt.*;

public class MyWindow extends JFrame {
    public MyWindow() {
        setBounds(400, 300, 600, 500);
        setTitle("MyWindow");

        setLayout(new BorderLayout());
        JButton button= new JButton("btn1");
        button.setBorderPainted(false);
        button.setBackground(Color.GREEN);
        add(button, BorderLayout.NORTH);


//        setLayout(null);
//        JButton button = new JButton("кнопка");
//        button.setBounds(0,0, 100, 50);
//        add(button);

//        setLayout(new FlowLayout());
//        for (int i = 1; i <= 7; i++) {
//            JButton button = new JButton("btn_" + i);
//            add(button);
//        }

//        setLayout(new GridLayout(3,3));
//        for (int i = 1; i <= 12; i++) {
//            JButton button = new JButton("btn_" + i);
//            add(button);
//        }


//        setLayout(new BorderLayout());
//
//        JTextField textField = new JTextField();
//        add(textField, BorderLayout.NORTH);
//
//        JButton buttonSend = new JButton("send");
//        add(buttonSend, BorderLayout.SOUTH);
//
//        JTextArea textArea = new JTextArea();
//        add(textArea, BorderLayout.CENTER);
//
//        buttonSend.addActionListener(e -> {
//            textArea.append(textField.getText() + "\n");
//            textField.setText("");
//        });

        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
}
