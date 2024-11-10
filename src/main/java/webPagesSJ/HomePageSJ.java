package webPagesSJ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtiliesSJ.ElementUtilisSJ;
import UtiliesSJ.commonutilisSJ;

public class HomePageSJ {
  WebDriver driver;
  
  private ElementUtilisSJ elementsutils;
  private commonutilisSJ commonutils;
  
  public HomePageSJ(WebDriver driver) { 
	  this.driver=driver;
	  PageFactory.initElements(driver,this);
	  elementsutils = new ElementUtilisSJ(driver);
  }
 //for create Account 
@FindBy(linkText="Create an Account")
private WebElement Create_Account;
 public void clickon__CreateAccount() {
	 elementsutils.clickonElement(Create_Account,commonutils.implicity_wait);
 }
 //for sign in
 @FindBy(linkText="Sign In ")
 private WebElement Sign_In;
  public SignInPageSJ clickon__Sign_IN() {
 	 elementsutils.clickonElement(Sign_In ,commonutils.implicity_wait);
	return new SignInPageSJ(driver);
  }
 
}
