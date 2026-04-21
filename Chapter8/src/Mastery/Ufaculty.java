package Mastery; // Places this class inside the Mastery package

public class Ufaculty extends Uemployee {
    private String faculty; // Stores the faculty or department name

    public Ufaculty(String F, String L, String facul, double s) { // Constructor that receives first name, last name, faculty, and salary
        super(F, L, s); // Calls the parent Uemployee constructor to initialize name and salary
        faculty = facul; // Assigns the faculty value to the instance variable
    } // Ends the constructor

    public String getFaculty() { // Method that returns the faculty or department name
        return faculty; // Returns the stored faculty value
    } // Ends the getFaculty method

    public double pay(double weeks) { // Method that calculates pay based on weeks worked
        return getSalary() / 52 * weeks; // Uses inherited salary to calculate weekly pay multiplied by weeks
    } // Ends the pay method
} // Ends the Ufaculty class