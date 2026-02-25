package Mastery;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class BreakAPlate {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BreakAPlate window = new BreakAPlate();
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
	public BreakAPlate() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 333, 391);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		
		
		ImageIcon plateallbroken = new ImageIcon("../Chapter10/src/Mastery/plates_all_broken.gif");
		ImageIcon twoplatesbroken = new ImageIcon("../Chapter10/src/Mastery/plates_two_broken.gif");
		ImageIcon unbrokenplates = new ImageIcon("../Chapter10/src/Mastery/plates.gif");
		ImageIcon tiger= new ImageIcon("../Chapter10/src/Mastery/tiger_plush.gif");
		ImageIcon sticker1 = new ImageIcon("../Chapter10/src/Mastery/sticker.gif");
		ImageIcon placeholder = new ImageIcon("../Chapter10/src/Mastery/image.png");
		JLabel sticker = new JLabel("");
		sticker.setBounds(102, 254, 142, 87);
		frame.getContentPane().add(sticker);

		JLabel Plates = new JLabel("");
		Plates.setBounds(21, 11, 286, 97);
		frame.getContentPane().add(Plates);
		Plates.setIcon(unbrokenplates);
		
		JLabel losesign = new JLabel("");
		losesign.setBounds(62, 133, 255, 31);
		frame.getContentPane().add(losesign);
		
		JButton submit = new JButton("Play!");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int plateschange;
				plateschange=(int)(3*Math.random()+1);
				
				if(plateschange==1) {
					Plates.setIcon(twoplatesbroken);
					sticker.setIcon(sticker1);
					submit.setText("Play again!");
					losesign.setText("");
				}
				
				if(plateschange==2) {
					Plates.setIcon(plateallbroken);
					sticker.setIcon(tiger);
					submit.setText("Play again!");
					losesign.setText("");
				}
				
				if (plateschange==3)
				{
					Plates.setIcon(unbrokenplates);
					sticker.setIcon(placeholder);
					submit.setText("Play");
					losesign.setText("you have lost please try again");
				}
				
			
				

				
			
			            
			        
				
			}
		});
		submit.setBounds(68, 175, 160, 51);
		frame.getContentPane().add(submit);
		
	
		
		
		
	}
}
