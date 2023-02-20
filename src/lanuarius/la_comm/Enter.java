package lanuarius.la_comm;

import lanuarius.la.DisplayButtonMessage;

public class Enter {
// ------------------------------------------------------user directory definition
	public static String currentUsersHomeDir = System.getProperty("user.dir" );
	public static String wd = (currentUsersHomeDir);
	public static String jwd = ("/home/migowj/ittia_chart/je/panse/doro/text/samsara");
//	public static String jwd = (wd + "home/migowj/ittia_chart/je/panse/doro/text/samsara");
	public static String jwt = (wd  + "/ittia_chart/addjar_ittia3");

	public static void main(String[] args){
		System.out.println("Continue the program ? : ");
		System.out.println(" Migo JJ  wd  " + wd);
		System.out.println(" Migo JJ  jwd  " + jwd);
		System.out.println(" Migo JJ  jwt  " + jwt);

		DisplayButtonMessage.main(null);
    }
}