package com.example.demo1.Demo;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo1.Pojo.Teacher;

public class Animal {
    
    //Field Dependency injection
    // @Autowired
    // Teacher t1;

    // public void callName(){
    //     System.out.println("Hello " + t1.getName() + " with ID " + t1.getId());
    // }


    /**
     * Constructor Dependency Injection
     
    Teacher t1;

    @Autowired
    public Animal(Teacher t1) {
        this.t1 = t1;
    }

    public void callName(){
             System.out.println("Hello " + t1.getName() + " with ID " + t1.getId());
        }
    */

    /*
     * Setter Dependency injection
     */

     Teacher t1;
    @Autowired
    public void setT1(Teacher t1) {
        this.t1 = t1;
    }

    public void callName(){
        System.out.println("Hello " + t1.getName() + " with ID " + t1.getId());
   }
     
}
