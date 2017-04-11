package main.objectStyle.textField;

import javax.swing.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class FilterNumbersTextField extends JTextField {

    public FilterNumbersTextField() {
        this.addKeyListener(new KeyAdapter() {
            @Override
            public void keyTyped(KeyEvent e) {

                if (isNumber(e)){
                    e.consume();
                }

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (isNumber(e)){
                    e.consume();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if (isNumber(e)){
                    e.consume();
                }
            }

            public boolean isNumber(KeyEvent event){
                char c = event.getKeyChar();
                return c < '0' || c > '9';
            }
        });
    }
}
