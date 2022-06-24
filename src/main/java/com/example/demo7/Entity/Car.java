package com.example.demo7.Entity;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class Car {
    private Integer vin;
    @NotEmpty(message = "Please enter valide make of car")
    private String make;
    @NotEmpty(message = "Please enter valid model of car")
    private String model;
    @NotNull(message = "Please enter valid mpg for car")
    private Double mpg;

    public Car() {
    }
    public Car(Integer vin, String make, String model, Double mpg) {
        this.vin = vin;
        this.make = make;
        this.model = model;
        
        this.mpg = mpg;
    }
    public Integer getVin() {
        return vin;
    }
    public void setVin(Integer vin) {
        this.vin = vin;
    }
    public String getMake() {
        return make;
    }
    public void setMake(String make) {
        this.make = make;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public Double getMpg() {
        return mpg;
    }
    public void setMpg(Double mpg) {
        this.mpg = mpg;
    } 

    
}
