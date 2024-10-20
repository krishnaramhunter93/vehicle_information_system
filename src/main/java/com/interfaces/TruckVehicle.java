package com.interfaces;

//Interface extending Vehicle for additional truck-specific details
public interface TruckVehicle extends Vehicle {
	double getCargoCapacity(); // Method to get the cargo capacity in tons

	void setCargoCapacity(double capacity); // Method to set the cargo capacity

	String getTransmissionType(); // Method to get the transmission type

	void setTransmissionType(String type); // Method to set the transmission type
}
