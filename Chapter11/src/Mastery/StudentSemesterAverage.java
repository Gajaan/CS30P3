
/*

Program: StudentSemesterAverage.java          Last Date of this Revision: April 2, 2026

Purpose: Create a program that stores and saves information of students through a file
Author: Gajaan Ram
School: CHHS
Course: Computer science 30
 

*/
package Mastery; // places this class inside the Mastery package

import java.awt.EventQueue; // safely starts the GUI
import javax.swing.JFrame; // creates the window
import javax.swing.JLabel; // creates labels
import java.awt.Font; // changes font style
import javax.swing.JTextField; // creates text boxes
import javax.swing.JButton; // creates buttons
import java.awt.event.ActionListener; // listens for button clicks
import java.awt.event.ActionEvent; // handles click events
import java.io.BufferedReader; // reads lines from a file
import java.io.FileReader; // reads characters from file
import java.io.IOException; // handles file errors
import javax.swing.JTextArea; // creates large text area
import java.io.FileWriter; // writes data to file
import java.io.PrintWriter; // prints text into file

public class StudentSemesterAverage {

	private JFrame frame; // main program window
	private JTextField Stures; // student name field
	private JTextField sturgraderes; // student grade field
	private JTextField semnumres; // semester number field
	private JTextField G1Res; // grade 1 field
	private JTextField G2res; // grade 2 field
	private JTextField G3Res; // grade 3 field
	private JTextField G4Res; // grade 4 field

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() { // starts GUI safely
			public void run() {
				try {
					StudentSemesterAverage window = new StudentSemesterAverage(); // creates object
					window.frame.setVisible(true); // shows window
				} catch (Exception e) {
					e.printStackTrace(); // prints any startup errors
				}
			}
		});
	}

	public StudentSemesterAverage() {
		initialize(); // calls GUI setup
	}

	private void initialize() {
		frame = new JFrame(); // creates frame
		frame.setBounds(100, 100, 581, 686); // sets window size
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // closes app when X clicked
		frame.getContentPane().setLayout(null); // manual layout
		
		JLabel Stuname = new JLabel("Student Name:"); // name label
		Stuname.setFont(new Font("Tahoma", Font.PLAIN, 16)); // sets font
		Stuname.setBounds(10, 11, 126, 35); // position
		frame.getContentPane().add(Stuname); // adds label
		
		Stures = new JTextField(); // creates name box
		Stures.setBounds(122, 20, 356, 20); // position
		frame.getContentPane().add(Stures); // adds field
		Stures.setColumns(10); // width
		
		JTextArea Studentinfolist = new JTextArea(); // creates output area
		Studentinfolist.setBounds(40, 457, 465, 161); // position
		frame.getContentPane().add(Studentinfolist); // adds output area
		
		JLabel AVGdisp = new JLabel(""); // average result label
		AVGdisp.setBounds(88, 327, 342, 35); // position
		frame.getContentPane().add(AVGdisp); // adds average display
		
		JLabel Gradelvl = new JLabel("Student Grade:"); // grade label
		Gradelvl.setFont(new Font("Tahoma", Font.PLAIN, 16)); // font
		Gradelvl.setBounds(10, 57, 126, 35); // position
		frame.getContentPane().add(Gradelvl); // add
		
		sturgraderes = new JTextField(); // grade field
		sturgraderes.setBounds(122, 66, 355, 20); // position
		frame.getContentPane().add(sturgraderes); // add
		sturgraderes.setColumns(10); // width
		
		JLabel Semnum = new JLabel("Semester Number:"); // semester label
		Semnum.setFont(new Font("Tahoma", Font.PLAIN, 16)); // font
		Semnum.setBounds(10, 118, 142, 14); // position
		frame.getContentPane().add(Semnum); // add
		
		semnumres = new JTextField(); // semester field
		semnumres.setBounds(148, 117, 330, 20); // position
		frame.getContentPane().add(semnumres); // add
		semnumres.setColumns(10); // width
		
		JLabel G1 = new JLabel("Grade 1:"); // grade 1 label
		G1.setFont(new Font("Tahoma", Font.PLAIN, 16)); // font
		G1.setBounds(10, 159, 126, 20); // position
		frame.getContentPane().add(G1); // add
		
		G1Res = new JTextField(); // grade 1 field
		G1Res.setBounds(122, 161, 356, 20); // position
		frame.getContentPane().add(G1Res); // add
		G1Res.setColumns(10); // width
		
		JLabel G2 = new JLabel("Grade 2:"); // grade 2 label
		G2.setFont(new Font("Tahoma", Font.PLAIN, 16)); // font
		G2.setBounds(10, 206, 100, 14); // position
		frame.getContentPane().add(G2); // add
		
		G2res = new JTextField(); // grade 2 field
		G2res.setBounds(122, 205, 356, 20); // position
		frame.getContentPane().add(G2res); // add
		G2res.setColumns(10); // width
		
		JLabel G3 = new JLabel("Grade 3:"); // grade 3 label
		G3.setFont(new Font("Tahoma", Font.PLAIN, 16)); // font
		G3.setBounds(10, 242, 76, 27); // position
		frame.getContentPane().add(G3); // add
		
		G3Res = new JTextField(); // grade 3 field
		G3Res.setBounds(122, 247, 356, 20); // position
		frame.getContentPane().add(G3Res); // add
		G3Res.setColumns(10); // width
		
		JLabel G4 = new JLabel("Grade 4:"); // grade 4 label
		G4.setFont(new Font("Tahoma", Font.PLAIN, 16)); // font
		G4.setBounds(10, 297, 76, 14); // position
		frame.getContentPane().add(G4); // add
		
		G4Res = new JTextField(); // grade 4 field
		G4Res.setBounds(122, 296, 356, 20); // position
		frame.getContentPane().add(G4Res); // add
		G4Res.setColumns(10); // width
		
		JButton Save = new JButton("Save To File"); // save button
		Save.setBounds(49, 389, 142, 58); // position
		frame.getContentPane().add(Save); // add
		
		Save.addActionListener(new ActionListener() { // save button click
			public void actionPerformed(ActionEvent e) {
				String StuNres = Stures.getText(); // get student name
				String sturgraderesRES = sturgraderes.getText(); // get student grade
				String SNR = semnumres.getText(); // get semester
				String g1 = G1Res.getText(); // get grade 1
				String g2 = G2res.getText(); // get grade 2
				String g3 = G3Res.getText(); // get grade 3
				String g4 = G4Res.getText(); // get grade 4

				double semavg = (Double.parseDouble(g1) + Double.parseDouble(g2) +
						Double.parseDouble(g3) + Double.parseDouble(g4)) / 4; // calculate average

				AVGdisp.setText(Double.toString(semavg)); // show average

				String Studentinfo = "Name: " + StuNres +
						" Grade: " + sturgraderesRES +
						" Semester: " + SNR +
						" Average: " + semavg; // create file line

				try {
					FileWriter fw = new FileWriter("../Chapter11/src/Mastery/students.txt", true); // open file
					PrintWriter pw = new PrintWriter(fw); // connect print writer
					pw.println(Studentinfo); // write line
					pw.close(); // close file
				}
				catch(IOException ex) {
					ex.printStackTrace(); // print errors
				}
			}
		});
		
		JButton Viewfile = new JButton("View File contents"); // view button
		Viewfile.setBounds(234, 389, 196, 58); // position
		frame.getContentPane().add(Viewfile); // add
		
		Viewfile.addActionListener(new ActionListener() { // view click
			public void actionPerformed(ActionEvent e) {
				try {
					FileReader fr = new FileReader("../Chapter11/src/Mastery/students.txt"); // open file
					BufferedReader br = new BufferedReader(fr); // buffered reader

					String line; // current line
					String allText = ""; // all file text

					while((line = br.readLine()) != null) { // read until end
						allText += line + "\n"; // add line
					}

					Studentinfolist.setText(allText); // display in text area

					br.close(); // close reader
				}
				catch(IOException ex) {
					ex.printStackTrace(); // print errors
				}
			}
		});
		
		JLabel Avg = new JLabel("Average:"); // average label
		Avg.setFont(new Font("Tahoma", Font.PLAIN, 16)); // font
		Avg.setBounds(10, 332, 100, 20); // position
		frame.getContentPane().add(Avg); // add
	}
}