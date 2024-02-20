package com.service;

import org.springframework.stereotype.Service;

@Service
public class Car {

	private String name = "BMW";
	private String model = "m01";
	private int price = 100;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "CarFactoryService [name=" + name + ", model=" + model + ", price=" + price + "]";
	}
}
