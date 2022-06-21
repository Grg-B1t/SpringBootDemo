package com.example.demo5.Service;

import java.util.List;
import java.util.Optional;

import com.example.demo5.Model.Employee;

public interface EmployeeServiceInterface {
    List<Employee> getAllEmployee();
    Employee createEmployee(Employee e);
    Optional<Employee> getUserbyId(int id);
    Optional<Employee> getUserbyIdandName(Integer id, String name);
    List<Employee> getUserbyName(String name);
    Optional<Employee> getUserbyIdNameCompanySalary(Integer id, String name, String company, Integer salary);
    Employee updateUserbyId(Integer id, Employee emp);
    Employee deleteUserbyId(Integer id);
}
