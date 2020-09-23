package vehicles;

public class Car extends Vehicle {

	private String registrationID;
	private int numberOfDoors;
	private Boolean isManual;
	
	public Car() {
		super(-1, "Unknown", "Unknown", 0);
		setRegistrationID("?");
		setNumberOfDoors(0);
		setIsManual(true);
	}

	public Car(int ID, String owner, String fuelType, int wheels, String reg, int doors, Boolean isManual) {
		super(ID, owner, fuelType, wheels);
		setRegistrationID(reg);
		setNumberOfDoors(doors);
		setIsManual(isManual);
	}

	public String getRegistrationID() {
		return registrationID;
	}

	public void setRegistrationID(String registrationID) {
		this.registrationID = registrationID;
	}

	public int getNumberOfDoors() {
		return numberOfDoors;
	}

	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}

	public Boolean getIsManual() {
		return isManual;
	}

	public void setIsManual(Boolean isManual) {
		this.isManual = isManual;
	}
	
	@Override
	public void fixVehicle() {
		float totalPrice = 0;
		
		if(isManual) {
			totalPrice += 80.0f;
		}
		totalPrice = totalPrice + (numberOfDoors * 30);
		System.out.println("Bill for " + this.getOwner() + " = £" + totalPrice);
	}

}
