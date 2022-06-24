package com.example.demo7.Controller;

import java.util.List;

import org.apache.coyote.http11.Http11AprProtocol;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo7.Entity.Car;
import com.example.demo7.Service.CarService;

@RestController
@RequestMapping("/api")
public class EndPoint {
    
    @Autowired
    CarService cs;

    @GetMapping("/v")
    public ResponseEntity<List<Car>> getAllCar(){
        try {
            return new ResponseEntity<>(cs.getAll(), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/v1/{make}")
    public ResponseEntity<List<Car>> getCarbyMake(@PathVariable String make){
        try {
            return new ResponseEntity<>(cs.getCarbyMake(make), HttpStatus.FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping("/v2")
    public ResponseEntity<Car> getCarbyVin(@RequestParam Integer vin){
        try {
            return new ResponseEntity<>(cs.getCarbyVin(vin), HttpStatus.FOUND);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @PostMapping("/v3")
    public ResponseEntity<Car> addCar(@RequestBody Car c){
        try {
            return new ResponseEntity<Car>(cs.addNewCar(c), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Car>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @PutMapping("v4/{vin}")
    public ResponseEntity<Car> updateCarbyVin(@PathVariable Integer vin, @RequestBody Car c){
        try {
            return new ResponseEntity<Car>(cs.updateCarbyVin(vin, c), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<Car>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

    @DeleteMapping("v4/{vin}")
    public ResponseEntity<Car> deleteCarbyVin(@PathVariable Integer vin){
        try {
            return new ResponseEntity<>(cs.deleteCarbyVin(vin), HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.NOT_ACCEPTABLE);
        }
    }

}
