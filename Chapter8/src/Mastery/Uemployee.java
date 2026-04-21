package Mastery; // Places this class inside the Mastery package

public class Uemployee {
    private String Fname, Lname; // Stores the employee's first and last name
    private double salary; // Stores the employee's yearly salary

    public Uemployee(String F, String L, double s) { // Constructor that receives first name, last name, and salary
        Fname = F; // Assigns the first name to the instance variable
        Lname = L; // Assigns the last name to the instance variable
        salary = s; // Assigns the salary to the instance variable
    } // Ends the constructor

    public String getName() { // Method that returns the employee's full name
        return Fname + " " + Lname; // Combines first and last name with a space in between
    } // Ends the getName method

    public double getSalary() { // Method that returns the employee's salary
        return salary; // Returns the stored salary value
    } // Ends the getSalary method

    public double pay(double weeks) { // Method that calculates pay based on number of weeks worked
        return salary / 52 * weeks; // Divides yearly salary into weekly pay and multiplies by weeks worked
    } // Ends the pay method
} // Ends the Uemployee class