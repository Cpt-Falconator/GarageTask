package vehicles;

public class Boat extends Vehicle {

	private float boatLength;
	private float boatWidth;
	private Boolean isGlitter;
	
	public Boat() {
		super(-1, "Unknown", "Unknown", 0);
		setBoatLength(0f);
		setBoatWidth(0f);
		setIsGlitter(false);
	}

	public Boat(int ID, String owner, String fuelType, int wheels, float len, float wid, Boolean glitter) {
		super(ID, owner, fuelType, wheels);
		setBoatLength(len);
		setBoatWidth(wid);
		setIsGlitter(glitter);
	}

	public float getBoatLength() {
		return boatLength;
	}

	public void setBoatLength(float boatLength) {
		this.boatLength = boatLength;
	}

	public float getBoatWidth() {
		return boatWidth;
	}

	public void setBoatWidth(float boatWidth) {
		this.boatWidth = boatWidth;
	}

	public Boolean getIsGlitter() {
		return isGlitter;
	}

	public void setIsGlitter(Boolean isGlitter) {
		this.isGlitter = isGlitter;
	}

}
