package lanuarius.la;

import java.io.IOException;
import java.util.Scanner;

public class Librexls_replace {

	public static String lxr(String dtext) throws IOException {
        if(dtext.contains("[   ]")) {
			Scanner myObj = new Scanner(System.in);  // Create a Scanner object
			System.out.println(dtext + "   Enter Lab DATA ...   : ");
			String lab_data = myObj.nextLine();  // Read user input
			if (lab_data !="") {
			      System.out.println("Match found");
			      dtext= dtext.replace("[   ]", "[ " + lab_data + " ]");
			} else {
			      System.out.println("Match not found");
			}
		}
		dtext= dtext.replace(">•", ".");
		dtext= dtext.replace(".", ".\n\t\t");
		dtext= dtext.replace(",.", ",");
		
		return dtext; 
		}

}
