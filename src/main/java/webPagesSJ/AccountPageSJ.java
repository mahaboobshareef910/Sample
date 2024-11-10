package webPagesSJ;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import UtiliesSJ.ElementUtilisSJ;
import UtiliesSJ.commonutilisSJ;

public class AccountPageSJ {
	WebDriver driver;
	private ElementUtilisSJ elementUtils;
	private commonutilisSJ commonutlis;
	
	public AccountPageSJ(WebDriver driver) {
		
		this.driver = driver;
		PageFactory.initElements(driver,this);
		elementUtils = new ElementUtilisSJ(driver);
		
	}
	
	@FindBy(xpath="//*[@data-target='dropdown'][@aria-hidden='false']")
	private WebElement UserSignInbutton;
	public void ClickonUserButton() {
		elementUtils.clickonElement(UserSignInbutton,commonutlis.implicity_wait);
	}
	
	@FindBy(linkText="My Account")
	private WebElement MyAccount;
	public void ClickonMyAccount() {
		elementUtils.clickonElement(MyAccount,commonutlis.implicity_wait);
	}
	
	@FindBy(xpath="//*[@data-ui-id='page-title-wrapper']")
	private WebElement DisplayStausOfAccount;
	
	public boolean DisplayTheStatusOfAccount() {
		return elementUtils.DisplayStatusOFWebElement(DisplayStausOfAccount,commonutlis.implicity_wait);
		
	}
}
