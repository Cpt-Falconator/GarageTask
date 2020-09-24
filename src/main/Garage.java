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
				
				removeVehicle("Car");
				removeVehicle(3);
				
				fixVehicles();
				
				emptyGarage();
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
	
	//The use of this for loop and reducing the iterator seems a bit clunky, to be honest,
	//However it feels more resource efficient than creating a second list of items to remove.
	private void removeVehicle(String vehicleType) {
		System.out.println("Removing all " + vehicleType + "s from the garage, please inform the following owners");
		
		for(int i = 0; i < falconGarage.size(); i++)
		{
			if(falconGarage.get(i).getClass().getSimpleName().equalsIgnoreCase(vehicleType)) {
				System.out.println("> " + falconGarage.get(i).getOwner());
				falconGarage.remove(i);
				i--;
			}
		}
	}

	
	private void removeVehicle(int ID) {
		for(int i = 0; i < falconGarage.size(); i++) {
			if(falconGarage.get(i).getVehicleID() == ID) {
				System.out.println("Removing vehicle " + falconGarage.get(i).getVehicleID() + " from the garage, please inform " + falconGarage.get(i).getOwner() +".");
				falconGarage.remove(i);
				break;
			}
		}
	}
	
	//Could be improved to only fix certain vehicles.
	private void fixVehicles(){
		for(Vehicle index : falconGarage){
			index.fixVehicle();
		}
	}
	
	private void emptyGarage() {
		System.out.println("The garage has gone into administration, removing all vehicles. Please inform all owners on record:");
		for(int i = 0; i < falconGarage.size(); i++){
			System.out.println(falconGarage.get(i).getOwner());
		}
		falconGarage.clear();
	}
}
