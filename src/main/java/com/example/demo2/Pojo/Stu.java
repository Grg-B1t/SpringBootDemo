package com.example.demo2.Pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Stu {
    // @Autowired  //field injection
    // Student s1;

    // Student s1;

    // @Autowired
    // public Stu(Student s1) {
    //     this.s1 = s1;
    // }


    Student s1;

    @Autowired
    public void setStudent(Student s1){
        this.s1 = s1;
    }


    public void printInfo(){
        System.out.println("Student Name: " + s1.getName() + " Student grade: " + s1.getGrade());
    }
}
