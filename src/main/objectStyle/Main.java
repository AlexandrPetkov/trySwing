package main.objectStyle;

import main.objectStyle.textField.FilterNumbersTextField;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        JTextField field = new FilterNumbersTextField();
        JFrame frame = new JFrame("KeyFilter test");
        frame.add(field);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
    }
}
