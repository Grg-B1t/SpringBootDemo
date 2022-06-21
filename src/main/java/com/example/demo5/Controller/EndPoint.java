package com.example.demo5.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo5.Model.Employee;
import com.example.demo5.Service.EmployeeService;
import com.example.demo5.Service.EmployeeServiceInterface;

@RestController
@RequestMapping("api/v1")
public class EndPoint {

    @Autowired
    EmployeeService es;


    @GetMapping("/")
    public List<Employee> getName() {
        return es.getAllEmployee();
    }

    @GetMapping("/{uid}")
    public Optional<Employee> getId(@PathVariable(value = "uid") int id) {
        
        return es.getUserbyId(id);
    }

    @GetMapping("/{uid}/{uname}")
    public Optional<Employee> getIdandName(@PathVariable(value = "uid") Integer id, @PathVariable(value = "uname") String name) {
        // System.out.println(es.getUserbyIdandName(id, name).get().getName());
        return es.getUserbyIdandName(id, name);
    }

    @GetMapping("/v2")
    public List<Employee> getNameParam(@RequestParam(value = "name") String name) {
        return es.getUserbyName(name);
    }

    @GetMapping("/v2/{id}/{name}")
    public Optional<Employee> getSomething(@PathVariable(value = "id") Integer id, @PathVariable(value = "name") String name,
            @RequestParam(value = "company") String company, @RequestParam(value = "salary") Integer salary) {
                return es.getUserbyIdNameCompanySalary(id, name, company, salary);
            }

    @PostMapping("/v3/")
    public Employee __create_new_employee(@Validated @RequestBody Employee emp){
        return es.createEmployee(emp);
    }

    @PutMapping("/{id}")
    public Employee __update_emplopyee(@Validated @PathVariable(value = "id") int id, @RequestBody Employee emp){        
        return es.updateUserbyId(id, emp);
    }

    @DeleteMapping("/{id}")
    public Employee __delete_employee(@PathVariable(value = "id") Integer id){
        
        return es.deleteUserbyId(id);
    }


}
