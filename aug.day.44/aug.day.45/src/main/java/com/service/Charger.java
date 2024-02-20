package com.service;

public class Charger {
	
	String name;
	String year;
	int cost;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Charger [name=" + name + ", year=" + year + ", cost=" + cost + "]";
	}
	
	
	
	

}
