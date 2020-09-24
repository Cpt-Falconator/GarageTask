package vehicles;

public abstract class Vehicle {

	private int vehicleID;
	private String owner;
	private String fuelType;
	private int numberOfWheels;
	//I'm not a car person... I don't know what attributes cars usually have, sue me. Haha
	
	public Vehicle() {
		super();
		setVehicleID(-1);
		setOwner("Unknown");
		setFuelType("Unknown");
		setNumberOfWheels(0);
	}
	
	public Vehicle(int ID, String owner, String fuelType, int wheels)
	{
		setVehicleID(ID);
		setOwner(owner);
		setFuelType(fuelType);
		setNumberOfWheels(wheels);
	}
	
	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int ID) {
		this.vehicleID = ID;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getFuelType() {
		return fuelType;
	}

	public void setFuelType(String fuelType) {
		this.fuelType = fuelType;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
	
	public abstract void fixVehicle();
	
	

}
