package learning;

import main.objectStyle.textField.DocumentFilterTextField;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;

/**
 * Created by objectstyle on 4/11/17.
 */
public class DocumentFilterTextFieldTest {
    JTextField field;

    @Before
    public void before(){
        field = new DocumentFilterTextField();
    }

    @Test
    public void checkDocumentFilterInTextField(){
        field.setText("123");
        Assert.assertEquals("123", field.getText());

        field.setText("123we");
        Assert.assertEquals("123", field.getText());
    }
}
