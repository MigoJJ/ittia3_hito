package lanuarius.la_comm;

import lanuarius.la.DisplayButtonMessage;

public class Enter {
// ------------------------------------------------------user directory definition
	public static String currentUsersHomeDir = System.getProperty("user.dir" );
//	public static String wd = (currentUsersHomeDir + "/src");
	public static String wd = (currentUsersHomeDir);

	public static void main(String[] args){
		System.out.println("Continue the program ? : ");
		System.out.println(" Migo JJ");
		DisplayButtonMessage.main(null);
    }
}

