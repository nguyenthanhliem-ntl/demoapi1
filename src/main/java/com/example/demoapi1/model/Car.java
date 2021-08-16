package com.example.demoapi1.model;

import javax.persistence.*;

@Entity
@Table(name = "car")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

    private String color;
    private String wheel;
    private String seat;

    @ManyToOne
    @JoinColumn(name = "gara_id")
    private Gara gara;

    public Car() {
    }

    public Car(Long id, String color, String wheel, String seat, Gara gara) {
        this.id = id;
        this.color = color;
        this.wheel = wheel;
        this.seat = seat;
        this.gara = gara;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getWheel() {
        return wheel;
    }

    public void setWheel(String wheel) {
        this.wheel = wheel;
    }

    public String getSeat() {
        return seat;
    }

    public void setSeat(String seat) {
        this.seat = seat;
    }

    public Gara getGara() {
        return gara;
    }

    public void setGara(Gara gara) {
        this.gara = gara;
    }
}
