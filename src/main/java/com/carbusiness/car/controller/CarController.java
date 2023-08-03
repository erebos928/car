package com.carbusiness.car.controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import com.carbusiness.car.model.Car;
import com.carbusiness.car.service.CarService;

import jakarta.validation.Valid;


@Controller
public class CarController {
	private CarService carService;

	public CarController(CarService carService) {
		super();
		this.carService = carService;
	}

	@RequestMapping("/")
	public String root(ModelMap model) {
		return getAllCars(model);
	}
	
	@RequestMapping("car/allcars")
	public String getAllCars(ModelMap model){
		List<Car> cars = carService.findAllCars();
		model.put("carsList", cars);
		return "listall";
	}
	@RequestMapping(value="car/addcar", method = RequestMethod.GET)
	public String addcar(ModelMap model){
		Car car  = new Car(0,"","",0);
		model.put("car", car);
		return "addcar";
	}
	@RequestMapping(value="car/addcar", method = RequestMethod.POST)
	public String addcarPosted(@Valid Car car, BindingResult result){
		if (result.hasErrors()) {
			return "addcar";
		}
		carService.addCar(car);
		return "redirect:allcars";
	}
	@RequestMapping(value="car/deletecar", method = RequestMethod.GET)
	public String deleteCar(@RequestParam int id) {
		carService.deleteCar(id);
		return "redirect:allcars";
	}
	@RequestMapping(value="car/updatecar", method = RequestMethod.GET)
	public String showUpdateCar(@RequestParam int id, ModelMap model) {
		Car car = carService.findById(id);
		model.put("car", car);
		return "addcar";
	}
	@RequestMapping(value="car/updatecar", method = RequestMethod.POST)
	public String updateCar(@Valid Car car,BindingResult result) {
		carService.updateCar(car);
		return "redirect:allcars";
	}

}
