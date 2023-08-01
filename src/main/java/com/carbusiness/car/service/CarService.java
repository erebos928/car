package com.carbusiness.car.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.carbusiness.car.model.Car;

@Service
public class CarService {
	private static List<Car> cars = new ArrayList();
	private static int count = 0;
	static {
		
		cars.add(new Car(++count,"green","Renault",2017));
		cars.add(new Car(++count,"white","BMW",2007));
		cars.add(new Car(++count,"blue","Chevrolet",2020));
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
	public void addCar(Car car) {
		car.setId(++count);
		cars.add(car);
		
	}
	
}
