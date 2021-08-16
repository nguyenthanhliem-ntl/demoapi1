package com.example.demoapi1.service.Car;

import com.example.demoapi1.model.Car;
import com.example.demoapi1.repo.ICarRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CarService implements ICarService {

    @Autowired
    private ICarRepo carRepo;

    @Override
    public Iterable findAll() {
        return carRepo.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return carRepo.findById(id);
    }

    @Override
    public void save(Car car) {
        carRepo.save(car);
    }

    @Override
    public void remote(Long id) {
        carRepo.deleteById(id);
    }

    @Override
    public Iterable<Car> searchName(String color) {
        return carRepo.findByName(color);
    }
}
