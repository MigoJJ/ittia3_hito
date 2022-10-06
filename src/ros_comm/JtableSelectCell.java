package ros_comm;

import java.awt.BorderLayout;
import java.awt.Font;
import java.util.Vector;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class JtableSelectCell extends ExcelToJTable {
	public static void JTableSelectCell(Vector data, Vector headers)  {
		DefaultTableModel model = new DefaultTableModel(data, headers);  

	    JTable table = new JTable(model) {
	    	@Override
	    	public Class getColumnClass(int column) {
	        //return Boolean.class
	    	return getValueAt(3, column).getClass(); 
			      }
	    	};

		JScrollPane scrollPane = new JScrollPane(table);
		table.setFont(new Font("Arial",Font.TRUETYPE_FONT,15));
		table.setFillsViewportHeight(true);

	    JLabel labelHead = new JLabel("List of employees");
	    labelHead.setFont(new Font("Arial",Font.TRUETYPE_FONT,20));
	  }

	  public static void main(String[] args) 
	  {
	    ExcelToJTable frame = new ExcelToJTable();  
	    frame.setDefaultCloseOperation(EXIT_ON_CLOSE);
	    frame.setSize(1200,600);
	    frame.setVisible(true);
	  }
	}
