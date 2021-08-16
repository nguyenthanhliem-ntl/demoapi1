package com.example.demoapi1.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "gara")
public class Gara {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String address;
    @OneToMany
    private List<Car> carList;

    public Gara() {
    }

    public Gara(Long id, String name, String address, List<Car> carList) {
        this.id = id;
        this.name = name;
        this.address = address;
        this.carList = carList;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Car> getCarList() {
        return carList;
    }

    public void setCarList(List<Car> carList) {
        this.carList = carList;
    }
}
