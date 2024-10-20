package com;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

import com.interfaces.Vehicle;
import com.model.Car;
import com.model.Motorcycle;
import com.model.Truck;

public class VehicleInformationSystem {
	private static List<Vehicle> vehicleList = new ArrayList<>();
	private static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		boolean running = true;

		while (running) {
			try {
				System.out.println("Vehicle Information System");
				System.out.println("1. Create Vehicle");
				System.out.println("2. Read Vehicles");
				System.out.println("3. Update Vehicle");
				System.out.println("4. Delete Vehicle");
				System.out.println("0. Exit");
				System.out.print("Select an option: ");
				int choice = scanner.nextInt();
				scanner.nextLine(); // consume newline

				switch (choice) {
				case 1:
					createVehicle();
					break;
				case 2:
					readVehicles();
					break;
				case 3:
					updateVehicle();
					break;
				case 4:
					deleteVehicle();
					break;
				case 0:
					running = false;
					System.out.println("Exiting the Vehicle Information System. Goodbye!");
					break;
				default:
					System.out.println("Invalid choice. Please select a valid option.");
				}
			} catch (InputMismatchException e) {
				System.out.println("Invalid input. Please enter a number.");
				scanner.nextLine(); // consume the invalid input
			} catch (Exception e) {
				System.out.println("An error occurred: " + e.getMessage());
				e.printStackTrace();
				scanner.nextLine(); // consume the invalid input
			}
		}

		scanner.close();
	}

	private static void createVehicle() {
		try {
			System.out.println("Select vehicle type to create (1: Car, 2: Motorcycle, 3: Truck): ");
			int type = scanner.nextInt();
			scanner.nextLine(); // consume newline

			switch (type) {
			case 1:
				createCar();
				break;
			case 2:
				createMotorcycle();
				break;
			case 3:
				createTruck();
				break;
			default:
				System.out.println("Invalid vehicle type.");
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a number.");
			scanner.nextLine(); // consume the invalid input
		}
	}

	private static void createCar() {
		try {
			System.out.println("Enter car make: ");
			String carMake = scanner.nextLine();
			System.out.println("Enter car model: ");
			String carModel = scanner.nextLine();
			System.out.println("Enter car year of manufacture: ");
			int carYear = scanner.nextInt();
			System.out.println("Enter number of doors: ");
			int doors = scanner.nextInt();
			scanner.nextLine(); // consume newline
			System.out.println("Enter fuel type (petrol, diesel, electric): ");
			String fuelType = scanner.nextLine();

			Car car = new Car(carMake, carModel, carYear, doors, fuelType);
			vehicleList.add(car);
			System.out.println("Car added successfully.");
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter the correct data type.");
			scanner.nextLine(); // consume the invalid input
		}
	}

	private static void createMotorcycle() {
		try {
			System.out.println("Enter motorcycle make: ");
			String motoMake = scanner.nextLine();
			System.out.println("Enter motorcycle model: ");
			String motoModel = scanner.nextLine();
			System.out.println("Enter motorcycle year of manufacture: ");
			int motoYear = scanner.nextInt();
			System.out.println("Enter number of wheels: ");
			int wheels = scanner.nextInt();
			scanner.nextLine(); // consume newline
			System.out.println("Enter motorcycle type (sport, cruiser, off-road): ");
			String motoType = scanner.nextLine();

			Motorcycle motorcycle = new Motorcycle(motoMake, motoModel, motoYear, wheels, motoType);
			vehicleList.add(motorcycle);
			System.out.println("Motorcycle added successfully.");
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter the correct data type.");
			scanner.nextLine(); // consume the invalid input
		}
	}

	private static void createTruck() {
		try {
			System.out.println("Enter truck make: ");
			String truckMake = scanner.nextLine();
			System.out.println("Enter truck model: ");
			String truckModel = scanner.nextLine();
			System.out.println("Enter truck year of manufacture: ");
			int truckYear = scanner.nextInt();
			System.out.println("Enter cargo capacity (in tons): ");
			double capacity = scanner.nextDouble();
			scanner.nextLine(); // consume newline
			System.out.println("Enter transmission type (manual, automatic): ");
			String transType = scanner.nextLine();

			Truck truck = new Truck(truckMake, truckModel, truckYear, capacity, transType);
			vehicleList.add(truck);
			System.out.println("Truck added successfully.");
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter the correct data type.");
			scanner.nextLine(); // consume the invalid input
		}
	}

	private static void readVehicles() {
		if (vehicleList.isEmpty()) {
			System.out.println("No vehicles available.");
		} else {
			for (Vehicle vehicle : vehicleList) {
				System.out.println(vehicle);
			}
		}
	}

	private static void updateVehicle() {
		try {
			System.out.println("Enter the index of the vehicle to update: ");
			int index = scanner.nextInt();
			scanner.nextLine(); // consume newline

			if (index < 0 || index >= vehicleList.size()) {
				System.out.println("Invalid index.");
				return;
			}

			Vehicle vehicle = vehicleList.get(index);

			if (vehicle instanceof Car) {
				updateCar((Car) vehicle);
			} else if (vehicle instanceof Motorcycle) {
				updateMotorcycle((Motorcycle) vehicle);
			} else if (vehicle instanceof Truck) {
				updateTruck((Truck) vehicle);
			} else {
				System.out.println("Unknown vehicle type.");
			}
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter the correct data type.");
			scanner.nextLine(); // consume the invalid input
		}
	}

	private static void updateCar(Car car) {
		try {
			System.out.println("Updating Car: " + car);
			System.out.println("Enter new car make (current: " + car.getMake() + "): ");
			String carMake = scanner.nextLine();
			System.out.println("Enter new car model (current: " + car.getModel() + "): ");
			String carModel = scanner.nextLine();
			System.out.println("Enter new car year of manufacture (current: " + car.getYearOfManufacture() + "): ");
			int carYear = scanner.nextInt();
			System.out.println("Enter new number of doors (current: " + car.getNumberOfDoors() + "): ");
			int doors = scanner.nextInt();
			scanner.nextLine(); // consume newline
			System.out.println("Enter new fuel type (current: " + car.getFuelType() + "): ");
			String fuelType = scanner.nextLine();

			car.setMake(carMake);
			car.setModel(carModel);
			car.setYearOfManufacture(carYear);
			car.setNumberOfDoors(doors);
			car.setFuelType(fuelType);

			System.out.println("Car updated successfully.");
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter the correct data type.");
			scanner.nextLine(); // consume the invalid input
		}
	}

	private static void updateMotorcycle(Motorcycle motorcycle) {
		try {
			System.out.println("Updating Motorcycle: " + motorcycle);
			System.out.println("Enter new motorcycle make (current: " + motorcycle.getMake() + "): ");
			String motoMake = scanner.nextLine();
			System.out.println("Enter new motorcycle model (current: " + motorcycle.getModel() + "): ");
			String motoModel = scanner.nextLine();
			System.out.println(
					"Enter new motorcycle year of manufacture (current: " + motorcycle.getYearOfManufacture() + "): ");
			int motoYear = scanner.nextInt();
			System.out.println("Enter new number of wheels (current: " + motorcycle.getNumberOfWheels() + "): ");
			int wheels = scanner.nextInt();
			scanner.nextLine(); // consume newline
			System.out.println("Enter new motorcycle type (current: " + motorcycle.getMotorcycleType() + "): ");
			String motoType = scanner.nextLine();

			motorcycle.setMake(motoMake);
			motorcycle.setModel(motoModel);
			motorcycle.setYearOfManufacture(motoYear);
			motorcycle.setNumberOfWheels(wheels);
			motorcycle.setMotorcycleType(motoType);

			System.out.println("Motorcycle updated successfully.");
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter the correct data type.");
			scanner.nextLine(); // consume the invalid input
		}
	}

	private static void updateTruck(Truck truck) {
		try {
			System.out.println("Updating Truck: " + truck);
			System.out.println("Enter new truck make (current: " + truck.getMake() + "): ");
			String truckMake = scanner.nextLine();
			System.out.println("Enter new truck model (current: " + truck.getModel() + "): ");
			String truckModel = scanner.nextLine();
			System.out.println("Enter new truck year of manufacture (current: " + truck.getYearOfManufacture() + "): ");
			int truckYear = scanner.nextInt();
			System.out.println("Enter new cargo capacity in tons (current: " + truck.getCargoCapacity() + "): ");
			double capacity = scanner.nextDouble();
			scanner.nextLine(); // consume newline
			System.out.println("Enter new transmission type (current: " + truck.getTransmissionType() + "): ");
			String transType = scanner.nextLine();

			truck.setMake(truckMake);
			truck.setModel(truckModel);
			truck.setYearOfManufacture(truckYear);
			truck.setCargoCapacity(capacity);
			truck.setTransmissionType(transType);

			System.out.println("Truck updated successfully.");
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter the correct data type.");
			scanner.nextLine(); // consume the invalid input
		}
	}

	private static void deleteVehicle() {
		try {
			System.out.println("Enter the index of the vehicle to delete: ");
			int index = scanner.nextInt();
			scanner.nextLine(); // consume newline

			if (index < 0 || index >= vehicleList.size()) {
				System.out.println("Invalid index.");
				return;
			}

			vehicleList.remove(index);
			System.out.println("Vehicle deleted successfully.");
		} catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a number.");
			scanner.nextLine(); // consume the invalid input
		}
	}
}
