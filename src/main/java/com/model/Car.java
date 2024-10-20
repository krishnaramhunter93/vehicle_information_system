package com.model;

import com.interfaces.CarVehicle;

//Class implementing CarVehicle interface, representing a car
public class Car implements CarVehicle {
	private String github;
	private String make;
	private String model;
	private int yearOfManufacture;
	private int numberOfDoors;
	private String fuelType;

	// Constructor to initialize car properties
	public Car(String make, String model, int yearOfManufacture, int numberOfDoors, String fuelType) {
		this.make = make;
		this.model = model;
		this.yearOfManufacture = yearOfManufacture;
		this.numberOfDoors = numberOfDoors;
		this.fuelType = fuelType;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getYearOfManufacture() {
		return yearOfManufacture;
	}

	public void setYearOfManufacture(int yearOfManufacture) {
		this.yearOfManufacture = yearOfManufacture;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	@Override
	public String toString() {
		return "Car [make=" + make + ", model=" + model + ", yearOfManufacture=" + yearOfManufacture
				+ ", numberOfDoors=" + numberOfDoors + ", fuelType=" + fuelType + "]";
	}

}
