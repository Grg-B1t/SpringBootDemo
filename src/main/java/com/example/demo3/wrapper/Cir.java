package com.example.demo3.wrapper;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo3.Pojo.Circle;

public class Cir {
    
    // @Autowired
    // Circle c;

    Circle c;

    
    // @Autowired
    // public Cir(Circle c) {
    //     this.c = c;
    // }

    
    @Autowired
    public void setC(Circle c) {
        this.c = c;
    }

    public void printCirArea(){
        System.out.println("Area of Circle: " + c.getArea());
    }

}
