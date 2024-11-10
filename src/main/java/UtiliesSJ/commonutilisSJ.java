package UtiliesSJ;

import java.util.Date;

public class commonutilisSJ {
   public static final int implicity_wait=10;
   public static final int Expilicity_wait=10;
   public static final int Page_load_wait=10;
   
   public String getEmailTimeStamp() {
	   Date date = new Date();
	   return "mahaboobshareef234"+date.toString().replace(" ", "_").replace(":","_")+"@gmail.com";
	   }
}
