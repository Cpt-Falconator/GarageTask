package vehicles;

public class Motorcycle extends Vehicle {

	private String registrationID;
	private float tyreSize;
	
	public Motorcycle() {
	}

	public Motorcycle(int ID, String owner, String fuelType, int wheels, String reg, float tyreSize) {
		super(ID, owner, fuelType, wheels);
		setRegistrationID(reg);
		setTyreSize(tyreSize);
	}

	public String getRegistrationID() {
		return registrationID;
	}

	public void setRegistrationID(String reg) {
		this.registrationID = reg;
	}
	
	public float getTyreSize() {
		return tyreSize;
	}
	
	public void setTyreSize(float tyreSize) {
		this.tyreSize = tyreSize;
	}
}
