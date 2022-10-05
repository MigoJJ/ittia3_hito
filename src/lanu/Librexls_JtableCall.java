package lanu;

import java.io.*;								
import java.util.*;
import javax.swing.*;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.*;
import java.awt.Font;

import javax.swing.table.*;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import la.DisplayButtonMessage;
import la_comm.Enter;
import la_comm.File_cdrw_proc;

public class Librexls_JtableCall {
	 public static void main(String xlspath, String soaptit, String soaptar, String argscho, int jframeH, int jframeW) {
		 Vector headers = new Vector();
		 Vector data = new Vector();
		 File file = new File(xlspath);
		 try {
			 Workbook workbook = Workbook.getWorkbook(file);
//			 Sheet sheet = workbook.getSheet(0);
			 Sheet sheet = workbook.getSheet(argscho);

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
		 JTable table = new JTable() {;
		 @Override
		    public Component prepareRenderer(TableCellRenderer renderer, int row, int column) {
		      Component component = super.prepareRenderer(renderer, row, column);
		      int rendererWidth = component.getPreferredSize().width;
		      TableColumn tableColumn = getColumnModel().getColumn(column);
		      tableColumn.setPreferredWidth(Math.max(rendererWidth + getIntercellSpacing().width, tableColumn.getPreferredWidth()));
		      return component;
		    }
		  };
		  
		 JScrollPane scroll = new JScrollPane(table);
		 JFrame f=new JFrame();
		 	 f.add(scroll);
			 f.setSize(jframeH, jframeW);
			 f.setLocationRelativeTo(null); 
			 f.setResizable(true);
			 f.setVisible(true);
			 f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 
		 DefaultTableModel model = new DefaultTableModel(data,headers);
			 Font  f1  = new Font("Consolas", Font.PLAIN,  15);
			 table.setFont(f1);
			 table.setModel(model);
			 table.setAutoCreateRowSorter(true);
			 model = new DefaultTableModel(data, headers);
			 table.setModel(model);
			 table.setRowHeight(30);
			 table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
	//		 table.getColumnModel().getColumn(0).setPreferredWidth(450);
	//		 table.getColumnModel().getColumn(1).setPreferredWidth(450);
		 
		 table.addMouseListener( new MouseAdapter(){
			 public void mousePressed(MouseEvent e){
	             JTable source = (JTable)e.getSource();
	             int row = source.rowAtPoint( e.getPoint() );
	             int column = source.columnAtPoint( e.getPoint() );
//	             System.out.print("\t"+ soaptit + table.getValueAt(row, column)+"\n");

	             String dtext = ("\t" + soaptit + table.getValueAt(row, column)).toString(); 
	     		    	File_cdrw_proc fcp1 = new File_cdrw_proc(); 
			           try {
			        	   
			        	   if (argscho=="ExtraLab"){
								Scanner myObj = new Scanner(System.in);  // Create a Scanner object
								System.out.println("Enter Lab DATA ...   : ");
								String lab_data = myObj.nextLine();  // Read user input
								System.out.println("lab_data is: " + lab_data); 	
								dtext= dtext.replace("[   ]", "[" + lab_data + "]");
								}
			        	   
			        	   dtext= dtext.replace("        ", "\n\t    ");
			        	   dtext= dtext.replace(">•", ".");
			        	   System.out.println(dtext);

        	   
			        	   fcp1.writeliner(soaptar,dtext);
			    		} catch (IOException e1) {
			    			// TODO Auto-generated catch block
			    			e1.printStackTrace();
			    		}
	             if (! source.isRowSelected(row))
	                 source.changeSelection(row, column, false, false);
	         		}
	 		});
	 
	 }
}