package main;

import vehicles.Car;
import vehicles.Boat;
import vehicles.Motorcycle;
import vehicles.Vehicle;

public class Main {

	public static void main(String[] args) {
		
		Garage falconGarage = new Garage();
		
		Vehicle car1 = new Car(0, "Lewis", "Diesel", 4, "F41C0N", 5, false);
		
		Vehicle boat1 = new Boat(1, "McBoatface", "Petrol", 0, 30.0f, 6, true);

		Vehicle bike1 = new Motorcycle(2, "Lefkos", "Diesel", 2, "C9R107", 9.0f);
		Vehicle bike2 = new Motorcycle(3, "Michal", "Petrol", 2, "S14V", 11.0f);

		falconGarage.addVehicle(car1);
		falconGarage.addVehicle(boat1);
		falconGarage.addVehicle(bike1);
		falconGarage.addVehicle(bike2);
		
		falconGarage.removeVehicle("Car");
		falconGarage.removeVehicle(2);
		
		falconGarage.fixVehicles();
		
		falconGarage.emptyGarage();
	}

}
