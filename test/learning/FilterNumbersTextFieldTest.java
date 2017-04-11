package learning;

import main.objectStyle.textField.FilterNumbersTextField;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;


public class FilterNumbersTextFieldTest {
    JTextField field;
    JFrame frame;

    @Before
    public void before(){
        field = new FilterNumbersTextField();
    }

    @Test
    public void checkFilterNumbersTextField() throws InterruptedException {
        frame = new JFrame ("KeyFilter test");
        frame.add(field);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 300);
        frame.setVisible(true);
/*
        field.setText("123");
        Assert.assertEquals("123", field.getText());

        field.setText("123we");
        Assert.assertEquals("123", field.getText());
*/
    }
}
