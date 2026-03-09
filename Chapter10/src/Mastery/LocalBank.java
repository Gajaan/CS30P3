
/*

Program: LocalBank.java          Last Date of this Revision: March 9, 2026

Purpose:An application that implements a GUI for the Local Bank case study

Author: Gajaan Ram
School: CHHS
Course: Computer science 30
 

*/

package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class LocalBank {

	private JFrame frame;
	private JTextField Accnumamm;
	private JTextField WorDamm1;
	private JTextField Fnameres;
	private JTextField Lnameres;
	private JTextField BBalanceres;
	private JLabel Fname;
	private JLabel Lname;
	private JLabel ACNUM;
	private JLabel WorDAMM;
	private JLabel BBalance;
Bank everything = new Bank();
private JLabel Disp;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					LocalBank window = new LocalBank();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public LocalBank() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 643, 579);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox WorD = new JComboBox();
		WorD.setModel(new DefaultComboBoxModel(new String[] {"", "Withdraw", "Deposit", "Make an account", "Delete an account", "Check Balance"}));
		WorD.addActionListener(new ActionListener() {
		    public void actionPerformed(ActionEvent e) {
		    	 if (WorD.getSelectedItem().equals("Make an account")) {
		             Fname.setForeground(Color.RED);
		             Lname.setForeground(Color.RED);
		             ACNUM.setForeground(Color.BLACK);
				    	WorDAMM.setForeground(Color.BLACK);
				    	BBalance.setForeground(Color.RED);
				    	
							
						
		    	 }
		    	 
		    	 if (WorD.getSelectedItem().equals("Withdraw")) {
		    		ACNUM.setForeground(Color.RED);
		    		WorDAMM.setForeground(Color.RED);
		    		 Fname.setForeground(Color.BLACK);
		             Lname.setForeground(Color.BLACK);
		             BBalance.setForeground(Color.BLACK);
		    			}
		    	 
		    	 if (WorD.getSelectedItem().equals("Deposit")) {
		    		 ACNUM.setForeground(Color.RED);
			    	WorDAMM.setForeground(Color.RED);
			    	 Fname.setForeground(Color.BLACK);
		             Lname.setForeground(Color.BLACK);
		             BBalance.setForeground(Color.BLACK);
		    	 }
		    	 
		    	if(WorD.getSelectedItem().equals("")) {
		    		 Fname.setForeground(Color.BLACK);
		             Lname.setForeground(Color.BLACK);
		             ACNUM.setForeground(Color.BLACK);
			    	WorDAMM.setForeground(Color.BLACK);
		    	 }
		    	if(WorD.getSelectedItem().equals("Delete an account")) {
		    		ACNUM.setForeground(Color.RED);
		    		 Fname.setForeground(Color.BLACK);
		             Lname.setForeground(Color.BLACK);
		             WorDAMM.setForeground(Color.BLACK);
		    	}
		    	
		    	
		    	}
		});
		
		WorD.setBounds(10, 44, 607, 22);
		frame.getContentPane().add(WorD);
		
		JLabel selectaction = new JLabel("Select an action:");
		selectaction.setFont(new Font("Tahoma", Font.PLAIN, 15));
		selectaction.setBounds(10, 27, 193, 14);
		frame.getContentPane().add(selectaction);
		
		JLabel InfoRed = new JLabel("Complete the Info in RED:");
		InfoRed.setFont(new Font("Tahoma", Font.PLAIN, 15));
		InfoRed.setBounds(10, 133, 180, 30);
		frame.getContentPane().add(InfoRed);
		
		ACNUM = new JLabel("Account ID:");
		ACNUM.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ACNUM.setBounds(10, 174, 128, 14);
		frame.getContentPane().add(ACNUM);
		
		Accnumamm = new JTextField();
		Accnumamm.setBounds(10, 192, 607, 20);
		frame.getContentPane().add(Accnumamm);
		Accnumamm.setColumns(10);
		
		WorDAMM = new JLabel("Amount of Withdrawal or Deposit:");
		WorDAMM.setFont(new Font("Tahoma", Font.PLAIN, 15));
		WorDAMM.setBounds(10, 226, 238, 22);
		frame.getContentPane().add(WorDAMM);
		
		WorDamm1 = new JTextField();
		WorDamm1.setBounds(10, 247, 607, 20);
		frame.getContentPane().add(WorDamm1);
		WorDamm1.setColumns(10);
		
		Fname = new JLabel("First Name:");
		Fname.setForeground(new Color(0, 0, 0));
		Fname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Fname.setBounds(10, 278, 145, 22);
		frame.getContentPane().add(Fname);
		
		Fnameres = new JTextField();
		Fnameres.setBounds(10, 298, 607, 20);
		frame.getContentPane().add(Fnameres);
		Fnameres.setColumns(10);
		
		Lname = new JLabel("Last Name:");
		Lname.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Lname.setBounds(10, 329, 106, 14);
		frame.getContentPane().add(Lname);
		
		Lnameres = new JTextField();
		Lnameres.setBounds(10, 344, 607, 20);
		frame.getContentPane().add(Lnameres);
		Lnameres.setColumns(10);
		
		Disp = new JLabel("");
		Disp.setBounds(202, 420, 415, 109);
		frame.getContentPane().add(Disp);
		
		BBalance = new JLabel("Starting Balance:");
		BBalance.setFont(new Font("Tahoma", Font.PLAIN, 15));
		BBalance.setBounds(10, 367, 158, 22);
		frame.getContentPane().add(BBalance);
		
		BBalanceres = new JTextField();
		BBalanceres.setBounds(10, 389, 607, 20);
		frame.getContentPane().add(BBalanceres);
		BBalanceres.setColumns(10);
		
		JButton Checkinfo = new JButton("Process Transaction");
		Checkinfo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double Wi;
				double D;
				String	options="";
				String Fn=Fnameres.getText();
				String Ln=Lnameres.getText();
				String ID =Accnumamm.getText();;
				String BB=BBalanceres.getText();
				String WAM =WorDamm1.getText();
				String Delete= null;
				String moneyleft;
				String c;
				if (WorD.getSelectedItem().equals("Make an account")) {
					options="Make an account";
					ID=everything.addAccount(Fn, Ln, Double.parseDouble(BB));
					Disp.setText("Your account number is: " + ID);
				}
				
				if(WorD.getSelectedItem().equals("Delete an account")) {
					options="Delete an account";
					Delete=everything.deleteAccount(ID);
					Disp.setText("Your account has been deleted");
					
				}
				
				if(WorD.getSelectedItem().equals("Check Balance")) {
					moneyleft= everything.checkBalance(ID);
					
					
					Disp.setText("Account ID: "+moneyleft);
				}
				
				
				if(WorD.getSelectedItem().equals("Withdraw")) {

				    options = "Withdraw";

				    double Wi1 = Double.parseDouble(WAM);

				    String result = everything.transaction(2, ID, Wi1);

				    Disp.setText(result);

				}
				
				if(WorD.getSelectedItem().equals("Deposit")) {
					options="Deposit";
					
					double Wi1 = Double.parseDouble(WAM);
					String result2 = everything.transaction(1, ID, Wi1);
					
					Disp.setText(result2);
							
				}
			
				
					
				
			}
		
		});
		
		Checkinfo.setBounds(10, 454, 180, 53);
		frame.getContentPane().add(Checkinfo);
		
	
		
		
		
	}
}
