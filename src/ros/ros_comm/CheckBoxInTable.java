package ros.ros_comm;


import javax.swing.*;	
import java.awt.*;
import java.io.File;
import java.util.Vector;

import javax.swing.table.DefaultTableModel;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class CheckBoxInTable extends JFrame 
{
  public CheckBoxInTable() 
  {
//    //Headers for JTable
//    String[] columns = {"Id", "Name", "Address", "Available"};
//
//    //data for JTable in a 2D table
//    Object[][] data = {
//      {1, "Thomas", "Alaska", true },
//      {2, "Jean", "Arizona", true },
//      {3, "Yohan", "California", false },
//      {4, "Emily", "Florida", false }
//    };

	  	Vector headers = new Vector();
		Vector data = new Vector();
		File file = new File("/home/migowj/git/Lanu_VioletBlue_V0.1/src/lanuarius/lanu/Lanuarius.xls");
		 try {
			 Workbook workbook = Workbook.getWorkbook(file);
//			 Sheet sheet = workbook.getSheet(0);
			 Sheet sheet = workbook.getSheet("ROS");

			 headers.clear();
			 for (int i = 0; i < sheet.getColumns(); i++) {
				 Cell cell1 = sheet.getCell(i, 0);
				 headers.add(cell1.getContents());
				 }
				 data.clear();
				 for (int j = 1; j < sheet.getRows(); j++) {
					 Vector d = new Vector();
					 for (int i = 0; i < sheet.getColumns(); i++) {
						 Cell cell = sheet.getCell(i, j);
						 d.add(cell.getContents());
					 }
					 d.add("\n");
					 data.add(d);
				 }
		 	}
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	  
	DefaultTableModel model = new DefaultTableModel(data, headers);  
		 
		 
//    DefaultTableModel model = new DefaultTableModel(data, columns);

    JTable table = new JTable(model) {
    	@Override
    	public Class getColumnClass(int column) {
        //return Boolean.class
    	return getValueAt(3, column).getClass(); 
    		
    		
		      }
    	};


	JScrollPane scrollPane = new JScrollPane(table);
	getContentPane().add(scrollPane);
	table.setFont(new Font("Arial",Font.TRUETYPE_FONT,15));
	table.setFillsViewportHeight(true);

    JLabel labelHead = new JLabel("List of employees");
    labelHead.setFont(new Font("Arial",Font.TRUETYPE_FONT,20));
    getContentPane().add(labelHead,BorderLayout.PAGE_START);
  }

  public static void main(String[] args) 
  {
    CheckBoxInTable frame = new CheckBoxInTable();  
    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
    frame.setSize(1200,600);
    frame.setVisible(true);
  }
}