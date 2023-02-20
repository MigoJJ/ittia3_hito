package lanuarius.la;

import java.io.IOException;
import java.io.InputStream;

import lanuarius.la_comm.Enter;

public class Get_EJt extends Enter{
	public static void main(String choice) throws IOException {
		if (choice== "EKG") 		{Get_EJt.callJtable(choice,jwd+"/6OBJ","Ⓔ EKG : ");}
		else if (choice== "Chest_PA") {Get_EJt.callJtable(choice,jwd + "/6OBJ","Ⓟ chest PA : ");}
		else if (choice== "GFS")	{Get_EJt.callJtable(choice,jwd+"/6OBJ","Ⓖ GFS : ");}
		else if (choice== "CFS")	{Get_EJt.callJtable(choice,jwd+"/6OBJ","Ⓒ CFS : ");}
		else if (choice== "Physical_Exam"){Get_EJt.callJtable(choice,wd+"/6OBJ","");}

		else if (choice== "CC") {Get_EJt.callJtable(choice,jwd+"/3CC","");}
		else if (choice== "PI") {Get_EJt.callJtable(choice,jwd+"/3CC","");}
		
		else if (choice== "ROS"){
            String udbu =(wd + "/ittia_chart/addjar_ittia2");
            String jarName =("java -jar " + udbu + "/ittia1jros.jar");
            Process proc = Runtime.getRuntime().exec(jarName);
            InputStream in = proc.getInputStream();
            InputStream err = proc.getErrorStream();
				
		}
		
		else if (choice== "PMH"){Get_EJt.callJtable(choice,jwd+"/4PMH","");} 
		
		else if (choice== "Sujective")	{Get_EJt.callJtable(choice,jwd+"/5SUJ","");} 
		else if (choice== "Objective")	{Get_EJt.callJtable(choice,jwd+"/6OBJ","");} 
		else if (choice== "ExtraLab")	{Get_EJt.callJtable(choice,jwd+"/6OBJ","");} 
		else if (choice== "ExtraLab_fix") {Get_EJt.callJtable(choice,jwd+"/6OBJ","");} 

		else if (choice== "9PLAN") 	{Get_EJt.callJtable(choice,jwd+"/9PLAN","");} 
		else if (choice== "ThyPx") 	{Get_EJt.callJtable(choice,jwd+"/9PLAN","");} 
		else if (choice== "Chest_Pain") 	{Get_EJt.callJtable(choice,jwd+"/5SUJ","");} 
		else if (choice== "DM_complication") 	{Get_EJt.callJtable(choice,jwd+"/6OBJ","⚝");} 

		else if (choice== "Exit") 	{System.exit(0);}
		else {}
	}
	 
	public static void callJtable(String choice, String starget, String tprefix) {
			System.out.println("Continue the program ? : ");
//		    Librexls_JtableCall.main(wd +"/src/lanuarius/lanu/Lanuarius.xls",tprefix,starget,choice);
		    Librexls_JtableCall.main(wd +"/lanuarius/lanu/Lanuarius.xls",tprefix,starget,choice);

	}
}