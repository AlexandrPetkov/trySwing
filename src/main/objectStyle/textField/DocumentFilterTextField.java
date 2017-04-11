package main.objectStyle.textField;

import javax.swing.*;
import javax.swing.text.*;


public class DocumentFilterTextField extends JTextField{

    public DocumentFilterTextField() {
        this.setDocument(new PlainDocument() {
            @Override
            public void insertString(int offs, String str, AttributeSet a) throws BadLocationException {
                if (str == null)
                    return;

                char[] chars = str.toCharArray();
                StringBuilder builder = new StringBuilder();

                for (int i = 0; i < chars.length; i++) {
                    if (chars[i] >= '0' && chars[i] <= '9'){
                        builder.append(chars[i]);
                    }
                }

                super.insertString(offs, builder.toString(), a);
            }
        });
    }
}
