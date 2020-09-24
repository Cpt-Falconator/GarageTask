package main;

import java.util.ArrayList;

import vehicles.Boat;
import vehicles.Car;
import vehicles.Motorcycle;
import vehicles.Vehicle;

public class Garage {

	private ArrayList<Vehicle> garage;
	
	public Garage() {
		garage = new ArrayList<Vehicle>();
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
		garage.add(new Car(garage.size(), owner, fuelType, wheels, reg, doors, isManual ));
	}
	
	//For Motorcycles
	private void addVehicle(String owner, String fuelType, int wheels, String reg, float tyreSize) {
		garage.add(new Motorcycle(garage.size(), owner, fuelType, wheels, reg, tyreSize));
	}

	//For Boats
	private void addVehicle(String owner, String fuelType, float len, float wid, Boolean glitter) {
		garage.add(new Boat(garage.size(), owner, fuelType, 0, len, wid, glitter));
	}
	
	//The use of this for loop and reducing the iterator seems a bit clunky, to be honest,
	//However it feels more resource efficient than creating a second list of items to remove.
	private void removeVehicle(String vehicleType) {
		System.out.println("Removing all " + vehicleType + "s from the garage, please inform the following owners");
		
		for(int i = 0; i < garage.size(); i++)
		{
			if(garage.get(i).getClass().getSimpleName().equalsIgnoreCase(vehicleType)) {
				System.out.println("> " + garage.get(i).getOwner());
				garage.remove(i);
				i--;
			}
		}
	}

	
	private void removeVehicle(int ID) {
		for(int i = 0; i < garage.size(); i++) {
			if(garage.get(i).getVehicleID() == ID) {
				System.out.println("Removing vehicle " + garage.get(i).getVehicleID() + " from the garage, please inform " + garage.get(i).getOwner() +".");
				garage.remove(i);
				break;
			}
		}
	}
	
	//Could be improved to only fix certain vehicles.
	private void fixVehicles(){
		for(Vehicle index : garage){
			index.fixVehicle();
		}
	}
	
	private void emptyGarage() {
		System.out.println("The garage has gone into administration, removing all vehicles. Please inform all owners on record:");
		for(int i = 0; i < garage.size(); i++){
			System.out.println(garage.get(i).getOwner());
		}
		garage.clear();
	}
}
