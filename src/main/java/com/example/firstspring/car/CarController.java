package com.example.firstspring.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.transaction.Transactional;
import java.util.List;

@RestController
@RequestMapping(path = "api/v1/car")
public class CarController {
    private final CarService carService;

    @Autowired
    public CarController(CarService carService) {
        this.carService = carService;
    }

    @GetMapping
    public List<Car> getCars(){
        return carService.getCars();
    }

    @PostMapping
    public void registerCar(@RequestBody Car car){
        carService.addNewCar(car);
    }
    @DeleteMapping(path = "{carId}")
    public void deleteCar(@PathVariable("carId") Long carId) {
        carService.deleteCar(carId);
    }
/*    @PutMapping(path = "{carId}")
    public void updateCar(@PathVariable("carId") Long carId,
                          @RequestParam(required = false) int year,
                          @RequestParam(required = false) int weight,
                          @RequestParam(required = false) int maxspeed){
        carService.updateCar(carId,year,weight,maxspeed);
    }*/

}
