package com.example.demo3.wrapper;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo3.Pojo.Rectangle;

public class Rect {
    // @Autowired
    // Rectangle r;

    Rectangle r;

    
    // @Autowired
    // public Rect(Rectangle r) {
    //     this.r = r;
    // }

    @Autowired
    public void setR(Rectangle r) {
        this.r = r;
    }

    public void printRectArea(){
        System.out.println("Area of Rectangle: " + r.getArea());
    }


  


}
