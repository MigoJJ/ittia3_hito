package ros_comm;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Vector;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;

public class readXlsto_AL {
	public static void main(String[] args) {
		 Vector headers = new Vector();
		 Vector data = new Vector();
		 File file = new File("/home/migoey/git/Lanu_VioletBlue_V0.1/src/lanuarius/lanu/Lanuarius.xls");
		 try {
			 Workbook workbook = Workbook.getWorkbook(file);
//			 Sheet sheet = workbook.getSheet(0);
			 Sheet sheet = workbook.getSheet("rosAL");
			 headers.clear();
			 for (int i = 0; i < sheet.getColumns(); i++) {
				 Cell cell = sheet.getCell(i, 0);
				 headers.add(cell.getContents());
			 }
				 data.clear();
			 for (int j = 1; j < sheet.getRows(); j++) {
				 Vector d = new Vector();
				 for (int i = 0; i < sheet.getColumns(); i++) {
					 Cell cell = sheet.getCell(i, j);
					 d.add(cell.getContents());
					 }
//					 d.add("\n");
					 
					 d.set(1, "(Vector) objectros).get(i)");

					 data.add(d);
			 }
			 for(int i = 0; i < data.size(); i++) {
				 System.out.println(i + "==> " + data.get(i));
				 readXlsto_AL.rosAL1(data.get(i));
			 }
		 }
		 catch (Exception e) {
			 e.printStackTrace();
		 }
	}
	
	public static void rosAL1(Object objectros) {
		 for(int i = 0; i < ((Vector) objectros).size(); i++) {
			 
			 System.out.println(" rosAL1" + i + "==> " + ((Vector) objectros).get(i));
		 }
	}	
}