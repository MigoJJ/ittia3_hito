package lanu;

import java.io.*;					
import lanu.Librexls_JtableCall;
import la_comm.Enter;

public class Get_ExceltoJtable02 {
	 public static void main(String choice) {
		 String soaptarget = ("/home/migowj/GDS_Jtable/JTableButton/src/lanuar/output_select_Jtable");
		 
		 Librexls_JtableCall.main(Enter.wd + "/lanu/Lnuarius.xls","...",soaptarget,choice);
	 }
}