package com.spring_cloud.config_client.service;

import com.spring_cloud.config_client.model.Car;
import com.spring_cloud.config_client.repository.CarRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CarService {
    private CarRepository carRepository;

    public List<Car> getAllCars() {
        return carRepository.findAll();
    }

    public Car saveNewCar(Car car) {
        return carRepository.save(car);
    }
}
