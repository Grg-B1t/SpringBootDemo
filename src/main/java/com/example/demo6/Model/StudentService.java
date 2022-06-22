package com.example.demo6.Model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo6.Response.Response;

@Service
public class StudentService implements StudentServiceInterface {

    public static List<Student> stuList = new ArrayList<>();

    static {
        stuList.add(new Student(1, "Sam", "HST", 3.5));
        stuList.add(new Student(2, "Ham", "CST", 3.7));
        stuList.add(new Student(3, "May", "BST", 3.2));
        stuList.add(new Student(4, "Marry", "COM", 3.8));
    }

    @Override
    public List<Student> getAllStu() {
        return stuList;
    }

    @Override
    public Student getStubyName(String name) {
        return stuList.stream().filter(a -> a.getName().contains(name)).findFirst().get();
    }

    @Override
    public Student getStubyId(Integer id) {
        return stuList.stream().filter(a -> id.equals(a.getId())).findFirst().get();
    }

    @Override
    public Student getStubyIdandName(Integer id, String name) {
        return stuList.stream().filter(a -> id.equals(a.getId()) && name.equals(a.getName())).findFirst().get();
    }

    @Override
    public Student createStudent(Student stu) {
        stuList.add(stu);
        return stu;
    }

    @Override
    public Student updateStudent(Student stu) {
        Student stu1 = stuList.stream().filter(a -> stu.getId().equals(a.getId())).findFirst().get();
        stu1.setName(stu.getName());
        stu1.setCourse(stu.getCourse());
        stu1.setGrade(stu.getGrade());
        return stu1;
    }

    @Override
    public Student updateStudentbyId(Integer id, Student stu) {
        int index = id - 1;
        stu.setId(id);

        // Student s1 = stuList.get(index);
        // int id1 = s1.getId();
        // stu.setId(id1);

        stuList.add(index, stu);
        return stuList.get(index);
    }

    @Override
    public Response deleteStudentbyId(Integer id) {
        Student ds = stuList.stream().filter(a -> a.getId().equals(id)).findFirst().get();
        stuList.remove(ds);

        Response rs = new Response();
        //rs.setName(ds.getName());
        rs.setMsg("Student name: " + ds.getName() + " is deleted from our record.");
        return rs;
    }

    @Override
    public Response deleteStudentbyName(String name) {
        Student ds = stuList.stream().filter(a -> a.getName().equals(name)).findFirst().get();
        stuList.remove(ds);

        Response rs = new Response();
       // rs.setName(ds.getName());
        rs.setMsg("Student name: " + ds.getName() + " is deleted from our record.");
        return rs;
    }
    
}
