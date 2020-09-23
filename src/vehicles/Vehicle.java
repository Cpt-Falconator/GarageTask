package vehicles;

public class Vehicle {

	private String owner;
	private String fuelType;
	private int numberOfWheels;
	//I'm not a car person... I don't know what attributes cars usually have, sue me. Haha
	
	public Vehicle() {
		super();
		setOwner("Unknown");
		setFuelType("Unknown");
		setNumberOfWheels(0);
	}
	
	public Vehicle(String owner, String fuelType, int wheels)
	{
		setOwner(owner);
		setFuelType(fuelType);
		setNumberOfWheels(wheels);
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
	
	

}
