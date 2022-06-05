package com.example.firstspring.car;

import java.time.LocalDate;
import java.util.Date;

public class Car {
    private Long id;
    private String Model;
    private String Brand;
    private int HP;
    private int weight;
    private int maxSpeed;
    private int yearOfProduction;

    public Car(String model, String brand, int HP, int weight, int maxSpeed, int yearOfProduction) {
        Model = model;
        Brand = brand;
        this.HP = HP;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public Car(Long id, String model, String brand, int HP, int weight, int maxSpeed, int yearOfProduction) {
        this.id = id;
        Model = model;
        Brand = brand;
        this.HP = HP;
        this.weight = weight;
        this.maxSpeed = maxSpeed;
        this.yearOfProduction = yearOfProduction;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getModel() {
        return Model;
    }

    public void setModel(String model) {
        Model = model;
    }

    public String getBrand() {
        return Brand;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public int getHP() {
        return HP;
    }

    public void setHP(int HP) {
        this.HP = HP;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }
}
