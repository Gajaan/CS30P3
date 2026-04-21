/*

Program: carInfoshop.java          Last Date of this Revision: April 21, 2026

Purpose: an application that gives details of a certain car, truck and minivan

Author: Gajaan Ram
School: CHHS
Course: Computer science 30
 

*/


package Mastery;

import java.util.Scanner;

public class carInfoshop {

    public static void main(String[] args) {

        // create a car object with model, make, year, doors, and electric status
        car details = new car("Sentra", "Nissan", 2015, 4, false);

        // create a truck object with model, make, year, cylinders, and towing capacity
        truck details1 = new truck("VelociRaptor", "Ford", 2021, 6, 3);

        // create a minivan object with model, make, year, seats, and sliding door status
        minivan details2 = new minivan("Grand Caravan", "Dodge", 2017, 7, false);

        // create Scanner object to take user input
        Scanner input = new Scanner(System.in);

        // variable to store user's menu choice
        String action;

        // repeat menu until user chooses to quit
        do {

            // display menu options to the user
            System.out.println("Do you want to see details of a (C)ar, (T)ruck, (M)inivan, or (Q)uit?");
            System.out.print("Make a choice: ");

            // read user input
            action = input.next();

            // if user selects car, display car details
            if (action.equalsIgnoreCase("C")) {
                System.out.println(details.getDetails());
            }

            // if user selects truck, display truck details
            else if (action.equalsIgnoreCase("T")) {
                System.out.println(details1.getDetails());
            }

            // if user selects minivan, display minivan details
            else if (action.equalsIgnoreCase("M")) {
                System.out.println(details2.getDetails());
            }

        // continue looping until user enters Q
        } while (!action.equalsIgnoreCase("Q"));

    }
}


/*
If the user wants to see details of a car and quits:

Do you want to see details of a (C)ar, (T)ruck, (M)inivan, or (Q)uit?
Make a choice: c
2015 Sentra Nissan |Doors: 4 |Electric: false
Do you want to see details of a (C)ar, (T)ruck, (M)inivan, or (Q)uit?
Make a choice: q




if the user wants to see details of a truck and quits:

Do you want to see details of a (C)ar, (T)ruck, (M)inivan, or (Q)uit?
Make a choice: t
2021 VelociRaptor Ford |number of wheels: 6 |trunk space: 3
Do you want to see details of a (C)ar, (T)ruck, (M)inivan, or (Q)uit?
Make a choice: q




If the user wants to see details of a minivan and quits:

Do you want to see details of a (C)ar, (T)ruck, (M)inivan, or (Q)uit?
Make a choice: m
2017 Grand Caravan Dodge |number of seats: 7 |automatic doors: false
Do you want to see details of a (C)ar, (T)ruck, (M)inivan, or (Q)uit?
Make a choice: q

 
 
 
 If the user does not want to see any car and just quits:
 
 Do you want to see details of a (C)ar, (T)ruck, (M)inivan, or (Q)uit?
Make a choice: q



*/