package com.example.demo2.Pojo;

public class Teacher {
    private String name;
    private int id;
    private String course;
    
    public Teacher(String name, int id, String course) {
        this.name = name;
        this.id = id;
        this.course = course;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getCourse() {
        return course;
    }
    public void setCourse(String course) {
        this.course = course;
    }

    
}
