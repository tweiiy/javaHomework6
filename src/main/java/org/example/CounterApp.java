package org.example;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CounterApp extends JFrame {
    private int value;
    public CounterApp(int initialValue) {
        setBounds(500, 500, 300, 120);
        setTitle("Simple Counter");
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        Font font = new Font("Arial", Font.BOLD, 32);
        JLabel counterValueView = new JLabel();
        counterValueView.setFont(font);
        counterValueView.setHorizontalAlignment(SwingConstants.CENTER);
        add(counterValueView, BorderLayout.CENTER);
        value = initialValue;
        counterValueView.setText(String.valueOf(value));
        JButton decrementButton = new JButton("/2");
        decrementButton.setFont(font);
        add(decrementButton, BorderLayout.WEST);
        JButton incrementButton = new JButton("*2");
        incrementButton.setFont(font);
        add(incrementButton, BorderLayout.EAST);
        decrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (value!=1)
                    value/=2;
                counterValueView.setText(String.valueOf(value));
            }
        });
        incrementButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                value*=2;
                counterValueView.setText(String.valueOf(value));
            }
        });
        setVisible(true);
    }

    public static void main(String[] args) {
        new CounterApp(1);
    }
}