package com.example.demo3.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.demo3.Pojo.Circle;
import com.example.demo3.Pojo.Rectangle;
import com.example.demo3.wrapper.*;

@Configuration
public class Config {
    
    @Bean
    public Rectangle getRect(){
        return new Rectangle(4, 2);
    }

    @Bean
    public Circle getCir(){
        return new Circle(2);
    }

    @Bean
    public Rect getR(){
        return new Rect();
    }

    @Bean
    public Cir getC(){
        return new Cir();
    }

    @Bean
    public CirRect getCr(){
        return new CirRect();
    }
    
}
