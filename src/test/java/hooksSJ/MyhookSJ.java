package hooksSJ;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import BrowserFactory.DriverFactorySJ;
import UtiliesSJ.configReaderSJ;
import io.cucumber.java.After;
import io.cucumber.java.Before;

public class MyhookSJ {

WebDriver driver;

  @Before
   public void setup() {
	  
	  Properties prop = new configReaderSJ().intailizePropertiwes();
	  driver = DriverFactorySJ.intializebrowser(prop.getProperty("requiredbrowser"));
	  driver.get(prop.getProperty("url"));
  }
  @After
  public void teardown() {
	  driver.quit();
  }
}
