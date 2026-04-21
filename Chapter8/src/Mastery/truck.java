package Mastery;

public class truck extends vehicle {

	// stores the number of wheels on the truck
	private int numwheels;

	// stores the trunk (cargo) volume of the truck
	private int trunkvolume;

	// constructor that initializes truck and calls parent (vehicle) constructor
	public truck(String mod, String mak, int y, int nw, int tv) {

		// call the vehicle constructor to set model, make, and year
		super(mod, mak, y);

		// set number of wheels
		numwheels = nw;

		// set trunk volume
		trunkvolume = tv;
	}

	// returns a string containing all vehicle and truck details
	public String getDetails() {

	    // combine parent class string with truck-specific details
	    return super.toString() + " |number of wheels: " + numwheels + " |trunk space: " + trunkvolume;
	}
}