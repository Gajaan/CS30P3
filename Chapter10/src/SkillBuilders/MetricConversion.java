package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
public class MetricConversion {

	private static final JLabel Display = null;
	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MetricConversion window = new MetricConversion();
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
	public MetricConversion() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 348, 155);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Select = new JLabel("Select a conversion type:");
		Select.setFont(new Font("Tahoma", Font.PLAIN, 15));
		Select.setBounds(26, 11, 187, 26);
		frame.getContentPane().add(Select);
		
		JComboBox conversions = new JComboBox();
		conversions.setFont(new Font("Tahoma", Font.PLAIN, 13));
		conversions.setModel(new DefaultComboBoxModel(new String[] {"Select conversion", "Inches to centimeters", "foot to meters", "gallons to liters", "pound to kilograms"}));
		conversions.setBounds(23, 48, 190, 22);
		frame.getContentPane().add(conversions);
		
		JLabel Disp = new JLabel("");
		Disp.setBounds(26, 81, 197, 24);
		frame.getContentPane().add(Disp); {
			
		
		}
		
		
		
		JButton btnNewButton = new JButton("Convert");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
			String Conversions ="";
			
			if(conversions.getSelectedItem().equals("Inches to centimeters")) {
				Conversions="1 inch= 2.54 centimeters";
			}
			
			else if(conversions.getSelectedItem().equals("foot to meters")) {
				Conversions="1 foot= 0.3048 meters";
			}
			
			else if(conversions.getSelectedItem().equals("gallons to liters")) {
				Conversions="1 gallon= 4.5461";
			}
			
			else {
				Conversions="1 pound= 0.4536 kilograms";
			}
			
			Disp.setText(Conversions);
				
				
			}
		});
		btnNewButton.setBounds(220, 49, 89, 23);
		frame.getContentPane().add(btnNewButton); 
	
	}
}
