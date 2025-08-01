package com.inter.carapi.repository;

import com.inter.carapi.model.Car;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    // Custom search by name (case-insensitive, contains)
    List<Car> findByNameContainingIgnoreCase(String name);
}
