package com.example.demo6.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo6.Model.Student;
import com.example.demo6.Model.StudentService;
import com.example.demo6.Response.Response;

@RestController
@RequestMapping("/api")
public class EndPoint {
    StudentService sc;

    @Autowired
    public EndPoint(StudentService sc) {
        this.sc = sc;
    }

    @GetMapping("/v")
    public ResponseEntity<List<Student>> getAllStu() {
        try {
            return new ResponseEntity<>(sc.getAllStu(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @GetMapping("/v1/{name}")
    public ResponseEntity<Student> getStubyID(@PathVariable(value = "name") String name) {
        try {
            return new ResponseEntity<>(sc.getStubyName(name), HttpStatus.FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/v2/{id}")
    public ResponseEntity<Student> getUserbyId(@PathVariable(value = "id") Integer id) {
        try {
            return new ResponseEntity<>(sc.getStubyId(id), HttpStatus.FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/v3/{id}/{name}")
    public ResponseEntity<Student> getUserbbyIDandName(@PathVariable(value = "id") Integer id,
            @PathVariable(value = "name") String name) {
        try {
            return new ResponseEntity<>(sc.getStubyIdandName(id, name), HttpStatus.FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        

    }

    @GetMapping("/v4")
    public ResponseEntity<Student> getUserbbyIDandName1(@RequestParam(value = "id") Integer id, 
             @RequestParam(value = "name") String name) {
        try {
            return new ResponseEntity<>(sc.getStubyIdandName(id, name), HttpStatus.FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/v5")
    public ResponseEntity<Student> createStudent(@Validated @RequestBody Student stu){
        try {
            return new ResponseEntity<>(sc.createStudent(stu), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
    }

    @PutMapping("/v6")
    public ResponseEntity<Student> updateStudent(@Validated @RequestBody Student stu){
        try {
            return new ResponseEntity<>(sc.updateStudent(stu), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @PutMapping("/v7")
    public ResponseEntity<Student> updateStudentbyId(@Validated @RequestParam Integer id, @RequestBody Student stu){
        try {
            return new ResponseEntity<>(sc.updateStudentbyId(id, stu), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_MODIFIED);
        }
    }

    @DeleteMapping("/v8")
    public ResponseEntity<Response> deleteStudentbyId(@RequestParam Integer id ){
        try {
            return new ResponseEntity<>(sc.deleteStudentbyId(id), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @DeleteMapping("/v9")
    public ResponseEntity<Response> deleteStudentbyName(@RequestParam String name ){
        try {
            return new ResponseEntity<>(sc.deleteStudentbyName(name), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }
}
