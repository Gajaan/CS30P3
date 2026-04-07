/*

Program: CountVowels.java          Last Date of this Revision: April 1, 2026

Purpose: An application that counts vowels in a file

Author: Gajaan Ram
School: CHHS
Course: Computer science 30
 

*/



package Mastery; // puts this class inside the Mastery package

import java.io.BufferedReader; // lets us read text efficiently from a file
import java.io.File; // allows us to create and use file objects
import java.io.FileReader; // reads characters from a file
import java.io.IOException; // handles file-related errors
import java.util.Scanner; // allows keyboard input

public class CountVowels {

    public static void main(String[] args) {
    	
    	File dataFile; // declares a file variable (not used here)
        File textFile; // stores the file the user wants to open
        FileReader in; // reads characters from the file
        BufferedReader readFile; // reads full lines from the file
        String fileName; // stores the filename entered by the user
        String lineInFile, lowercaseText, letter; // stores each line, lowercase line, and each letter
        int vowelSum = 0; // counts total vowels
        Scanner input = new Scanner(System.in); // creates scanner for user input

        System.out.println("Enter the file name: "); // asks user for filename
        fileName = input.nextLine(); // stores the typed filename

        textFile = new File(fileName); // creates a file object using the filename
        if (textFile.exists()) { // checks if the file exists
            System.out.println("File exists"); // tells user file was found
            System.out.println("Gathering vowels"); // lets user know counting started
        } else { // runs if file does not exist
            System.out.println("File does not exist"); // tells user file was not found
        }

        try { // starts file-reading code that may cause errors
        	
            in = new FileReader(textFile); // opens the file for reading
            
            readFile = new BufferedReader(in); // connects buffered reader to file reader

            while ((lineInFile = readFile.readLine()) != null) { // keeps reading until end of file
                lowercaseText = lineInFile.toLowerCase(); // changes line to lowercase

                for (int i = 0; i < lowercaseText.length(); i++) { // loops through each character
                    letter = lowercaseText.substring(i, i + 1); // gets one letter at a time

                    if (letter.equals("a") || letter.equals("e") || // checks if letter is a vowel
                        letter.equals("i") || letter.equals("o") || 
                        letter.equals("u")) {
                        vowelSum++; // adds 1 if vowel is found
                    }
                }
            }

            System.out.println("The file has " + vowelSum + " vowels."); // shows final total

            readFile.close(); // closes buffered reader
            in.close(); // closes file reader

        } catch (IOException e) { // catches file reading errors
            System.out.println("File error: " + e.getMessage()); // prints the error
        }

    }
}

/*
 
 Screen Dump:
 
 
Enter the file name: 
..\Chapter11\src\Mastery\Countvowels.txt
File exists
Gathering vowels
The file has 26 vowels.
*/

