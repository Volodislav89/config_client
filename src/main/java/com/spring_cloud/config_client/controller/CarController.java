package com.spring_cloud.config_client.controller;

import com.spring_cloud.config_client.model.Car;
import com.spring_cloud.config_client.service.CarService;
import lombok.AllArgsConstructor;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
@RefreshScope
@AllArgsConstructor
@RequestMapping("/car")
public class CarController {
    private CarService carService;

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @PostMapping
    public Car saveNewCar(@RequestBody Car car) {
        return carService.saveNewCar(car);
    }
}
