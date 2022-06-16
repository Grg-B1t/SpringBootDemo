package com.example.demo2.Pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class StuTeach {
  /*   @Autowired
    Teacher t1;

    @Autowired
    Student s1; */

    /* Teacher t1;
    Student s1;

    @Autowired
    public StuTeach(Teacher t1, Student s1){
        this.t1 = t1;
        this.s1 = s1;
    }
 */

    Teacher t1;
    Student s1;

    @Autowired
    public void setT1(Teacher t1) {
        this.t1 = t1;
    }

    @Autowired
    public void setS1(Student s1) {
        this.s1 = s1;
    }


    public void printSTinfo(){
        System.out.println("Teacher name: " + t1.getName() + " | Student name: " + s1.getName());
    }
}
