package com.example.demo4.Pojo;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;

public class College {
    
   public static List<Student> getStuList = new ArrayList<>();

   static {
    getStuList.add(new Student(1, "Sam", "CS1", 3.5));
    getStuList.add(new Student (2, "Ham", "HST", 3.2));
    getStuList.add(new Student(3, "Joy", "HMT", 3.7));
    getStuList.add(new Student(4, "Jemma", "BIO", 3.9));
    getStuList.add(new Student(5, "Justin", "CS1", 3.1));
   }

public static List<Student> getGetStuList() {
    return getStuList;
}

   
    

}
