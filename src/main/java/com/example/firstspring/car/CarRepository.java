package com.example.firstspring.car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CarRepository extends JpaRepository<Car,Long> {

    Car findCarByBrand(String brand);
    Car findCarByModel(String model);
}
