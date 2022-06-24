package com.example.demo7.Service;

import java.util.Map.Entry;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo7.Entity.Car;

@Service
public class CarService implements CarServiceInterface {

    public static HashMap<Integer, Car> carList = new HashMap<>();
    static{
        carList.put(1, new Car(12301, "Nissan", "Altima", 26.5));
        carList.put(2, new Car(12302, "Subaru", "Crosstrek", 29.5));
        carList.put(3, new Car(12304, "Honda", "Civic", 27.5));
        carList.put(4, new Car(12305, "Toyota", "Prius", 30.5));
        carList.put(5, new Car(12306, "Nissan", "Maxima", 27.5));
    }

    @Override
    public List<Car> getAll() {
        List<Car> cl = new ArrayList(carList.values());
        return cl;
    }


    @Override
    public List<Car> getCarbyMake(String make) {
        List<Car> cl = new ArrayList(carList.values());
        return cl.stream().filter(a -> make.equals(a.getMake())).collect(Collectors.toList());
    }

    @Override
    public Car getCarbyVin(Integer vin) {
        List<Car> cl = new ArrayList(carList.values());
        return cl.stream().filter(a -> vin.equals(a.getVin())).findFirst().get();
    }

    @Override
    public Car addNewCar(Car c) {
        carList.put(generateKey(), c);
        return c;
    }

    public static Integer generateKey(){
        int max = 0;
        for (Integer key : carList.keySet()) {
            if(key > max){
                max = key;
            }
        }
        return max + 1;
    }

    @Override
    public Car updateCarbyVin(Integer vin, Car c) {
        Car nc = null;
        
        for (Car cl : carList.values()) {
            if(cl.getVin().equals(vin)){
                cl.setMake(c.getMake());
                cl.setModel(c.getModel());
                cl.setMpg(c.getMpg());
                return cl;
            }
        }

       // nc.setVin(c.getVin());
       // nc.setMake(c.getMake());
       // nc.setModel(c.getModel());
       // nc.setMpg(c.getMpg());

        return nc;
    }

    @Override
    public Car deleteCarbyVin(Integer vin) {
        // Integer key = 1;
        // for (Car car : carList.values()) {
        //     if(car.getVin().equals(vin)){
        //         carList.remove(key, car);
        //     }
        //     key++;
        // } 

        for (Entry<Integer, Car> cl : carList.entrySet()) {
            if(cl.getValue().getVin().equals(vin)){
                carList.remove(cl.getKey());
                return cl.getValue();
            }
        }

        return null;
    }

    
}
