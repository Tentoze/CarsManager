package com.example.firstspring.car;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CarService {
    public List<Car> getCars(){
        return List.of(new Car(1L,
                "CX3",
                "Mazda",
                150,
                1300,
                240,
                2020));
    }
}
