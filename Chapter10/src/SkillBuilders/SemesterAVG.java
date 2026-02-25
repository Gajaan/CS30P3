package SkillBuilders;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SemesterAVG {

	private JFrame frame;
	private JTextField FirstAVG;
	private JTextField secondAVG;
	private JTextField thirdAVG;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SemesterAVG window = new SemesterAVG();
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
	public SemesterAVG() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 515, 409);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel Fgrade = new JLabel("Enter your first grade:\r\n");
		Fgrade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Fgrade.setBounds(26, 50, 194, 32);
		frame.getContentPane().add(Fgrade);
		
		JLabel disp = new JLabel("");
		disp.setBounds(234, 277, 188, 50);
		frame.getContentPane().add(disp);
		
		FirstAVG = new JTextField();
		FirstAVG.setBounds(214, 52, 183, 32);
		frame.getContentPane().add(FirstAVG);
		FirstAVG.setColumns(10);
		
		
		
		JLabel Sgrade = new JLabel("Enter your second grade:\r\n");
		Sgrade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Sgrade.setBounds(26, 123, 194, 32);
		frame.getContentPane().add(Sgrade);
		
		secondAVG = new JTextField();
		secondAVG.setColumns(10);
		secondAVG.setBounds(214, 125, 183, 32);
		frame.getContentPane().add(secondAVG);
		
		JLabel Tgrade = new JLabel("Enter your third grade:\r\n");
		Tgrade.setFont(new Font("Tahoma", Font.PLAIN, 16));
		Tgrade.setBounds(26, 188, 194, 32);
		frame.getContentPane().add(Tgrade);
		
		thirdAVG = new JTextField();
		thirdAVG.setColumns(10);
		thirdAVG.setBounds(214, 190, 183, 32);
		frame.getContentPane().add(thirdAVG);
		
		JButton submit = new JButton("AVERAGE");
		submit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				double semavg;
				String firstaverage = FirstAVG.getText();
				String secondaverage = secondAVG.getText();
				String thirdaverage = thirdAVG.getText();
				
		semavg = (Double.parseDouble(firstaverage)+Double.parseDouble(secondaverage)+Double.parseDouble(thirdaverage))/3;
		
		disp.setText(Double.toString(semavg));
		
			
			}
			
			
		});
		
		
		
		submit.setFont(new Font("Tahoma", Font.PLAIN, 18));
		submit.setBounds(26, 277, 194, 50);
		frame.getContentPane().add(submit);
		
		
	}
	
	
}
