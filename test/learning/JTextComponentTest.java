package learning;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.swing.*;
import javax.swing.text.BadLocationException;


public class JTextComponentTest {
    JTextField component;
    String text;


        @Before
        public void before(){
           component  = new JTextField();
           text = "Test text";
           component.setText(text);
        }

    @Test
    public void testGetTextMethods(){
        Assert.assertEquals(text, component.getText());

        try {
            Assert.assertEquals(text, component.getText(0, text.length()));
        } catch (BadLocationException e) {
            e.printStackTrace();
        }


//        Assert.assertTrue(component.getUIClassID().contains(text));
//        Assert.assertFalse(component.getToolTipText().contains(text));
//        Assert.assertFalse(component.getName().contains(text));
//        Assert.assertTrue(component.toString().contains(text));

        component.selectAll();
        Assert.assertEquals(text, component.getSelectedText());

        try {
            Assert.assertEquals(text, component.getDocument().getText(0, component.getDocument().getLength()));
        } catch (BadLocationException e) {
            e.printStackTrace();
        }

 //       Assert.assertTrue(component.getInputContext().toString().contains(text));
    }
}
