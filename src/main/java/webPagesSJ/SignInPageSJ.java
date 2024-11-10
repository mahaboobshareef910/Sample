package webPagesSJ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtiliesSJ.ElementUtilisSJ;
import UtiliesSJ.commonutilisSJ;

public class SignInPageSJ {
  WebDriver driver;
  
   private ElementUtilisSJ elementutils;
  private commonutilisSJ commonutils;
  
  public SignInPageSJ(WebDriver driver) {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
	 elementutils = new ElementUtilisSJ(driver);
}
  //click signIn
  @FindBy(xpath="//*[@id='email']")
  private WebElement emailfield;
   public void Enter_Email(String emailtext) {
	  elementutils.textType(emailfield, emailtext,commonutils.implicity_wait);
  }
   
   @FindBy(xpath="//*[@name='login[password]']")
   private WebElement passwordfield;
   public void Enter_passwsord(String password) {
	  elementutils.textType(passwordfield, password,commonutils.implicity_wait); 
   }
   
   @FindBy(xpath="//*[@class='action login primary']")
   private WebElement Sign_In_with_valid_Credentials;
   public AccountPageSJ ClickonSignIn() {
		  elementutils.clickonElement(Sign_In_with_valid_Credentials,commonutils.implicity_wait);
		return  new AccountPageSJ(driver) ; 
	   }
   
   @FindBy(xpath="//*[@data-ui-id='message-error']")
   private WebElement WarningMessage;
   
   public String getWarninTextPage() {
	return elementutils.GetTextFromWebElement(WarningMessage,commonutils.implicity_wait);
	   
   }
}