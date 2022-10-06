package ros_comm;


import javax.swing.*;
import org.apache.logging.log4j.core.tools.picocli.CommandLine.Help.TextTable.Cell;
import java.io.File;
import java.util.Vector;
import jxl.Sheet;
import jxl.Workbook;
import lanuarius.la_comm.Enter;

public class ExcelToJTable extends JFrame 
{
  public static void main(String[] args)  {
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
		File file = new File(Enter.wd + "/lanuarius/lanu/Lanuarius.xls");
		 try {
			 Workbook workbook = Workbook.getWorkbook(file);
//			 Sheet sheet = workbook.getSheet(0);
			 Sheet sheet = workbook.getSheet("ROS");

			 headers.clear();
			 for (int i = 0; i < sheet.getColumns(); i++) {
				 Cell cell = (Cell) sheet.getCell(i, 0);
				 headers.add(cell.getContent());
				 }
				 data.clear();
				 for (int j = 1; j < sheet.getRows(); j++) {
					 Vector d = new Vector();
					 for (int i = 0; i < sheet.getColumns(); i++) {
						 Cell cell = (Cell) sheet.getCell(i, j);
						 d.add(getContent());
					 }
					 d.add("\n");
					 data.add(d);
				 }
		 	}
		 catch (Exception e) {
			 e.printStackTrace();
		 }
		 JtableSelectCell.main(null);
  }
}