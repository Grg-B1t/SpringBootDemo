package com.example.demo5.Controller;

import java.util.List;
import java.util.Optional;

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
    public ResponseEntity<List<Employee>> getName() {
        try{
            return new ResponseEntity<>(es.getAllEmployee(), HttpStatus.OK);
        }
        catch(Exception err){
            System.out.println(err);
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }   

    }

    @GetMapping("/{uid}")
    public ResponseEntity<Optional<Employee>> getId(@PathVariable(value = "uid") int id) {
        try {
            return new ResponseEntity<>(es.getUserbyId(id), HttpStatus.FOUND);    
        } catch (Exception e) {
            //TODO: handle exception
            System.out.println(e);
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        
    }

    @GetMapping("/{uid}/{uname}")
    public ResponseEntity<Employee> getIdandName(@PathVariable(value = "uid") Integer id, @PathVariable(value = "uname") String name) {
        // System.out.println(es.getUserbyIdandName(id, name).get().getName());
       try {
        return new ResponseEntity<>(es.getUserbyIdandName(id, name), HttpStatus.FOUND) ;
       } catch (Exception e) {
        //TODO: handle exception
        System.out.println(e);
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
       } 
    }

    @GetMapping("/v2")
    public ResponseEntity<List<Employee>> getNameParam(@RequestParam(value = "name") String name) {
       try {
        return new ResponseEntity(es.getUserbyName(name), HttpStatus.OK);
       } catch (Exception e) {
        //TODO: handle exception
        return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
       } 
    }

    @GetMapping("/v2/{id}/{name}")
    public ResponseEntity<Employee> getSomething(@PathVariable(value = "id") Integer id, @PathVariable(value = "name") String name,
            @RequestParam(value = "company") String company, @RequestParam(value = "salary") Integer salary) {
                try {
                    return new ResponseEntity<>(es.getUserbyIdNameCompanySalary(id, name, company, salary), HttpStatus.FOUND);
                } catch (Exception e) {
                    //TODO: handle exception
                    return new ResponseEntity<>(HttpStatus.NOT_FOUND);
                }
                
            }

    @PostMapping("/v3/")
    public ResponseEntity<Employee> __create_new_employee(@Validated @RequestBody Employee emp){
        try {
            return new ResponseEntity<>(es.createEmployee(emp), HttpStatus.CREATED);    
        } catch (Exception e) {
            //TODO: handle exception
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        
    }

    @PutMapping("/{id}")
    public ResponseEntity<Employee> __update_emplopyee(@Validated @PathVariable(value = "id") int id, @RequestBody Employee emp){        
        try {
            return new ResponseEntity<>(es.updateUserbyId(id, emp), HttpStatus.ACCEPTED);    
        } catch (Exception e) {
            //TODO: handle exception
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
        
    }

    @PutMapping("/up")
    public ResponseEntity<Employee> __update_emplopyee_byData(@Validated @RequestBody Employee emp){
        try {
            return new ResponseEntity<Employee>(es.updateUserbyData(emp), HttpStatus.ACCEPTED);
        } catch (Exception e) {
            //TODO: handle exception
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Employee> __delete_employee(@PathVariable(value = "id") Integer id){
        try {
            return new ResponseEntity<Employee>(es.deleteUserbyId(id), HttpStatus.OK);    
        } catch (Exception e) {
            //TODO: handle exception
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE); 
        }
        
    }


}
