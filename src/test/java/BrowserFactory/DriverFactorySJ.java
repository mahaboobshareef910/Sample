package BrowserFactory;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import UtiliesSJ.commonutilisSJ;

public class DriverFactorySJ {
	
  static WebDriver driver=null;
  
  public static WebDriver intializebrowser(String browsername) {
	  if(browsername.equals("chrome")) {
		  driver = new ChromeDriver();
	  }
	  else if(browsername.equals("firefox")) {
		  driver = new FirefoxDriver();
	  }
	  else if(browsername.equals("edge")) {
		  driver = new EdgeDriver();
	  }
	  driver.manage().deleteAllCookies();
	  driver.manage().window().maximize();
	  driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(commonutilisSJ.implicity_wait));
	  driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(commonutilisSJ.implicity_wait));
	return driver;
	 }
    public static WebDriver getDriver() {
		return driver;
    }
}
