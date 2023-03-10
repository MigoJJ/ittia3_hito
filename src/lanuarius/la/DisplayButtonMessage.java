package lanuarius.la;

import java.awt.*;
import javax.swing.*;

import lanuarius.la_comm.Enter;

import java.awt.event.*;
import java.io.IOException;

public class DisplayButtonMessage extends JFrame {
	int i=0;
	static JPanel panel;
	public DisplayButtonMessage(){
		JButton[] buttons = new JButton[26];
		panel=new JPanel(new GridLayout(13,2));
		String  b[]={"CC","GFS",
				"PI","CFS",
				"PMH","Chest_PA",
				"ROS","EKG",
				"-","-",                 
				"Subjective","Chest_Pain",
				"Objective","-",
				"Physical_Exam","ThyPx",
				"-","-",
				"ExtraLab","ExtraLab_fix",
				"9PLAN","DM_complication",
				"-","-",
				"Exit","Exit"};

		for(i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(b[i]);
			buttons[i].setPreferredSize(new Dimension(300, 60));
			buttons[i].setFont(new Font("Arial", Font.BOLD, 16));
			buttons[i].setSize(80, 80);
			buttons[i].setActionCommand(b[i]);
			buttons[i].addActionListener(new ActionListener(){
		public void actionPerformed(ActionEvent e) {
				  String choice = e.getActionCommand();
//				  JOptionPane.showMessageDialog(null, "You have clicked: "+choice);
				  try {
						Get_EJt.main(choice);
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				  }
		});
		panel.add(buttons[i]);
		}
	}
	public static void main(String[] args){
		DisplayButtonMessage frame=new DisplayButtonMessage();
		frame.setTitle("More Description !!!");
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setLocation(1900,500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}