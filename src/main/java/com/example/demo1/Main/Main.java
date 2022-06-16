package com.example.demo1.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.demo1.Configuration.config;
import com.example.demo1.Demo.Animal;
import com.example.demo1.Pojo.Student;
import com.example.demo1.Pojo.Teacher;

// @configuration, @bean, @autowired
public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(config.class);
        Student s1 = ac.getBean(Student.class);

        System.out.println(s1.getName() + " " + s1.getGrade());

        Teacher t1 = ac.getBean(Teacher.class);

        System.out.println(t1.getName() + " " + t1.getCollegeName());

        System.out.println("----------------------------");

        Animal a = ac.getBean(Animal.class);
        a.callName();
    }
}
