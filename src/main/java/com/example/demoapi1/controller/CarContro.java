package com.example.demoapi1.controller;

import com.example.demoapi1.model.Car;
import com.example.demoapi1.service.Car.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/car")
public class CarContro {

    @Autowired
    private CarService carService;
    @GetMapping
    public ResponseEntity<Iterable<Car>> findAll(){
        Iterable<Car> findAll= carService.findAll();
        return new ResponseEntity<>(findAll, HttpStatus.OK);
    }
    @GetMapping("/search")
    public ResponseEntity<Iterable<Car>> searchName(@RequestParam String color){
        Iterable<Car> cars = carService.searchName("%"+color+"%");
        return new ResponseEntity<>(cars , HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Car> create(@RequestBody Car car){
        carService.save(car);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }
    @PutMapping("/{id}")
    public ResponseEntity<Car> update(@PathVariable Long id,@RequestBody Car car){
        Optional<Car> carOptional = carService.findById(id);
        if (!carOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }else {
            carService.findById(carOptional.get().getId());
            carService.save(car);
            return new ResponseEntity<>(HttpStatus.OK);
        }

    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Car> deleteEmployee(@PathVariable Long id){
        Optional<Car> employeeOptional = carService.findById(id);
        if (!employeeOptional.isPresent()){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        carService.remote(id);
        return new ResponseEntity<>(employeeOptional.get(),HttpStatus.NO_CONTENT);
    }
}
