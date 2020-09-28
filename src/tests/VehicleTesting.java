package tests;

import vehicles.Boat;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class VehicleTesting {

	private Boat testBoat;
	@BeforeEach
	public void setUp()
	{
		testBoat = new Boat(0, "Lewis", "Diesel", 0, 12.0f, 6.0f, true);
	}
	
	@Test
	public void glitterCheck() {
		assertTrue(testBoat.getIsGlitter());
	}


}
