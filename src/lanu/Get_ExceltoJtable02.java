package lanu;

import java.io.*;					
import lanu.Librexls_JtableCall;
import la_comm.Enter;

public class Get_ExceltoJtable02 {
	 public static void main(String choice) {
		 String soaptarget = (Enter.wd + "/output_select_Jtable");
		 String prefixi ="";
		 
		if (choice== "EKG") 
			{soaptarget=("/home/migoey/git/VioletBlue/src/je/panse/doro/text/samsara/6OBJ");prefixi=("Ⓔ EKG : ");}
		else if (choice== "GFS") 
//Ⓖ	 Ⓒ	Ⓟ Ⓓ 	{soaptarget=("");prefixi=("");}
		 	{soaptarget=(Enter.wd + "/lanuar/output_select_Jtable1");prefixi=("Ⓖ GFS : ");}

		else if (choice== "CFS") 
		 	{soaptarget=("");prefixi=("");}
		else {
			soaptarget=(Enter.wd + "/output_select_Jtable");prefixi=("");
		 }
		 		 
		 Librexls_JtableCall.main(Enter.wd + "/lanu/Lnuarius.xls",prefixi,soaptarget,choice);
	 }
}