package com.example.demoapi1.service.Car;

import com.example.demoapi1.model.Car;
import com.example.demoapi1.service.IGeneralService;
import com.example.demoapi1.service.gara.IGaraService;

public interface ICarService extends IGeneralService<Car> {
    Iterable<Car> searchName(String color);

}
