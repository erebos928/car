package com.carbusiness.car.model;


import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.NotBlank;

public class Car {
	private long id;
	private String color;
	@NotBlank
	private String brand;
	private static final long YEAR = 2023;
	@Max(value=YEAR, message = "The year must be less than ${YEAR}")
	private long model;

	public Car() {
		super();
	}
	
	public Car(long id, String color, String brand, long model) {
		super();
		this.id = id;
		this.color = color;
		this.brand = brand;
		this.model = model;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public long getModel() {
		return model;
	}

	public void setModel(long model) {
		this.model = model;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", color=" + color + ", brand=" + brand + ", model=" + model + "]";
	}
	
}
