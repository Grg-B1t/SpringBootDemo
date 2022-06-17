package com.example.demo3.wrapper;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo3.Pojo.*;

public class CirRect {
    // @Autowired
    // Circle c;

    // @Autowired
    // Rectangle r;

    Circle c;
    Rectangle r;

    
    // @Autowired
    // public CirRect(Circle c, Rectangle r) {
    //     this.c = c;
    //     this.r = r;
    // }
    @Autowired
    public void setC(Circle c) {
        this.c = c;
    }

    @Autowired
    public void setR(Rectangle r) {
        this.r = r;
    }

    public void printArea(){
        System.out.println("Circle area: " + c.getArea());
        System.out.println("Reactangle area: " + r.getArea());
    }


    
}
