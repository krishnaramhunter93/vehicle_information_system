package com.interfaces;

//Interface extending Vehicle for additional car-specific details
public interface CarVehicle extends Vehicle {
	int getNumberOfDoors(); // Method to get the number of doors

	void setNumberOfDoors(int doors); // Method to set the number of doors

	String getFuelType(); // Method to get the fuel type

	void setFuelType(String fuelType); // Method to set the fuel type
}
