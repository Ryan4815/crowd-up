package pageobjects;

import static org.junit.Assert.*;

public class License extends Base {

	By serverIdLocator = By.id("field-value");
	By licenseKeyLocator = By.id("textarea full-width-field");
	By licenseFormLocator = By.id("aui-button aui-button-primary");
	By successMessageLocator = By.cssSelector("success");
	By failureMessageLocator = By.cssSelector("error");
	
        // Visit the License page
	public License(WebDriver driver) {
		super(driver);
		visit("http://localhost:8095/console/setup/setuplicense.action");
		assertTrue("Page is present",
		           isDisplayed(serverIdLocator));
	}
	
	// Type in license key and press continue
	public void with(String key) {
		type(licenseKeyLocator, key);
		submit(licenseFormLocator);
	}
	
	public Boolean successMessagePresent() { return isDisplayed(successMessageLocator)); }
	
	public Boolean failureMessagePresent() { return isDisplayed(failureMessageLocator)); }
}
