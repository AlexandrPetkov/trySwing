package main.objectStyle.textField;

import javax.swing.*;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

public class OnlyNumbersTextField extends JTextField{

    public OnlyNumbersTextField() {
        this.getDocument().addDocumentListener(new DocumentListener(){
            @Override
            public void insertUpdate(DocumentEvent e) {
                formatText();
             }

            @Override
            public void removeUpdate(DocumentEvent e) {
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                formatText();
            }
        });
    }

    private void formatText(){
      String text = this.getText();

      if (text.length() > 0 && !containsOnlyNumbers()){

          Runnable editText = new Runnable() {
              @Override
              public void run() {
                  String formattedText = deleteNotNumbers(text);
                  setText(formattedText);
              }
          };
          SwingUtilities.invokeLater(editText);
          }

    }

    private boolean containsOnlyNumbers()  {
        return this.getText().matches("\\d+");
    }

    private String deleteNotNumbers(String text){
        char[] chars = text.toCharArray();
        StringBuilder formattedText = new StringBuilder();

        for (int i = 0; i < chars.length ; i++) {
            if (chars[i] >= 48 && chars[i] <= 57){
                formattedText.append(chars[i]);
            }
        }

        return formattedText.toString();
    }


}
