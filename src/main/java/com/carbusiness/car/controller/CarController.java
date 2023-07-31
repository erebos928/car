package com.carbusiness.car.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.carbusiness.car.model.Car;

@RestController
public class CarController {
	@RequestMapping("car/{id}")
	public Car getCar(@PathVariable long id) {
		return new Car(1, "red", "Toyota", 2002);
	}
}
