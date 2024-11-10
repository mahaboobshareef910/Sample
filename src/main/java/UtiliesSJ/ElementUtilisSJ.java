package UtiliesSJ;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ElementUtilisSJ {
   WebDriver driver;
  
   public ElementUtilisSJ(WebDriver driver) {
	   this.driver=driver;
   }
   
   public WebElement WaitForElement(WebElement element,long durationInSeconds) {
	   WebElement webelement = null;
	   try {
		   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationInSeconds));
		   webelement = wait.until(ExpectedConditions.elementToBeClickable(element));
	   }catch(Throwable e) {
		   e.printStackTrace();
	   }
	return webelement;
	   }
   public void clickonElement(WebElement element,long durationInSeconds) {
	   WebElement webelement = WaitForElement(element,durationInSeconds);
	   webelement.click();
   }
   public void textType(WebElement element,String TextToBeType,long durationInSeconds) {
	   WebElement webelement = WaitForElement(element,durationInSeconds);
	   webelement.clear();
	   webelement.click();
	   webelement.sendKeys(TextToBeType);
   }
   public void javaScriptClick(WebElement element,long durationInSeconds) {
	   WebElement webelement = WaitForElement(element,durationInSeconds);
	   JavascriptExecutor jse = ((JavascriptExecutor)driver);
	   jse.executeScript("arguments[0].click;",webelement);
   }
   public void javaScripttextType(WebElement element,String TextToBeType,long durationInSeconds) {
	   WebElement webelement = WaitForElement(element,durationInSeconds);
	   JavascriptExecutor jse = ((JavascriptExecutor)driver);
	   jse.executeScript("arguments[0].value='"+TextToBeType+"'",webelement);
   }
   
   public void SelecDropdown(WebElement element,String selectdropDown,long durationInSeconds) {
	   WebElement webelement = WaitForElement(element,durationInSeconds);
	   Select select = new Select(webelement);
	   select.selectByVisibleText(selectdropDown);
   }
   
   public void OverMouseAction(WebElement element,long durationInSeconds){
	   WebElement webelement = WaitForElement(element,durationInSeconds);
	   Actions action =new Actions(driver);
	   action.moveToElement(webelement).click().build().perform();
   }
   
   public String GetTextFromWebElement(WebElement element,long durationInSeconds) {
	   WebElement webelement = WaitForElement(element,durationInSeconds);
	return webelement.getText();
	    }
   
   public boolean DisplayStatusOFWebElement(WebElement element,long durationInSeconds) {
	   try {
		   WebElement webelement = WaitForElement(element,durationInSeconds); 
		   return webelement.isDisplayed();
	   }catch(Throwable e) {
		   e.printStackTrace();
	   }
	return false;
	}
   
   public Alert WaitForAlert(long durationInSeconds) {
	   Alert alert = null;
	   try {
		   WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(durationInSeconds));
		    alert = wait.until(ExpectedConditions.alertIsPresent());
	   }catch(Throwable e) {
		   e.printStackTrace();
	   }
	return alert;
	   }
   
   public void AlertPresent(long durationInSeconds) {
	     Alert alert = WaitForAlert(durationInSeconds);
	     alert.accept();
   }
   
   public void AlertDismiss(long durationInSeconds) {
	     Alert alert = WaitForAlert(durationInSeconds);
         alert.dismiss();
   }
}
