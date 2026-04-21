package Mastery;

public class car extends vehicle{

	// stores the number of doors the car has
	private int doors;

	// indicates whether the car is electric or not
	private boolean isElectric;
	
	// constructor that initializes car and calls parent (vehicle) constructor
	public car(String mod, String mak, int y, int d, boolean e) {

		// call the vehicle constructor to set model, make, and year
		super(mod, mak, y);

		// set number of doors
		doors = d;

		// set whether the car is electric
		isElectric = e;
		
	}

	// returns a string containing all vehicle and car details
	public String getDetails() {

	    // combine parent class string with car-specific details
	    return super.toString() + " |Doors: " + doors + " |Electric: " + isElectric;
	}
	
}