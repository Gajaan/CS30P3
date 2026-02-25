package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JComboBox;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LocalBank {

	private JFrame frame;
	private JTextField Accnum1;
	private JTextField Ammwithordepresponse;
	private JTextField FnameResponse;
	private JTextField LnameResponse;
	private JTextField BalanceResponse;

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
		frame.setBounds(100, 100, 850, 814);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JComboBox WorD = new JComboBox();
		WorD.setModel(new DefaultComboBoxModel(new String[] {"", "Withdraw", "Deposit"}));
		WorD.setBounds(10, 44, 814, 22);
		frame.getContentPane().add(WorD);
		
		JLabel select = new JLabel("Select an Action:");
		select.setBounds(10, 24, 180, 22);
		frame.getContentPane().add(select);
		
		JLabel InfoRED = new JLabel("Complete the information in RED:");
		InfoRED.setBounds(10, 77, 181, 22);
		frame.getContentPane().add(InfoRED);
		
		Accnum1 = new JTextField();
		Accnum1.setBounds(10, 133, 814, 20);
		frame.getContentPane().add(Accnum1);
		Accnum1.setColumns(10);
		
		JLabel Accnum = new JLabel("Account Number:");
		Accnum.setForeground(new Color(255, 0, 0));
		Accnum.setBounds(10, 114, 167, 22);
		frame.getContentPane().add(Accnum);
		
		JLabel ammWithdep = new JLabel("Amount of withdrawal/deposit:");
		ammWithdep.setForeground(new Color(255, 0, 0));
		ammWithdep.setBounds(10, 163, 298, 22);
		frame.getContentPane().add(ammWithdep);
		
		Ammwithordepresponse = new JTextField();
		Ammwithordepresponse.setBounds(10, 181, 814, 20);
		frame.getContentPane().add(Ammwithordepresponse);
		Ammwithordepresponse.setColumns(10);
		
		JLabel Fname = new JLabel("First Name:");
		Fname.setBounds(10, 204, 106, 22);
		frame.getContentPane().add(Fname);
		
		FnameResponse = new JTextField();
		FnameResponse.setBounds(10, 221, 814, 20);
		frame.getContentPane().add(FnameResponse);
		FnameResponse.setColumns(10);
		
		JLabel LName = new JLabel("Last Name:");
		LName.setBounds(10, 252, 65, 22);
		frame.getContentPane().add(LName);
		
		LnameResponse = new JTextField();
		LnameResponse.setBounds(10, 274, 814, 20);
		frame.getContentPane().add(LnameResponse);
		LnameResponse.setColumns(10);
		
		JLabel BBalance = new JLabel("Beginning Balance:");
		BBalance.setBounds(10, 305, 167, 22);
		frame.getContentPane().add(BBalance);
		
		JLabel Transactioninfo =  new JLabel("");
		Transactioninfo.setBounds(10, 355, 814, 233);
		frame.getContentPane().add(Transactioninfo);
		
		BalanceResponse = new JTextField();
		BalanceResponse.setBounds(10, 323, 688, 20);
		frame.getContentPane().add(BalanceResponse);
		BalanceResponse.setColumns(10);
		
		JButton Submit = new JButton("Process Transaction");
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double totalamount;
				double totalamountD;
				String withdrawordeposit="";
				String BalanceResponse1=BalanceResponse.getText();			
				String amount=Ammwithordepresponse.getText();
				totalamount=(Double.parseDouble(amount)+Double.parseDouble(BalanceResponse1));
				totalamountD=(Double.parseDouble(BalanceResponse1)-Double.parseDouble(amount));
				String ID= Accnum1.getText();
				String Firstn= FnameResponse.getText();
				String lastn= LnameResponse.getText();
				
				
			
				
				if(WorD.getSelectedItem().equals("Withdraw")) {
					withdrawordeposit="withdraw";
					Transactioninfo.setText("Account Number: " + ID + "  First Name: " + Firstn + "  Last Name: " + lastn + "  Type of Transaction: " + withdrawordeposit + "  Total Amount: " +Double.toString(totalamountD));
					
				}
				
				
				
				if(WorD.getSelectedItem().equals("Deposit")) {
					withdrawordeposit="Deposit";
					Transactioninfo.setText("Account Number: " + ID + "  First Name: " + Firstn + "  Last Name: " + lastn + "  Type of Transaction: " + withdrawordeposit + "  Total Amount: " +Double.toString(totalamount));
				}
				
				
			}
		});
		Submit.setBounds(35, 599, 153, 30);
		frame.getContentPane().add(Submit);
		
		
	}

	protected void totalamount(double d) {
		// TODO Auto-generated method stub
		
	}

	
}
