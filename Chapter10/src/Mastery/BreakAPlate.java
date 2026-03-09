/*

Program: BreakAPlate.java          Last Date of this Revision: February 26, 2026

Purpose: an application that plays a carnival game called Break-A-Plate.

Author: Gajaan Ram
School: CHHS
Course: Computer science 30
 

*/






package Mastery; // Declares the package this class belongs to

import java.awt.EventQueue; // Imports EventQueue for safely starting the GUI

import javax.swing.JFrame; // Imports JFrame for the main application window
import javax.swing.ImageIcon; // Imports ImageIcon to display images
import javax.swing.JButton; // Imports JButton to create clickable buttons
import javax.swing.JLabel; // Imports JLabel to display text or images
import java.awt.event.ActionListener; // Imports ActionListener to handle button events
import java.awt.event.ActionEvent; // Imports ActionEvent for event information

public class BreakAPlate {

	private JFrame frame; // Declares the main window frame

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { // Ensures GUI runs on the event-dispatching thread
			public void run() { // Runs the GUI creation code
				try { // Starts a try block to catch possible errors
					BreakAPlate window = new BreakAPlate(); // Creates an object of BreakAPlate
					window.frame.setVisible(true); // Makes the window visible
				} catch (Exception e) { // Catches any errors that occur
					e.printStackTrace(); // Prints the error to the console
				}
			}
		});
	}

	
	
	
	
	
	
	/**
	 * Create the application.
	 */
	public BreakAPlate() { // Constructor method that runs when the object is created
		initialize(); // Calls the initialize method to build the GUI
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() { // Method that sets up all GUI components
		
		frame = new JFrame(); // Creates the main application window
		frame.setBounds(100, 100, 333, 391); // Sets the position and size of the window
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes program when window is closed
		frame.getContentPane().setLayout(null); // Uses absolute positioning for components
		
		ImageIcon plateallbroken = new ImageIcon("../Chapter10/src/Mastery/plates_all_broken.gif"); // Image showing all plates broken
		ImageIcon twoplatesbroken = new ImageIcon("../Chapter10/src/Mastery/plates_two_broken.gif"); // Image showing two plates broken
		ImageIcon unbrokenplates = new ImageIcon("../Chapter10/src/Mastery/plates.gif"); // Image showing unbroken plates
		ImageIcon tiger= new ImageIcon("../Chapter10/src/Mastery/tiger_plush.gif"); // Image of the tiger plush prize
		ImageIcon sticker1 = new ImageIcon("../Chapter10/src/Mastery/sticker.gif"); // Image of the sticker prize
		ImageIcon placeholder = new ImageIcon("../Chapter10/src/Mastery/image.png"); // Placeholder image for losing
		
		JLabel sticker = new JLabel(""); // Label that will display the prize image
		sticker.setBounds(102, 254, 142, 87); // Sets the position and size of the sticker label
		frame.getContentPane().add(sticker); // Adds the sticker label to the window

		JLabel Plates = new JLabel(""); // Label that will display the plate images
		Plates.setBounds(21, 11, 286, 97); // Sets the position and size of the plates label
		frame.getContentPane().add(Plates); // Adds the plates label to the window
		Plates.setIcon(unbrokenplates); // Sets the starting image to unbroken plates
		
		JLabel losesign = new JLabel(""); // Label used to display a losing message
		losesign.setBounds(62, 133, 255, 31); // Sets the position and size of the losing message
		frame.getContentPane().add(losesign); // Adds the losing message label to the window
		
		JButton submit = new JButton("Play!"); // Creates a button labeled Play
		submit.addActionListener(new ActionListener() { // Adds an event listener to the button
			public void actionPerformed(ActionEvent e) { // Runs when the button is clicked
				int plateschange; // Declares a variable to store the random result
				plateschange=(int)(3*Math.random()+1); // Generates a random number between 1 and 3
				
				if(plateschange==1) { // Checks if the random number is 1
					Plates.setIcon(twoplatesbroken); // Shows the image with two broken plates
					sticker.setIcon(sticker1); // Displays the sticker prize
					submit.setText("Play again!"); // Changes button text to Play again
					losesign.setText(""); // Clears the losing message
				}
				
				if(plateschange==2) { // Checks if the random number is 2
					Plates.setIcon(plateallbroken); // Shows the image with all plates broken
					sticker.setIcon(tiger); // Displays the tiger prize
					submit.setText("Play again!"); // Changes button text to Play again
					losesign.setText(""); // Clears the losing message
				}
				
				if (plateschange==3) // Checks if the random number is 3
				{
					Plates.setIcon(unbrokenplates); // Shows the unbroken plates image
					sticker.setIcon(placeholder); // Shows the placeholder image
					submit.setText("Play"); // Resets button text to Play
					losesign.setText("you have lost please try again"); // Displays losing message
				}
			}
		});
		submit.setBounds(68, 175, 160, 51); // Sets the position and size of the Play button
		frame.getContentPane().add(submit); // Adds the button to the window
		
	}
}