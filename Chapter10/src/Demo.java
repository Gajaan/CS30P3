import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JTextArea;
import javax.swing.JLabel;

public class Demo {

	private JFrame frame;
	private JTextField Lname;
	private JTextField Fname;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Demo window = new Demo();
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
	public Demo() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		 ImageIcon N = new ImageIcon("../Chapter10/src/Nelson.jpg");
		 ImageIcon C = new ImageIcon("../Chapter10/src/crecent heights.png");
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 589, 489);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(128, 128, 128));
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		Lname = new JTextField();
		Lname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(Lname.getText().equals("Last Name"))
					Lname.setText("");
			}
		});
		Lname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Lname.setForeground(new Color(0, 128, 64));
		Lname.setText("Last Name");
		Lname.setHorizontalAlignment(SwingConstants.LEFT);
		Lname.setBounds(388, 27, 86, 20);
		panel.add(Lname);
		Lname.setColumns(10);
		
		Fname = new JTextField();
		Fname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e)
			{
				if(Fname.getText().equals("First Name"))
					Fname.setText("");
			}
			
			
			
		});
		Fname.setForeground(new Color(64, 0, 64));
		Fname.setFont(new Font("Tahoma", Font.PLAIN, 14));
		Fname.setText("First Name");
		Fname.setColumns(10);
		Fname.setBounds(101, 27, 86, 20);
		panel.add(Fname);
		
		JLabel pic = new JLabel("");
		pic.setBounds(203, 218, 177, 60);
		panel.add(pic);
	
		JComboBox Grade = new JComboBox();
		Grade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Grade.setModel(new DefaultComboBoxModel(new String[] {"Select Grade Level:", "Grade 10", "Grade 11", "Grade 12"}));
		Grade.setBounds(63, 58, 161, 22);
		panel.add(Grade);
		
		
	
		
		JTextArea Display = new JTextArea();
		Display.setBackground(new Color(128, 128, 128));
		Display.setBounds(63, 177, 411, 53);
		panel.add(Display);
		
		
		JComboBox School = new JComboBox();
		School.setModel(new DefaultComboBoxModel(new String[] {"Select School:", "Crescent", "Nelson", "Western", "Westmount", "Pearson", "Churchill"}));
		School.setFont(new Font("Tahoma", Font.PLAIN, 16));
		School.setBounds(314, 58, 161, 22);
		panel.add(School);
		
		JButton Submit = new JButton("Submit");
		Submit.setForeground(new Color(0, 138, 138));
		Submit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		Submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				String Fn = Fname.getText();
				String Ln= Lname.getText();
				String grade= "";
				String school="";
				
				if(Grade.getSelectedItem().equals("Grade 12"))
				{
					grade="12";
				}
				
				else if(Grade.getSelectedItem().equals("Grade 11")) {
					grade="11";
				}
				
				
				else
				{
					grade = "10";
				}
				
				if(School.getSelectedItem().equals("Crescent")) {
					school="Crescent";
					
					pic.setIcon(C);
				}
				
				else if(School.getSelectedItem().equals("Nelson")) {
					school="Nelson";
					pic.setIcon(N);
				}
				
				else if(School.getSelectedItem().equals("Western")) {
					school="Western";
				}
					
				else if(School.getSelectedItem().equals("Westmount")) {
					school="Westmount";
				}
				
				else if(School.getSelectedItem().equals("Pearson")) {
					school="Pearson";
				}
				
				else
				{
					school="Churchill";
				}
				
				
				Display.setText(Fn + " " + Ln + " is in Grade "+grade +" and goes to "+school );
				
			}
			
		
		});
		Submit.setBounds(244, 143, 89, 23);
		panel.add(Submit);
	
		
		
		
		
		
		}
	}

