package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Roll {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Roll window = new Roll();
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
	public Roll() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		ImageIcon roll1 = new ImageIcon("../Chapter10/src/SkillBuilders/Dice1.png");
		ImageIcon roll2 = new ImageIcon("../Chapter10/src/SkillBuilders/SecondDice.png");
		ImageIcon roll3 = new ImageIcon("../Chapter10/src/SkillBuilders/3dice.png");
		ImageIcon roll4 = new ImageIcon("../Chapter10/src/SkillBuilders/4dice.png");
		ImageIcon roll5 = new ImageIcon("../Chapter10/src/SkillBuilders/5dice.png");
		ImageIcon roll6 = new ImageIcon("../Chapter10/src/SkillBuilders/6dice.png");
		
		frame = new JFrame();
		frame.setBounds(100, 100, 279, 322);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Dice = new JLabel("");
		Dice.setBackground(new Color(255, 255, 255));
		Dice.setBounds(20, 11, 233, 127);
		frame.getContentPane().add(Dice);
		
		JLabel seconddice = new JLabel("");
		seconddice.setBounds(137, 11, 116, 129);
		frame.getContentPane().add(seconddice);
		
		JButton roll = new JButton("ROLL!");
		roll.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int newroll;
				int newroll1;
				
				newroll1=(int)(6*Math.random()+1);
				newroll= (int)(6*Math.random()+1);
				
				if (newroll ==1) {
					Dice.setIcon(new ImageIcon("../Chapter10/src/SkillBuilders/Dice1.png"));
				}
				else if (newroll==2) {
					Dice.setIcon(roll2);
				}
				else if (newroll==3) {
					Dice.setIcon(roll3);
				}
				else if (newroll==4) {
					Dice.setIcon(roll4);
				}
				else if (newroll==5) {
					Dice.setIcon(roll5);
				}
				else if (newroll==6) {
					Dice.setIcon(roll6);
				}
				
				if(newroll1==1) {
					seconddice.setIcon(roll1);
				}
				
				else if(newroll1==2) {
					seconddice.setIcon(roll2);
				}
				
				else if(newroll1==3) {
					seconddice.setIcon(roll3);
				}
				
				else if(newroll1==4) {
					seconddice.setIcon(roll4);
				}
				
				else if(newroll1==5) {
					seconddice.setIcon(roll5);
				}
				
				else if(newroll1==6) {
					seconddice.setIcon(roll6);
				}
				
			}
		});
		roll.setFont(new Font("Tahoma", Font.PLAIN, 15));
		roll.setBounds(69, 234, 114, 38);
		frame.getContentPane().add(roll);
		
		
	}
}
