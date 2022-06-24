package com.example.demo7.Service;

import java.util.List;

import com.example.demo7.Entity.Car;

public interface CarServiceInterface {
    List<Car> getAll();
    List<Car> getCarbyMake(String make);
    Car getCarbyVin(Integer vin);
    Car addNewCar(Car c);
    Car updateCarbyVin(Integer vin, Car c);
    Car deleteCarbyVin(Integer vin);
}
