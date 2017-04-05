package com.objectStyle;

import com.objectStyle.bean.Course;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CourseNameEnterForm {
    private JTextField courseName;
    private JPanel panelMain;
    private JLabel courseNameLabel;
    private JButton courseNameSet;

    public CourseNameEnterForm() {
        courseNameSet.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Course course = Course.getInstance();
                course.setName(courseName.getText());
                //JOptionPane.showMessageDialog(null, "You name entered is:[" + course.getName() + "]");
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
