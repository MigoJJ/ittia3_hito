package la;

import java.awt.*;
import javax.swing.*;

import la_comm.Enter;
import lanu.Get_ExceltoJtable02;

import java.awt.event.*;

public class DisplayButtonMessage extends JFrame {
	int i=0;
	static JPanel panel;
	public DisplayButtonMessage(){
		JButton[] buttons = new JButton[26];
		panel=new JPanel(new GridLayout(13,2));
		String  b[]={"GFS","CFS","EKG","Chest_PA","-","-","ROS","9PLAN","I","J","K","L","M","N",
		"O","P","Q","R","S","T","U","V","W","X","Y","Z"};
		for(i = 0; i < buttons.length; i++) {
			buttons[i] = new JButton(b[i]);
			buttons[i].setPreferredSize(new Dimension(300, 60));
			buttons[i].setFont(new Font("Arial", Font.PLAIN, 16));
			buttons[i].setSize(80, 80);
			buttons[i].setActionCommand(b[i]);
			buttons[i].addActionListener(new ActionListener(){
				public void actionPerformed(ActionEvent e) {
				  String choice = e.getActionCommand();
//				  JOptionPane.showMessageDialog(null, "You have clicked: "+choice);
				  System.out.println("choice  >>   " + choice);
				  
				  
				  
				  Get_ExceltoJtable02.main(choice);
				  }
			});
			panel.add(buttons[i]);
		}
	}
	public static void main(String[]args){
		DisplayButtonMessage frame=new DisplayButtonMessage();
		frame.setTitle("More Description !!!");
		frame.add(panel);
		frame.pack();
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}