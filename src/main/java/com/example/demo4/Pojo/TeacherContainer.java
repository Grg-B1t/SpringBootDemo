package com.example.demo4.Pojo;

import java.util.*;

public class TeacherContainer {
    List<Teacher> teacherList = Arrays.asList(new Teacher(1, "Dough", "Harvard"),
    new Teacher(2, "Amit", "MIT"),
    new Teacher(3, "Sam", "Boston University"),
    new Teacher(4, "Justing", "Yale"));

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    
}
