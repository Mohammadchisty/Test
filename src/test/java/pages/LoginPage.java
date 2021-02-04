package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	WebDriver driver;
	
	By text_Username = By.id("authUser");
	By text_Password = By.id("clearPass");
	By button_Login = By.xpath("//*[@type='submit']");

public LoginPage(WebDriver driver) {
	
	 this.driver = driver;
}




public void EnterUsername(String Username) {
driver.findElement(text_Username).sendKeys(Username);	
}	
	
public void EnterPassword(String Password) {
		driver.findElement(text_Password).sendKeys(Password);
	}

	public void ClickLoginButton() {
	driver.findElement(button_Login).click();
}
}









