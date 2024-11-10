package StepDefinationSJ;

import org.openqa.selenium.WebDriver;

import org.junit.Assert;
import BrowserFactory.DriverFactorySJ;
import UtiliesSJ.commonutilisSJ;
import io.cucumber.java.en.*;
import io.cucumber.java.en.Then;
import webPagesSJ.AccountPageSJ;
import webPagesSJ.HomePageSJ;
import webPagesSJ.SignInPageSJ;

public class SignInSJ {
WebDriver driver;

  private HomePageSJ homePage;
  private SignInPageSJ signinPage;
  private AccountPageSJ accountPage;
  private commonutilisSJ commonutilis;
  
	@Given("User Navigate to SignIn page")
	public void user_navigate_to_sign_in_page() {
	   driver = DriverFactorySJ.getDriver();
	   homePage = new HomePageSJ(driver);
	   signinPage = homePage.clickon__Sign_IN();
	}

	@And("^User enters validemail address (.+) into email field$")
	public void user_enters_validemail_address_into_email_field(String emailText) {
	   signinPage.Enter_Email(emailText);
	}

	@And("^User enters valid  password (.+) into password field$")
	public void user_enters_valid_password_into_password_field(String password ) {
	    signinPage.Enter_passwsord(password);
	}

	@And("User clicks on signIn buttton")
	public void user_clicks_on_sign_in_buttton() {
		accountPage=signinPage.ClickonSignIn();
	}

	@Then("User Successfully should get successfully in Sign In")
	public void user_successfully_should_get_successfully_in_sign_in() {
		Assert.assertTrue(accountPage.DisplayTheStatusOfAccount());
	}

	@And("User enters invalidEmail address into email field")
	public void user_enters_invalid_email_address_into_email_field() {
		commonutilis = new  commonutilisSJ();
		signinPage.Enter_Email(commonutilis.getEmailTimeStamp());
	}

	@And("User enters invalid Password {string} into password field")
	public void user_enters_invalid_password_into_password_field(String invalidpassword) {
	    signinPage.Enter_passwsord(invalidpassword);
	}

	@Then("User displayed  warning Message")
	public void user_displayed_warning_message() {
	   Assert.assertTrue(signinPage.getWarninTextPage().contains("")); 
	}

}
