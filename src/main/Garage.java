package main;

import java.util.ArrayList;

import vehicles.Boat;
import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Vehicle;

public class Garage {

	private ArrayList<Vehicle> falconGarage;
	
	public Garage() {
		falconGarage = new ArrayList<Vehicle>();
		
	}
	
	public void runGarage() {
		//adding car
				addVehicle("Lewis", "Diesel", 4, "F41C0N", 5, false);
				
				//adding boat
				addVehicle("McBoatface", "Petrol", 30.0f, 6, true);
			
				//adding two motorcylces
				addVehicle("Michal", "Petrol", 2, "S14V", 11.0f);
				addVehicle("Lefkos", "Diesel", 2, "C9R107", 9.0f);
				
				fixVehicles();
	}

	//For Cars
	private void addVehicle(String owner, String fuelType, int wheels, String reg, int doors, Boolean isManual) {
		falconGarage.add(new Car(falconGarage.size(), owner, fuelType, wheels, reg, doors, isManual ));
	}
	
	//For Motorcycles
	private void addVehicle(String owner, String fuelType, int wheels, String reg, float tyreSize) {
		falconGarage.add(new Motorcycle(falconGarage.size(), owner, fuelType, wheels, reg, tyreSize));
	}

	//For Boats
	private void addVehicle(String owner, String fuelType, float len, float wid, Boolean glitter) {
		falconGarage.add(new Boat(falconGarage.size(), owner, fuelType, 0, len, wid, glitter));
	}
	
	private void removeVehicle(String vehicleType) {
		
	}
	
	private void removeVehicle(int ID) {
		
	}
	
	private void fixVehicles(){
		for(Vehicle index : falconGarage){
			index.fixVehicle();
		}
	}
	
	private void emptyGarage() {
		falconGarage.clear();
	}
}
