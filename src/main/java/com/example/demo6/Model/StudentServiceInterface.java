package com.example.demo6.Model;

import java.util.List;

import com.example.demo6.Response.Response;

public interface StudentServiceInterface {
    List<Student> getAllStu();
    Student getStubyName(String name);
    Student getStubyId(Integer id);
    Student getStubyIdandName(Integer id, String name);
    Student createStudent(Student stu);
    Student updateStudent(Student stu);
    Student updateStudentbyId(Integer id, Student stu);
    Response deleteStudentbyId(Integer id);
    Response deleteStudentbyName(String name);
}
