package com.interfaces;

//Interface extending Vehicle for additional motorcycle-specific details
public interface MotorVehicle extends Vehicle {
	int getNumberOfWheels(); // Method to get the number of wheels

	void setNumberOfWheels(int wheels); // Method to set the number of wheels

	String getMotorcycleType(); // Method to get the type of motorcycle

	void setMotorcycleType(String type); // Method to set the type of motorcycle
}
