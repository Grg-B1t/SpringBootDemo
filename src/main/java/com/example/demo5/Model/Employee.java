package com.example.demo5.Model;

public class Employee {
    private int id;
    private String name;
    private String company;
    private String field;
    private int salary;
    
    public Employee() {
    }

    
    public Employee(int id, String name, String company, String field, int salary) {
        this.id = id;
        this.name = name;
        this.company = company;
        this.field = field;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getCompany() {
        return company;
    }
    public void setCompany(String company) {
        this.company = company;
    }
    public String getField() {
        return field;
    }
    public void setField(String field) {
        this.field = field;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    
}
