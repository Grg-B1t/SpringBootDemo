package com.example.demo1.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo1.Demo.Animal;
import com.example.demo1.Pojo.Student;
import com.example.demo1.Pojo.Teacher;

@Configuration
public class config {
    @Bean
    public Student st1(){
        Student s = new Student("Sam", 1, 3.7);
        return s;
    }

    @Bean
    public Teacher T1(){
        return new Teacher("Dough", 1, "Boston University");
    }

    @Bean
    public Animal a1(){
        return new Animal();
    }
}
