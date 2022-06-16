package com.example.demo1.Pojo;

public class Teacher {
    private String name;
    private int id;
    private String collegeName;
    
    public Teacher(String name, int id, String collegeName) {
        this.name = name;
        this.id = id;
        this.collegeName = collegeName;
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

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    
}
