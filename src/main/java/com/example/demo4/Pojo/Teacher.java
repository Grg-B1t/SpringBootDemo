package com.example.demo4.Pojo;

public class Teacher {
    private int id;
    private String name;
    private String collegeName;
    
    public Teacher(int id, String name, String collegeName) {
        this.id = id;
        this.name = name;
        this.collegeName = collegeName;
    }

    @Override
    public String toString() {
        return "Teacher [collegeName=" + collegeName + ", id=" + id + ", name=" + name + "]";
    }

    
}
