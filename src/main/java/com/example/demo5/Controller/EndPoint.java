package com.example.demo5.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo5.Model.Student;

// @Controller
// @ResponseBody
@RestController
public class EndPoint {

//    @RequestMapping(value = "/api/v1", method = RequestMethod.GET)
    @GetMapping("/api/v1")
    public String getString(){
        return "First Rest API";
    }

    @PostMapping("/api/v1")
    public Student newUser(@Validated @RequestBody Student stu){
        System.out.println(stu.getId() + " " + stu.getName() + " " + stu.getGrage());
        return stu;
    }

    @GetMapping("/api/v1/{id}")
    public String getId(@PathVariable(value = "id") Long id){
        return "Your ID : " + id;
    }

    @GetMapping("/api1/v1/{name}")
    public String getName(@PathVariable(value = "name") String name){
    return "your name :" + name;
    }

    @GetMapping("/api/v2/{id}/{name}")
    public String getIdandName(@PathVariable(value = "id")Long id, @PathVariable(value = "name") String name){
        return "your Name: " + name + "\nYour ID: " + id;
    }

    @GetMapping("/api/v3")
    public String getSomethihng(@RequestParam(value = "some") String some){
        return "Here is something: " + some;
    }

    @GetMapping("/api/v4")
    public String getSomethihng2(@RequestParam(value = "id") Long id, @RequestParam(value = "name") String name){
        return "Your ID :" + id + "\nYour Name: " + name;
    }

    @GetMapping("/api/v5")
    public String getSomethihng3(@RequestParam(value = "id") Long id, @RequestParam(value = "name") String name, @RequestParam(value = "grade") Double grade){
        return "Your ID :" + id + "\nYour Name: " + name + "\nYour Grade: " + grade;
    }

    @GetMapping("/api/v6/{uid}")
    public String somethingAwe(@PathVariable(value = "uid") long id, @RequestParam(value="uname") String name){
        return "User ID: " + id + "\nUser Name: " + name;
    }

    @PutMapping("/api/v7/{uid}")
    public String updateSomething(@PathVariable(value = "uid") long id, @Validated @RequestBody Student stu){
        return "Your user id : " + id + " with user name : " + stu.getName() + " is updated successfully"; 
    }

    @DeleteMapping("api/d1/{id}")
    public String deleteSomething(@PathVariable(value = "id") long id){
        return "The user with id " + id + " is deleted successfully";
    }
}
