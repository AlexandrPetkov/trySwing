package com.objectStyle;

import com.objectStyle.bean.Course;

import javax.swing.*;
import java.awt.event.FocusAdapter;
import java.awt.event.FocusEvent;

public class CourseNameEnterForm {
    private JTextField courseName;
    private JPanel panelMain;
    private JLabel courseNameLabel;


    public CourseNameEnterForm() {
        courseName.addFocusListener(new FocusAdapter() {
            @Override
            public void focusLost(FocusEvent e) {
                Course course = Course.getInstance();
                course.setName(courseName.getText().trim());
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("CourseNameEnterForm");
        frame.setContentPane(new CourseNameEnterForm().panelMain);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
