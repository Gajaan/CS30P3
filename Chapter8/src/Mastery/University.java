/*

Program: University.java          Last Date of this Revision: April 21, 2026

Purpose: an application that shows the salary and role of the faculty and staff of the university

Author: Gajaan Ram
School: CHHS
Course: Computer science 30
 

*/

package Mastery; // Places this class inside the Mastery package

import java.text.NumberFormat; // Allows salary formatting
import java.util.Scanner; // Allows user input

public class University {

    public static void payEmployee(Uemployee emp, double payArg) { // Method to process pay
        NumberFormat money = NumberFormat.getCurrencyInstance(); // Currency formatter

        double pay; // Stores calculated pay

        System.out.println(emp.getName()); // Prints employee name

        pay = emp.pay(payArg); // Calls the correct pay method (polymorphism)

        System.out.println(money.format(pay)); // Prints formatted pay
    }

    public static void main(String[] args) {

        Ufaculty emp1 = new Ufaculty("Sarah", "Lee", "Science", 70000); // Faculty object
        Ustaff emp2 = new Ustaff("Mike", "Brown", "Technician", 45000); // Staff object

        Scanner input = new Scanner(System.in); // Scanner for user input

        Uemployee emp = emp1; // Reference variable for polymorphism

        String action; // Stores user choice
        int empNum; // Stores employee selection
        double payArg; // Stores weeks worked

        do {
            System.out.println("\n(E)mployee \\ (P)ay \\ (Q)uit"); // Menu
            System.out.print("Make a choice: ");
            action = input.next();

            if (!action.equalsIgnoreCase("Q")) {

                System.out.print("Enter Employee number (1 or 2): ");
                empNum = input.nextInt();

                switch (empNum) {
                    case 1: emp = emp1; break; // Select faculty
                    case 2: emp = emp2; break; // Select staff
                }

                if (action.equalsIgnoreCase("E")) {
                    if (emp instanceof Ufaculty) {
                        System.out.println(emp.getName() + " " + ((Ufaculty) emp).getFaculty());
                    }
                    else if (emp instanceof Ustaff) {
                        System.out.println(emp.getName() + " " + ((Ustaff) emp).getStaff());
                    }
                }
                else if (action.equalsIgnoreCase("P")) {
                    System.out.print("Enter number of weeks: ");
                    payArg = input.nextDouble();
                    payEmployee(emp, payArg); // Call shared pay method
                }
            }

        } while (!action.equalsIgnoreCase("Q")); // Loop until user quits
    }
}


/*

if the user picks employee and says they are employee 1 and quits:


(E)mployee \ (P)ay \ (Q)uit
Make a choice: e
Enter Employee number (1 or 2): 1
Sarah Lee Science

(E)mployee \ (P)ay \ (Q)uit
Make a choice: q



if the user picks employee and says they are employee 2 and quits:


(E)mployee \ (P)ay \ (Q)uit
Make a choice: e
Enter Employee number (1 or 2): 2
Mike Brown Technician

(E)mployee \ (P)ay \ (Q)uit
Make a choice: q



if the user picks pay and says they are user 1 and they have worked a X amount of weeks and quits:



(E)mployee \ (P)ay \ (Q)uit
Make a choice: p
Enter Employee number (1 or 2): 1
Enter number of weeks: 32
Sarah Lee
$43,076.92

(E)mployee \ (P)ay \ (Q)uit
Make a choice: q




if the user picks pay and says they are user 2 and they have worked a X amount of weeks and quits:



(E)mployee \ (P)ay \ (Q)uit
Make a choice: p
Enter Employee number (1 or 2): 2
Enter number of weeks: 32
Mike Brown
$27,692.31

(E)mployee \ (P)ay \ (Q)uit
Make a choice: q




if the user just quits:



(E)mployee \ (P)ay \ (Q)uit
Make a choice: q




*/