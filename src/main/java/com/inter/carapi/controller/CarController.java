package com.inter.carapi.controller;

import com.inter.carapi.model.Car;
import com.inter.carapi.repository.CarRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {

    @Autowired
    private CarRepository carRepository;

    // 1. List all cars
    @GetMapping
    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    // 2. Add a new car
    @PostMapping
    public Car createCar(@RequestBody Car car) {
        return carRepository.save(car);
    }

    // 3. Delete a car by ID
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteCar(@PathVariable Long id) {
        if (carRepository.existsById(id)) {
            carRepository.deleteById(id);
            return ResponseEntity.noContent().build(); // 204 No Content
        } else {
            return ResponseEntity.notFound().build();  // 404 Not Found
        }
    }

    // 4. Search cars by name (case-insensitive substring)
    @GetMapping("/search")
    public List<Car> searchCarsByName(@RequestParam String name) {
        return carRepository.findByNameContainingIgnoreCase(name);
    }
}
