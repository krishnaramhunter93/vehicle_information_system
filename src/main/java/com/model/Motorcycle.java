package com.model;

import com.interfaces.MotorVehicle;

//Class implementing MotorVehicle interface, representing a motorcycle
public class Motorcycle implements MotorVehicle {
	private String make;
	private String model;
	private int yearOfManufacture;
	private int numberOfWheels;
	private String motorcycleType;

	// Constructor to initialize motorcycle properties
	public Motorcycle(String make, String model, int yearOfManufacture, int numberOfWheels, String type) {
		this.make = make;
		this.model = model;
		this.yearOfManufacture = yearOfManufacture;
		this.numberOfWheels = numberOfWheels;
		this.motorcycleType = type;
	}

	// Getter and Setter

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

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}

	public String getMotorcycleType() {
		return motorcycleType;
	}

	public void setMotorcycleType(String motorcycleType) {
		this.motorcycleType = motorcycleType;
	}

	// Override toString method to display motorcycle details
	public String toString() {
		return "Motorcycle: " + make + " " + model + " (" + yearOfManufacture + "), " + numberOfWheels + " wheels, "
				+ motorcycleType;
	}
}
