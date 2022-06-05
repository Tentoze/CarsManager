package com.example.firstspring.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

@Service
public class CarService {
    private final CarRepository carRepository;

    @Autowired
    public CarService(CarRepository carRepository) {
        this.carRepository = carRepository;
    }

    public List<Car> getCars(){
        return carRepository.findAll();
    }

    public void addNewCar(Car car) {
        Optional<Car> carBrand = carRepository.findCarByBrand(car.getBrand());
        Optional<Car> carModel = carRepository.findCarByModel(car.getModel());
        if(carBrand.isPresent()&&carModel.isPresent()){
            throw new IllegalStateException("There is the same car in repository");
        }
        System.out.println(car);
    }

    public void deleteCar(Long carId) {
        if(!carRepository.existsById(carId)){
            throw new IllegalStateException("There is no car with this id");
        }
        carRepository.findById(carId);
    }

   /* @Transactional
    public void updateCar(Long carId, int year, int weight, int maxspeed) {
        Car car = carRepository.findById(carId).orElseThrow(()-> new IllegalStateException("There is no car with this id"));
        if(year > 1900|| year <= LocalDate.now().getDayOfYear()){
            car.setYearOfProduction(year);
        }
        if(weight>100){
            car.setWeight(weight);
        }
        if(maxspeed>20){
            car.setMaxSpeed(maxspeed);
        }
    }*/
}

