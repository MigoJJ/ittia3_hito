package lanuarius.la;

import java.io.*;

import javax.swing.JFrame;

import lanuarius.la_comm.Enter;

public class Get_EJt extends Enter{
	 public static void main(String choice) {
		String soaptarget = jwd;
		String prefixi ="";
		int jframeH =1200;
		int jframeW=800;

		if (choice== "EKG") {Get_EJt.callJtable(jwd+"/6OBJ", "Ⓔ EKG : ", 1200, 800);}
		else if (choice== "Chest_PA") {(jwd + "/6OBJ");"Ⓟ chest PA : ";800;800;}
		else if (choice== "GFS") 
			{soaptarget=(soaptarget + "/6OBJ");prefixi=("Ⓖ GFS : ");}	
		else if (choice== "CFS") 
			{soaptarget=(soaptarget + "/6OBJ");prefixi=("Ⓒ CFS : ");jframeH=1500;jframeW=800;}
		else if (choice== "Physical_Exam") 
			{soaptarget=(soaptarget + "/6OBJ");prefixi=("");}

		else if (choice== "CC") 
			{soaptarget=(soaptarget + "/3CC");prefixi=("");jframeH=600;jframeW=600;}
		else if (choice== "PI") 
			{soaptarget=(soaptarget + "/3CC");prefixi=("");jframeH=1200;jframeW=800;}
		else if (choice== "PMH") 
			{soaptarget=(soaptarget + "/4PMH");prefixi=("");jframeH=600;jframeW=600;}
		else if (choice== "Sujective") 
			{soaptarget=(soaptarget + "/5SUJ");prefixi=("");jframeH=600;jframeW=600;}
		else if (choice== "Objective") 
			{soaptarget=(soaptarget + "/6OBJ");prefixi=("");jframeH=600;jframeW=600;}
		
		else if (choice== "ROS") 
			{soaptarget=(soaptarget + "/4PMH");prefixi=(">");jframeH=1500;jframeW=900;}
		else if (choice== "9PLAN") 
		{soaptarget=(soaptarget + "/9PLAN");prefixi=("...");jframeH=1500;jframeW=900;}
		
		else if (choice== "ThyPx") 
			{soaptarget=(soaptarget + "/9PLAN");prefixi=("...");jframeH=1100;jframeW=550;}
		
		else if (choice== "ExtraLab") 
			{soaptarget=(soaptarget + "/6OBJ");prefixi=("");jframeH=800;jframeW=600;}
		else if (choice== "ExtraLab_fix") 
			{soaptarget=(soaptarget + "/6OBJ");prefixi=("");jframeH=800;jframeW=600;}
		else if (choice== "Chest_Pain") 
			{soaptarget=(soaptarget + "/3CC");prefixi=("");jframeH=1150;jframeW=500;}
		else if (choice== "Exit") 
		{			
			System.exit(0);
		}
		else {
			soaptarget=(Enter.wd + "/output_select_Jtable");prefixi=("");
		}
//		Librexls_JtableCall.main("/home/migowj/git/GDS_Jtable/src/lanuarius/lanu/Lanuarius.xls",prefixi,soaptarget,choice,jframeH,jframeW);
//		Librexls_JtableCall.main(wd + "/src/lanuarius/lanu/Lanuarius.xls",prefixi,soaptarget,choice,jframeH,jframeW);
	 }
	 
		public static void callJtable(String starget, String tprefix, int fH, int fW) extends main{
			System.out.println("Continue the program ? : ");
			soaptarget = starget;
			prefixi=tprefix;
			jframeH=fH;
			jframeW=fW;
			
			Librexls_JtableCall.main(wd + "/src/lanuarius/lanu/Lanuarius.xls",prefixi,soaptarget,choice,jframeH,jframeW);
 
		}
}