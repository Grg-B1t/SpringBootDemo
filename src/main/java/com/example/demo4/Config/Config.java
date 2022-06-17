package com.example.demo4.Config;

import java.util.Arrays;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.example.demo4.Pojo.College;
import com.example.demo4.Pojo.Student;
import com.example.demo4.Pojo.TeacherContainer;
import com.example.demo4.Pojo.E;
import com.example.demo4.Pojo.Emp;
import com.example.demo4.Pojo.Stu;

@Configuration
public class Config {
    @Bean
    @Primary
    public Emp e1(){
        return new Emp(1, "Sam");
    }

    @Bean
    public Emp e2(){
        return new Emp(2, "Ham");
    }

    @Bean
    public Stu s(){
        return new Stu(1, "Dan");
    }

    @Bean
    public E e(){
        return new E();
    }

    @Bean
    public College getCollege(){
        return new College();
    }

    @Bean
    public TeacherContainer getTeachers(){
        return new TeacherContainer();
    }
    
}
