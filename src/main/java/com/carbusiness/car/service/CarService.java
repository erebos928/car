package com.carbusiness.car.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.logging.LogFactory;
import org.hibernate.validator.internal.util.logging.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.carbusiness.car.model.Car;

import ch.qos.logback.classic.Level;

@Service
public class CarService {
	private static List<Car> cars = new ArrayList();
	private Logger logger = org.slf4j.LoggerFactory.getLogger(CarService.class);
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
	public void deleteCar(int id) {
		logger.debug("delete car id {0}",id);
		cars.removeIf(car -> car.getId() == id);
	}

}
