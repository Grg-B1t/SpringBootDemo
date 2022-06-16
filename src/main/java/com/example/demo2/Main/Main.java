package com.example.demo2.Main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import com.example.demo2.Configuration.Config;
import com.example.demo2.Pojo.Stu;
import com.example.demo2.Pojo.StuTeach;
import com.example.demo2.Pojo.Teach;
import com.example.demo2.Pojo.Student;
import com.example.demo2.Pojo.Teacher;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(Config.class);

        Student s1 = ac.getBean(Student.class);
        Teacher t1 = ac.getBean(Teacher.class);

        System.out.println("Student name: " + s1.getName() + " |grade " + s1.getGrade());
        System.out.println("Teacher name: " + t1.getName() + " |teaches " + t1.getCourse());

        System.out.println("--------------------------");

        Stu s2 = ac.getBean(Stu.class);
        Teach t2 = ac.getBean(Teach.class);

        s2.printInfo();
        t2.printTeachInfo();

        System.out.println("--------------------------");
        
        StuTeach stuT = ac.getBean(StuTeach.class);

        stuT.printSTinfo();
    }
}
