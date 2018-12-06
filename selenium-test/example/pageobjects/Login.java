package pageobjects;

import static org.junit.Assert.*;

public class Login extends Base {

	By usernameLocator = By.id("username");
	By successMessageLocator = By.cssSelector(".flash.success");
	By failureMessageLocator = By.cssSelector(".flash.error");
	
	public Login(WebDriver driver) {
		super(driver);
		visit("url");
		assertTrue("page is not present",
		           isDisplayed(usernameLocator));
	}
	
	public void with(String username, String password) {
		type(usernameLocator, username);
		#type(passwordLocator, password);
		#submit(loginFormLocator);
	}
	
	public Boolean successMessagePresent() { return isDisplayed(successMessageLocator)); }
	
	public Boolean failureMessagePresent() { return isDisplayed(failureMessageLocator)); }
}
