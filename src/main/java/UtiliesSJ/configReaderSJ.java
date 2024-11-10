package UtiliesSJ;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class configReaderSJ {
	
  public Properties intailizePropertiwes() {
	  Properties prop = new Properties();;
	  File file = new File("C:\\Users\\USER\\eclipse-workspace\\SJP\\src\\main\\resourcesSJ\\configuartion.properties");
	  try {
		  FileInputStream fis = new FileInputStream(file);
		  prop.load(fis);
	  }catch(Throwable e){
		  e.printStackTrace();
	  }
	return prop;
	  
  }
}
