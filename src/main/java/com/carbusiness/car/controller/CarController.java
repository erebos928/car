package com.carbusiness.car.controller;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carbusiness.car.model.Car;
import com.carbusiness.car.service.CarService;

@RestController
public class CarController {
	private CarService carService;

	public CarController(CarService carService) {
		super();
		this.carService = carService;
	}

	@RequestMapping("car/{id}")
	public Car getCar(@PathVariable long id) {
		return carService.findById(id);
	}
	
	@RequestMapping("car/allcars")
	public List<Car> getAllCars(){
		return carService.findAllCars();
	}
	
}
