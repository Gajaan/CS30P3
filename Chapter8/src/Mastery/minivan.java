package Mastery;

public class minivan extends vehicle {

	// stores the number of seats in the minivan
	private int seats;

	// indicates whether the minivan has automatic sliding doors
	private boolean autodoors;
	
	// constructor that initializes minivan and calls parent (vehicle) constructor
	public minivan(String mod, String mak, int y, int s, boolean ad) {

		// call the vehicle constructor to set model, make, and year
		super(mod, mak, y);

		// set number of seats
		seats = s;

		// set automatic door status
		autodoors = ad;
	}

	// returns a string containing all vehicle and minivan details
	public String getDetails() {

	    // combine parent class string with minivan-specific details
	    return super.toString() + " |number of seats: " + seats + " |automatic doors: " + autodoors;
	}
}