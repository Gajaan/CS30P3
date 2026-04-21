package Mastery; // Places this class inside the Mastery package

public class Ustaff extends Uemployee {
    private String JT; // Stores the employee's job title

    public Ustaff(String F, String L, String j, double s) { // Constructor that receives first name, last name, job title, and salary
        super(F, L, s); // Calls the parent Uemployee constructor to initialize name and salary
        JT = j; // Assigns the job title to the instance variable
    } // Ends the constructor

    public String getStaff() { // Method that returns the job title
        return JT; // Returns the stored job title
    } // Ends the getStaff method

    public double pay(double weeks) { // Method that calculates pay based on weeks worked
        return getSalary() / 52 * weeks; // Uses inherited salary to calculate weekly pay multiplied by weeks
    } // Ends the pay method
} // Ends the Ustaff class