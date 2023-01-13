package lanuarius.la;

import lanuarius.la_comm.Enter;

public class Get_EJt extends Enter{
	public static void main(String choice) {
		if (choice== "EKG") 		{Get_EJt.callJtable(choice,jwd+"/6OBJ","Ⓔ EKG : ",1200,800);}
		else if (choice== "Chest_PA") {Get_EJt.callJtable(choice,jwd + "/6OBJ","Ⓟ chest PA : ",800,800);}
		else if (choice== "GFS")	{Get_EJt.callJtable(choice,jwd+"/6OBJ","Ⓖ GFS : ",800,800);}
		else if (choice== "CFS")	{Get_EJt.callJtable(choice,jwd+"/6OBJ","Ⓒ CFS : ",800,800);}
		else if (choice== "Physical_Exam"){Get_EJt.callJtable(choice,jwd+"/6OBJ","",800,800);}

		else if (choice== "CC") {Get_EJt.callJtable(choice,jwd+"/3CC","",800,800);}
		else if (choice== "PI") {Get_EJt.callJtable(choice,jwd+"/3CC","",800,800);}
		else if (choice== "ROS"){Get_EJt.callJtable(choice,jwd+"/4PMH","",800,800);}
		
		else if (choice== "PMH"){Get_EJt.callJtable(choice,jwd+"/4PMH","",800,800);} 
		
		else if (choice== "Sujective")	{Get_EJt.callJtable(choice,jwd+"/5SUJ","",800,800);} 
		else if (choice== "Objective")	{Get_EJt.callJtable(choice,jwd+"/6OBJ","",800,800);} 
		else if (choice== "ExtraLab")	{Get_EJt.callJtable(choice,jwd+"/6OBJ","",800,800);} 
		else if (choice== "ExtraLab_fix") {Get_EJt.callJtable(choice,jwd+"/6OBJ","",800,800);} 

		else if (choice== "9PLAN") 	{Get_EJt.callJtable(choice,jwd+"/9PLAN","",800,800);} 
		else if (choice== "ThyPx") 	{Get_EJt.callJtable(choice,jwd+"/9PLAN","",800,800);} 
		else if (choice== "Chest_Pain") 	{Get_EJt.callJtable(choice,jwd+"/5SUJ","",800,800);} 
		else if (choice== "DM_complication") 	{Get_EJt.callJtable(choice,jwd+"/6OBJ","⚝",800,800);} 

		else if (choice== "Exit") 	{System.exit(0);}
		else {}
	}
	 
	public static void callJtable(String choice, String starget, String tprefix, int fH, int fW) {
			System.out.println("Continue the program ? : ");
//		    Librexls_JtableCall.main(wd + "/src/lanuarius/lanu/Lanuarius.xls",tprefix,starget,choice,fH,fW);
		    Librexls_JtableCall.main(wd + "/lanuarius/lanu/Lanuarius.xls",tprefix,starget,choice,fH,fW);

	}
}