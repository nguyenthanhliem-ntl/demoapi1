package com.example.demoapi1.repo;

import com.example.demoapi1.model.Car;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ICarRepo  extends CrudRepository<Car,Long> {
    @Query("select e from Car e where e.color like ?1")
    Iterable<Car> findByName(String color);
}
