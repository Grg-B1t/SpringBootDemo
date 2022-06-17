package com.example.demo3.Main;

import com.example.demo3.Config.*;
import com.example.demo3.Pojo.Circle;
import com.example.demo3.Pojo.Rectangle;
import com.example.demo3.wrapper.*;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);

        /* Rectangle r = ac.getBean(Rectangle.class);
        Circle c = ac.getBean(Circle.class);

        System.out.println("The are of Rectangle is: " + r.getArea());
        System.out.println("The are of Circle is: " + c.getArea()); */

       /*  Cir c = ac.getBean(Cir.class);
        Rect r = ac.getBean(Rect.class);

        c.printCirArea();
        r.printRectArea(); */

        CirRect cr = ac.getBean(CirRect.class);

        cr.printArea();
    }
}
