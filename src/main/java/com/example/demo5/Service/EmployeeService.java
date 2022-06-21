package com.example.demo5.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;


import org.springframework.stereotype.Service;

import com.example.demo5.Model.Employee;

@Service
public class EmployeeService implements EmployeeServiceInterface{
    public static List<Employee> empList = new ArrayList<>();
    
    static{
        empList.add(new Employee(1, "Sam", "HCL", "IT", 52000));
        empList.add(new Employee(2, "Ham", "ABC", "Sales", 60000));
        empList.add(new Employee(3, "Doug", "XYZ", "Management", 55000));
        empList.add(new Employee(4, "Ram", "TMZ", "Development", 59000));
        empList.add(new Employee(5, "Sue", "MTV", "Marketting", 50000));
    }

    @Override
    public List<Employee> getAllEmployee() {
        // TODO Auto-generated method stub
        return empList;
    }

    @Override
    public Employee createEmployee(Employee e) {
        // TODO Auto-generated method stub
        empList.add(e);
        return e;
    }

    @Override
    public Optional<Employee> getUserbyId(int id) {
        // TODO Auto-generated method stub
       return empList.stream().filter(a -> a.getId() == id).findFirst();
    }

    @Override
    public Optional<Employee> getUserbyIdandName(Integer id, String name) {
        // TODO Auto-generated method stub
        // System.out.println(empList.stream().filter(a -> a.getId() == id & a.getName() == name).findFirst().get());
        return empList.stream().filter(a -> id.equals(a.getId()) && name.equals(a.getName())).findFirst();
        // for (Employee employee : empList) {
        //     if(id.equals(employee.getId()) && name.equals(employee.getName())){
        //         return employee;
        //     }
        // }
    }

    @Override
    public List<Employee> getUserbyName(String name) {
        // TODO Auto-generated method stub
        return empList.stream().filter(a -> name.equals(a.getName())).collect(Collectors.toList());
    }

    @Override
    public Optional<Employee> getUserbyIdNameCompanySalary(Integer id, String name, String company, Integer salary) {
        // TODO Auto-generated method stub
        return empList.stream().filter(a -> id.equals(a.getId()) && name.equals(a.getName()) && company.equals(a.getCompany()) && salary.equals(a.getSalary())).findFirst();
    }

    @Override
    public Employee updateUserbyId(Integer id, Employee emp) {
        // TODO Auto-generated method stub
        // Employee e1 = empList.stream().filter(a-> id.equals(a.getId())).forEach(a-> a.setName(emp.getName()); a.setCompany(emp.set););;
        
        // for (Employee employee : empList) {
        //     if(id.equals(employee.getId())){
        //         employee.setName(emp.getName());
        //         employee.setCompany(emp.getCompany());
        //         employee.setField(emp.getField());
        //         employee.setSalary(emp.getSalary());
        //         return employee;
        //     }
        // }
        
         Employee e = empList.stream().filter(a -> id.equals(a.getId())).findFirst().get();
            e.setName(emp.getName());
            e.setCompany(emp.getCompany());
            e.setField(emp.getField());
            e.setSalary(emp.getSalary());
        
        return e;
    }

    @Override
    public Employee deleteUserbyId(Integer id) {
        // TODO Auto-generated method stub
        Employee e = empList.stream().filter(a -> id.equals(a.getId())).findFirst().get();
        empList.remove(e);
        return e;
    }
}
