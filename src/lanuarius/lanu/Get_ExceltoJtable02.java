package lanuarius.lanu;

import java.io.*;

import javax.swing.JFrame;

import lanuarius.la_comm.Enter;
import lanuarius.lanu.Librexls_JtableCall;

public class Get_ExceltoJtable02 {
	 public static void main(String choice) {
		 String soaptarget = (Enter.wd + "/output_select_Jtable");
//		 soaptarget = "/home/migowj/ittia1_chart/je/panse/doro/text/samsara";
		 soaptarget = "/home/migoey/ittia_chart/je/panse/doro/text/samsara";

		 String prefixi ="";
			System.out.println("Enter.currentUsersHomeDir : "+ Enter.currentUsersHomeDir);
			System.out.println("soaptarget  Dir : "+ soaptarget);
		int jframeH =1200;
		int jframeW=800;

		if (choice== "EKG") 
			{soaptarget=(soaptarget + "/6OBJ");prefixi=("Ⓔ EKG : ");jframeH=1400;jframeW=600;}
		else if (choice== "Chest_PA") 
			{soaptarget=(soaptarget + "/6OBJ");prefixi=("Ⓟ chest PA : ");jframeH=800;jframeW=800;}
		else if (choice== "GFS") 
			{soaptarget=(soaptarget + "/6OBJ");prefixi=("Ⓖ GFS : ");}	
		else if (choice== "CFS") 
			{soaptarget=(soaptarget + "/6OBJ");prefixi=("Ⓒ CFS : ");}
		else if (choice== "ROS") 
			{soaptarget=(soaptarget + "/4PMH");prefixi=(">");jframeH=1500;jframeW=900;}
		else if (choice== "9PLAN") 
		{soaptarget=(soaptarget + "/9PLAN");prefixi=("...");}
		
		else if (choice== "ThyPx") 
			{soaptarget=(soaptarget + "/9PLAN");prefixi=("...");jframeH=1100;jframeW=550;}
		
		else if (choice== "ExtraLab") 
			{soaptarget=(soaptarget + "/6OBJ");prefixi=("");jframeH=600;jframeW=600;}
		else if (choice== "ExtraLab_fix") 
			{soaptarget=(soaptarget + "/6OBJ");prefixi=("");jframeH=600;jframeW=600;}
		else if (choice== "Chest_Pain") 
			{soaptarget=(soaptarget + "/3CC");prefixi=("");jframeH=1150;jframeW=500;}
		else {
			soaptarget=(Enter.wd + "/output_select_Jtable");prefixi=("");
		}
//		 Librexls_JtableCall.main("/home/migowj/GDS_chart_button/lanu/Lanuarius.xls",prefixi,soaptarget,choice,jframeH,jframeW);
		 Librexls_JtableCall.main("/home/migoey/git/Lanu_VioletBlue_V0.1/src/lanuarius/lanu/Lanuarius.xls",prefixi,soaptarget,choice,jframeH,jframeW);
		 
	 }
}
//Ⓖ	 Ⓒ	Ⓟ Ⓓ 	{soaptarget=("");prefixi=("");}
//https://ecgwaves.com/wp-content/uploads/2017/10/Pocket-guide-ECG-interpretation.pdf