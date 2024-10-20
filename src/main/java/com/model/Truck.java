package com.model;

import com.interfaces.TruckVehicle;

//Class implementing TruckVehicle interface, representing a truck
public class Truck implements TruckVehicle {
	private String make;
	private String model;
	private int yearOfManufacture;
	private double cargoCapacity;
	private String transmissionType;

	// Constructor to initialize truck properties
	public Truck(String make, String model, int yearOfManufacture, double cargoCapacity, String transmissionType) {
		this.make = make;
		this.model = model;
		this.yearOfManufacture = yearOfManufacture;
		this.cargoCapacity = cargoCapacity;
		this.transmissionType = transmissionType;
	}
	//Getter and Setters method
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

	public double getCargoCapacity() {
		return cargoCapacity;
	}

	public void setCargoCapacity(double cargoCapacity) {
		this.cargoCapacity = cargoCapacity;
	}

	public String getTransmissionType() {
		return transmissionType;
	}

	public void setTransmissionType(String transmissionType) {
		this.transmissionType = transmissionType;
	}

	// Override toString method to display truck details
	public String toString() {
		return "Truck: " + make + " " + model + " (" + yearOfManufacture + "), " + cargoCapacity + " tons, "
				+ transmissionType + " transmission";
	}
}
