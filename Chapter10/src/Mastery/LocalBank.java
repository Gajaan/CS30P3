
/*

Program: LocalBank.java          Last Date of this Revision: March 9, 2026

Purpose:An application that implements a GUI for the Local Bank case study

Author: Gajaan Ram
School: CHHS
Course: Computer science 30
 

*/

package Mastery; // Declares the package this class belongs to

import java.awt.EventQueue; // Imports EventQueue to safely start the GUI
import javax.swing.JFrame; // Imports JFrame to create the application window
import javax.swing.JComboBox; // Imports JComboBox to create dropdown menus
import javax.swing.JLabel; // Imports JLabel to display text on the GUI
import java.awt.Font; // Imports Font to change text style and size
import java.awt.event.ActionEvent; // Imports ActionEvent for event handling
import java.awt.event.ActionListener; // Imports ActionListener to respond to user actions

import javax.swing.DefaultComboBoxModel; // Imports DefaultComboBoxModel to store combo box items
import javax.swing.JTextField; // Imports JTextField to allow user text input
import javax.swing.JButton; // Imports JButton for clickable buttons
import java.awt.Color; // Imports Color to change component colors

public class LocalBank {

	private JFrame frame; // Declares the main application window
	private JTextField Accnumamm; // Text field for entering the account ID
	private JTextField WorDamm1; // Text field for entering withdrawal or deposit amount
	private JTextField Fnameres; // Text field for entering the first name
	private JTextField Lnameres; // Text field for entering the last name
	private JTextField BBalanceres; // Text field for entering the starting balance
	private JLabel Fname; // Label for first name
	private JLabel Lname; // Label for last name
	private JLabel ACNUM; // Label for account ID
	private JLabel WorDAMM; // Label for withdrawal or deposit amount
	private JLabel BBalance; // Label for starting balance
	Bank everything = new Bank(); // Creates an object of the Bank class to manage accounts
	private JLabel Disp; // Label used to display results or messages to the user
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { // Runs the GUI on the event dispatch thread
			public void run() { // Method that starts the program
				try { // Try block to catch errors
					LocalBank window = new LocalBank(); // Creates a LocalBank object
					window.frame.setVisible(true); // Makes the window visible
				} catch (Exception e) { // Catches any exceptions
					e.printStackTrace(); // Prints the error to the console
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LocalBank() { // Constructor method
		initialize(); // Calls the method that builds the GUI
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() { // Method that creates and arranges GUI components
		frame = new JFrame(); // Creates the main window
		frame.setBounds(100, 100, 643, 579); // Sets the window position and size
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Closes the program when the window closes
		frame.getContentPane().setLayout(null); // Uses absolute positioning
		
		JComboBox WorD = new JComboBox(); // Creates a combo box for selecting a transaction
		WorD.setModel(new DefaultComboBoxModel(new String[] {"", "Withdraw", "Deposit", "Make an account", "Delete an account", "Check Balance"})); // Adds options to the combo box
		
		WorD.addActionListener(new ActionListener() { // Adds an event listener to the combo box
		    public void actionPerformed(ActionEvent e) { // Runs when the selection changes
		    	 if (WorD.getSelectedItem().equals("Make an account")) { // Checks if user selects make account
		             Fname.setForeground(Color.RED); // Turns first name label red
		             Lname.setForeground(Color.RED); // Turns last name label red
		             ACNUM.setForeground(Color.BLACK); // Sets account label to black
				     WorDAMM.setForeground(Color.BLACK); // Sets amount label to black
				     BBalance.setForeground(Color.RED); // Turns starting balance label red
		    	 }
		    	 
		    	 if (WorD.getSelectedItem().equals("Withdraw")) { // Checks if withdraw is selected
		    		ACNUM.setForeground(Color.RED); // Highlights account ID
		    		WorDAMM.setForeground(Color.RED); // Highlights amount field
		    		 Fname.setForeground(Color.BLACK); // Resets first name label
		             Lname.setForeground(Color.BLACK); // Resets last name label
		             BBalance.setForeground(Color.BLACK); // Resets balance label
		    	 }
		    	 
		    	 if (WorD.getSelectedItem().equals("Deposit")) { // Checks if deposit is selected
		    		 ACNUM.setForeground(Color.RED); // Highlights account ID
			    	 WorDAMM.setForeground(Color.RED); // Highlights amount
			    	 Fname.setForeground(Color.BLACK); // Resets first name label
		             Lname.setForeground(Color.BLACK); // Resets last name label
		             BBalance.setForeground(Color.BLACK); // Resets balance label
		    	 }
		    	 
		    	 if(WorD.getSelectedItem().equals("")) { // Checks if nothing is selected
		    		 Fname.setForeground(Color.BLACK); // Resets first name label
		             Lname.setForeground(Color.BLACK); // Resets last name label
		             ACNUM.setForeground(Color.BLACK); // Resets account ID label
			    	 WorDAMM.setForeground(Color.BLACK); // Resets amount label
		    	 }
		    	 
		    	 if(WorD.getSelectedItem().equals("Delete an account")) { // Checks if delete account is selected
		    		ACNUM.setForeground(Color.RED); // Highlights account ID
		    		 Fname.setForeground(Color.BLACK); // Resets first name label
		             Lname.setForeground(Color.BLACK); // Resets last name label
		             WorDAMM.setForeground(Color.BLACK); // Resets amount label
		    	 }
		    }
		});
		
		WorD.setBounds(10, 44, 607, 22); // Sets combo box position and size
		frame.getContentPane().add(WorD); // Adds combo box to the window
		
		JLabel selectaction = new JLabel("Select an action:"); // Label describing the combo box
		selectaction.setFont(new Font("Tahoma", Font.PLAIN, 15)); // Sets font style and size
		selectaction.setBounds(10, 27, 193, 14); // Sets position and size
		frame.getContentPane().add(selectaction); // Adds label to window
		
		JLabel InfoRed = new JLabel("Complete the Info in RED:"); // Instruction label
		InfoRed.setFont(new Font("Tahoma", Font.PLAIN, 15)); // Sets font
		InfoRed.setBounds(10, 133, 180, 30); // Sets position
		frame.getContentPane().add(InfoRed); // Adds label to frame
		
		ACNUM = new JLabel("Account ID:"); // Label for account ID
		ACNUM.setFont(new Font("Tahoma", Font.PLAIN, 14)); // Sets font
		ACNUM.setBounds(10, 174, 128, 14); // Sets position
		frame.getContentPane().add(ACNUM); // Adds label
		
		Accnumamm = new JTextField(); // Text field for account ID input
		Accnumamm.setBounds(10, 192, 607, 20); // Sets size and location
		frame.getContentPane().add(Accnumamm); // Adds field to window
		Accnumamm.setColumns(10); // Sets width of text field
		
		WorDAMM = new JLabel("Amount of Withdrawal or Deposit:"); // Label for transaction amount
		WorDAMM.setFont(new Font("Tahoma", Font.PLAIN, 15)); // Sets font
		WorDAMM.setBounds(10, 226, 238, 22); // Sets position
		frame.getContentPane().add(WorDAMM); // Adds label
		
		WorDamm1 = new JTextField(); // Text field for entering withdrawal or deposit amount
		WorDamm1.setBounds(10, 247, 607, 20); // Sets size and location
		frame.getContentPane().add(WorDamm1); // Adds field
		WorDamm1.setColumns(10); // Sets text field width
		
		Fname = new JLabel("First Name:"); // Label for first name
		Fname.setForeground(new Color(0, 0, 0)); // Sets text color
		Fname.setFont(new Font("Tahoma", Font.PLAIN, 15)); // Sets font
		Fname.setBounds(10, 278, 145, 22); // Sets position
		frame.getContentPane().add(Fname); // Adds label
		
		Fnameres = new JTextField(); // Text field for first name
		Fnameres.setBounds(10, 298, 607, 20); // Sets position
		frame.getContentPane().add(Fnameres); // Adds field
		Fnameres.setColumns(10); // Sets width
		
		Lname = new JLabel("Last Name:"); // Label for last name
		Lname.setFont(new Font("Tahoma", Font.PLAIN, 15)); // Sets font
		Lname.setBounds(10, 329, 106, 14); // Sets position
		frame.getContentPane().add(Lname); // Adds label
		
		Lnameres = new JTextField(); // Text field for last name
		Lnameres.setBounds(10, 344, 607, 20); // Sets location
		frame.getContentPane().add(Lnameres); // Adds field
		Lnameres.setColumns(10); // Sets width
		
		Disp = new JLabel(""); // Label used to display results
		Disp.setBounds(202, 420, 415, 109); // Sets location and size
		frame.getContentPane().add(Disp); // Adds display label
		
		BBalance = new JLabel("Starting Balance:"); // Label for starting balance
		BBalance.setFont(new Font("Tahoma", Font.PLAIN, 15)); // Sets font
		BBalance.setBounds(10, 367, 158, 22); // Sets position
		frame.getContentPane().add(BBalance); // Adds label
		
		BBalanceres = new JTextField(); // Text field for entering starting balance
		BBalanceres.setBounds(10, 389, 607, 20); // Sets location
		frame.getContentPane().add(BBalanceres); // Adds field
		BBalanceres.setColumns(10); // Sets width
		
		JButton Checkinfo = new JButton("Process Transaction"); // Creates button to process bank actions
		Checkinfo.addActionListener(new ActionListener() { // Adds click listener
			public void actionPerformed(ActionEvent e) { // Runs when button is clicked
				double Wi; // Variable for withdrawal amount
				double D; // Variable for deposit amount
				String options=""; // Stores the selected option
				String Fn=Fnameres.getText(); // Gets first name from text field
				String Ln=Lnameres.getText(); // Gets last name from text field
				String ID =Accnumamm.getText(); // Gets account ID
				String BB=BBalanceres.getText(); // Gets starting balance
				String WAM =WorDamm1.getText(); // Gets withdrawal or deposit amount
				String Delete= null; // Variable for delete account result
				String moneyleft; // Variable to store balance result
				String c; // Extra string variable
				
				if (WorD.getSelectedItem().equals("Make an account")) { // Checks if user is creating an account
					options="Make an account"; // Stores action name
					ID=everything.addAccount(Fn, Ln, Double.parseDouble(BB)); // takes the users First Name, Last name and starting bank balance to create an account
					Disp.setText("Your account number is: " + ID); // Displays account number
				}
				
				if(WorD.getSelectedItem().equals("Delete an account")) { // Checks if deleting account
					options="Delete an account"; // Stores action
					Delete=everything.deleteAccount(ID); // Calls delete method
					Disp.setText("Your account has been deleted"); // Displays confirmation
				}
				
				if(WorD.getSelectedItem().equals("Check Balance")) { // Checks if balance is requested
					moneyleft= everything.checkBalance(ID); // Calls balance method
					Disp.setText("Account ID: "+moneyleft); // Displays balance
				}
				
				if(WorD.getSelectedItem().equals("Withdraw")) { // Checks if withdrawing money
				    options = "Withdraw"; // Stores action name
				    double Wi1 = Double.parseDouble(WAM); // Converts withdrawal amount to double
				    String result = everything.transaction(2, ID, Wi1); // Calls withdrawal transaction
				    Disp.setText(result); // Displays result
				}
				
				if(WorD.getSelectedItem().equals("Deposit")) { // Checks if depositing money
					options="Deposit"; // Stores action name
					double Wi1 = Double.parseDouble(WAM); // Converts deposit amount
					String result2 = everything.transaction(1, ID, Wi1); // Calls deposit transaction
					Disp.setText(result2); // Displays result
				}
			}
		});
		
		Checkinfo.setBounds(10, 454, 180, 53); // Sets button size and position
		frame.getContentPane().add(Checkinfo); // Adds button to frame
		
	}
}