package learning;

import main.objectStyle.textField.OnlyNumbersTextField;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

/**
 * Created by objectstyle on 4/10/17.
 */
public class OnlyNumbersTextFieldTest {
    JTextField field;

    @Before
    public void before(){
        field = new OnlyNumbersTextField();
    }

    @Test
    public void validateNumber(){
        field.setText("1233");
        Assert.assertEquals("1233", field.getText());
        field.setText("1233we");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        Assert.assertEquals("1233", field.getText());
    }
}
