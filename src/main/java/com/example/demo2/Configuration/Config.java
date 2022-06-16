package com.example.demo2.Configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo2.Pojo.Stu;
import com.example.demo2.Pojo.StuTeach;
import com.example.demo2.Pojo.Student;
import com.example.demo2.Pojo.Teacher;
import com.example.demo2.Pojo.Teach;

@Configuration
public class Config {
    
    @Bean
    public Student st1(){
        return new Student("Ham", 2, 3.2);
    }

    @Bean
    public Teacher t1(){
        return new Teacher("Fay", 2, "HST");
    }

    @Bean
    public Stu st2(){
        return new Stu();
    }

    @Bean
    public Teach t2(){
        return new Teach();
    }

    @Bean
    public StuTeach sTeach(){
        return new StuTeach();
    }
}
