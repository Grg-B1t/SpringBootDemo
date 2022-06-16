package com.example.demo2.Pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Teach {
    // @Autowired
    // Teacher t1;

    // Teacher t1;

    // @Autowired
    // public Teach(Teacher t1) {
    //     this.t1 = t1;
    // }

    Teacher t1;

    @Autowired
    public void setTeacher(Teacher t1){
        this.t1 = t1;
    }


    public void printTeachInfo(){
        System.out.println("Teacher name: " + t1.getName() + " Teaches: " + t1.getCourse());
    }
}
