package com.carbusiness.car.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.carbusiness.car.model.Car;

@Service
public class CarService {
	private static List<Car> cars = new ArrayList();
	static {
		
		cars.add(new Car(1,"green","Renault",2017));
		cars.add(new Car(2,"white","BMW",2007));
		cars.add(new Car(3,"blue","Chevrolet",2020));
	}
	public List<Car> findAllCars(){
		return cars;
	}
	public Car findById(long id){
		for (Car car : cars) {
			if (car.getId() == id)
				return car;
		}
		return null;
	}
	
}
