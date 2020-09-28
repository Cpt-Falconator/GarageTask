package main;

import java.util.ArrayList;

import vehicles.Vehicle;

public class Garage {

	private ArrayList<Vehicle> garage;
	
	public Garage() {
		garage = new ArrayList<Vehicle>();
	}
	
	//For Cars
	public void addVehicle(Vehicle vehicle)
	{
		garage.add(vehicle);
	}
	//The use of this for loop and reducing the iterator seems a bit clunky, to be honest,
	//However it feels more resource efficient than creating a second list of items to remove.
	public void removeVehicle(String vehicleType) {
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

	
	public void removeVehicle(int ID) {
		for(int i = 0; i < garage.size(); i++) {
			if(garage.get(i).getVehicleID() == ID) {
				System.out.println("Removing vehicle " + garage.get(i).getVehicleID() + " from the garage, please inform " + garage.get(i).getOwner() +".");
				garage.remove(i);
				break;
			}
		}
	}
	
	//Could be improved to only fix certain vehicles.
	public void fixVehicles(){
		for(Vehicle index : garage){
			index.fixVehicle();
		}
	}
	
	public void emptyGarage() {
		System.out.println("The garage has gone into administration, removing all vehicles. Please inform all owners on record:");
		for(int i = 0; i < garage.size(); i++){
			System.out.println(garage.get(i).getOwner());
		}
		garage.clear();
	}
	
	public int getGarageSize() {
		return garage.size();
	}

}
