package com.carbusiness.car.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.carbusiness.car.model.Car;
import com.carbusiness.car.service.CarService;

@Controller
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
	public String getAllCars(ModelMap model){
		List<Car> cars = carService.findAllCars();
		model.put("carsList", cars);
		return "listall";
	}
	@RequestMapping(value="car/addcar", method = RequestMethod.GET)
	public String addcar(){
		return "addcar";
	}
	@RequestMapping(value="car/addcar", method = RequestMethod.POST)
	public String addcarPosted(){
		return "redirect:allcars";
	}
	
	
}
