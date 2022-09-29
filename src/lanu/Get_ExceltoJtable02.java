package lanu;

import java.io.*;					
import lanu.Librexls_JtableCall;
import la_comm.Enter;

public class Get_ExceltoJtable02 {
	 public static void main(String choice) {
		 String soaptarget = (Enter.wd + "/output_select_Jtable");
		 String prefixi ="";
		 
		if (choice== "EKG") 
			{soaptarget=("/home/migowj/ittia1_chart/je/panse/doro/text/samsara/6OBJ");prefixi=("Ⓔ EKG : ");}
		else if (choice== "Chest_PA") 
			{soaptarget=("/home/migowj/ittia1_chart/je/panse/doro/text/samsara/6OBJ");prefixi=("Ⓟ chest PA : ");}
		else if (choice== "GFS") 
			{soaptarget=("/home/migowj/ittia1_chart/je/panse/doro/text/samsara/6OBJ");prefixi=("Ⓖ GFS : ");}	
		else if (choice== "CFS") 
			{soaptarget=("/home/migowj/ittia1_chart/je/panse/doro/text/samsara/6OBJ");prefixi=("Ⓒ CFS : ");}
		else if (choice== "ROS") 
		{soaptarget=("/home/migowj/ittia1_chart/je/panse/doro/text/samsara/5SUJ");prefixi=(">");}
		else if (choice== "9PLAN") 
		{soaptarget=("/home/migowj/ittia1_chart/je/panse/doro/text/samsara/9PLAN");prefixi=("...");}
		else if (choice== "ExtraLab") 
		{soaptarget=("/home/migowj/ittia1_chart/je/panse/doro/text/samsara/6OBJ");prefixi=("");}
		else {
			soaptarget=(Enter.wd + "/output_select_Jtable");prefixi=("");
		 }
		 		 
		 Librexls_JtableCall.main(Enter.wd + "/lanu/Lanuarius.xls",prefixi,soaptarget,choice);
	 }
}

//Ⓖ	 Ⓒ	Ⓟ Ⓓ 	{soaptarget=("");prefixi=("");}
//https://ecgwaves.com/wp-content/uploads/2017/10/Pocket-guide-ECG-interpretation.pdf