/*

Program: WordGuess.java          Last Date of this Revision: April 1, 2026

Purpose: An application that makes the user enter letters of words until it is correct and the words are in a file
Author: Gajaan Ram
School: CHHS
Course: Computer science 30
 

*/


package Mastery; // places the class inside the Mastery package

import java.io.BufferedReader; // allows reading lines from a file
import java.io.File; // allows file objects to be created
import java.io.FileReader; // reads characters from a file
import java.io.IOException; // handles file errors
import java.util.Scanner; // allows user keyboard input

public class WordGuess {

	public static void main(String[] args) {

		final String FLAG = "!"; // special symbol used to quit the game
		FileReader in; // reads the file
		BufferedReader readFile; // reads full lines from the file
		File dataFile; // stores the word file
		Scanner input = new Scanner(System.in); // gets user input

		int numWords, wordToGuess; // stores total words and random word number
		String secretWord = ""; // stores the chosen word
		String wordSoFar = ""; // stores guessed progress using dashes
		String updatedWord = ""; // stores updated guessed letters
		String letterGuess; // stores the guessed letter
		int numGuesses = 0; // counts guesses

		try { // starts file reading section

			dataFile = new File("../Chapter11/src/Mastery/words.txt"); // opens the words file

			in = new FileReader(dataFile); // connects file reader to the file
			readFile = new BufferedReader(in); // connects buffered reader

			numWords = Integer.parseInt(readFile.readLine()); // reads number of words from first line

			wordToGuess = (int)(Math.random() * numWords) + 1; // picks random word number

			for(int i = 0; i < wordToGuess; i++) { // loops until reaching chosen word
				secretWord = readFile.readLine(); // stores chosen word
			}

			readFile.close(); // closes buffered reader
			in.close(); // closes file reader

		}
		catch (IOException e) { // catches file errors
			System.out.println("File error: " + e.getMessage()); // prints file error
		}

		System.out.println("WordGuess game.\n"); // displays game title

		for(int i = 0; i < secretWord.length(); i++) { // creates dashes equal to word length
			wordSoFar = wordSoFar + "-"; // adds one dash
		}

		System.out.println(wordSoFar); // shows blank word

		do { // starts guessing loop

			System.out.print("Enter a letter (! to quit): "); // asks for a letter
			letterGuess = input.next(); // stores guessed letter

			numGuesses++; // adds 1 guess

			updatedWord = ""; // clears updated word

			for(int i = 0; i < secretWord.length(); i++) { // checks each letter in secret word

				if(secretWord.substring(i, i+1).equals(letterGuess)) { // checks for match
					updatedWord = updatedWord + letterGuess; // reveals guessed letter
				}
				else {
					updatedWord = updatedWord + wordSoFar.charAt(i); // keeps previous letters/dashes
				}

			}

			wordSoFar = updatedWord; // updates displayed word

			System.out.println(wordSoFar); // shows progress

		}
		while (!letterGuess.equals(FLAG) && !wordSoFar.equals(secretWord)); // repeats until quit or solved

		if(wordSoFar.equals(secretWord)) { // checks if player won
			System.out.println("Congratulations! You guessed the word: " + secretWord); // winning message
		}
		else {
			System.out.println("Game ended. The word was: " + secretWord); // losing message
		}

		System.out.println("Number of guesses: " + numGuesses); // shows guess count

	}
}
/*
Screen Dump
 
 
If the user decides to play the game:

WordGuess game.

-----
Enter a letter (! to quit): a
a----
Enter a letter (! to quit): p
app--
Enter a letter (! to quit): l
appl-
Enter a letter (! to quit): e
apple
Congratulations! You guessed the word: apple
Number of guesses: 4

If the user wants to quit:

WordGuess game.

----
Enter a letter (! to quit): !
----
Game ended. The word was: math
Number of guesses: 1


*/
