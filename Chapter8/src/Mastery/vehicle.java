package Mastery;

public abstract class vehicle {

	// stores the year of the vehicle
	private int year;

	// stores the model and make of the vehicle
	private String model, make;

	// constructor that initializes vehicle attributes
	public vehicle(String mod, String mak, int y){

		// set year of the vehicle
		year = y;

		// set model of the vehicle
		model = mod;

		// set make of the vehicle
		make = mak;
	}

	// returns basic vehicle information as a string
	public String toString() {

		// combine year, model, and make into a single string
		return(year + " " + model + " " + make);
	}
 
	// abstract method that must be implemented by subclasses
	public abstract String getDetails();
}