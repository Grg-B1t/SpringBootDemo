package com.example.demo4.Main;

import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.demo4.Config.*;
import com.example.demo4.Pojo.*;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);
    
        Emp e = ac.getBean(Emp.class);

        System.out.println("Get Name: " + e.getName() + " | Get ID: " + e.getId());
        System.out.println("---------------------------");

        E e2 = ac.getBean(E.class);
        e2.printEandS();

        System.out.println("---------------------");


        College coll = ac.getBean(College.class);

     //   System.out.println(coll.getGetStuList());

         for (Student stu : coll.getGetStuList()) {
            System.out.println(stu);
         }

         System.out.println("------------------------");
         
         TeacherContainer tc = ac.getBean(TeacherContainer.class);

         for (Teacher t : tc.getTeacherList()) {
            System.out.println(t);
         }

      
    }
}
