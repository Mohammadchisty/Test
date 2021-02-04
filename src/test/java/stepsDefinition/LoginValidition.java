package stepsDefinition;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.LoginPage;

public class LoginValidition {
	
	WebDriver driver;
	LoginPage login;
	@Given("OpenEMR Browser")
	public void open_emr_browser() {
	   System.setProperty("webdriver.chrome.driver", "C:\\Users\\chisty\\Desktop\\chromedriver.exe");
	   driver.get("https://opensource-demo.orangehrmlive.com/");
	}

	@When("Enter Username\"admin\"")
	public void enter_username_admin() {
	     login = new LoginPage(driver);
	   login.EnterUsername("Username");
	  
	}

	@When("Enter Password\"Pass\"")
	public void enter_password_pass() {
		login.EnterPassword("Password");
	   
	}

	@When("Click Login button")
	public void click_login_button() {
	   login.ClickLoginButton();
	}

	@Then("User able to login to the application")
	public void user_able_to_login_to_the_application() {
	    System.out.println("User logedin");
	}

}
