package com.objectStyle.bean;

public class Course {


    private static final Course instance = new Course();
    private static String name;

    private Course() {
    }

    public static Course getInstance() {
        return instance;
    }

    public String getName() {
        return name;
    }

    public void setName(String selectedText) {
        this.name = selectedText;
    }
}
